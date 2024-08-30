package com.malachitebe.interfaces;

import java.util.List;

import com.malachitebe.entities.cotisation_emise;
import com.malachitebe.models.cotisationModel;

public interface icotisation_emise {
	/* int NbrsAdherent();
     IPagedList<Tab_Adherent> PagerAdherent(int? page, string search = null);
     IPagedList<AdherentModel> GetAdherent(int? page, string search = null);
     AdherentModel GetAdherentDetail(long Id_Adherent);
     bool DeleteCotisation(int Id_Adherent);
     bool SauveCotisation(Tab_Historique_Cotisation model);
     bool SauvegardeCotisation(Tab_Historique_Cotisation model, int annee);
     
     IEnumerable<AdherentModel> GetCotisation(int Query, int mois, int Annee, int Zone);
     IPagedList<AdherentModel> GetCotisations(int Query, int mois, int Annee, int pageNumber);
     IEnumerable<MoisModel> MoisCotisation(long IdAdherent);
     //IEnumerable<MoisModel> Mois();
     //IEnumerable<Tab_Exercice> Annee();*/
     Double MontantCotisationemise(Long IdAdherent);
     cotisation_emise savecotisationemise(Long idadherent,Integer idexercice,Integer mois);
	cotisationModel GetHistoriqueCotisationemise(Long IdAdherent,Integer annee);

}
