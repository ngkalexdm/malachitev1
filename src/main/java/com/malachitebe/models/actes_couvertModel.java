package com.malachitebe.models;

import java.util.Date;

public class actes_couvertModel {
	  private Integer id_Acte ;
	  private String nom ;
	  private Boolean actif ;
	  private Boolean global ;
	  private Integer id_parametrage_annuel_acte ;
	  private Integer id_exercice ;
	  private String exercice ;
	  private Integer taux_utilisation_global ;
	  private Double cout_moyen_prevu ;
	  private Integer taux_prise_en_charge_acte ;
	  private Integer mois ;
	  private Date date_creation=new Date() ;
	  
	public Integer getId_Acte() {
		return id_Acte;
	}
	public void setId_Acte(Integer id_Acte) {
		this.id_Acte = id_Acte;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public Boolean getGlobal() {
		return global;
	}
	public void setGlobal(Boolean global) {
		this.global = global;
	}
	public Integer getId_parametrage_annuel_acte() {
		return id_parametrage_annuel_acte;
	}
	public void setId_parametrage_annuel_acte(Integer id_parametrage_annuel_acte) {
		this.id_parametrage_annuel_acte = id_parametrage_annuel_acte;
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
	public Integer getTaux_utilisation_global() {
		return taux_utilisation_global;
	}
	public void setTaux_utilisation_global(Integer taux_utilisation_global) {
		this.taux_utilisation_global = taux_utilisation_global;
	}
	public Double getCout_moyen_prevu() {
		return cout_moyen_prevu;
	}
	public void setCout_moyen_prevu(Double cout_moyen_prevu) {
		this.cout_moyen_prevu = cout_moyen_prevu;
	}
	public Integer getTaux_prise_en_charge_acte() {
		return taux_prise_en_charge_acte;
	}
	public void setTaux_prise_en_charge_acte(Integer taux_prise_en_charge_acte) {
		this.taux_prise_en_charge_acte = taux_prise_en_charge_acte;
	}
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public actes_couvertModel(Integer id_Acte, String nom, Boolean actif, Boolean global, Integer id_parametrage_annuel_acte,
			Integer id_exercice, String exercice, Integer taux_utilisation_global, Double cout_moyen_prevu,
			Integer taux_prise_en_charge_acte, Integer mois, Date date_creation) {
		super();
		this.id_Acte = id_Acte;
		this.nom = nom;
		this.actif = actif;
		this.global = global;
		this.id_parametrage_annuel_acte = id_parametrage_annuel_acte;
		this.id_exercice = id_exercice;
		this.exercice = exercice;
		this.taux_utilisation_global = taux_utilisation_global;
		this.cout_moyen_prevu = cout_moyen_prevu;
		this.taux_prise_en_charge_acte = taux_prise_en_charge_acte;
		this.mois = mois;
		this.date_creation = date_creation;
	}
	
	public actes_couvertModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "actes_couvertModel [id_Acte=" + id_Acte + ", nom=" + nom + ", actif=" + actif + ", global=" + global
				+ ", id_parametrage_annuel_acte=" + id_parametrage_annuel_acte + ", id_exercice=" + id_exercice
				+ ", exercice=" + exercice + ", taux_utilisation_global=" + taux_utilisation_global
				+ ", cout_moyen_prevu=" + cout_moyen_prevu + ", taux_prise_en_charge_acte=" + taux_prise_en_charge_acte
				+ ", mois=" + mois + ", date_creation=" + date_creation + "]";
	}
	  
}
