package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.entities.devises;
import com.malachitebe.interfaces.idevises;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/devise")
public class deviseController {
	 @Autowired 
	 idevises idevises;
	 @GetMapping("/ListeDevises")
		public List<devises> ListeDevises(){
			return idevises.ListeDevises();
		}
}
