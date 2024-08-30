package com.malachitebe.interfaces;

import java.util.List;

import com.malachitebe.entities.actes_couverts;
import com.malachitebe.models.actes_couvertModel;

public interface iactes_couverts {
    List<actes_couvertModel> GetActes();
    List<actes_couvertModel> GetActesactif();
    Boolean saveActes(actes_couvertModel model);
    List<actes_couvertModel> GarantieCouvertActes(Integer GarantieId);
  /*  List<actes_couvertModel> PrestataireCouvertActes(int Id_Prestataire);
    
    actes_couvertModel GetActe(int IdActe);
    actes_couverts CreateActes(actes_couverts model);
    Boolean EditActes(actes_couverts model);*/
}
