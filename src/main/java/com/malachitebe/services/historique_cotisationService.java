package com.malachitebe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.cotisation_emise;
import com.malachitebe.entities.cotisation_percue;
import com.malachitebe.entities.cour_dechange;
import com.malachitebe.entities.exercice;
import com.malachitebe.entities.historique_cotisation;
import com.malachitebe.interfaces.iarriere_avance;
import com.malachitebe.interfaces.icotisation_emise;
import com.malachitebe.interfaces.icotisation_percue;
import com.malachitebe.interfaces.icour_dechange;
import com.malachitebe.interfaces.ihistorique_cotisation;
import com.malachitebe.interfaces.isituation_adherents;
import com.malachitebe.repositories.cotisation_percueRepository;
import com.malachitebe.repositories.exerciceRepository;
import com.malachitebe.repositories.historique_cotisationRepository;

@Service
public class historique_cotisationService implements ihistorique_cotisation {
@Autowired
historique_cotisationRepository historique_cotisationRepository;
@Autowired
exerciceRepository exerciceRepository;
@Autowired
icotisation_emise icotisation_emise;
@Autowired
icotisation_percue icotisation_percue;
@Autowired
isituation_adherents isituation_adherents;
@Autowired
JdbcTemplate jdbcTemplate;
@Autowired
iarriere_avance iarriere_avance;
@Autowired
icour_dechange icour_dechange;
@Autowired
cotisation_percueRepository cotisation_percueRepository;
	@Override
	public Boolean SauvegardeCotisation(historique_cotisation model) {
		Boolean reponse=false;
		exercice exer=new exercice();
		Optional<exercice>existexercice=exerciceRepository.getexercice(model.getAnnee());
		 if (existexercice.isPresent()){
			 exer=existexercice.orElseThrow();
		 }else {
			 exer.setAnnees(model.getAnnee());
			 exer=exerciceRepository.save(exer);
		 }
		 cour_dechange c=icour_dechange.getcourdechange(model.getId_devise());
		 if(c!=null) {
			 model.setTaux(c.getTaux());
		 }
		model.setId_exercice(exer.getId());
		if(historique_cotisationRepository.save(model)!=null) {
			cotisation_emise e= icotisation_emise.savecotisationemise(model.getId_adherent(), exer.getId(), model.getMois());
				if(e!=null) {
					
				}
			
				
			if(model.getMontant() <= (icotisation_emise.MontantCotisationemise(model.getId_adherent())) &&
					(icotisation_emise.MontantCotisationemise(model.getId_adherent())) > icotisation_percue.MontantPercues(model.getId_adherent(), model.getMois(),model.getAnnee())) {
				CotisationPercue(false, model.getId_adherent(), exer.getId(), model.getMois(), model.getMontant());
				isituation_adherents.UpdateSituation(model.getId_adherent());
			}
		}
		
          return reponse;
	}
	@Override
	public Boolean CotisationPercue(Boolean delete, Long IdAdherent, Integer Exercise, Integer Mois, Double Montant) {
		Boolean rep=false;
		String query="SELECT c.id, c.id_adherent, c.id_exercice, c.annee, c.mois_1, c.mois_2, c.mois_3, c.mois_4 "
				+ ",c.mois_5, c.mois_6, c.mois_7, c.mois_8, c.mois_9, c.mois_10, c.mois_11, c.mois_12, c.date_creation "
				+ "  FROM Tab_cotisation_percue c "
				+ "  where c.id_adherent="+IdAdherent+" and c.id_exercice="+Exercise;
		cotisation_percue collection=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(cotisation_percue.class));
		if (collection != null)
        { 
			String querry="SELECT sum(h.montant) FROM Tab_historique_cotisation h  where h.id_adherent=2	and  h.id_exercice=2 and h.mois=12";
            Double _Montant =jdbcTemplate.queryForObject(querry, Double.class);

            switch (Mois)
            {
                case 1:
                    collection.setMois_1(_Montant);
                    break;
                case 2:
                	   collection.setMois_2(_Montant);
                    break;
                case 3:
                	  collection.setMois_3(_Montant);
                    break;
                case 4:
                	   collection.setMois_4(_Montant);
                    break;
                case 5:
                	   collection.setMois_5(_Montant);
                    break;
                case 6:
                	   collection.setMois_6(_Montant);
                    break;
                case 7:
                	   collection.setMois_7(_Montant);
                    break;
                case 8:
                	   collection.setMois_8(_Montant);
                    break;
                case 9:
                	   collection.setMois_9(_Montant);
                    break;
                case 10:
                	   collection.setMois_10(_Montant);
                    break;
                case 11:
                	   collection.setMois_11(_Montant);
                    break;
                case 12:
                	   collection.setMois_12(_Montant);  
                    break;
            }
            if (cotisation_percueRepository.save(collection) != null)
            {
                iarriere_avance.ArriereAvance(delete,IdAdherent, Exercise, Mois, Montant);
                rep=true;
            }
        }
             return rep;
	}

}
