package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.interfaces.iusers_systeme;
import com.malachitebe.models.users_systemeModel;
@Service
public class users_systemeService implements iusers_systeme {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<users_systemeModel> GetUserSysteme(Integer GroupeID) {
		String query="select u.id as id_user,u.nom,u.prenom,u.username,u.telephone1,u.telephone2, "
				+ "u.adresse_mail,u.fonction,g.nom_groupe,u.actif,u.date_creation "
				+ "from Tab_users_systeme u "
				+ "inner join Tab_groupe_travaille g on u.id_group=g.id ";
		if(GroupeID!=0) {
			query+=" where u.id_group="+GroupeID;;
		}
		List<users_systemeModel> collection=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(users_systemeModel.class));;
		return collection;
	}

}
