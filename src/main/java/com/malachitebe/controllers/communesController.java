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

import com.malachitebe.entities.communes;
import com.malachitebe.interfaces.icommunes;
import com.malachitebe.models.adherentModel;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/communes")
public class communesController {
	@Autowired
	icommunes icommunes;
	@GetMapping("/Getcommune/{id}")
	public List<communes> Getcommune(@PathVariable("id") Integer id){
	
		return icommunes.Getcommune(id);
	}
	@GetMapping("/Getcommuneetatmensuel/{mois}/{Annee}/{idville}/{search}/{page}/{size}")
	public Page<adherentModel> Getcommuneetatmensuel(@PathVariable("mois") Integer mois,@PathVariable("Annee") Integer Annee,@PathVariable("idville") Integer idville,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return icommunes.Getcommuneetatmensuel(mois,Annee,idville,search,PageRequest.of(page, size));
	}
	@GetMapping("/Getcommuneeadherentobs_susp/{Query}/{idville}/{search}/{page}/{size}")
	public Page<adherentModel> Getcommuneeadherentobs_susp(@PathVariable("Query") Integer Query,@PathVariable("idville") Integer idville,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return icommunes.Getcommuneeadherentobs_susp(Query,idville,search,PageRequest.of(page, size));
	}
}
