package com.malachitebe.models;

import java.util.Date;
import java.util.List;

public class facture_prestataireModel {
	private Integer id_ligne ;
      private Long nfacture ;
      private String ref_facture_prestataire ;
      private Integer id_facture ;
      private Long id_adherent ;
      private String nom_adherent ;
      private String prenom_adherent ;
      private String noms ;
      private Integer id_pac ;
      private Integer id_prestation ;
      private String nom_prestation ;
      private Integer id_acte ;
      private Integer etat_facture ;
      private String nom_acte ;
      private Integer id_prestataire ;
      private String code ;
      private Integer id_exercice ;
      private String exercice ;
      private Integer mois ;
      private String _mois ;
      private Double montant ;
      private Double total ;
      private Long id_beneficiaire ;
      private String nom_beneficiaire ;
      private String prenom_beneficiaire ;
      private Double prise_en_charge ;
      private Double montant_facture ;
      private Boolean paye ;
      private Date dates ;
      private Date naissance_beneficiaire ;
      private String lieunaissance_beneficiaire ;
      private String profession ;
      private Boolean facture_anormale ;
      private String commentaire_facture_anormale ;
      private String nom_beneficiaire_existant ;
      private String prenom_beneficiaire_existant ;
      private String code_mutuelle_beneficiaire_inexistant ;
      private String code_mutuelle;
      private Boolean facture_non_detaille ;
      private String etat_adherent_fact_anormale ;
      private Long date_mise_ajours ;
      private String commentaire ;
      private List<facture_prestataireModel> lignes_factures ;
      private Integer id_devise ;
      
	  public Integer getId_ligne() {
		return id_ligne;
	}
	  
	public Long getId_beneficiaire() {
		return id_beneficiaire;
	}

	public void setId_beneficiaire(Long id_beneficiaire) {
		this.id_beneficiaire = id_beneficiaire;
	}

