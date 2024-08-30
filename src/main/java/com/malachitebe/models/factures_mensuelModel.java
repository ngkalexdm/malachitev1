package com.malachitebe.models;

import java.util.Date;

public class factures_mensuelModel {

    private Integer id_facture_mensuelle ;
    private String exercice ;
    private Integer id_exercice ;
    private Integer id_prestation ;
    private String nom_prestation ;
    private Integer id_acte ;
    private String nom_acte ;
    private Integer id_prestataire ;
    private Integer id_zone ;
    private String nom_zone ;
    private Integer mois ;
    private Double total ;
    private Double montant_facture ;
    private Integer prise_en_charge ;
    private Integer nombre_acte ;
    private Date dates ;
    private Integer id_devise ;
    
	public Integer getId_facture_mensuelle() {
		return id_facture_mensuelle;
	}
	public void setId_facture_mensuelle(Integer id_facture_mensuelle) {
		this.id_facture_mensuelle = id_facture_mensuelle;
	}
	public String getExercice() {
		return exercice;
	}
	public void setExercice(String exercice) {
		this.exercice = exercice;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
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
	public Integer getId_zone() {
		return id_zone;
	}
	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
	}
	public String getNom_zone() {
		return nom_zone;
	}
	public void setNom_zone(String nom_zone) {
		this.nom_zone = nom_zone;
	}
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getMontant_facture() {
		return montant_facture;
	}
	public void setMontant_facture(Double montant_facture) {
		this.montant_facture = montant_facture;
	}
	public Integer getPrise_en_charge() {
		return prise_en_charge;
	}
	public void setPrise_en_charge(Integer prise_en_charge) {
		this.prise_en_charge = prise_en_charge;
	}
	public Integer getNombre_acte() {
		return nombre_acte;
	}
	public void setNombre_acte(Integer nombre_acte) {
		this.nombre_acte = nombre_acte;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	public Integer getId_devise() {
		return id_devise;
	}
	public void setId_devise(Integer id_devise) {
		this.id_devise = id_devise;
	}
	factures_mensuelModel(Integer id_facture_mensuelle, String exercice, Integer id_exercice, Integer id_prestation,
			String nom_prestation, Integer id_acte, String nom_acte, Integer id_prestataire, Integer id_zone,
			String nom_zone, Integer mois, Double total, Double montant_facture, Integer prise_en_charge,
			Integer nombre_acte, Date dates, Integer id_devise) {
		super();
		this.id_facture_mensuelle = id_facture_mensuelle;
		this.exercice = exercice;
		this.id_exercice = id_exercice;
		this.id_prestation = id_prestation;
		this.nom_prestation = nom_prestation;
		this.id_acte = id_acte;
		this.nom_acte = nom_acte;
		this.id_prestataire = id_prestataire;
		this.id_zone = id_zone;
		this.nom_zone = nom_zone;
		this.mois = mois;
		this.total = total;
		this.montant_facture = montant_facture;
		this.prise_en_charge = prise_en_charge;
		this.nombre_acte = nombre_acte;
		this.dates = dates;
		this.id_devise = id_devise;
	}
	factures_mensuelModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
