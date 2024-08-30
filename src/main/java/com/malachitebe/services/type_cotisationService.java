package com.malachitebe.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.type_cotisation;
import com.malachitebe.interfaces.itype_cotisation;
import com.malachitebe.models.periode_observationModel;
import com.malachitebe.repositories.type_cotisationRepository;

@Service
public class type_cotisationService implements itype_cotisation{
@Autowired
type_cotisationRepository type_cotisationRepository;
	@Override
	public List<type_cotisation> TypeCotisation() {
		
		return type_cotisationRepository.findAll();
	}

	@Override
	public List<periode_observationModel> PeriodeObservation() {
	List<periode_observationModel>periode= new LinkedList<periode_observationModel>();
	periode.add(new periode_observationModel(1));
	periode.add(new periode_observationModel(2));
	periode.add(new periode_observationModel(3));
	periode.add(new periode_observationModel(4));
	periode.add(new periode_observationModel(5));
	periode.add(new periode_observationModel(6));
		return periode;
	}

}
