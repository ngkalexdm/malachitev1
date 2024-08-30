package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.interfaces.ilignes_facture;
import com.malachitebe.models.facture_prestataireModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/lignes_facture")
public class lignes_factureController {
	@Autowired
	ilignes_facture ilignes_facture;
	
	@GetMapping("/SaveLigneFacture/{_NFacture}/{Id_Prestataire}/{Id_Acte}")
	public Integer SaveLigneFacture(@PathVariable("_NFacture") Long _NFacture,@PathVariable("Id_Prestataire")Integer Id_Prestataire,@PathVariable("Id_Acte")Integer Id_Acte){
		if( ilignes_facture.SaveLigneFacture(_NFacture,Id_Prestataire,Id_Acte)) {
			return 1;
		}else {
			return 2;
		}
	}
	@GetMapping("/DeleteLigneFacture/{idligne}")
	public Integer DeleteLigneFacture(@PathVariable("idligne") Integer idligne){
		if( ilignes_facture.DeleteLigneFacture(idligne)) {
			return 1;
		}else {
			return 2;
		}
	}
}
