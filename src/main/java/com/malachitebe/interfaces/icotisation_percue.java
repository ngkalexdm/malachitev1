package com.malachitebe.interfaces;


import com.malachitebe.models.cotisationModel;

public interface icotisation_percue {

	cotisationModel GetHistoriqueCotisationpercue(Long IdAdherent,Integer annee);
	Double MontantPercues(Long IdAdherent, Integer Mois, Integer Exercise);
	Double MontantPercus(Long Id_Adherent, Integer Mois, Integer Exercise);
	Boolean sauvegardecotisationpercue(Long Id_Adherent, Double montant, Integer annee);
}