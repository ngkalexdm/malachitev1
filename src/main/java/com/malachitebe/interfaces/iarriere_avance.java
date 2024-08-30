package com.malachitebe.interfaces;

import java.util.List;

import com.malachitebe.models.cotisationModel;

public interface iarriere_avance {
	 Boolean ArriereAvance(Boolean delete, Long IdAdherent, Integer Exercise, Integer Mois, Double _Montant);
	cotisationModel GetHistoriqueCotisationarriereavance(Long IdAdherent,Integer annee);
	Double _MontantArrieres(Integer Query, Long IdAdherent, Integer Mois, Integer Exercise);
    Double MontantArrieres(Integer Query, Long IdAdherent, Integer Mois);
}
