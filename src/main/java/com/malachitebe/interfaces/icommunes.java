package com.malachitebe.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.malachitebe.entities.communes;
import com.malachitebe.models.adherentModel;

public interface icommunes {
	  List<communes> Getcommune(Integer idville);
	  Page<adherentModel>Getcommuneetatmensuel(Integer mois, Integer Annee,Integer idville,String search,Pageable pageable);
		 Page<adherentModel>Getcommuneeadherentobs_susp(Integer query,Integer idville,String search,Pageable pageable);
}
