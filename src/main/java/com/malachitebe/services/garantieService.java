package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.interfaces.iactes_couverts;
import com.malachitebe.interfaces.igarantie;
import com.malachitebe.models.garantie_santesModels;
@Service
public class garantieService implements igarantie{
@Autowired
JdbcTemplate jdbcTemplate;
@Autowired
iactes_couverts iactes_couverts;
	@Override
	public Double MontantCotisationgarantie(Long IdAdherent) {
		Double Montant=0.0;
	    String query="SELECT g.Idcollections,g.Nom,tc.id as id_type_cotisation,tc.type_cotisation, "
	    		+ "g.Active,g.v1,g.v2,g.v3,g.v4,g.v5,a.Salaire "
	    		+ "from Tabcollections g "
	    		+ "inner join Tab_type_cotisation tc on  g.id_type_cotisation=tc.id "
	    		+ "inner join Tab_adherent a on a.idcollections=g.idcollections "
	    		+ "where a.id="+IdAdherent
	    		+ " group by  g.Idcollections,g.Nom,tc.id,tc.type_cotisation, "
	    		+ "g.Active,g.v1,g.v2,g.v3,g.v4,g.v5,a.Salaire";

	garantie_santesModels collections = jdbcTemplate.queryForObject(query,BeanPropertyRowMapper.newInstance(garantie_santesModels.class));
	String querycount="select COUNT(*) from Tab_beneficiaires b where b.id_adherent="+IdAdherent+" and b.situation_actuelle!=4";
	Integer nbrpac=jdbcTemplate.queryForObject(querycount,BeanPropertyRowMapper.newInstance(Integer.class));
	  switch (collections.getId_type_cotisation())
      {
          case 1: // Forfait Familial
              Montant = collections.getV1();
              break;
          case 2: // Montant unique par bénéficiaire
              Integer Nbr = (nbrpac + 1);
              Montant = (collections.getV1() * Nbr);
              break;
          case 3: // Montant distinct adhérent/personne à charge
              Montant = (collections.getV1()) + (collections.getV2() * nbrpac);
              break;
          case 4: // Montant par tranche de bénéficiaires- 2 tranches
              Montant = (collections.getV1() + collections.getV2());
              break;
          case 5: // Montant par tranche de bénéficiaires- 3 tranches
              Montant = (collections.getV1() + collections.getV2() + collections.getV3());
              break;
          case 6: // Montant en pourcentage du revenu
              Montant = (collections.getSalaire() * collections.getV3()) / 100;
              //Montant = 300000;
              break;
      }
		return Montant;
	}
	@Override
	public garantie_santesModels GetGarantie(Integer GarantieId) {
		String query="SELECT g.id_garantie,g.nom,tc.id as id_type_cotisation,tc.type_cotisation, "
				+ "g.active,g.v1,g.v2,g.v3,g.v4,g.v5,g.observation,g.droit_adhesion, "
				+ "g.delai_reprise,g.delai_retard,g.date_creation "
	    		+ "FROM Tab_garantie g "
	    		+ "inner join Tab_type_cotisation tc on tc.id=g.id_type_cotisation "
	    		+ "where g.id_garantie="+GarantieId;

	garantie_santesModels collections = jdbcTemplate.queryForObject(query,BeanPropertyRowMapper.newInstance(garantie_santesModels.class));
	if(collections != null)
    {
        switch (collections.getId_type_cotisation())
        {
            case 1: // Forfait Familial
            	collections.setCotisation_mensuel( collections.getV1());
                break;
            case 2: // Montant unique par bénéficiaire
            	collections.setCotisation_mensuel( collections.getV1() * 1);
                break;
            case 3: // Montant distinct adhérent/personne à charge
            	collections.setCotisation_mensuel(collections.getV1()+ collections.getV2());
                break;
            case 4: // Montant par tranche de bénéficiaires- 2 tranches
            	collections.setCotisation_mensuel( collections.getV1() + collections.getV2());
                break;
            case 5: // Montant par tranche de bénéficiaires- 3 tranches
            	collections.setCotisation_mensuel( collections.getV1() + collections.getV2()+ collections.getV3());
                break;
            case 6: // Montant en pourcentage du revenu
                    // Montant = ((decimal)Garanties.Salaire * Garanties.v3) / 100;
            	collections.setCotisation_mensuel(collections.getV3());
                break;
        }
        collections.setActes(iactes_couverts.GarantieCouvertActes(collections.getId_garantie()));
    }
	return collections;
	}
	@Override
	public List<garantie_santesModels> GetGaranties() {
		String query="select g.id_garantie,g.nom,t.id as id_type_cotisation,t.type_cotisation, "
				+ "g.active,g.v1,g.v2,g.v3,g.v4,g.v5,g.observation,g.droit_adhesion,g.delai_reprise, "
				+ "g.delai_retard,g.date_creation "
				+ "from Tab_garantie g "
				+ "inner join Tab_type_cotisation t on g.id_type_cotisation=t.id";

		List<garantie_santesModels> collections = jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(garantie_santesModels.class));
	return collections;
	}
}
