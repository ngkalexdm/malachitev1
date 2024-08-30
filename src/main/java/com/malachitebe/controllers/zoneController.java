package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.interfaces.izones;
import com.malachitebe.models.regroupementModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/zones")
public class zoneController {
	@Autowired
	izones izones;
	@GetMapping("/GetZones")
	public List<regroupementModel> GetZones(){
		return izones.GetZones();
	}
}
