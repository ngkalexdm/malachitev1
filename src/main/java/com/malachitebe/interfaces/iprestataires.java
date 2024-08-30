package com.malachitebe.interfaces;

import java.util.List;

import com.malachitebe.entities.prestataires;
import com.malachitebe.models.prestataire_authoriseModel;

public interface iprestataires {
 List<prestataire_authoriseModel> GetPrestataire();
   /*   PrestataireAutorisesModels GetPrestataire(int Id_Prestataire);*/
      List<prestataires> GetGarantiePrestataire(Integer Id_Garantie);

      Boolean save(prestataire_authoriseModel model);
       List<prestataires> GetPrestataires();



}
