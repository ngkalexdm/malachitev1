package com.malachitebe.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.cotisation_percue;
import com.malachitebe.interfaces.iarriere_avance;
import com.malachitebe.interfaces.icotisation_emise;
import com.malachitebe.interfaces.icotisation_percue;
import com.malachitebe.models.cotisationModel;
import com.malachitebe.repositories.cotisation_percueRepository;
import com.malachitebe.repositories.exerciceRepository;
@Service
public class cotisation_percueService  implements icotisation_percue{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	icotisation_emise icotisation_emise;
	@Autowired
	exerciceRepository exerciceRepository;
	
	@Override
	public cotisationModel GetHistoriqueCotisationpercue(Long IdAdherent, Integer annee) {
		try{
			String query="select cp.id_adherent,cp.id_exercice,sum(cp.mois_1) as mois_1,sum(cp.mois_2) as mois_2,sum(cp.mois_3) as mois_3, "
				+ "sum(cp.mois_4) as mois_4,sum(cp.mois_5) as mois_5, sum(cp.mois_6) as mois_6,sum(cp.mois_7) as mois_7, "
				+ "sum(cp.mois_8) as mois_8,sum(cp.mois_9) as mois_9,sum(cp.mois_10) as mois_10,sum(cp.mois_11) as mois_11, "
				+ "sum(cp.mois_12) as mois_12 "
				+ "from Tab_cotisation_percue cp "
				+ "inner join Tab_exercice e on  e.id=cp.id_exercice "
				+ "where cp.id_adherent="+IdAdherent+" and e.annees="+annee
				+" group by  cp.id_adherent,cp.id_exercice";
		cotisationModel collection=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(cotisationModel.class));
		collection.setIntitule_cotisation("Cotisation perçue");
		return collection;
	}catch(Exception e) {
        e.printStackTrace();
        return null;
    }
	}
	@Override
	public Double MontantPercues(Long IdAdherent, Integer Mois, Integer Exercise) {
		Double montant=0.0;
		String mois="mois_"+Mois;
		try {
		String query="select cp."+mois
				+ " from Tab_cotisation_percue cp "
				+ "inner join Tab_exercice e on cp.id_exercice=e.id "
				+ "where cp.id_adherent="+IdAdherent+" and  e.annees="+Exercise;
		 montant=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(Double.class));
		 
		}catch (Exception e) {
		}
		return montant;
	}
	@Override
	public Double MontantPercus(Long Id_Adherent, Integer Mois, Integer Exercise) {
		Double montant=0.0;
		try {
		String query="select  cp.id,cp.id_adherent,cp.id_exercice,cp.mois_1,cp.mois_2,cp.mois_3, "
				+ "cp.mois_4,cp.mois_5,cp.mois_6,cp.mois_7,cp.mois_8,cp.mois_9,cp.mois_10,cp.mois_11, "
				+ "cp.mois_12,cp.date_creation "
				+ " from Tab_cotisation_percue cp "
				+ "inner join Tab_exercice e on cp.id_exercice=e.id "
				+ "where cp.id_adherent="+Id_Adherent+" and  e.annees="+Exercise;
		cotisation_percue collection=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(cotisation_percue.class));
		if(collection!=null) {
			System.out.println("salut");
            switch (Mois)
            {
                case 1:
                    montant = collection.getMois_1();
                    break;
                case 2:
                    montant = collection.getMois_1() + collection.getMois_2();
                    break;
                case 3:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3();
                    break;
                case 4:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3() + collection.getMois_4();
                    break;
                case 5:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3() + collection.getMois_4() + collection.getMois_5();
                    break;
                case 6:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3() + collection.getMois_4() + collection.getMois_5() + collection.getMois_6();
                    break;
                case 7:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3() + collection.getMois_4() + collection.getMois_5() + collection.getMois_6() + collection.getMois_7();
                    break;
                case 8:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3() + collection.getMois_4() + collection.getMois_5() + collection.getMois_6() + collection.getMois_7() + collection.getMois_8();
                    break;
                case 9:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3() + collection.getMois_4() + collection.getMois_5() + collection.getMois_6() + collection.getMois_7() + collection.getMois_8() + collection.getMois_9();
                    break;
                case 10:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3() + collection.getMois_4() + collection.getMois_5() + collection.getMois_6() + collection.getMois_7() + collection.getMois_8() + collection.getMois_9() + collection.getMois_10();
                    break;
                case 11:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3() + collection.getMois_4() + collection.getMois_5() + collection.getMois_6() + collection.getMois_7() + collection.getMois_8() + collection.getMois_9() + collection.getMois_10()+ collection.getMois_11();
                    break;
                case 12:
                    montant = collection.getMois_1() + collection.getMois_2() + collection.getMois_3() + collection.getMois_4() + collection.getMois_5() + collection.getMois_6() + collection.getMois_7() + collection.getMois_8() + collection.getMois_9() + collection.getMois_10() + collection.getMois_11() + collection.getMois_12();
                    break;
            }
		}
		}catch (Exception e) {
			return montant;
		}
		return montant;
	}
	@Override
	public Boolean sauvegardecotisationpercue(Long Id_Adherent, Double montant, Integer annee) {
		Boolean reponse=false;
			
		
		return null;
	}
	
	
	}

