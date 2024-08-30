package com.malachitebe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.malachitebe.entities.actes;
import com.malachitebe.interfaces.iactes_couverts;
import com.malachitebe.interfaces.iparametrage_annuel_acte;
import com.malachitebe.models.actes_couvertModel;
import com.malachitebe.repositories.actesRepository;
@Service
public class actes_couvertsService implements iactes_couverts{
	@Autowired
	JdbcTemplate jdbcTemplate;
	 @Autowired
	 actesRepository actesRepository;
	@Autowired
	iparametrage_annuel_acte iparametrage_annuel_acte;
	@Override
	public List<actes_couvertModel> GetActes() {
		String query="SELECT  a.id as id_acte,a.nom,a.actif,a.global,p.id as id_parametrage_annuel_acte, "
				+ "p.id_exercice,p.taux_utilisation_global,p.cout_moyen_prevu,p.taux_prise_en_charge_acte, "
				+ "p.mois,a.date_creation "
				+ "FROM Tab_actes a  "
				+ "inner join Tab_parametrage_annuel_acte p on a.id=p.id_acte";
		List<actes_couvertModel>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(actes_couvertModel.class));
			return collections;
	}
	@Override
	public Boolean saveActes(actes_couvertModel  model) {
		Boolean reponse=false;
	try {
		Integer id=model.getId_Acte()==null?0:model.getId_Acte();
		Optional<actes>exist=actesRepository.findById(id);
		if(exist.isPresent()) {
			exist.get().setActif(model.getActif());
			exist.get().setDate_creation(model.getDate_creation());
			exist.get().setId(model.getId_Acte());
			exist.get().setNom(model.getNom());
			System.out.println(exist.get());
			if(actesRepository.save(exist.get())!=null){
				if(iparametrage_annuel_acte.saveparametrage_annuel_acte(model)) {
					reponse=true;
				}
			}
		}else {
			System.out.println("salut");
			actes a=new actes();
			a.setId(model.getId_Acte());
			a.setActif(model.getActif());
			a.setNom(model.getNom());
			System.out.println(a);
			System.out.println("salut");
			a=actesRepository.save(a);
			model.setId_Acte(a.getId());
			if(a!=null){
				if(iparametrage_annuel_acte.saveparametrage_annuel_acte(model)) {
					reponse=true;
				}
			}
		}
	}catch (Exception e) {
		System.out.println(e);
	}
		return reponse;
	}
	@Override
	public List<actes_couvertModel> GetActesactif() {
		String query="SELECT  a.id as id_acte,a.nom,a.actif,a.global,p.id as id_parametrage_annuel_acte, "
				+ "p.id_exercice,p.taux_utilisation_global,p.cout_moyen_prevu,p.taux_prise_en_charge_acte, "
				+ "p.mois,a.date_creation "
				+ "FROM Tab_actes a  "
				+ "inner join Tab_parametrage_annuel_acte p on a.id=p.id_acte"
				+ " where actif= 1";
		List<actes_couvertModel>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(actes_couvertModel.class));
			return collections;
	}
	@Override
	public List<actes_couvertModel> GarantieCouvertActes(Integer GarantieId) {
		String query=" select a.id as id_Acte,a.nom,a.global,a.actif,a.date_creation "
				+ "  from Tab_actes a "
				+ "  inner join Tab_garantie_couverture g on a.id=g.id_acte "
				+ "  where  g.actif=1 and g.id_garantie="+GarantieId;
		List<actes_couvertModel>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(actes_couvertModel.class));
		
			return collections;
	}

}
