package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.province;
import com.malachitebe.interfaces.iprovince;
import com.malachitebe.models.adherentModel;
@Service
public class provinceService implements iprovince {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<province> Getprovince(Integer idpays) {
		String query="SELECT  p.id,p.code_pays,p.province,p.username,p.date_creation "
				+ "FROM Tab_province p "
				+ "where p.code_pays="+idpays;
		List<province>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(province.class));
			return collections;
	}

	@Override
	public Page<adherentModel> Getprovinceetatmensuel(Integer mois, Integer Annee, Integer idpays, String search,Pageable pageable){
			String nombre= "SELECT count(DISTINCT pr.id) "
					+"FROM Tab_province pr "
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
				    	nombre=nombre+" and pr.province like'%"+search+"%'";
				} 
					Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
			String query="with QUERY AS("
					+"SELECT pr.id as id_province,pr.province,count(DISTINCT a.id)as effectif, "
					+ "sum(r.mois_"+mois+") as montant_percue,sum(b.mois_"+mois+") as montant_arriere, "
					+"ROW_NUMBER() OVER(ORDER BY pr.id DESC) as line "
					+ "FROM  Tab_province pr "
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
				    	query=query+" and pr.province like'%"+search+"%' ";
				} 
				    query=query+" group by pr.id,pr.province) SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();
			List<adherentModel> collection=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(adherentModel.class));
			return new PageImpl<adherentModel>(collection,pageable,count);
		
		
	}

	@Override
	public Page<adherentModel> Getprovinceadherentobs_susp(Integer query, Integer idpays, String search,Pageable pageable) {
		String nombre= "SELECT count(DISTINCT pr.id) "
				+"FROM Tab_province pr  "
				+ "inner join Tab_ville v on pr.id=v.code_province "
				+ "inner join Tab_communes c on v.id=c.code_ville  "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  ";
		if(query==1) {
			nombre=nombre+" where a.situation_actuelle=3 and pr.code_pays="+idpays;
		}else {
			nombre=nombre+" where a.situation_actuelle=2 and pr.code_pays="+idpays;
		}
			    if (!search.equals("0")) {
			    	nombre=nombre+" and pr.province like'%"+search+"%'";
			} 
				Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
		String querry="with QUERY AS("
				+"SELECT pr.id as id_province,pr.province,count(DISTINCT a.id)as effectif, "
				+"ROW_NUMBER() OVER(ORDER BY pr.id DESC) as line "
				+ "FROM  Tab_province pr  "
				+ "inner join Tab_ville v on pr.id=v.code_province "
				+ "inner join Tab_communes c on v.id=c.code_ville  "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  ";
		if(query==1) {
			querry=querry+" where a.situation_actuelle=3 and pr.code_pays="+idpays;
		}else {
			querry=querry+" where a.situation_actuelle=2 and pr.code_pays="+idpays;
		}
			    if (!search.equals("0")) {
			    	querry=querry+" and pr.province like'%"+search+"%' ";
			} 
			    querry=querry+" group by pr.id,pr.province) SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();
		List<adherentModel> collection=jdbcTemplate.query(querry, BeanPropertyRowMapper.newInstance(adherentModel.class));
		return new PageImpl<adherentModel>(collection,pageable,count);
	
	}
		


}
