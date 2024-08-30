package com.malachitebe.interfaces;

import java.util.List;

import com.malachitebe.models.garantie_santesModels;

public interface igarantie {
/*    IEnumerable<AdherentModel> GetGarentie();*/
    List<garantie_santesModels> GetGaranties();
    //garantie_santesModels GetGarantie(Integer GarantieId);
    /*bool CreateGarantie(GarantieSantesModels model);
    bool EditGarantie(GarantieSantesModels model);*/
	garantie_santesModels GetGarantie(Integer GarantieId);
	 Double MontantCotisationgarantie(Long IdAdherent);
}
