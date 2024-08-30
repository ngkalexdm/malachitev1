package com.malachitebe.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.malachitebe.entities.province;
import com.malachitebe.models.adherentModel;

public interface iprovince {
    List<province> Getprovince(Integer idpays);
    Page<adherentModel>Getprovinceetatmensuel(Integer mois, Integer Annee,Integer idpays,String search,Pageable pageable);
	 Page<adherentModel>Getprovinceadherentobs_susp(Integer query,Integer idpays,String search,Pageable pageable);
}
