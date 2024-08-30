package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.devises;
import com.malachitebe.interfaces.idevises;
import com.malachitebe.repositories.devisesRepository;

@Service
public class devisesService implements idevises{
@Autowired
devisesRepository devisesRepository;
	@Override
	public List<devises> ListeDevises() {
		return devisesRepository.findAll();
	}

}
