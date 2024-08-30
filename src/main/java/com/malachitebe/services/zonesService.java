package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.interfaces.izones;
import com.malachitebe.models.regroupementModel;
@Service
public class zonesService implements izones{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<regroupementModel> GetZones() {
		String query="SELECT  z.id as id_zone,z.nom,z.actif,p.id as id_parametrage_annuel_zone, "
				+ "p.taille_population_cible,z.date_creation "
				+ "FROM Tab_zones z "
				+ "inner join Tab_parametrage_annuel_zone p on z.id=p.id_zone";
		List<regroupementModel> collection=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(regroupementModel.class));;
		return collection;
	}

}
