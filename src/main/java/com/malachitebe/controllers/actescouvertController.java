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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.interfaces.iactes_couverts;
import com.malachitebe.interfaces.iactes_prestataires;
import com.malachitebe.models.actes_couvertModel;
import com.malachitebe.models.facture_prestataireModel;

import jakarta.websocket.server.PathParam;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/actescouvert")
public class actescouvertController {
@Autowired
iactes_couverts iactes_couverts;
@Autowired
iactes_prestataires iactes_prestataires;
@GetMapping("/GetActesactif")
public List<actes_couvertModel> GetActesactif(){
	return iactes_couverts.GetActesactif();
}
@GetMapping("/GetActes")
public List<actes_couvertModel> GetActes(){
	return iactes_couverts.GetActes();
}

@GetMapping("/GarantieCouvertActes/{GarantieId}")
public List<actes_couvertModel> GarantieCouvertActes(@PathVariable("GarantieId") Integer GarantieId){
	return iactes_couverts.GarantieCouvertActes(GarantieId);
}

@PostMapping("/saveActes")
public ResponseEntity<?> saveActes(@RequestBody actes_couvertModel model) {

	if(iactes_couverts.saveActes(model)) {
		System.out.println(model);
		return ResponseEntity.ok().body(model);
	}else {
		//System.out.println("erreur");
		return ResponseEntity.ok().body("Enregistrement echouée");	
	}
}
@GetMapping("/ActesPrestataires/{id_prestataire}")
public List<facture_prestataireModel> ActesPrestataires(@PathVariable("id_prestataire") Integer id_prestataire){
	return iactes_prestataires.ActesPrestataires(id_prestataire);
}
}
