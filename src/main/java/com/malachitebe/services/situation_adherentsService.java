package com.malachitebe.services;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.adherent;
import com.malachitebe.entities.arriere_avance;
import com.malachitebe.entities.beneficiaires;
import com.malachitebe.interfaces.iarriere_avance;
import com.malachitebe.interfaces.icotisation_emise;
import com.malachitebe.interfaces.iexercice;
import com.malachitebe.interfaces.igarantie;
import com.malachitebe.interfaces.isituation_adherents;
import com.malachitebe.models.adherentModel;
import com.malachitebe.models.exercicesModel;
import com.malachitebe.models.garantie_santesModels;
import com.malachitebe.repositories.adherentRepository;
import com.malachitebe.repositories.beneficiairesRepository;

@Service
public class situation_adherentsService implements isituation_adherents {
@Autowired
iexercice iexercice;
@Autowired
iarriere_avance iarriere_avance;
@Autowired
icotisation_emise icotisation_emise;
@Autowired
adherentRepository adherentRepository;
@Autowired
beneficiairesRepository beneficiairesRepository;
@Autowired
JdbcTemplate jdbcTemplate;
@Autowired
igarantie igarantie;
	@Override
	public void UpdateSituation(Long IdAdherent) {		
		  exercicesModel exer =iexercice.ExerciceEnCours();
		  Calendar calendar = Calendar.getInstance();
			Integer mois =calendar.get(Calendar.MONTH)+1;
		  Double montant =  iarriere_avance._MontantArrieres(1, IdAdherent, mois, exer != null ? exer.getAnnees() : 0);
          Double montantCotisation = icotisation_emise.MontantCotisationemise(IdAdherent);
          Integer EquivalentMois = montantCotisation == 0 ? 0 : Integer.parseInt((-montant / montantCotisation)+"");
          String query="SELECT  a.id,a.identite,a.id_garantie,a.id_zone,a.code_mutuelle,a.beneficiaire "
          		+ ",a.situation_actuelle,a.salaire,a.username,a.date_creation,a.etat "
          		+ "FROM Tab_adherent a "
          		+ "where a.id="+IdAdherent+" and a.situation_actuelle!=4";
          adherent a=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(adherent.class));
          if(a!=null) {
        	  garantie_santesModels Garantie =igarantie.GetGarantie(a.getId_garantie());
              Integer Retard = Garantie == null ? 0 : Garantie.getDelai_retard();
              Integer Reprise = Garantie == null ? 0 :Garantie.getDelai_reprise();
              Integer Observation = Garantie == null ? 0 : Garantie.getObservation();
              if (a.getSituation_actuelle() != 3)
              {
                  if (EquivalentMois >= Retard)
                  {
                      a.setSituation_actuelle(EquivalentMois > Observation ? 3 : a.getSituation_actuelle());

                      if (adherentRepository.save(a) != null)
                      {
                    	  String quer="SELECT b.id,b.identite,b.id_adherent,b.code_mutuelle,b.id_zone,b.situation_actuelle "
                    	  		+ ",b.username,b.date_creation "
                    	  		+ "  FROM Tab_beneficiaires b "
                    	  		+ "  where b.id_adherent="+IdAdherent+" and b.situation_actuelle!=4";
                          List<beneficiaires> beneficiaire =jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(beneficiaires.class));
                          for (beneficiaires b: beneficiaire)
                          {
                              b.setSituation_actuelle(a.getSituation_actuelle());
                              beneficiairesRepository.save(b);

                          }
                          
                      }

                  }
              }
              else
              {
                  if (EquivalentMois == Reprise)
                  {
                	  a.setSituation_actuelle(1);

                	  if (adherentRepository.save(a) != null)
                      {
                    	  String quer="SELECT b.id,b.identite,b.id_adherent,b.code_mutuelle,b.id_zone,b.situation_actuelle "
                    	  		+ ",b.username,b.date_creation "
                    	  		+ "  FROM Tab_beneficiaires b "
                    	  		+ "  where b.id_adherent="+IdAdherent+" and b.situation_actuelle!=4";
                          List<beneficiaires> beneficiaire =jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(beneficiaires.class));
                          for (beneficiaires b: beneficiaire)
                          {
                              b.setSituation_actuelle(a.getSituation_actuelle());
                              beneficiairesRepository.save(b);

                          }
                          
                      }

                  }

          }
		
	}
	}
}
