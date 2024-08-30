package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.entities.pays;
import com.malachitebe.interfaces.ipays;
import com.malachitebe.models.adherentModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/pays")
public class paysController {
	@Autowired
	ipays ipays;
	@GetMapping("/Getpays")
	public List<pays> Getpays(){
		return ipays.Getpays();
	}
	@GetMapping("/Getpaysetatmensuel/{mois}/{Annee}/{search}/{page}/{size}")
	public Page<adherentModel> Getpaysetatmensuel(@PathVariable("mois") Integer mois,@PathVariable("Annee") Integer Annee,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return ipays.Getpaysetatmensuel(mois,Annee,search,PageRequest.of(page, size));
	}
	@GetMapping("/Getpaysadherentobs_susp/{Query}/{search}/{page}/{size}")
	public Page<adherentModel> Getpaysadherentobs_susp(@PathVariable("Query") Integer Query,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return ipays.Getpaysadherentobs_susp(Query,search,PageRequest.of(page, size));
	}
}
