package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.entities.devises;
import com.malachitebe.interfaces.icotisation_percue;
import com.malachitebe.interfaces.idevises;
import com.malachitebe.models.cotisationModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/cotisationpercue")
public class cotisation_percueController {
	@Autowired
	icotisation_percue icotisation_percue;
 @Autowired 
 idevises idevises;
 
	@GetMapping("/GetHistoriqueCotisationpercue/{idadherent}/{idexercice}")
	public cotisationModel GetHistoriqueCotisationpercue(@PathVariable("idadherent") Long idadherent,@PathVariable("idexercice")Integer idexercice){
		return icotisation_percue.GetHistoriqueCotisationpercue(idadherent, idexercice);
	}
	@GetMapping("/ListeDevises")
	
	public List<devises> ListeDevises(){
		return idevises.ListeDevises();
	}
}
