package com.malachitebe.interfaces;

import java.util.List;

import com.malachitebe.entities.exercice;
import com.malachitebe.models.exercicesModel;

public interface iexercice {
    List<exercice> Exercices();
    exercicesModel ExerciceEnCours();
    //IEnumerable<ExercicesModels> Exercices();
    /*exercicesModel ExerciceEnCours();*/
    exercicesModel Exercice(int Annee);
    List<exercicesModel> Mois();
    String MoisString(int mois);
}
