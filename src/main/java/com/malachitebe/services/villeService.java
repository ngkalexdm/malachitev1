package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.ville;
import com.malachitebe.interfaces.iville;
import com.malachitebe.models.actes_couvertModel;
import com.malachitebe.models.adherentModel;

@Service
public class villeService implements iville{
@Autowired
JdbcTemplate jdbcTemplate;
	@Override
	public List<ville> Getville(Integer idprovince) {
		String query="SELECT v.id,v.code_province,v.ville,v.username,v.date_creation "
				+ "FROM Tab_ville v "
				+ "where v.code_province="+idprovince;
		List<ville>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(ville.class));
			return collections;
	}
	@Override
	public Page<adherentModel> Getvilleetatmensuel( Integer mois, Integer Annee, Integer idprovince,String search,Pageable pageable) {
		String nombre="SELECT count(DISTINCT v.id) "
				+ "FROM Tab_ville v   "
				+ "inner join Tab_communes c on v.id=c.code_ville  "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  "
				+ "inner join Tab_cotisation_emise e on a.id=e.id_adherent "
				+ "inner join Tab_cotisation_percue r on a.id=r.id_adherent "
				+ "inner join Tab_arriere_avance b on a.id=b.id_adherent "
				+ "inner join Tab_exercice x on x.id=r.id_exercice and x.id=b.id_exercice "
				+ "where x.annees="+Annee+" and v.code_province="+idprovince;
			    if (!search.equals("0")) {
			    	nombre=nombre+" and v.ville like'%"+search+"%' ";
			} 		
		Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
	    String query="with QUERY AS("
				+"SELECT v.id as id_ville,v.ville,count(DISTINCT a.id)as effectif, "
				+ "sum(r.mois_"+mois+") as montant_percue,sum(b.mois_"+mois+") as montant_arriere,"
				+"ROW_NUMBER() OVER(ORDER BY v.id DESC) as line "
				+ "FROM Tab_ville v   "
				+ "inner join Tab_communes c on v.id=c.code_ville  "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  "
				+ "inner join Tab_cotisation_emise e on a.id=e.id_adherent "
				+ "inner join Tab_cotisation_percue r on a.id=r.id_adherent "
				+ "inner join Tab_arriere_avance b on a.id=b.id_adherent "
				+ "inner join Tab_exercice x on x.id=r.id_exercice and x.id=b.id_exercice "
				+ "where x.annees="+Annee+" and v.code_province="+idprovince;
			    if (!search.equals("0")) {
			    	query=query+" and v.ville like'%"+search+"%' ";
			} 
			    query=query+" group by v.id,v.ville) SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();
		
		List<adherentModel> collection=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(adherentModel.class));
		return new PageImpl<adherentModel>(collection,pageable,count);
	}
	@Override
	public Page<adherentModel> Getvilleadherentobs_susp(Integer query, Integer idprovince, String search,Pageable pageable){
			String nombre= "SELECT count(DISTINCT v.id) "
					+"FROM Tab_ville v  "
					+ "inner join Tab_communes c on v.id=c.code_ville  "
					+ "inner join Tab_identites i on c.id=i.id_commune  "
					+ "inner join Tab_adherent a on a.identite=i.id  ";
			if(query==1) {
				nombre=nombre+" where a.situation_actuelle=3 and v.code_province="+idprovince;
			}else {
				nombre=nombre+" where a.situation_actuelle=2  and v.code_province="+idprovince;
			}
				    if (!search.equals("0")) {
				    	nombre=nombre+" and v.ville like'%"+search+"%'";
				} 
					Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
			String querry="with QUERY AS("
					+"SELECT v.id as id_ville,v.ville,count(DISTINCT a.id)as effectif, "
					+"ROW_NUMBER() OVER(ORDER BY v.id DESC) as line "
					+ "FROM Tab_ville v "
					+ "inner join Tab_communes c on v.id=c.code_ville  "
					+ "inner join Tab_identites i on c.id=i.id_commune  "
					+ "inner join Tab_adherent a on a.identite=i.id  ";
			if(query==1) {
				querry=querry+" where a.situation_actuelle=3 and v.code_province="+idprovince;
			}else {
				querry=querry+" where a.situation_actuelle=2 and v.code_province="+idprovince;
			}
				    if (!search.equals("0")) {
				    	querry=querry+" and v.ville like'%"+search+"%' ";
				} 
				    querry=querry+" group by v.id,v.ville) SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();
			List<adherentModel> collection=jdbcTemplate.query(querry, BeanPropertyRowMapper.newInstance(adherentModel.class));
			return new PageImpl<adherentModel>(collection,pageable,count);
	}

}
