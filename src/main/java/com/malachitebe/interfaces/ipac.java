package com.malachitebe.interfaces;

import java.util.List;

import com.malachitebe.entities.pac;
import com.malachitebe.models.adherentModel;

public interface ipac {
	List<adherentModel> PacAdherent(Long Id_Adherent);
	Boolean save (pac model);
}
