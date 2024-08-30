package com.malachitebe.services;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.arriere_avance;
import com.malachitebe.interfaces.isituation_compte;
import com.malachitebe.models.adherentModel;
@Service
public class situation_compteService  implements isituation_compte{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public String SituationCompte(long Id_Adherent) {
		String situation="";
		try {
		String queryexercice="select e.id from  Tab_exercice e where  e.cloture=0";
		Calendar calendar=Calendar.getInstance();
		Integer mois=calendar.get(Calendar.MONTH);
		Integer idexercice= jdbcTemplate.queryForObject(queryexercice,Integer.class);
		 String query="select a.id,a.id_adherent,a.id_exercice,a.mois_1,a.mois_2,a.mois_3, "
		 		+ "a.mois_4,a.mois_5,a.mois_6,a.mois_7,a.mois_8,a.mois_9,a.mois_10,a.mois_11, "
		 		+ "a.mois_12,a.date_creation "
		 		+ "from Tab_arriere_avance a "
		 		+ "where a.id_adherent="+Id_Adherent+" and a.id_exercice="+idexercice;
		arriere_avance collections = jdbcTemplate.queryForObject(query,BeanPropertyRowMapper.newInstance(arriere_avance.class));
		System.out.println(collections);
if(collections!=null) {
	switch (mois)
    {
        case 1:

            situation = collections.getMois_1() > 0 ? "Avance" : collections.getMois_1() < 0 ? "Retard" : "A Jour";

            break;
        case 2:

            situation = collections.getMois_2() > 0 ? "Avance" : collections.getMois_2() < 0 ? "Retard" : "A Jour";

            break;
        case 3:

            situation = collections.getMois_3() < 0 ? "Avance" : collections.getMois_3() < 0 ? "Retard" : "A Jour";

            break;
        case 4:

            situation = collections.getMois_4() > 0 ? "Avance" : collections.getMois_4() < 0 ? "En Retard" : "A Jour";

            break;
        case 5:

            situation = collections.getMois_5() > 0 ? "Avance" : collections.getMois_5() < 0 ? "Retard" : "A Jour";

            break;
        case 6:

            situation = collections.getMois_6() > 0 ? "Avance" : collections.getMois_6() < 0 ? "Retard" : "A Jour";

            break;
        case 7:

            situation = collections.getMois_7() > 0 ? "Avance" : collections.getMois_7() < 0 ? "Retard" : "A Jour";

            break;
        case 8:

            situation = collections.getMois_8() > 0 ? "Avance" : collections.getMois_8() < 0 ? "Retard" : "A Jour";

            break;
        case 9:

            situation = collections.getMois_9() > 0 ? "Avance" : collections.getMois_9() < 0 ? "Retard" : "A Jour";

            break;
        case 10:

            situation = collections.getMois_10() > 0 ? "Avance" : collections.getMois_10() < 0 ? "Retard" : "A Jour";

            break;
        case 11:

            situation = collections.getMois_11() > 0 ? "Avance" : collections.getMois_11() < 0 ? "Retard" : "A Jour";

            break;
        case 12:

            situation = collections.getMois_12() > 0 ? "Avance" : collections.getMois_12() < 0 ? "Retard" : "A Jour";

            break;

    }
}else {
	situation="Retard";
}
}catch(Exception e) {
	
}
		return situation;
	}

}
