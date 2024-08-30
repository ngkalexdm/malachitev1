package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.interfaces.imouvement_adherent;
import com.malachitebe.models.mouvementModel;
@Service
public class mouvement_adherentService  implements imouvement_adherent{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<mouvementModel> GetMouvement(Long Id_Adherent) {
		String query="SELECT  m.date_mouvement, m.motif_mouvement , m.nature_mouvement,m.type_mouvement, e.annees "
				+ "from Tab_mouvement_adherent m "
				+ "inner join  Tab_Exercice e on m.id_exercise=e.id "
				+ "where m.id_adherent="+Id_Adherent;
		List<mouvementModel> collections = jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(mouvementModel.class));

		return collections;
	}



}
