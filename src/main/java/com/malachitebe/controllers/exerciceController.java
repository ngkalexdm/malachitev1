package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.entities.exercice;
import com.malachitebe.interfaces.iexercice;
import com.malachitebe.models.exercicesModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/exercice")
public class exerciceController {
	@Autowired
	iexercice iexercice;

	@GetMapping("/Exercices")
	public List<exercice> Exercices(){
		return iexercice.Exercices();
	}
	@GetMapping("/Mois")
	public List<exercicesModel> Mois(){
		return iexercice.Mois();
	}
}
