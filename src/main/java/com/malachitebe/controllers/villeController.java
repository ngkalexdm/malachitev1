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

import com.malachitebe.entities.ville;
import com.malachitebe.interfaces.iville;
import com.malachitebe.models.adherentModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/ville")
public class villeController {
	@Autowired
	iville iville;
	@GetMapping("/Getville/{id}")
	public List<ville> Getville(@PathVariable("id") Integer id){
		return iville.Getville(id);
	}
	@GetMapping("/Getvilleetatmensuel/{mois}/{Annee}/{idprovince}/{search}/{page}/{size}")
	public Page<adherentModel> Getvilleetatmensuel(@PathVariable("mois") Integer mois,@PathVariable("Annee") Integer Annee,@PathVariable("idprovince") Integer idprovince,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return iville.Getvilleetatmensuel(mois,Annee,idprovince,search,PageRequest.of(page, size));
	}
	@GetMapping("/Getvilleadherentobs_susp/{Query}/{idprovince}/{search}/{page}/{size}")
	public Page<adherentModel> Getvilleadherentobs_susp(@PathVariable("Query") Integer Query,@PathVariable("idprovince") Integer idprovince,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return iville.Getvilleadherentobs_susp(Query,idprovince,search,PageRequest.of(page, size));
	}
}
