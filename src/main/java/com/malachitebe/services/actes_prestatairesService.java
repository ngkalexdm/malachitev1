package com.malachitebe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.actes_prestataires;
import com.malachitebe.interfaces.iactes_prestataires;
import com.malachitebe.models.actes_couvertModel;
import com.malachitebe.models.adherentModel;
import com.malachitebe.models.facture_prestataireModel;
import com.malachitebe.models.prestataire_authoriseModel;
import com.malachitebe.repositories.actes_prestatairesRepository;
import com.malachitebe.repositories.lignes_factureRepository;

@Service
public class actes_prestatairesService implements iactes_prestataires{
@Autowired
actes_prestatairesRepository actes_prestatairesRepository;
@Autowired
JdbcTemplate jdbcTemplate;
	@Override
	public Boolean save(prestataire_authoriseModel model) {
		Boolean reponse=false;
		Long id=(long) 0;
		String query="";
		for (actes_couvertModel acte: model.getActes()){
			Integer idprestataire=model.getId_prestataire()==null?0:model.getId_prestataire();
			Integer idacte=acte.getId_Acte()==null?0:acte.getId_Acte();
			Optional<actes_prestataires>exist=actes_prestatairesRepository.getacteprestataire(idprestataire,idacte);
			if(exist.isPresent()) {
				exist.get().setCout_prevu(acte.getCout_moyen_prevu());
				exist.get().setDate_creation(acte.getDate_creation());
				exist.get().setId_acte(acte.getId_Acte());
				exist.get().setId_prestataire(model.getId_prestataire());
				if(actes_prestatairesRepository.save(exist.get())!=null) {
					reponse=true;
				}
			}else {
				actes_prestataires a=new actes_prestataires();
				a.setCout_prevu(acte.getCout_moyen_prevu());
				a.setDate_creation(acte.getDate_creation());
				a.setId_acte(acte.getId_Acte());
				a.setId_prestataire(model.getId_prestataire());
				if(actes_prestatairesRepository.save(a)!=null) {
					reponse=true;
				}
		}
		}
		return reponse;
	}
	@Override
	public Boolean delete(Integer idprestataire, Integer idactes) {
		// TODO Auto-generated method stub
		Boolean rep=false;
		rep=actes_prestatairesRepository.deleteacteprestataire(idprestataire, idactes)==true?true:false;
	return	rep;
	}
	@Override
	public List<facture_prestataireModel> ActesPrestataires(Integer Id_Prestataire) {
		String query="SELECT p.id_acte,a.nom as nom_acte,p.cout_prevu as montant,p.id_prestataire "
				+ "FROM Tab_actes_prestataires p "
				+ "inner join Tab_actes a on a.id=p.id_acte "
				+ "where p.id_prestataire="+Id_Prestataire;
		List<facture_prestataireModel>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(facture_prestataireModel.class));
		
		return collections;
	}
	
}
