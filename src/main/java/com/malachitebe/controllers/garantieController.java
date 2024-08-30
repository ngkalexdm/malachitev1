package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.entities.type_cotisation;
import com.malachitebe.interfaces.igarantie;
import com.malachitebe.interfaces.itype_cotisation;
import com.malachitebe.models.garantie_santesModels;
import com.malachitebe.models.periode_observationModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/garantie")
public class garantieController {
@Autowired
igarantie igarantie;
@Autowired 
itype_cotisation itype_cotisation;

@GetMapping("/GetGaranties")
public List<garantie_santesModels> GetGaranties() {
	return igarantie.GetGaranties();
}
@GetMapping("/GetGarantie/{GarantieId}")
public garantie_santesModels GetGaranties(@PathVariable("GarantieId") Integer GarantieId) {
	
	return igarantie.GetGarantie(GarantieId);
}
@GetMapping("/TypeCotisation")
public List<type_cotisation> TypeCotisation() {
	return itype_cotisation.TypeCotisation();
}
@GetMapping("/PeriodeObservation")
public List<periode_observationModel> PeriodeObservation() {
	return itype_cotisation.PeriodeObservation();
}

}
