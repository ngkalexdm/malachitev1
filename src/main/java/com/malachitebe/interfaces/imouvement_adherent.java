package com.malachitebe.interfaces;

import java.util.List;

import com.malachitebe.models.mouvementModel;

public interface imouvement_adherent {
 List<mouvementModel> GetMouvement(Long Id_Adherent);
}