	public void setId_ligne(Integer id_ligne) {
		this.id_ligne = id_ligne;
	}
	public Long getNfacture() {
		return nfacture;
	}
	public void setNfacture(Long nfacture) {
		this.nfacture = nfacture;
	}
	public String getRef_facture_prestataire() {
		return ref_facture_prestataire;
	}
	public void setRef_facture_prestataire(String ref_facture_prestataire) {
		this.ref_facture_prestataire = ref_facture_prestataire;
	}
	public Integer getId_facture() {
		return id_facture;
	}
	public void setId_facture(Integer id_facture) {
		this.id_facture = id_facture;
	}
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
	}
	public String getNoms() {
		return noms;
	}
	public void setNoms(String noms) {
		this.noms = noms;
	}
	public Integer getId_pac() {
		return id_pac;
	}
	public void setId_pac(Integer id_pac) {
		this.id_pac = id_pac;
	}
	public Integer getId_prestation() {
		return id_prestation;
	}
	public void setId_prestation(Integer id_prestation) {
		this.id_prestation = id_prestation;
	}
	public String getNom_prestation() {
		return nom_prestation;
	}
	public void setNom_prestation(String nom_prestation) {
		this.nom_prestation = nom_prestation;
	}
	public Integer getId_acte() {
		return id_acte;
	}
	public void setId_acte(Integer id_acte) {
		this.id_acte = id_acte;
	}
	public String getNom_acte() {
		return nom_acte;
	}
	public void setNom_acte(String nom_acte) {
		this.nom_acte = nom_acte;
	}
	public Integer getId_prestataire() {
		return id_prestataire;
	}
	public void setId_prestataire(Integer id_prestataire) {
		this.id_prestataire = id_prestataire;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public String getExercice() {
		return exercice;
	}
	public void setExercice(String exercice) {
		this.exercice = exercice;
	}
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	public String get_mois() {
		return _mois;
	}
	public void set_mois(String _mois) {
		this._mois = _mois;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getPrise_en_charge() {
		return prise_en_charge;
	}
	public void setPrise_en_charge(Double prise_en_charge) {
		this.prise_en_charge = prise_en_charge;
	}
	public Double getMontant_facture() {
		return montant_facture;
	}
	public void setMontant_facture(Double montant_facture) {
		this.montant_facture = montant_facture;
	}
	public Boolean getPaye() {
		return paye;
	}
	public void setPaye(Boolean paye) {
		this.paye = paye;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	public Boolean getFacture_anormale() {
		return facture_anormale;
	}
	public void setFacture_anormale(Boolean facture_anormale) {
		this.facture_anormale = facture_anormale;
	}
	public String getCommentaire_facture_anormale() {
		return commentaire_facture_anormale;
	}
	public void setCommentaire_facture_anormale(String commentaire_facture_anormale) {
		this.commentaire_facture_anormale = commentaire_facture_anormale;
	}
	public String getNom_beneficiaire_existant() {
		return nom_beneficiaire_existant;
	}
	public void setNom_beneficiaire_existant(String nom_beneficiaire_existant) {
		this.nom_beneficiaire_existant = nom_beneficiaire_existant;
	}
	public String getPrenom_beneficiaire_existant() {
		return prenom_beneficiaire_existant;
	}
	public void setPrenom_beneficiaire_existant(String prenom_beneficiaire_existant) {
		this.prenom_beneficiaire_existant = prenom_beneficiaire_existant;
	}
	public String getCode_mutuelle_beneficiaire_inexistant() {
		return code_mutuelle_beneficiaire_inexistant;
	}
	public void setCode_mutuelle_beneficiaire_inexistant(String code_mutuelle_beneficiaire_inexistant) {
		this.code_mutuelle_beneficiaire_inexistant = code_mutuelle_beneficiaire_inexistant;
	}
	public Boolean getFacture_non_detaille() {
		return facture_non_detaille;
	}
	public void setFacture_non_detaille(Boolean facture_non_detaille) {
		this.facture_non_detaille = facture_non_detaille;
	}
	public String getEtat_adherent_fact_anormale() {
		return etat_adherent_fact_anormale;
	}
	public void setEtat_adherent_fact_anormale(String etat_adherent_fact_anormale) {
		this.etat_adherent_fact_anormale = etat_adherent_fact_anormale;
	}
	public Long getDate_mise_ajours() {
		return date_mise_ajours;
	}
	public void setDate_mise_ajours(Long date_mise_ajours) {
		this.date_mise_ajours = date_mise_ajours;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public List<facture_prestataireModel> getLignes_factures() {
		return lignes_factures;
	}
	public void setLignes_factures(List<facture_prestataireModel> lignes_factures) {
		this.lignes_factures = lignes_factures;
	}
	public Integer getId_devise() {
		return id_devise;
	}
	public void setId_devise(Integer id_devise) {
		this.id_devise = id_devise;
	}
	
	
	 public Integer getEtat_facture() {
		return etat_facture;
	}

	public void setEtat_facture(Integer etat_facture) {
		this.etat_facture = etat_facture;
	}

	
	public String getNom_adherent() {
		return nom_adherent;
	}

	public void setNom_adherent(String nom_adherent) {
		this.nom_adherent = nom_adherent;
	}

	public String getPrenom_adherent() {
		return prenom_adherent;
	}

	public void setPrenom_adherent(String prenom_adherent) {
		this.prenom_adherent = prenom_adherent;
	}

	public String getNom_beneficiaire() {
		return nom_beneficiaire;
	}

	public void setNom_beneficiaire(String nom_beneficiaire) {
		this.nom_beneficiaire = nom_beneficiaire;
	}

	public String getPrenom_beneficiaire() {
		return prenom_beneficiaire;
	}

	public void setPrenom_beneficiaire(String prenom_beneficiaire) {
		this.prenom_beneficiaire = prenom_beneficiaire;
	}

	
	public String getCode_mutuelle() {
		return code_mutuelle;
	}

	public void setCode_mutuelle(String code_mutuelle) {
		this.code_mutuelle = code_mutuelle;
	}

	

	public Date getNaissance_beneficiaire() {
		return naissance_beneficiaire;
	}

	public void setNaissance_beneficiaire(Date naissance_beneficiaire) {
		this.naissance_beneficiaire = naissance_beneficiaire;
	}

	public String getLieunaissance_beneficiaire() {
		return lieunaissance_beneficiaire;
	}

	public void setLieunaissance_beneficiaire(String lieunaissance_beneficiaire) {
		this.lieunaissance_beneficiaire = lieunaissance_beneficiaire;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public facture_prestataireModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public facture_prestataireModel(Integer id_ligne, Long nfacture, String ref_facture_prestataire, Integer id_facture,
			Long id_adherent, String nom_adherent, String prenom_adherent, String noms, Integer id_pac,
			Integer id_prestation, String nom_prestation, Integer id_acte, Integer etat_facture, String nom_acte,
			Integer id_prestataire, String code, Integer id_exercice, String exercice, Integer mois, String _mois,
			Double montant, Double total, Long id_beneficiaire, String nom_beneficiaire, String prenom_beneficiaire,
			Double prise_en_charge, Double montant_facture, Boolean paye, Date dates, Date naissance_beneficiaire,
			String lieunaissance_beneficiaire, String profession, Boolean facture_anormale,
			String commentaire_facture_anormale, String nom_beneficiaire_existant, String prenom_beneficiaire_existant,
			String code_mutuelle_beneficiaire_inexistant, String code_mutuelle, Boolean facture_non_detaille,
			String etat_adherent_fact_anormale, Long date_mise_ajours, String commentaire,
			List<facture_prestataireModel> lignes_factures, Integer id_devise) {
		super();
		this.id_ligne = id_ligne;
		this.nfacture = nfacture;
		this.ref_facture_prestataire = ref_facture_prestataire;
		this.id_facture = id_facture;
		this.id_adherent = id_adherent;
		this.nom_adherent = nom_adherent;
		this.prenom_adherent = prenom_adherent;
		this.noms = noms;
		this.id_pac = id_pac;
		this.id_prestation = id_prestation;
		this.nom_prestation = nom_prestation;
		this.id_acte = id_acte;
		this.etat_facture = etat_facture;
		this.nom_acte = nom_acte;
		this.id_prestataire = id_prestataire;
		this.code = code;
		this.id_exercice = id_exercice;
		this.exercice = exercice;
		this.mois = mois;
		this._mois = _mois;
		this.montant = montant;
		this.total = total;
		this.id_beneficiaire = id_beneficiaire;
		this.nom_beneficiaire = nom_beneficiaire;
		this.prenom_beneficiaire = prenom_beneficiaire;
		this.prise_en_charge = prise_en_charge;
		this.montant_facture = montant_facture;
		this.paye = paye;
		this.dates = dates;
		this.naissance_beneficiaire = naissance_beneficiaire;
		this.lieunaissance_beneficiaire = lieunaissance_beneficiaire;
		this.profession = profession;
		this.facture_anormale = facture_anormale;
		this.commentaire_facture_anormale = commentaire_facture_anormale;
		this.nom_beneficiaire_existant = nom_beneficiaire_existant;
		this.prenom_beneficiaire_existant = prenom_beneficiaire_existant;
		this.code_mutuelle_beneficiaire_inexistant = code_mutuelle_beneficiaire_inexistant;
		this.code_mutuelle = code_mutuelle;
		this.facture_non_detaille = facture_non_detaille;
		this.etat_adherent_fact_anormale = etat_adherent_fact_anormale;
		this.date_mise_ajours = date_mise_ajours;
		this.commentaire = commentaire;
		this.lignes_factures = lignes_factures;
		this.id_devise = id_devise;
	}

	@Override
	public String toString() {
		return "facture_prestataireModel [id_ligne=" +id_ligne  + ", nfacture=" + nfacture
				+ ", ref_facture_prestataire=" + ref_facture_prestataire + ", id_facture=" + id_facture
				+ ", id_adherent=" + id_adherent + ", noms=" + noms + ", id_pac=" + id_pac + ", id_prestation="
				+ id_prestation + ", nom_prestation=" + nom_prestation + ", id_acte=" + id_acte + ", nom_acte="
				+ nom_acte + ", id_prestataire=" + id_prestataire + ", code=" + code + ", id_exercice=" + id_exercice
				+ ", exercice=" + exercice + ", mois=" + mois + ", _mois=" + _mois + ", montant=" + montant + ", total="
				+ total + ", prise_en_charge=" + prise_en_charge + ", montant_facture=" + montant_facture + ", paye="
				+ paye + ", dates=" + dates + ", facture_anormale=" + facture_anormale
				+ ", commentaire_facture_anormale=" + commentaire_facture_anormale + ", nom_beneficiaire_existant="
				+ nom_beneficiaire_existant + ", prenom_beneficiaire_existant=" + prenom_beneficiaire_existant
				+ ", code_mutuelle_beneficiaire_inexistant=" + code_mutuelle_beneficiaire_inexistant
				+ ", facture_non_detaille=" + facture_non_detaille + ", etat_adherent_fact_anormale="
				+ etat_adherent_fact_anormale + ", date_mise_ajours=" + date_mise_ajours + ", commentaire="
				+ commentaire + ", lignes_factures=" + lignes_factures + ", id_devise=" + id_devise + "]";
	}
      
      
}
