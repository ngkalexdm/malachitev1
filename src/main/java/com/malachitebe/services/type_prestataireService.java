package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.type_prestataire;
import com.malachitebe.interfaces.itype_prestataire;
import com.malachitebe.repositories.type_prestataireRepository;

@Service
public class type_prestataireService implements itype_prestataire{
@Autowired
type_prestataireRepository type_prestataireRepository;
	@Override
	public List<type_prestataire> GetTypePrestataire() {
		// TODO Auto-generated method stub
		return type_prestataireRepository.findAll();
	}

}
