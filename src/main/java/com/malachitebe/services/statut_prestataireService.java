package com.malachitebe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.statut_prestataire;
import com.malachitebe.interfaces.istatut_prestataire;
import com.malachitebe.repositories.statut_prestataireRepository;

@Service
public class statut_prestataireService implements istatut_prestataire {
@Autowired
statut_prestataireRepository statut_prestataireRepository;
	@Override
	public List<statut_prestataire> GetStatut() {
		// TODO Auto-generated method stub
		return statut_prestataireRepository.findAll();
	}

}
