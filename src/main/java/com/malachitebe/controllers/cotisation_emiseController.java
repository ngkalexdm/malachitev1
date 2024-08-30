package com.malachitebe.controllers;

import java.io.StringReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.malachitebe.entities.historique_cotisation;
import com.malachitebe.interfaces.iarriere_avance;
import com.malachitebe.interfaces.icotisation_emise;
import com.malachitebe.interfaces.icotisation_percue;
import com.malachitebe.interfaces.ihistorique_cotisation;
import com.malachitebe.models.cotisationModel;
import com.malachitebe.models.form_adherentModel;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/cotisationemise")
public class cotisation_emiseController {
	@Autowired
	icotisation_emise icotisation_emise;
	@Autowired
	ihistorique_cotisation ihistorique_cotisation;

	@GetMapping("/GetHistoriqueCotisationemise/{idadherent}/{idexercice}")
	public cotisationModel GetHistoriqueCotisationemise(@PathVariable("idadherent") Long idadherent,@PathVariable("idexercice")Integer idexercice){
		return icotisation_emise.GetHistoriqueCotisationemise(idadherent, idexercice);
	}

}
