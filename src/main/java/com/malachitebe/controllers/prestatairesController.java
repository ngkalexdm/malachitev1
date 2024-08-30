package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.entities.prestataires;
import com.malachitebe.entities.statut_prestataire;
import com.malachitebe.entities.type_prestataire;
import com.malachitebe.interfaces.iactes_prestataires;
import com.malachitebe.interfaces.iprestataires;
import com.malachitebe.interfaces.istatut_prestataire;
import com.malachitebe.interfaces.itype_prestataire;
import com.malachitebe.models.actes_couvertModel;
import com.malachitebe.models.prestataire_authoriseModel;

import jakarta.websocket.server.PathParam;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/prestataires")
public class prestatairesController {
	@Autowired
	iprestataires iprestataires;
	@Autowired
	iactes_prestataires iactes_prestataires;
	@Autowired
	istatut_prestataire istatut_prestataire;
	@Autowired
	itype_prestataire itype_prestataire;

@GetMapping("/GetPrestataire")
public List<prestataire_authoriseModel> GetPrestataire(){
	return iprestataires.GetPrestataire();
}
@GetMapping("/GetStatut")
public List<statut_prestataire> GetStatut(){
	return istatut_prestataire.GetStatut();
}
@GetMapping("/GetTypePrestataire")
public List<type_prestataire> GetTypePrestataire(){
	return itype_prestataire.GetTypePrestataire();
}

@PostMapping("/saveprestataire")
public ResponseEntity<?> saveprestataire(@RequestBody prestataire_authoriseModel model) {

	if(iprestataires.save(model)) {
		return ResponseEntity.ok().body(model);
	}else {
		//System.out.println("erreur");
		return ResponseEntity.ok().body("Enregistrement echouée");	
	}
}

@GetMapping("/deleteactePrestataire/{idprestataire}/{idactes}")
public ResponseEntity<?> deleteactePrestataire(@PathVariable("idprestataire")Integer idprestataire, @PathVariable("idactes") Integer idactes){
	 if(iactes_prestataires.delete(idprestataire,idactes)) {
		 return ResponseEntity.ok().body("");
	 }else {
		 return ResponseEntity.ok().body("Enregistrement echouée");		 
	 }
}

@GetMapping("/GetPrestataires")
public List<prestataires> GetPrestataires(){
	return iprestataires.GetPrestataires();
}
}
