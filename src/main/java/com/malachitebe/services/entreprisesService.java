package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.entreprises;
import com.malachitebe.interfaces.ientreprises;
import com.malachitebe.repositories.entreprisesRepository;
@Service
public class entreprisesService implements ientreprises{
@Autowired
entreprisesRepository entreprisesRepository;
	@Override
	public List<entreprises> collectionsentreprise() {
		return entreprisesRepository.findAll();
	}

}
