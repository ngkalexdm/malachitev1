package com.malachitebe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.actes_prestataires;
import com.malachitebe.entities.lignes_facture;
import com.malachitebe.interfaces.ilignes_facture;
import com.malachitebe.models.facture_prestataireModel;
import com.malachitebe.repositories.lignes_factureRepository;

@Service
public class lignes_factureService implements ilignes_facture {
@Autowired
JdbcTemplate jdbctemplate;
@Autowired
lignes_factureRepository lignes_factureRepository;

@Override
public Boolean SaveLigneFacture(Long _NFacture, Integer Id_Prestataire, Integer Id_Acte) {
	Boolean reponse = false;
	String queryacte = "SELECT a.id,a.id_prestataire,a.id_acte,a.cout_prevu,a.date_creation "
			+ "FROM Tab_actes_prestataires a " + "where a.id_prestataire=" + Id_Prestataire + " and a.id_acte="
			+ Id_Acte;
	List<actes_prestataires> existacte = jdbctemplate.query(queryacte,BeanPropertyRowMapper.newInstance(actes_prestataires.class));
	System.out.println(existacte);
	if (!existacte.isEmpty()) {
		String query = "select l.id,l.id_acte,l.montant,l.montant_total, " + "l.nfacture,l.prise_en_charge "
				+ "from Tab_lignes_facture l " + "where l.nfacture=" + _NFacture + " and l.id_acte=" + Id_Acte;
		List<lignes_facture> exis = jdbctemplate.query(query, BeanPropertyRowMapper.newInstance(lignes_facture.class));
		System.out.println(exis);
		if (exis.isEmpty()) {
			lignes_facture exist = new lignes_facture();
			exist.setNfacture(_NFacture);
			exist.setId_acte(Id_Acte);
			exist.setMontant(existacte.get(0).getCout_prevu());
			exist.setPrise_en_charge(100.0);
			exist.setMontant_total(exist.getMontant() * (exist.getPrise_en_charge() / 100));
			if (lignes_factureRepository.save(exist) != null) {
				reponse = true;
			}
		}
	}
	return reponse;
}

	@Override
	public Boolean DeleteLigneFacture(Integer idligne) {
		Boolean rep=false;
	lignes_factureRepository.deleteById(idligne);
	Optional<lignes_facture>exist=lignes_factureRepository.findById(idligne);
	if(exist.isEmpty()) {
		rep=true;
	}
		return rep;
	}



}
