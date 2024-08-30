package com.malachitebe.services;

import java.io.FileNotFoundException;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.malachitebe.entities.factures;
import com.malachitebe.interfaces.iadherent;
import com.malachitebe.interfaces.ibeneficiaires;
import com.malachitebe.interfaces.iexercice;
import com.malachitebe.interfaces.ifactures;
import com.malachitebe.models.adherentModel;
import com.malachitebe.models.facture_prestataireModel;
import com.malachitebe.models.reportBase64;
import com.malachitebe.repositories.facturesRepository;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
@Service
public class facturesService implements ifactures{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	facturesRepository facturesRepository;
	@Autowired
	ibeneficiaires ibeneficiaires;
	@Autowired
	iadherent iadherent;
	@Autowired
	iexercice iexercice;
	@Override
	public List<facture_prestataireModel> FactureBeneficiaires(Integer Annee, Long Id_Beneficiaire) {
		String query="SELECT f.id,f.id_beneficaire,f.id_adherent,f.nfacture, "
				+ " f.ref_facture_prestataire,f.date,f.mois,p.id, p.nom, "
				+ " f.montant_prestataire,f.prise_en_charge,f.montant_facture, "
				+ " f.facture_non_detaille,f.anomalie,f.Commentaires,f.id_exercice "
				+ " FROM Tab_factures f "
				+ " inner join Tab_prestataires p on f.id_prestataire=p.id "
				+ " inner join Tab_exercice e on e.id=f.id_exercice "
				+" where f.id_beneficaire="+Id_Beneficiaire+" and e.annees="+Annee;
		List<facture_prestataireModel>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(facture_prestataireModel.class));
	for(facture_prestataireModel facture:collections) {
		facture.set_mois(iexercice.MoisString(facture.getMois()));	
		facture.setLignes_factures(LignesFactures(facture.getNfacture()));
		Double montant=0.0;
		for(facture_prestataireModel lignefacture:facture.getLignes_factures()) {
			montant+=lignefacture.getMontant();
		}
		facture.setTotal(montant);
	}
		return collections;
	}
	@Override
	public List<facture_prestataireModel> LignesFactures(Long NFacture) {
		String query="SELECT l.id as id_ligne,l.nfacture,l.id_acte,a.nom as nom_acte,l.montant,l.prise_en_charge "
				+ " ,l.montant_total as total "
				+ " FROM Tab_lignes_facture l "
				+ " inner join Tab_actes a on l.id_acte=a.id "
				+ " where l.nfacture="+NFacture;
		List<facture_prestataireModel>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(facture_prestataireModel.class));
	
		return collections;
	}
	@Override
	public List<facture_prestataireModel> FactureAdherents(Integer Annee, Integer mois, Integer Query) {
		String query="select f.id,f.id_beneficaire,f.id_adherent, "
				+ "f.nfacture,f.ref_facture_prestataire,f.date as dates,f.mois,  "
				+ "p.id,p.nom as nom_prestation,f.montant_prestataire,f.prise_en_charge,f.montant_facture, "
				+ "f.facture_non_detaille,f.anomalie as facture_anormale,f.commentaires "
				+ "from Tab_factures f "
				+ "inner join Tab_prestataires p on f.id_prestataire=p.id "
				+ "inner join Tab_exercice e on e.id=f.id_exercice";
		if(Query==1) {
			query+=" where e.annees="+Annee+" and f.mois="+mois;
		}else {
			query+=" where e.annees="+Annee+" and f.mois="+mois+" and f.anomalie=1";
		}
		List<facture_prestataireModel>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(facture_prestataireModel.class));
		for(facture_prestataireModel facture:collections) {
			facture.set_mois(iexercice.MoisString(facture.getMois()));	
			facture.setLignes_factures(LignesFactures(facture.getNfacture()));
			Double montant=0.0;
			for(facture_prestataireModel lignefacture:facture.getLignes_factures()) {
				montant+=lignefacture.getMontant();
			}
			facture.setTotal(montant);
		}
			return collections;
	}
	
	@Override
	public facture_prestataireModel DetailFacture(Long NFacture) {
		String query="select f.id,f.id_beneficaire as id_beneficiaire,f.id_adherent,f.nfacture,f.ref_facture_prestataire, "
				+ "f.date as dates,f.mois,p.id as id_prestataire,p.nom as nom_prestation,f.montant_prestataire,f.prise_en_charge,f.montant_facture, "
				+ "f.facture_non_detaille,f.anomalie as facture_anormale,f.commentaires "
				+ " from Tab_factures f "
				+ " inner join Tab_prestataires p on f.id_prestataire=p.id "
				+ " where f.nfacture="+NFacture;
		facture_prestataireModel  collections=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(facture_prestataireModel.class));
		adherentModel adherent=iadherent.GetAdherentDetail(collections.getId_adherent());
		adherentModel beneficiaire=ibeneficiaires.DetailBeneficiaire(collections.getId_beneficiaire());
		collections.setNom_adherent(adherent.getNom());
		collections.setPrenom_adherent(adherent.getPrenom());
		collections.setNom_beneficiaire(beneficiaire.getNom());
		collections.setPrenom_beneficiaire(beneficiaire.getPrenom());
		collections.setNaissance_beneficiaire(beneficiaire.getNaissance());
		collections.setLieunaissance_beneficiaire(beneficiaire.getLieu_naissance());
		collections.setProfession(beneficiaire.getProfession());
		collections.set_mois(iexercice.MoisString(collections.getMois()));
		collections.setCode_mutuelle(adherent.getCode_mutuelle());
		collections.set_mois(iexercice.MoisString(collections.getMois()));	
		collections.setLignes_factures(LignesFactures(collections.getNfacture()));
			Double montant=0.0;
			for(facture_prestataireModel lignefacture:collections.getLignes_factures()) {
				montant+=lignefacture.getMontant();
			}
			collections.setTotal(montant);
		
		return collections;
	}
	@Override
	public List<facture_prestataireModel> ActesPrestataires(Integer Id_Prestataire) {
		String query="select ap.id_acte,a.nom as nom_acte,ap.cout_prevu as montant "
				+ "from Tab_actes a  "
				+ "inner join Tab_actes_prestataires ap on a.id=ap.id_acte "
				+ "where ap.id_prestataire="+Id_Prestataire;
		List<facture_prestataireModel>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(facture_prestataireModel.class));
	
		return collections;
	}
	   public Long NFacture()
       {
           Long NFacture=(long)0;
           String query="SELECT top 1 f.nfacture FROM Tab_factures f  order by f.nfacture desc";
           NFacture = jdbcTemplate.queryForObject(query,Long.class);
           NFacture = NFacture == 0 ? 1000 : NFacture + 1;

           return NFacture;
       }
	@Override
	public factures SaveFactures(facture_prestataireModel model, Integer annee) {
		model.setId_exercice(iexercice.Exercice(annee).getId_exercice());
		Optional<factures> f=facturesRepository.findById(model.getId_facture()==null?0:model.getId_facture());
		if(f.isPresent()) {
		f.get().setNfacture(model.getNfacture());
		f.get().setId_beneficaire(model.getId_beneficiaire());
		f.get().setId_adherent(model.getId_adherent());
		f.get().setRef_facture_prestataire(model.getRef_facture_prestataire());
		f.get().setId_exercice(model.getId_exercice());
		f.get().setDate(model.getDates());
		f.get().setMois(model.getMois());
		f.get().setId_prestataire(model.getId_prestataire());
		f.get().setFacture_non_detaille(model.getFacture_non_detaille());
		f.get().setMontant_prestataire(model.getMontant_facture());
		f.get().setPrise_en_charge(model.getPrise_en_charge());
		f.get().setMontant_facture( f.get().getFacture_non_detaille() == true ? f.get().getMontant_prestataire() * (model.getPrise_en_charge() / 100) : 0);
		f.get().setId_devise(model.getId_devise());
		f.get().setEtat_facture(model.getEtat_facture());
		f.get().setAnomalie( f.get().getMontant_prestataire() != f.get().getMontant_facture() ? true : false);
		if(facturesRepository.save(f.get())!=null) {
			
		}
		return f.get();
		}
		else {
			factures fa=new factures();
			fa.setNfacture(NFacture());
			fa.setId_beneficaire(model.getId_beneficiaire());
			fa.setId_adherent(model.getId_adherent());
			fa.setRef_facture_prestataire(model.getRef_facture_prestataire());
			fa.setId_exercice(model.getId_exercice());
			fa.setDate(model.getDates());
			fa.setMois(model.getMois());
			fa.setId_prestataire(model.getId_prestataire());
			fa.setFacture_non_detaille(model.getFacture_non_detaille());
			fa.setMontant_prestataire(model.getMontant_facture());
			fa.setPrise_en_charge(model.getPrise_en_charge());
			fa.setMontant_facture( fa.getFacture_non_detaille() == true ? fa.getMontant_prestataire() * (model.getPrise_en_charge() / 100) : 0);
			fa.setId_devise(model.getId_devise());
			fa.setEtat_facture(model.getEtat_facture());
			fa.setAnomalie( fa.getMontant_prestataire() != fa.getMontant_facture() ? true : false);
			if(facturesRepository.save(fa)!=null) {
				
			}
			return fa;
		}
	}
	@Override
	public ResponseEntity<?> getReportetatparadherent(String[] nfacture) {
		String strnfacture = String.join(",", nfacture);
		String query="select f.id,f.id_beneficaire as id_beneficiaire,f.id_adherent,f.nfacture,f.ref_facture_prestataire, "
				+ "f.date as dates,f.mois,p.id as id_prestataire,p.nom as nom_prestation,f.montant_prestataire,f.prise_en_charge,f.montant_facture, "
				+ "f.facture_non_detaille,f.anomalie as facture_anormale,f.commentaires "
				+ " from Tab_factures f "
				+ " inner join Tab_prestataires p on f.id_prestataire=p.id "
				+ " where f.nfacture in ("+strnfacture+")";
		List<facture_prestataireModel>  collections=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(facture_prestataireModel.class));
		for(facture_prestataireModel f:collections) {
		adherentModel adherent=iadherent.GetAdherentDetail(f.getId_adherent());
		adherentModel beneficiaire=ibeneficiaires.DetailBeneficiaire(f.getId_beneficiaire());
		f.setNom_adherent(adherent.getNom());
		f.setPrenom_adherent(adherent.getPrenom());
		f.setNom_beneficiaire(beneficiaire.getNom());
		f.setPrenom_beneficiaire(beneficiaire.getPrenom());
		f.setNaissance_beneficiaire(beneficiaire.getNaissance());
		f.setLieunaissance_beneficiaire(beneficiaire.getLieu_naissance());
		f.setProfession(beneficiaire.getProfession());
		f.set_mois(iexercice.MoisString(f.getMois()));
		f.setCode_mutuelle(adherent.getCode_mutuelle());
		f.set_mois(iexercice.MoisString(f.getMois()));	
		f.setLignes_factures(LignesFactures(f.getNfacture()));
			Double montant=0.0;
			for(facture_prestataireModel lignefacture:f.getLignes_factures()) {
				montant+=lignefacture.getMontant();
			}
			f.setTotal(montant);
		}
		System.out.println(collections);
		try {
			/*Map<String, Object> params = new HashMap<String, Object>();
			String _mois=iexercice.MoisString(mois);
			params.put("mois",_mois);
			params.put("annee", annee.toString());*/
			JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(collections);
			JasperPrint empReport = JasperFillManager.fillReport(
					JasperCompileManager.compileReport(
							ResourceUtils.getFile("classpath:etats//etatparadherent//etatparadherent.jrxml").getAbsolutePath()),null, ds);

			String encodedString = Base64.getEncoder().encodeToString(JasperExportManager.exportReportToPdf(empReport));
			return ResponseEntity.ok(new reportBase64(encodedString));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			return ResponseEntity.ok().body(e.getMessage());
		} catch (JRException e) {
			// TODO: handle exception
			return ResponseEntity.ok().body(e.getMessage());
		}
	}
	}



