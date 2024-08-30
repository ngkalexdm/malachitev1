package com.malachitebe.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.exercice;
import com.malachitebe.interfaces.iexercice;
import com.malachitebe.models.adherentModel;
import com.malachitebe.models.exercicesModel;
import com.malachitebe.repositories.exerciceRepository;
@Service
public class exerciceService implements iexercice {
@Autowired
JdbcTemplate jdbcTemplate;
@Autowired
exerciceRepository exerciceRepository;
	@Override
	public List<exercice> Exercices() {
		return exerciceRepository.findAll();
	}
	@Override
	public exercicesModel ExerciceEnCours() {
		 String query="SELECT e.id as id_exercice,e.annees,e.cloture "
		 		+ "FROM Tab_exercice e "
		 		+ "where e.cloture=0";
		 exercicesModel collections = jdbcTemplate.queryForObject(query,BeanPropertyRowMapper.newInstance(exercicesModel.class));

		return collections;
	}
	@Override
	public String MoisString(int mois) {
        switch (mois)
        {
            case 1:
            case 13:
                return "JANVIER";
            case 2:
                return "FEVRIER";
            case 3:
                return "MARS";
            case 4:
                return "AVRIL";
            case 5:
                return "MAI";
            case 6:
                return "JUIN";
            case 7:
                return "JUILLET";
            case 8:
                return "AOUT";
            case 9:
                return "SEPTEMBRE";
            case 10:
                return "OCTOBRE";
            case 11:
                return "NOVEMBRE";
            case 12:
                return "DECEMBRE";
            default:
                return "";
        }
	}
	@Override
	public List<exercicesModel> Mois() {
		  List<exercicesModel> _mois = new LinkedList<>();
		 try
         {
             for (int i = 0; i < 12; i++)
             {
                 int mois = i + 1;
                 exercicesModel e=new exercicesModel();
                 e.setMois(mois);
                 e.setIntitule_mois( MoisString(mois));
                 _mois.add(e);
             }
         }
         catch (Exception ex)
         {
         }
         return _mois;
	}
	@Override
	public exercicesModel Exercice(int Annee) {
		 String query="SELECT e.id as id_exercice,e.annees,e.cloture "
			 		+ " FROM Tab_exercice e "
			 		+ " where e.annees="+Annee
			 		+ " order by e.id";
			 exercicesModel collections = jdbcTemplate.queryForObject(query,BeanPropertyRowMapper.newInstance(exercicesModel.class));

			return collections;
	}

}
