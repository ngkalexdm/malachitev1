package com.malachitebe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.interfaces.iarriere_avance;
import com.malachitebe.interfaces.icotisation_percue;
import com.malachitebe.models.cotisationModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/arriereavance")
public class arriere_avanceController {
	@Autowired
	iarriere_avance iarriere_avance;

	@GetMapping("/GetHistoriqueCotisationarriereavance/{idadherent}/{idexercice}")
	public cotisationModel GetHistoriqueCotisationarriereavance(@PathVariable("idadherent") Long idadherent,@PathVariable("idexercice")Integer idexercice){
		return iarriere_avance.GetHistoriqueCotisationarriereavance(idadherent, idexercice);
	}
}
