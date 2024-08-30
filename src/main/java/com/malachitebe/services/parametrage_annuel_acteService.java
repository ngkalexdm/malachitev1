package com.malachitebe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.exercice;
import com.malachitebe.entities.parametrage_annuel_acte;
import com.malachitebe.interfaces.iexercice;
import com.malachitebe.interfaces.iparametrage_annuel_acte;
import com.malachitebe.models.actes_couvertModel;
import com.malachitebe.models.exercicesModel;
import com.malachitebe.repositories.exerciceRepository;
import com.malachitebe.repositories.parametrage_annuel_acteRepository;

@Service
public class parametrage_annuel_acteService implements iparametrage_annuel_acte{
@Autowired
parametrage_annuel_acteRepository parametrage_annuel_acteRepository;
@Autowired
iexercice iexercice;

	@Override
	public Boolean saveparametrage_annuel_acte(actes_couvertModel model) {
		Boolean reponse=false;
		
		try {
			exercice exercice=iexercice.Exercices().get(0);
			Optional<parametrage_annuel_acte>exist=parametrage_annuel_acteRepository.findById(model.getId_parametrage_annuel_acte()==null?0:model.getId_parametrage_annuel_acte());
			if(exist.isPresent()) {
				exist.get().setCout_moyen_prevu(model.getCout_moyen_prevu());
				exist.get().setTaux_utilisation_global(model.getTaux_utilisation_global());
				exist.get().setTaux_prise_en_charge_acte(model.getTaux_prise_en_charge_acte());
				exist.get().setMois(model.getMois());
				exist.get().setId(model.getId_parametrage_annuel_acte());
				exist.get().setDate_creation(model.getDate_creation());
				exist.get().setId_acte(model.getId_Acte());
				exist.get().setId_exercice(exercice!=null?exercice.getId():0);	
				if(parametrage_annuel_acteRepository.save(exist.get())!=null) {
					reponse=true;
					}
			}else {
				
				parametrage_annuel_acte e=new parametrage_annuel_acte();
				e.setTaux_utilisation_global(model.getTaux_utilisation_global());
				e.setTaux_prise_en_charge_acte(model.getTaux_prise_en_charge_acte());
				e.setCout_moyen_prevu(model.getCout_moyen_prevu());
				e.setMois(model.getMois());
				e.setDate_creation(model.getDate_creation());
				e.setId_acte(model.getId_Acte());
				e.setId_exercice(exercice!=null?exercice.getId():0);
				
				if(parametrage_annuel_acteRepository.save(e)!=null) {
					reponse=true;
					System.out.println("salut");
					}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return reponse;
	}

}
