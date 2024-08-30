package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.pac;
import com.malachitebe.interfaces.ipac;
import com.malachitebe.models.adherentModel;
import com.malachitebe.repositories.pacRepository;
@Service
public class pacService implements ipac {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	pacRepository pacRepository;
	@Override
	public List<adherentModel> PacAdherent(Long Id_Adherent) {
		String query="SELECT  p.id,p.id_adherent,p.code_mutuelle,p.nom,p.prenom,p.sexe,p.naissance, "
				+ "p.situation_actuelle,p.Parente,p.En_Stage,p.date_creation "
				+ "from "
				+ "Tab_Pac p "
				+ "where p.id_adherent="+Id_Adherent;
		List<adherentModel> collections = jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(adherentModel.class));

		return collections;
	}
	@Override
	public Boolean save(pac model) {
		
		Boolean reponse=false;
		if(pacRepository.save(model)!=null) {
			reponse=true;
		}
		return reponse;
	}

}
