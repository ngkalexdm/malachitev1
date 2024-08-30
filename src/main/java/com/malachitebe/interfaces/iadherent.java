package com.malachitebe.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.malachitebe.models.adherentModel;
import com.malachitebe.models.form_adherentModel;
public interface iadherent {
		Page<adherentModel> GetAdherent(String search ,Pageable pageable);
	      Page<adherentModel>GetSuspensionAdherent(Integer query,Integer idcommune,String search,Pageable pageable);
	      Boolean SaveAdherent(form_adherentModel model);
		  Page<adherentModel>Getadherentetatmensuel(Integer mois, Integer Annee,Integer idcommune,String search,Pageable pageable);
			ResponseEntity<?> getReportetatmensuel(String[] idpays,String[] idprovince,String[] idville,String[] idcommune,String[] idadherent,Integer mois,Integer annee);
			ResponseEntity<?> getReportdroitprestation(Integer query,String[] idpays,String[] idprovince,String[] idville,String[] idcommune,String[] idadherent);
			adherentModel GetAdherentDetail(Long id);
		  //    ResponseEntity<?> getReportetatmensuel(String[] idpays,String[] idville,String[] idcommune,String[] idadherent,Integer ayuerry;
			    
/*	  List<adherentModel> GetAdherent(int CodeRadiation);
      List<adherentModel> GetAdherentSearch(int CodeRadiation, String Search);
      List<adherentModel> GetAdherentGroupe(int Id_Zone);
      List<adherentModel> GetRadiationAdherent(8int Query, String mois);
      List<adherentModel> GetPacAdherent(long CodeParente);*/
     //<adherentModel>GetCotisations(Integer Query, Integer mois, Integer Annee,Pageable pageable);
     /* adherentModel GetAdherentDateCreation(double DateCreation);
      List<adherentModel> GetGroupement();
      List<regroupementModel> Regroupement();
      Page<adherentModel> RegistreAdhesion(int Page, int Size, String Search);
      Page<adherent> PagerRegistreAdhesion(int Page, int Size, String Search);
      adherent Sauvegarde(adherent model);
      Boolean SaveAdherent(FormadherentModel model, out adherentModel SortieDetails);
      String NumeroAdherent(long CodeParente);
      Page<adherent> PagerAdherent(int query, int? page);
      Boolean Sauvegarde(adherentModel model);
      adherentModel GetAdherent(long IdAdherent);*/
      
}
