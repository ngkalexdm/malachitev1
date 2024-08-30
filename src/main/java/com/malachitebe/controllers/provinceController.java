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

import com.malachitebe.entities.province;
import com.malachitebe.entities.ville;
import com.malachitebe.interfaces.iprovince;
import com.malachitebe.models.adherentModel;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/province")
public class provinceController {
@Autowired
iprovince iprovince;
	@GetMapping("/Getprovince/{id}")
	public List<province> Getprovince(@PathVariable("id") Integer id){
		return iprovince.Getprovince(id);
	}
	@GetMapping("/Getprovinceetatmensuel/{mois}/{Annee}/{idpays}/{search}/{page}/{size}")
	public Page<adherentModel> Getprovinceetatmensuel(@PathVariable("mois") Integer mois,@PathVariable("Annee") Integer Annee,@PathVariable("idpays") Integer idpays,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return iprovince.Getprovinceetatmensuel(mois,Annee,idpays,search,PageRequest.of(page, size));
	}
	@GetMapping("/Getprovinceadherentobs_susp/{Query}/{idpays}/{search}/{page}/{size}")
	public Page<adherentModel> Getprovinceadherentobs_susp(@PathVariable("Query") Integer Query,@PathVariable("idpays") Integer idpays,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return iprovince.Getprovinceadherentobs_susp(Query,idpays,search,PageRequest.of(page, size));
	}
}
