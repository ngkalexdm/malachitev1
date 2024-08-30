package com.malachitebe.interfaces;

import java.util.List;

import com.malachitebe.models.facture_prestataireModel;
import com.malachitebe.models.prestataire_authoriseModel;

public interface iactes_prestataires {
Boolean save(prestataire_authoriseModel model);
Boolean delete(Integer idprestataire,Integer idactes);
List<facture_prestataireModel> ActesPrestataires(Integer Id_Prestataire);
}
