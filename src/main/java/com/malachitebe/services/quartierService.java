package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.communes;
import com.malachitebe.entities.quartier;
import com.malachitebe.interfaces.iquartier;

@Service
public class quartierService implements iquartier{
@Autowired
JdbcTemplate jdbcTemplate;
	@Override
	public List<quartier> Getquartier(Integer idcommune) {
		String query="SELECT TOP (1000) q.id,q.code_commune,q.quartier,q.username,q.date_creation "
				+ "  FROM Tab_quartier q "
				+ "  where q.code_commune="+idcommune;
		List<quartier>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(quartier.class));
			return collections;
	}

}
