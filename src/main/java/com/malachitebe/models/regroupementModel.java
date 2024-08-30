package com.malachitebe.models;

import java.util.Date;

public class regroupementModel {

    private Integer id_zone ;
    private String nom ;
    private Boolean actif ;
    private Date date_creation ;

   private Long effectif ;
    private Integer id_parametrage_annuel_zone ;
    private Integer taille_population_cible ;
    private Integer mois ;
    
	public Integer getId_zone() {
		return id_zone;
	}
	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
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
	public Long getEffectif() {
		return effectif;
	}
	public void setEffectif(Long effectif) {
		this.effectif = effectif;
	}
	public Integer getId_parametrage_annuel_zone() {
		return id_parametrage_annuel_zone;
	}
	public void setId_parametrage_annuel_zone(Integer id_parametrage_annuel_zone) {
		this.id_parametrage_annuel_zone = id_parametrage_annuel_zone;
	}
	public Integer getTaille_population_cible() {
		return taille_population_cible;
	}
	public void setTaille_population_cible(Integer taille_population_cible) {
		this.taille_population_cible = taille_population_cible;
	}
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	regroupementModel(Integer id_zone, String nom, Boolean actif, Date date_creation, Long effectif,
			Integer id_parametrage_annuel_zone, Integer taille_population_cible, Integer mois) {
		super();
		this.id_zone = id_zone;
		this.nom = nom;
		this.actif = actif;
		this.date_creation = date_creation;
		this.effectif = effectif;
		this.id_parametrage_annuel_zone = id_parametrage_annuel_zone;
		this.taille_population_cible = taille_population_cible;
		this.mois = mois;
	}
	regroupementModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
