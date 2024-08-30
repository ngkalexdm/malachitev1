package com.malachitebe.models;

import java.util.Date;
import java.util.List;

public class services_santeModel {

    private Integer id_prestation;
    private String nom;
    private Boolean actif;
    private Date date_creation;
    private List<actes_couvertModel> actes;
    private Integer[] id_acte;
    
	public Integer getId_prestation() {
		return id_prestation;
	}
	public void setId_prestation(Integer id_prestation) {
		this.id_prestation = id_prestation;
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
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public List<actes_couvertModel> getActes() {
		return actes;
	}
	public void setActes(List<actes_couvertModel> actes) {
		this.actes = actes;
	}
	public Integer[] getId_acte() {
		return id_acte;
	}
	public void setId_acte(Integer[] id_acte) {
		this.id_acte = id_acte;
	}
	services_santeModel(Integer id_prestation, String nom, Boolean actif, Date date_creation,
			List<actes_couvertModel> actes, Integer[] id_acte) {
		super();
		this.id_prestation = id_prestation;
		this.nom = nom;
		this.actif = actif;
		this.date_creation = date_creation;
		this.actes = actes;
		this.id_acte = id_acte;
	}
	services_santeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
