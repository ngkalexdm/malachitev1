package com.malachitebe.services;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.identites;
import com.malachitebe.interfaces.iadherent;
import com.malachitebe.interfaces.iidentites;
import com.malachitebe.models.adherentModel;
import com.malachitebe.models.form_adherentModel;
import com.malachitebe.repositories.identitesRepository;

@Service
public class identitesService implements iidentites {
@Autowired
identitesRepository identitesRepository;
@Autowired
JdbcTemplate jdbcTemplate;
@Autowired 
iadherent iadherent;
	@Override
	public Boolean save(form_adherentModel model) {
		Boolean reponse =false;
		Long idtest= findbycolumn(model.getNom(), model.getPrenom(), model.getSexe(),model.getDatenaistes());
		System.out.println("rs : "+idtest);
		identites i=new identites();
		if(idtest==0) {		
			i.setAdresse(model.getAdresse());
			i.setContactresponsable(model.getContact());
			i.setEmail(model.getEmail());
			i.setId_categorie(model.getId_categorie());
			i.setId_entreprise(model.getId_entreprise());
			i.setId_commune(model.getId_commune());
			i.setId_quartier(model.getId_quartier());
			i.setLieu_naissance(model.getLieu_naissance());
			i.setNaissance(model.getNaissance());
			i.setNom(model.getNom());
			i.setPhoto(model.getPhoto());
			i.setPrenom(model.getPrenom());
			i.setProfession(model.getProfession());
			i.setResponsable(model.getResponsable()!=null?model.getResponsable():model.getResponsable()==""?null:model.getResponsable());
			i.setContactresponsable(model.getContactresponsable()!=null?model.getContactresponsable():model.getContactresponsable()==""?null:model.getContactresponsable());
			i.setSexe(model.getSexe());
			i.setTelephone_fixe(model.getTelephone_fixe());
			i.setTelephone_portable(model.getTelephone_portable());
			i=identitesRepository.save(i);
				if(i!=null) {
					model.setIdentite(i.getId());
					reponse=iadherent.SaveAdherent(model);
				}
		}
	return reponse;
	}
	
	public Long findbycolumn(String nom, String prenom, String genre, String datenais) {
		Long idresul =0L;
		String sql="SELECT top 1 id FROM Tab_identites where nom='"+nom+"' and prenom='"+prenom+"' and sexe='"+genre+"' and naissance=convert( datetime,'"+datenais+"')";
		System.out.println(sql);
		try {
			idresul = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(identites.class)).get(0).getId();
		} catch (Exception e) {
			// TODO: handle exception
			idresul =0L;
		}
		System.out.println(datenais);
		System.out.println("resultat search : "+idresul);
		return idresul;
	}

}
