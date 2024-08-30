package com.malachitebe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*dbo].[Tab_t_saisie_mensuelle_donnee](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NULL,
	[id_mois] [int] NULL,
	[nombre_adherent] [int] NULL,
	[nombre_adherent_radie] [int] NULL,
	[nombre_beneficiaire_inscrit] [int] NULL,
	[nombre_beneficiaire_radie] [int] NULL,
	[nombre_beneficiaire_non_cotisant] [int] NULL,
	[nombre_beneficiaire_effectif] [int] NULL,
	[cotisation_emise] [decimal](18, 2) NULL,
	[cotisations_percues] [decimal](18, 2) NULL,
	[prestations_maladies] [decimal](18, 2) NULL,
	[droits_adhesion] [decimal](18, 2) NULL,
	[cotisations_acquises] [decimal](18, 2) NULL,
	[recette_ext] [decimal](18, 2) NULL,
	[recette_int] [decimal](18, 2) NULL,
	[frais_f] [decimal](18, 2) NULL,
	[dep_propre] [decimal](18, 2) NULL,
	[dep_externe] [decimal](18, 2) NULL,
	[investissement] [decimal](18, 2) NULL,*/
@Entity(name="Tab_t_saisie_mensuelle_donnee")
public class t_saisie_mensuelle_donnee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_exercice;
	private Integer id_mois;
	private Integer nombre_adherent;
	private Integer nombre_adherent_radie;
	private Integer nombre_beneficiaire_inscrit;
	private Integer nombre_beneficiaire_radie;
	private Integer nombre_beneficiaire_non_cotisant;
	private Integer nombre_beneficiaire_effectif;
	private Double cotisation_emise;
	private Double cotisations_percues;
	private Double prestations_maladies;
	private Double droits_adhesion;
	private Double cotisations_acquises;
	private Double recette_ext;
	private Double recette_int;
	private Double frais_f;
	private Double dep_propre;
	private Double dep_externe;
	private Double investissement;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public Integer getId_mois() {
		return id_mois;
	}
	public void setId_mois(Integer id_mois) {
		this.id_mois = id_mois;
	}
	public Integer getNombre_adherent() {
		return nombre_adherent;
	}
	public void setNombre_adherent(Integer nombre_adherent) {
		this.nombre_adherent = nombre_adherent;
	}
	public Integer getNombre_adherent_radie() {
		return nombre_adherent_radie;
	}
	public void setNombre_adherent_radie(Integer nombre_adherent_radie) {
		this.nombre_adherent_radie = nombre_adherent_radie;
	}
	public Integer getNombre_beneficiaire_inscrit() {
		return nombre_beneficiaire_inscrit;
	}
	public void setNombre_beneficiaire_inscrit(Integer nombre_beneficiaire_inscrit) {
		this.nombre_beneficiaire_inscrit = nombre_beneficiaire_inscrit;
	}
	public Integer getNombre_beneficiaire_radie() {
		return nombre_beneficiaire_radie;
	}
	public void setNombre_beneficiaire_radie(Integer nombre_beneficiaire_radie) {
		this.nombre_beneficiaire_radie = nombre_beneficiaire_radie;
	}
	public Integer getNombre_beneficiaire_non_cotisant() {
		return nombre_beneficiaire_non_cotisant;
	}
	public void setNombre_beneficiaire_non_cotisant(Integer nombre_beneficiaire_non_cotisant) {
		this.nombre_beneficiaire_non_cotisant = nombre_beneficiaire_non_cotisant;
	}
	public Integer getNombre_beneficiaire_effectif() {
		return nombre_beneficiaire_effectif;
	}
	public void setNombre_beneficiaire_effectif(Integer nombre_beneficiaire_effectif) {
		this.nombre_beneficiaire_effectif = nombre_beneficiaire_effectif;
	}
	public Double getCotisation_emise() {
		return cotisation_emise;
	}
	public void setCotisation_emise(Double cotisation_emise) {
		this.cotisation_emise = cotisation_emise;
	}
	public Double getCotisations_percues() {
		return cotisations_percues;
	}
	public void setCotisations_percues(Double cotisations_percues) {
		this.cotisations_percues = cotisations_percues;
	}
	public Double getPrestations_maladies() {
		return prestations_maladies;
	}
	public void setPrestations_maladies(Double prestations_maladies) {
		this.prestations_maladies = prestations_maladies;
	}
	public Double getDroits_adhesion() {
		return droits_adhesion;
	}
	public void setDroits_adhesion(Double droits_adhesion) {
		this.droits_adhesion = droits_adhesion;
	}
	public Double getCotisations_acquises() {
		return cotisations_acquises;
	}
	public void setCotisations_acquises(Double cotisations_acquises) {
		this.cotisations_acquises = cotisations_acquises;
	}
	public Double getRecette_ext() {
		return recette_ext;
	}
	public void setRecette_ext(Double recette_ext) {
		this.recette_ext = recette_ext;
	}
	public Double getRecette_int() {
		return recette_int;
	}
	public void setRecette_int(Double recette_int) {
		this.recette_int = recette_int;
	}
	public Double getFrais_f() {
		return frais_f;
	}
	public void setFrais_f(Double frais_f) {
		this.frais_f = frais_f;
	}
	public Double getDep_propre() {
		return dep_propre;
	}
	public void setDep_propre(Double dep_propre) {
		this.dep_propre = dep_propre;
	}
	public Double getDep_externe() {
		return dep_externe;
	}
	public void setDep_externe(Double dep_externe) {
		this.dep_externe = dep_externe;
	}
	public Double getInvestissement() {
		return investissement;
	}
	public void setInvestissement(Double investissement) {
		this.investissement = investissement;
	}
	t_saisie_mensuelle_donnee(Integer id, Integer id_exercice, Integer id_mois, Integer nombre_adherent,
			Integer nombre_adherent_radie, Integer nombre_beneficiaire_inscrit, Integer nombre_beneficiaire_radie,
			Integer nombre_beneficiaire_non_cotisant, Integer nombre_beneficiaire_effectif, Double cotisation_emise,
			Double cotisations_percues, Double prestations_maladies, Double droits_adhesion,
			Double cotisations_acquises, Double recette_ext, Double recette_int, Double frais_f, Double dep_propre,
			Double dep_externe, Double investissement) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.id_mois = id_mois;
		this.nombre_adherent = nombre_adherent;
		this.nombre_adherent_radie = nombre_adherent_radie;
		this.nombre_beneficiaire_inscrit = nombre_beneficiaire_inscrit;
		this.nombre_beneficiaire_radie = nombre_beneficiaire_radie;
		this.nombre_beneficiaire_non_cotisant = nombre_beneficiaire_non_cotisant;
		this.nombre_beneficiaire_effectif = nombre_beneficiaire_effectif;
		this.cotisation_emise = cotisation_emise;
		this.cotisations_percues = cotisations_percues;
		this.prestations_maladies = prestations_maladies;
		this.droits_adhesion = droits_adhesion;
		this.cotisations_acquises = cotisations_acquises;
		this.recette_ext = recette_ext;
		this.recette_int = recette_int;
		this.frais_f = frais_f;
		this.dep_propre = dep_propre;
		this.dep_externe = dep_externe;
		this.investissement = investissement;
	}
	
}
