package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.cour_dechange;
import com.malachitebe.interfaces.icour_dechange;

@Service
public class cour_dechangeService implements icour_dechange{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public cour_dechange getcourdechange(Integer iddevise) {
		String query="SELECT c.id,c.id_devise,c.taux,c.id_devise_convertie,c.operateur,c.date_creation "
				+ "  FROM  Tab_cour_dechange c "
				+ "  where c.id_devise="+iddevise;
		cour_dechange  collections=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(cour_dechange.class));
			return collections;
	}

}
