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

import com.malachitebe.models.cotisationModel;
import com.malachitebe.models.facture_prestataireModel;
import com.malachitebe.entities.factures;
import com.malachitebe.interfaces.ifactures;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/facture")
public class factureController {
	@Autowired
	ifactures ifactures;
	@GetMapping("/FactureBeneficiaires/{Id_Beneficiaire}/{Annee}")
	public List<facture_prestataireModel> FactureBeneficiaires(@PathVariable("Id_Beneficiaire") Long Id_Beneficiaire,@PathVariable("Annee")Integer Annee){
		return ifactures.FactureBeneficiaires(Annee,Id_Beneficiaire);
	}
	@GetMapping("/FactureAdherents/{Annee}/{mois}/{query}")
	public List<facture_prestataireModel> FactureAdherents(@PathVariable("Annee")Integer Annee,@PathVariable("mois") Integer mois,@PathVariable("query") Integer query){
		return ifactures.FactureAdherents(Annee,mois,query);
	}
	@GetMapping("/DetailFacture/{nfacture}")
	public facture_prestataireModel DetailFacture(@PathVariable("nfacture")Long nfacture){
		return ifactures.DetailFacture(nfacture);
	}
	@GetMapping("/ActesPrestataires/{idprestataire}")
	public List<facture_prestataireModel> ActesPrestataires(@PathVariable("idprestataire")Integer idprestataire){
		return ifactures.ActesPrestataires(idprestataire);
	}
	@PostMapping("/SaveFactures/{annee}")
	public factures SaveFactures(@RequestBody facture_prestataireModel model, @PathVariable("annee")Integer annee){
		return ifactures.SaveFactures(model,annee);	
	}
	@GetMapping("/getReportetatparadherent/{nfacture}")
	public ResponseEntity<?> getReportetatparadherent(@PathVariable("nfacture") String[] nfacture){
	
		return ifactures.getReportetatparadherent(nfacture);
	}
}
