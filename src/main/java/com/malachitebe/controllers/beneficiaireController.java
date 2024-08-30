package com.malachitebe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.interfaces.ibeneficiaires;
import com.malachitebe.models.adherentModel;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/beneficiaire")

public class beneficiaireController {
@Autowired
ibeneficiaires ibeneficiaires;

@GetMapping("/BeneficiaireAdherent/{search}/{page}/{size}")
public Page<adherentModel> BeneficiaireAdherent(@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
	return ibeneficiaires.BeneficiaireAdherent(search,PageRequest.of(page, size));
}
@GetMapping("/GetBeneficiaire/{search}/{page}/{size}")
public Page<adherentModel> GetBeneficiaire(@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
	return ibeneficiaires.GetBeneficiaire(search,PageRequest.of(page, size));
}
@GetMapping("/DetailBeneficiaire/{Id_Beneficiaire}")
public adherentModel DetailBeneficiaire(@PathVariable("Id_Beneficiaire") Long Id_Beneficiaire ){
	return ibeneficiaires.DetailBeneficiaire(Id_Beneficiaire);
}
}
