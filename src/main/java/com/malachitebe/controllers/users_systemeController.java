package com.malachitebe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malachitebe.interfaces.iadherent;
import com.malachitebe.interfaces.iusers_systeme;
import com.malachitebe.models.users_systemeModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/usersysteme")
public class users_systemeController {
	@Autowired
	iusers_systeme iusers_systeme;
	@GetMapping("/GetUserSysteme/{idgroup}")
	
	public List<users_systemeModel> GetUserSysteme(@PathVariable("idgroup") Integer idgroup){
	
		return iusers_systeme.GetUserSysteme(idgroup);
	}
	
}
