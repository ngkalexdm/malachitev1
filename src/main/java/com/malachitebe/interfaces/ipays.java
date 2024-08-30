package com.malachitebe.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.malachitebe.entities.pays;
import com.malachitebe.models.adherentModel;

public interface ipays {
	 List<pays> Getpays();
	 Page<adherentModel>Getpaysetatmensuel(Integer mois, Integer Annee,String search,Pageable pageable);
	 Page<adherentModel>Getpaysadherentobs_susp(Integer query,String search,Pageable pageable);
}
