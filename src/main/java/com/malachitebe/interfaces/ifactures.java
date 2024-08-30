package com.malachitebe.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.malachitebe.entities.factures;
import com.malachitebe.models.facture_prestataireModel;
public interface ifactures {
    List<facture_prestataireModel> FactureBeneficiaires(Integer Annee, Long Id_Beneficiaire);
    List<facture_prestataireModel> LignesFactures(Long NFacture);
    List<facture_prestataireModel> FactureAdherents(Integer Annee, Integer mois, Integer Query);
    facture_prestataireModel DetailFacture(Long NFacture);
     List<facture_prestataireModel> ActesPrestataires(Integer Id_Prestataire);
     factures SaveFactures(facture_prestataireModel model, Integer annee);
     ResponseEntity<?> getReportetatparadherent(String[] nfacture);
 /*   bool SaveLigneFacture(long _NFacture, int Id_Prestataire, int Id_Acte);
    bool DeleteLigneFacture(long _NFacture, int Id_Acte);
    
    IEnumerable<FacturePrestataireModels> FactureBeneficiaires(int Annee, long Id_Beneficiaire);
    IEnumerable<FacturePrestataireModels> FactureAdherents(int Annee, int mois, int Query = 0);
    FacturePrestataireModels DetailFacture(long NFacture);
    IEnumerable<FacturePrestataireModels> LignesFactures(long NFacture);
    IEnumerable<FacturePrestataireModels> ActesPrestataires(int Id_Prestataire);

    IEnumerable<FacturePrestataireModels> FacturePrestataires(int Id_Exercice, int Mois, int Id_Prestataire, int Id_Service, bool Facture_Non_Detaille = false);
    IEnumerable<FacturePrestataireModels> PacFacturePrestataires(int Id_Exercice, int Mois, int Id_Prestataire, int Id_Service, long Id_Pac, bool Facture_Non_Detaille = false);
    IEnumerable<FacturePrestataireModels> FacturePrestataires(int Id_Exercice, int Mois, int Id_Prestataire, int Id_Service, long Id_Adherent, long Id_Pac = 0, bool Facture_Non_Detaille = false);
    FacturePrestataireModels FacturePrestataire(int Id_Facture);
    FacturePrestataireModels SaveFacturePrestataires(FacturePrestataireModels model);
    bool Save();*/
}
