package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.communes;
import com.malachitebe.entities.ville;
import com.malachitebe.interfaces.icommunes;
import com.malachitebe.models.adherentModel;

@Service
public class communesService implements icommunes {
@Autowired 
JdbcTemplate jdbcTemplate;
	@Override
	public List<communes> Getcommune(Integer idville) {
		String query="SELECT  c.id,c.code_ville, c.commune, c.username,c.date_creation "
				+ "  FROM Tab_communes c "
				+ "  where c.code_ville="+idville;
		List<communes>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(communes.class));
			return collections;
	}
	@Override
	public Page<adherentModel> Getcommuneetatmensuel(Integer mois, Integer Annee, Integer idville,String search,Pageable pageable) {
		String nombre="SELECT count(DISTINCT c.id) "
				+"FROM  Tab_communes c   "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  "
				+ "inner join Tab_cotisation_emise e on a.id=e.id_adherent "
				+ "inner join Tab_cotisation_percue r on a.id=r.id_adherent "
				+ "inner join Tab_arriere_avance b on a.id=b.id_adherent "
				+ "inner join Tab_exercice x on x.id=r.id_exercice and x.id=b.id_exercice "
				+ "where x.annees="+Annee+" and c.code_ville="+idville;
	    	if (!search.equals("0")) {
	    		nombre=nombre+" and c.commune like'%"+search+"%' ";
	    	} 
	    	Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
		String query="with QUERY AS("
				+"SELECT c.id as id_commune,c.commune,count(DISTINCT a.id)as effectif, "
				+ "sum(r.mois_"+mois+") as montant_percue,sum(b.mois_"+mois+") as montant_arriere, "
				+"ROW_NUMBER() OVER(ORDER BY c.id DESC) as line "
				+"FROM Tab_communes c "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  "
				+ "inner join Tab_cotisation_emise e on a.id=e.id_adherent "
				+ "inner join Tab_cotisation_percue r on a.id=r.id_adherent "
				+ "inner join Tab_arriere_avance b on a.id=b.id_adherent "
				+ "inner join Tab_exercice x on x.id=r.id_exercice and x.id=b.id_exercice "
				+ "where x.annees="+Annee+" and c.code_ville="+idville;
	    if (!search.equals("0")) {
	    	query=query+" and c.commune like'%"+search+"%' ";
	} 
	    query=query+" group by c.id,c.commune) SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();

		List<adherentModel> collection=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(adherentModel.class));
		return new PageImpl<adherentModel>(collection,pageable,count);
	}
	@Override
	public Page<adherentModel> Getcommuneeadherentobs_susp(Integer query, Integer idville, String search,Pageable pageable) {
		String nombre= "SELECT count(DISTINCT c.id) "
				+"FROM  Tab_communes c "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  ";
		if(query==1) {
			nombre=nombre+" where a.situation_actuelle=3 and c.code_ville="+idville;
		}else {
			nombre=nombre+" where a.situation_actuelle=2  and c.code_ville="+idville;
		}
			    if (!search.equals("0")) {
			    	nombre=nombre+" and c.commune like'%"+search+"%'";
			} 
				Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
		String querry="with QUERY AS("
				+"SELECT c.id as id_commune,c.commune,count(DISTINCT a.id)as effectif, "
				+"ROW_NUMBER() OVER(ORDER BY c.id DESC) as line "
				+ "FROM  Tab_communes c "
				+ "inner join Tab_identites i on c.id=i.id_commune  "
				+ "inner join Tab_adherent a on a.identite=i.id  ";
		if(query==1) {
			querry=querry+" where a.situation_actuelle=3 and c.code_ville="+idville;
		}else {
			querry=querry+" where a.situation_actuelle=2 and c.code_ville="+idville;
		}
			    if (!search.equals("0")) {
			    	querry=querry+" and c.commune like'%"+search+"%' ";
			} 
			    querry=querry+" group by c.id,c.commune) SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();
		List<adherentModel> collection=jdbcTemplate.query(querry, BeanPropertyRowMapper.newInstance(adherentModel.class));
		return new PageImpl<adherentModel>(collection,pageable,count);
	}

}
