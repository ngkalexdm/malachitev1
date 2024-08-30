package com.malachitebe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.entities.historique_cotisation;
import com.malachitebe.interfaces.ihistorique_cotisation;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/historiquecotisation")
public class historique_cotisationController {
	@Autowired
	ihistorique_cotisation ihistorique_cotisation;
	
	@PostMapping("/SauvegardeCotisation")
	public ResponseEntity<?> SaveAdherent(@RequestBody historique_cotisation model ){

		if(ihistorique_cotisation.SauvegardeCotisation(model)) {
			return ResponseEntity.ok().body(model);
        }else {
	      return ResponseEntity.ok().body("Enregistrement échoué!!" );
        }
	}
}
