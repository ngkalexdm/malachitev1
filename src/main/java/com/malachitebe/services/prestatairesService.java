package com.malachitebe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.prestataires;
import com.malachitebe.interfaces.iactes_prestataires;
import com.malachitebe.interfaces.iprestataires;
import com.malachitebe.models.actes_couvertModel;
import com.malachitebe.models.prestataire_authoriseModel;
import com.malachitebe.repositories.actes_prestatairesRepository;
import com.malachitebe.repositories.prestatairesRepository;
@Service
public class prestatairesService implements iprestataires{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	prestatairesRepository prestatairesRepository;
	@Autowired
	iactes_prestataires iactes_prestataires;
	@Autowired
	actes_prestatairesRepository actes_prestatairesRepository;
	@Override
	public List<prestataires> GetGarantiePrestataire(Integer Id_Garantie) {
		String query="select p.id,p.nom, p.adresse,p.telephone,p.fax,p.mail "
				+ " from Tab_prestataires p "
				+ " inner join Tab_type_prestataire tp on p.id_type_prestataire=tp.id "
				+ " inner join Tab_soins_couverts sc on sc.id_prestataire=p.id "
				+ " inner join Tab_garantie_couverture gc on gc.id_acte=sc.id_prestation "
				+ " where gc.id_garantie="+Id_Garantie
				+ " group by p.id,p.nom, p.adresse,p.telephone,p.fax,p.mail";
		List<prestataires> collection=jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(prestataires.class));
		return collection;
	}
	@Override
	public List<prestataire_authoriseModel> GetPrestataire() {
		String query="SELECT p.id as id_prestataire,p.nom as nom_prestataire,p.actif as actif_prestataire,p.adresse,p.telephone, "
				+ "s.id as id_statut,s.statut,t.id as id_type_prestataire,t.type_prestataire, "
				+ "p.fax,p.mail,p.date_creation "
				+ "from Tab_prestataires p "
				+ "inner join Tab_type_prestataire t on p.id_type_prestataire=t.id "
				+ "inner join Tab_statut_prestataire s on s.id=p.id_statut";
		List<prestataire_authoriseModel> collection=jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(prestataire_authoriseModel.class));
		for(prestataire_authoriseModel p:collection) {
			p.setActes(getactes(p.getId_prestataire()));
		}
		return collection;
	}
	List<actes_couvertModel> getactes(Integer idprestataire){
		String query="SELECT a.id as id_acte,a.nom,a.actif,a.global,  "
				+ "	p.cout_prevu as cout_moyen_prevu,p.date_creation  "
				+ " FROM Tab_actes a  "
				+ "	inner join Tab_actes_prestataires p on p.id_acte=a.id  "
				+ "	where id_prestataire="+ idprestataire ;
		List<actes_couvertModel> collection=jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(actes_couvertModel.class));
		return collection;
	}
	@Override
	public Boolean save(prestataire_authoriseModel model) {
		Boolean reponse=false;
		Optional<prestataires>exist=prestatairesRepository.findById(model.getId_prestataire()==null?0:model.getId_prestataire());
		if(exist.isPresent()) {
			exist.get().setActif(model.getActif_prestataire());
			exist.get().setAdresse(model.getAdresse());
			exist.get().setDate_creation(model.getDate_creation());
			exist.get().setFax(model.getFax());
			exist.get().setId_statut(model.getId_statut());
			exist.get().setId_type_prestataire(model.getId_type_prestataire());
			exist.get().setMail(model.getMail());
			exist.get().setNom(model.getNom_prestataire());
			exist.get().setTelephone(model.getTelephone());
			if(prestatairesRepository.save(exist.get())!=null) {
				reponse=iactes_prestataires.save(model);
			}
			
		}else {
			prestataires p= new prestataires();
			p.setActif(model.getActif_prestataire());
			p.setAdresse(model.getAdresse());
			p.setDate_creation(model.getDate_creation());
			p.setFax(model.getFax());
			p.setId_statut(model.getId_statut());
			p.setId_type_prestataire(model.getId_type_prestataire());
			p.setMail(model.getMail());
			p.setNom(model.getNom_prestataire());
			p.setTelephone(model.getTelephone());
			p=prestatairesRepository.save(p);
			if(p!=null) {
				model.setId_prestataire(p.getId());
				reponse=iactes_prestataires.save(model);
			}
		}
		
		return reponse;
	}
	@Override
	public List<prestataires> GetPrestataires() {
		String query="SELECT  p.id,p.nom,p.actif,p.adresse,p.telephone,p.id_type_prestataire "
				+ " ,p.id_statut,p.fax,p.mail,p.date_creation "
				+ " FROM Tab_prestataires p "
				+ " where p.actif=1";
		List<prestataires> collection=jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(prestataires.class));
		return collection;
	}

}
