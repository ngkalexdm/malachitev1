package com.malachitebe.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.beneficiaires;
import com.malachitebe.interfaces.ibeneficiaires;
import com.malachitebe.models.adherentModel;
import com.malachitebe.models.form_adherentModel;
import com.malachitebe.repositories.beneficiairesRepository;
@Service
public class beneficiairesService implements ibeneficiaires {
@Autowired
JdbcTemplate jdbcTemplate;
@Autowired
beneficiairesRepository beneficiairesRepository;
	@Override
	public Page<adherentModel> BeneficiaireAdherent(String Search,Pageable pageable) {
		String nombre="SELECT COUNT(*)"
				+ "FROM Tab_beneficiaires b  "
				+ "inner join Tab_identites i on b.identite=i.id "
				+ "inner join Tab_adherent a on a.identite=b.identite "
				+ "where b.situation_actuelle!=4";
	    if (!Search.equals("0")) {
	    	nombre=nombre+" and b.code_mutuelle like'%"+Search+"%' or i.nom like'%"+Search+"%' or i.profession like'%"+Search+"%' or i.prenom like'%"+Search+"%' or i.telephone_portable like'%"+Search+"%' or i.sexe like'%"+Search+"%' ";
	} 
	    //System.out.println(nombre);
		Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
    String query="with QUERY AS("
			+"SELECT "
			+ "case when a.identite='' then i.id else i.id end as id_adherent, "
			+ "b.code_mutuelle, "
			+ "CONCAT(i.nom,' ',i.prenom)nom, "
			+ "i.profession, "
			+ "case when i.telephone_portable='' then i.telephone_fixe else i.telephone_portable end telephone_portable, "
			+ "i.sexe,"
			+ "b.situation_actuelle, "
			+"ROW_NUMBER() OVER(ORDER BY a.identite DESC) as line "
			+ "FROM Tab_beneficiaires b  "
			+ "inner join Tab_identites i on b.id=i.id "
			+ "inner join Tab_adherent a on a.identite=b.identite "
			+ "where b.situation_actuelle!=4";
    if (!Search.equals("0")) {
    query=query+" and b.code_mutuelle like'%"+Search+"%' or i.nom like'%"+Search+"%' or i.profession like'%"+Search+"%' or i.prenom like'%"+Search+"%' or i.telephone_portable like'%"+Search+"%' or i.sexe like'%"+Search+"%' ";
} 
query=query+" group by a.id,i.id,a.identite,i.telephone_fixe, i.prenom ,b.code_mutuelle, i.nom ,i.profession ,i.telephone_portable ,i.sexe,b.situation_actuelle "
		+ ") SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();

System.out.println(query);
List<adherentModel> collections = jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(adherentModel.class));
return new PageImpl<adherentModel>(collections,pageable,count);

	}
	@Override
	public Page<adherentModel> GetBeneficiaire(String Search, Pageable pageable) {
		String nombre="SELECT COUNT(*)"
				+ "FROM Tab_beneficiaires b  "
				+ "inner join Tab_identites i on b.identite=i.id "
				+ "inner join Tab_adherent a on a.identite=b.identite ";
	    if (!Search.equals("0")) {
	    	nombre=nombre+" where b.code_mutuelle like'%"+Search+"%' or i.nom like'%"+Search+"%' or i.prenom like'%"+Search+"%' or i.profession like'%"+Search+"%' or i.telephone_portable like'%"+Search+"%' or i.sexe like'%"+Search+"%' ";
	} 
		Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
    String query="with QUERY AS("
			+"SELECT "
			+ "a.id  as id_adherent, "
			+"b.id as id_beneficiaire, "
			+ "b.code_mutuelle, "
			+ "i.nom, "
			+ "i.profession, "
			+ "i.telephone_portable, "
			+ "i.sexe,"
			+ "b.situation_actuelle, "
			+"ROW_NUMBER() OVER(ORDER BY a.id DESC) as line "
			+ "FROM Tab_beneficiaires b  "
			+ "inner join Tab_identites i on b.identite=i.id "
			+ "inner join Tab_adherent a on a.identite=b.identite ";
    if (!Search.equals("0")) {
    query=query+" where b.code_mutuelle like'%"+Search+"%' or i.nom like'%"+Search+"%' or i.prenom like'%"+Search+"%' or i.profession like'%"+Search+"%' or i.telephone_portable like'%"+Search+"%' or i.sexe like'%"+Search+"%' ";
} 
query=query+" group by a.id , b.id, b.code_mutuelle, i.nom ,i.profession ,i.telephone_portable ,i.sexe,b.situation_actuelle "
		+ ") SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();

List<adherentModel> collections = jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(adherentModel.class));
System.out.println(collections);
System.out.println("heello");
return new PageImpl<adherentModel>(collections,pageable,count);
	}
	@Override
	public adherentModel DetailBeneficiaire(Long Id_Beneficiaire) {
		String query="SELECT b.id as id_beneficiaire,b.id_adherent,b.code_mutuelle, "
				+ "i.nom,i.sexe,i.naissance,i.profession,i.telephone_fixe,i.telephone_portable, "
				+ "i.email,b.situation_actuelle,s.intitule_situation as situation_adherent,i.photo "
				+ "from Tab_beneficiaires b "
				+ "inner join Tab_identites i on i.id=b.identite "
				+ "inner join Tab_situation_adherents s on s.id=b.situation_actuelle "
				+"where b.id="+Id_Beneficiaire;
		adherentModel collections=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(adherentModel.class));
		String icon=collections.getSituation_actuelle() == 4 ? "fa fa-close fa-2x" : collections.getSituation_actuelle() == 3 ?
                "fa fa-close fa-2x" : collections.getSituation_actuelle() == 2 ? "fa fa-info fa-2x" : "fa fa-check-circle fa-2x";
		collections.setIcon(icon);
		return collections;
	}
	@Override
	public Boolean AddBeneficiaire(form_adherentModel model) {
	Boolean reponse=false;
	  beneficiaires ben = new beneficiaires();
      ben.setIdentite(model.getIdentite());
      ben.setId_adherent(model.getId_adherent()); 
      ben.setCode_mutuelle(model.getCode_mutuelle()); 
      //ben.setId_zone(model.getId_zone()); 
      ben.setSituation_actuelle(model.getSituation_actuelle()); 
      if(beneficiairesRepository.save(ben)!=null) {
    	  reponse=true;
      }
	
	return reponse;
	}
	@Override
	public List<adherentModel> GetPacAdherent(Long idadherent) {
		String query="select b.id_adherent,b.id as id_beneficiaire,b.code_mutuelle,  "
				+ " i.nom ,i.prenom,i.sexe,i.naissance,i.profession,i.adresse,  "
				+ " i.telephone_fixe,i.telephone_portable,b.situation_actuelle,  "
				+ " i.photo,i.id_categorie,s.intitule_situation as situation_adherent   "
				+ " from Tab_beneficiaires b  "
				+ "	inner join Tab_identites i on i.id=b.identite  "
				+ " inner join Tab_Situation_Adherents s on b.situation_actuelle= s.id  "
				+ " where id_adherent="+idadherent;
				
	List<adherentModel> collections = jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(adherentModel.class));
	for(adherentModel e:collections) {
		e.setIcon(e.getSituation_actuelle() == 4 ? "icon-close" : e.getSituation_actuelle() == 3 ? "icon-close" : e.getSituation_actuelle() == 2 ? "icon-info" : "icon-check");
	}
		return collections;
	}
	

}
