package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.entities.quartier;
import com.malachitebe.interfaces.iquartier;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/quartier")
public class quartierController {
	@Autowired
	iquartier iquartier;
	@GetMapping("/Getquartier/{id}")
	public List<quartier> Getquartier(@PathVariable("id") Integer id){
	
		return iquartier.Getquartier(id);
	}
}
