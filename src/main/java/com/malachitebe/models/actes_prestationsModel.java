package com.malachitebe.models;

public class actes_prestationsModel {

    private Integer id_prestation ;
    private String nom_prestation ;
    private Boolean actif_prestation ;
    private Integer id_acte ;
    private String nom_acte ;
    private Boolean actif_acte ;
    
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
	public Boolean getActif_prestation() {
		return actif_prestation;
	}
	public void setActif_prestation(Boolean actif_prestation) {
		this.actif_prestation = actif_prestation;
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
	public Boolean getActif_acte() {
		return actif_acte;
	}
	public void setActif_acte(Boolean actif_acte) {
		this.actif_acte = actif_acte;
	}
	
	actes_prestationsModel(Integer id_prestation, String nom_prestation, Boolean actif_prestation, Integer id_acte,
			String nom_acte, Boolean actif_acte) {
		super();
		this.id_prestation = id_prestation;
		this.nom_prestation = nom_prestation;
		this.actif_prestation = actif_prestation;
		this.id_acte = id_acte;
		this.nom_acte = nom_acte;
		this.actif_acte = actif_acte;
	}
	
	actes_prestationsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}
