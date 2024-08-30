package com.malachitebe.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.cotisation_emise;
import com.malachitebe.interfaces.icotisation_emise;
import com.malachitebe.models.cotisationModel;
import com.malachitebe.models.garantie_santesModels;
import com.malachitebe.repositories.cotisation_emiseRepository;
@Service
public class cotisation_emiseService implements icotisation_emise{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired 
	cotisation_emiseRepository cotisation_emiseRepository;
	@Override
	public cotisationModel GetHistoriqueCotisationemise(Long IdAdherent, Integer annee) {
		try {
		String query="select ce.id_adherent,ce.id_exercice,sum(ce.mois_1) as mois_1,sum(ce.mois_2) as mois_2,sum(ce.mois_3) as mois_3, "
				+ "sum(ce.mois_4) as mois_4,sum(ce.mois_5) as mois_5, sum(ce.mois_6) as mois_6,sum(ce.mois_7) as mois_7, "
				+ "sum(ce.mois_8) as mois_8,sum(ce.mois_9) as mois_9,sum(ce.mois_10) as mois_10,sum(ce.mois_11) as mois_11, "
				+ "sum(ce.mois_12) as mois_12 "
				+ "from Tab_cotisation_emise ce "
				+ "inner join Tab_exercice e on  e.id=ce.id_exercice "
				+ "where ce.id_adherent="+IdAdherent+" and e.annees="+annee
				+" group by  ce.id_adherent,ce.id_exercice";
		cotisationModel collection=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(cotisationModel.class));
		collection.setIntitule_cotisation("Cotisation émise");
		return collection;
	   }catch(Exception e) {
           e.printStackTrace();
           return null;
       }
	}
	@Override
	public Double MontantCotisationemise(Long IdAdherent) {
		Double montant=0.0;
		String query="select g.id_garantie,g.nom,tc.id as id_type_cotisation,tc.type_cotisation,g.active, "
					+ "g.v1,g.v2,g.v3,g.v4,g.v5,a.Salaire "
					+ "from tab_adherent a "
					+ "inner join Tab_garantie g on g.id_garantie=a.id_garantie "
					+ "inner join Tab_type_cotisation tc on g.id_type_cotisation=tc.id "
					+ "where a.id="+IdAdherent;
			garantie_santesModels garantie=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(garantie_santesModels.class));
			String querynbrpac="select COUNT(*) from Tab_beneficiaires b where b.situation_actuelle!=4 and b.id_adherent="+IdAdherent;
			
		Integer nbrpac=jdbcTemplate.queryForObject(querynbrpac, Integer.class);
		 switch (garantie.getId_type_cotisation())
	            {
	                case 1: // Forfait Familial
	                    montant = garantie.getV1();
	                    break;
	                case 2: // montant unique par bénéficiaire
	                    int Nbr = (nbrpac + 1);
	                    montant = (garantie.getV1() * Nbr);
	                    break;
	                case 3: // montant distinct adhérent/personne à charge
	                    montant = (garantie.getV1()) + (garantie.getV2() * nbrpac);
	                    break;
	                case 4: // montant par tranche de bénéficiaires- 2 tranches
	                    montant = (garantie.getV1() + garantie.getV2());
	                    break;
	                case 5: // montant par tranche de bénéficiaires- 3 tranches
	                    montant = (garantie.getV1() + garantie.getV2() + garantie.getV3());
	                    break;
	                case 6: // montant en pourcentage du revenu
	                    montant = (garantie.getSalaire() * garantie.getV3()) / 100;
	                    //montant = 300000;
	                    break;
	            }
		 //System.out.println(montant);
			return montant;
	}
	@Override
	public cotisation_emise savecotisationemise(Long idadherent, Integer idexercice, Integer mois) {
		Double montant=0.0;
		cotisation_emise a=new cotisation_emise();
		String query="SELECT e.id,e.id_adherent,e.id_exercice,e.annee,e.mois_1,e.mois_2,e.mois_3 "
				+ ",e.mois_4,e.mois_5,e.mois_6,e.mois_7,e.mois_8,e.mois_9,e.mois_10,e.mois_11 "
				+ ",e.mois_12,e.date_creation "
				+ "FROM Tab_cotisation_emise e "
				+ "where e.id_adherent="+idadherent+" and id_exercice="+idexercice;
		List<cotisation_emise> collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(cotisation_emise.class));
		montant=MontantCotisationemise(idadherent);
		if(collections.isEmpty()) {
			cotisation_emise e=new cotisation_emise();
			e.setId_adherent(idadherent);
			e.setId_exercice(idexercice);
			 switch(mois) {
			case 1: 
				e.setMois_1(montant);
				break;
			case 2: 
				e.setMois_2(montant);
				break;
			case 3: 
				e.setMois_3(montant);
				break;
			case 4: 
				e.setMois_4(montant);
				break;
			case 5: 
				e.setMois_5(montant);
				break;
			case 6: 
				e.setMois_6(montant);
				break;
			case 7:
				e.setMois_7(montant);
				break;
			case 8: 
				e.setMois_8(montant);
				break;
			case 9: 
				e.setMois_9(montant);
				break;
			case 10: 
				e.setMois_10(montant);
				break;
			case 11: 
				e.setMois_11(montant);
				break;
			case 12: 
				e.setMois_12(montant);
				break;
			default:
			}
			 a=cotisation_emiseRepository.save(e);
		}else {
			 switch(mois) {
			case 1: 
				collections.get(0).setMois_1(montant);
				break;
			case 2: 
				collections.get(0).setMois_2(montant);
				break;
			case 3: 
				collections.get(0).setMois_3(montant);
				break;
			case 4: 
				collections.get(0).setMois_4(montant);
				break;
			case 5: 
				collections.get(0).setMois_5(montant);
				break;
			case 6: 
				collections.get(0).setMois_6(montant);
				break;
			case 7:
		      	collections.get(0).setMois_7(montant);
				break;
			case 8: 
				collections.get(0).setMois_8(montant);
				break;
			case 9: 
				collections.get(0).setMois_9(montant);
				break;
			case 10: 
				collections.get(0).setMois_10(montant);
				break;
			case 11: 
				collections.get(0).setMois_11(montant);
				break;
			case 12: 
				collections.get(0).setMois_12(montant);
				break;
			default:
			 }
			  a=cotisation_emiseRepository.save(collections.get(0));
				if(a!=null) {
					
				}
		}
		return a;
		
	}


}
