package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.pays;
import com.malachitebe.interfaces.iarriere_avance;
import com.malachitebe.interfaces.icotisation_emise;
import com.malachitebe.interfaces.icotisation_percue;
import com.malachitebe.interfaces.ipays;
import com.malachitebe.interfaces.isituation_compte;
import com.malachitebe.models.adherentModel;
import com.malachitebe.repositories.paysRepository;
@Service
public class paysService implements ipays{
@Autowired
paysRepository paysRepository;
@Autowired
icotisation_emise icotisation_emise;
@Autowired
icotisation_percue icotisation_percue;
@Autowired
iarriere_avance iarriere_avance;
@Autowired
isituation_compte isituation_compte;
@Autowired
JdbcTemplate jdbcTemplate;
	@Override
	public List<pays> Getpays() {
		return  paysRepository.findAll();
	}
	@Override
	public Page<adherentModel> Getpaysetatmensuel( Integer mois, Integer Annee,String search,Pageable pageable) {
		String nombre= "SELECT count(DISTINCT p.id) "
				+"FROM Tab_pays p  "
				+ "inner join Tab_province pr  on pr.code_pays=p.id "
				+ "inner join Tab_ville v on pr.id=v.code_province "
				+ "inner join Tab_communes c on v.id=c.code_ville  "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  "
				+ "inner join Tab_cotisation_emise e on a.id=e.id_adherent "
				+ "inner join Tab_cotisation_percue r on a.id=r.id_adherent "
				+ "inner join Tab_arriere_avance b on a.id=b.id_adherent "
				+ "inner join Tab_exercice x on x.id=r.id_exercice and x.id=b.id_exercice "
				+ "where x.annees="+Annee;
			    if (!search.equals("0")) {
			    	nombre=nombre+" and p.pays like'%"+search+"%'";
			} 
				Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
		String query="with QUERY AS("
				+"SELECT p.id as id_pays,p.pays,count(DISTINCT a.id)as effectif, "
				+ "sum(r.mois_"+mois+") as montant_percue,sum(b.mois_"+mois+") as montant_arriere, "
				+"ROW_NUMBER() OVER(ORDER BY p.id DESC) as line "
				+ "FROM Tab_pays p  "
				+ "inner join Tab_province pr  on pr.code_pays=p.id "
				+ "inner join Tab_ville v on pr.id=v.code_province "
				+ "inner join Tab_communes c on v.id=c.code_ville  "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  "
				+ "inner join Tab_cotisation_emise e on a.id=e.id_adherent "
				+ "inner join Tab_cotisation_percue r on a.id=r.id_adherent "
				+ "inner join Tab_arriere_avance b on a.id=b.id_adherent "
				+ "inner join Tab_exercice x on x.id=r.id_exercice and x.id=b.id_exercice "
				+ "where x.annees="+Annee;
			    if (!search.equals("0")) {
			    	query=query+" and p.pays like'%"+search+"%' ";
			} 
			    query=query+" group by p.id,p.pays) SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();
		List<adherentModel> collection=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(adherentModel.class));
		return new PageImpl<adherentModel>(collection,pageable,count);
	}
	@Override
	public Page<adherentModel> Getpaysadherentobs_susp(Integer query, String search, Pageable pageable) {
		String nombre= "SELECT count(DISTINCT p.id) "
				+"FROM Tab_pays p  "
				+ "inner join Tab_province pr  on pr.code_pays=p.id "
				+ "inner join Tab_ville v on pr.id=v.code_province "
				+ "inner join Tab_communes c on v.id=c.code_ville  "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  ";
		if(query==1) {
			nombre=nombre+" where a.situation_actuelle=3";
		}else {
			nombre=nombre+" where a.situation_actuelle=2";
		}
			    if (!search.equals("0")) {
			    	nombre=nombre+" and p.pays like'%"+search+"%'";
			} 
				Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
		String querry="with QUERY AS("
				+"SELECT p.id as id_pays,p.pays,count(DISTINCT a.id)as effectif, "
				+"ROW_NUMBER() OVER(ORDER BY p.id DESC) as line "
				+ "FROM Tab_pays p  "
				+ "inner join Tab_province pr  on pr.code_pays=p.id "
				+ "inner join Tab_ville v on pr.id=v.code_province "
				+ "inner join Tab_communes c on v.id=c.code_ville  "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  ";
		if(query==1) {
			querry=querry+" where a.situation_actuelle=3";
		}else {
			querry=querry+" where a.situation_actuelle=2";
		}
			    if (!search.equals("0")) {
			    	querry=querry+" and p.pays like'%"+search+"%' ";
			} 
			    querry=querry+" group by p.id,p.pays) SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();
		List<adherentModel> collection=jdbcTemplate.query(querry, BeanPropertyRowMapper.newInstance(adherentModel.class));
		return new PageImpl<adherentModel>(collection,pageable,count);
	
	}
		


}
