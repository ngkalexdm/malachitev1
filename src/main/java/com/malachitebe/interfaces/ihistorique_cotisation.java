package com.malachitebe.interfaces;

import com.malachitebe.entities.historique_cotisation;

public interface ihistorique_cotisation {
	Boolean SauvegardeCotisation(historique_cotisation model);
	  Boolean CotisationPercue(Boolean delete, Long IdAdherent, Integer Exercise, Integer Mois, Double Montant);

   /* IEnumerable<CotisationModel> GetHistoriqueCotisation(long? IdAdherent);
    IEnumerable<CotisationModel> GetHistoriqueCotisation(long? IdAdherent, int annee);
    IEnumerable<HistoriqueModel> DetailsHistorique(long? IdAdherent, int? Mois);
    IEnumerable<HistoriqueModel> DetailHistoriques(long? IdAdherent, int? Mois, int? Id_Exercice);*/
}
