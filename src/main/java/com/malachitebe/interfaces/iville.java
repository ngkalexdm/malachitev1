package com.malachitebe.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.malachitebe.entities.ville;
import com.malachitebe.models.adherentModel;

public interface iville {
    List<ville> Getville(Integer idprovince);
    Page<adherentModel>Getvilleetatmensuel(Integer mois, Integer Annee,Integer idprovince,String search,Pageable pageable);
	 Page<adherentModel>Getvilleadherentobs_susp(Integer query,Integer idprovince,String search,Pageable pageable);
}
