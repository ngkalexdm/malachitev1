package com.malachitebe.models;

import java.util.Date;
import java.util.List;

public class garantie_couvertureModel {

    private Integer id_garantie ;
    private Integer id_prestation ;
    private Integer id_acte ;
    private Integer id_garantie_couverture ;
    private Integer nom_prestation ;
    private String nom_acte ;
    private Boolean actif ;
    private List<actes_couvertModel> actes_couvertes ;
    private Date date_creation ;
    
	public Integer getId_garantie() {
		return id_garantie;
	}
	public void setId_garantie(Integer id_garantie) {
		this.id_garantie = id_garantie;
	}
	public Integer getId_prestation() {
		return id_prestation;
	}
	public void setId_prestation(Integer id_prestation) {
		this.id_prestation = id_prestation;
	}
	public Integer getId_acte() {
		return id_acte;
	}
	public void setId_acte(Integer id_acte) {
		this.id_acte = id_acte;
	}
	public Integer getId_garantie_couverture() {
		return id_garantie_couverture;
	}
	public void setId_garantie_couverture(Integer id_garantie_couverture) {
		this.id_garantie_couverture = id_garantie_couverture;
	}
	public Integer getNom_prestation() {
		return nom_prestation;
	}
	public void setNom_prestation(Integer nom_prestation) {
		this.nom_prestation = nom_prestation;
	}
	public String getNom_acte() {
		return nom_acte;
	}
	public void setNom_acte(String nom_acte) {
		this.nom_acte = nom_acte;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public List<actes_couvertModel> getActes_couvertes() {
		return actes_couvertes;
	}
	public void setActes_couvertes(List<actes_couvertModel> actes_couvertes) {
		this.actes_couvertes = actes_couvertes;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	garantie_couvertureModel(Integer id_garantie, Integer id_prestation, Integer id_acte,
			Integer id_garantie_couverture, Integer nom_prestation, String nom_acte, Boolean actif,
			List<actes_couvertModel> actes_couvertes, Date date_creation) {
		super();
		this.id_garantie = id_garantie;
		this.id_prestation = id_prestation;
		this.id_acte = id_acte;
		this.id_garantie_couverture = id_garantie_couverture;
		this.nom_prestation = nom_prestation;
		this.nom_acte = nom_acte;
		this.actif = actif;
		this.actes_couvertes = actes_couvertes;
		this.date_creation = date_creation;
	}
	garantie_couvertureModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
