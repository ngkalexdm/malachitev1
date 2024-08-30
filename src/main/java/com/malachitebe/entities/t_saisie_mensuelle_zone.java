package com.malachitebe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_t_saisie_mensuelle_zone](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NULL,
	[id_mois] [int] NULL,
	[id_zone] [int] NULL,
	[nombre_adherent] [decimal](18, 2) NULL,
	[nombre_adherent_radie] [decimal](18, 2) NULL,
	[nombre_beneficiaire_inscrit] [decimal](18, 2) NULL,
	[nombre_beneficiaire_radie] [decimal](18, 2) NULL,
	[nombre_beneficiaire_cotisant] [decimal](18, 2) NULL,
	[nombre_beneficiaire_effectif] [decimal](18, 2) NULL,
	[cotisation_emise] [decimal](18, 2) NULL,
	[cotisations_percues] [decimal](18, 2) NULL,
	[cotisations_acquises] [decimal](18, 2) NULL,*/
@Entity(name="Tab_t_saisie_mensuelle_zone")
public class t_saisie_mensuelle_zone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer id_exercice;
	private Integer id_mois;
	private Integer id_zone;
	private Double nombre_adherent;
	private Double nombre_adherent_radie;
	private Double nombre_beneficiaire_inscrit;
	private Integer nombre_beneficiaire_radie;
	private Double nombre_beneficiaire_cotisant;
	private Double nombre_beneficiaire_effectif;
	private Double cotisation_emise;
	private Double cotisations_percues;
	private Double cotisations_acquises;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Integer getId_zone() {
		return id_zone;
	}
	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
	}
	public Double getNombre_adherent() {
		return nombre_adherent;
	}
	public void setNombre_adherent(Double nombre_adherent) {
		this.nombre_adherent = nombre_adherent;
	}
	public Double getNombre_adherent_radie() {
		return nombre_adherent_radie;
	}
	public void setNombre_adherent_radie(Double nombre_adherent_radie) {
		this.nombre_adherent_radie = nombre_adherent_radie;
	}
	public Double getNombre_beneficiaire_inscrit() {
		return nombre_beneficiaire_inscrit;
	}
	public void setNombre_beneficiaire_inscrit(Double nombre_beneficiaire_inscrit) {
		this.nombre_beneficiaire_inscrit = nombre_beneficiaire_inscrit;
	}
	public Integer getNombre_beneficiaire_radie() {
		return nombre_beneficiaire_radie;
	}
	public void setNombre_beneficiaire_radie(Integer nombre_beneficiaire_radie) {
		this.nombre_beneficiaire_radie = nombre_beneficiaire_radie;
	}
	public Double getNombre_beneficiaire_cotisant() {
		return nombre_beneficiaire_cotisant;
	}
	public void setNombre_beneficiaire_cotisant(Double nombre_beneficiaire_cotisant) {
		this.nombre_beneficiaire_cotisant = nombre_beneficiaire_cotisant;
	}
	public Double getNombre_beneficiaire_effectif() {
		return nombre_beneficiaire_effectif;
	}
	public void setNombre_beneficiaire_effectif(Double nombre_beneficiaire_effectif) {
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
	public Double getCotisations_acquises() {
		return cotisations_acquises;
	}
	public void setCotisations_acquises(Double cotisations_acquises) {
		this.cotisations_acquises = cotisations_acquises;
	}
	t_saisie_mensuelle_zone(Long id, Integer id_exercice, Integer id_mois, Integer id_zone, Double nombre_adherent,
			Double nombre_adherent_radie, Double nombre_beneficiaire_inscrit, Integer nombre_beneficiaire_radie,
			Double nombre_beneficiaire_cotisant, Double nombre_beneficiaire_effectif, Double cotisation_emise,
			Double cotisations_percues, Double cotisations_acquises) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.id_mois = id_mois;
		this.id_zone = id_zone;
		this.nombre_adherent = nombre_adherent;
		this.nombre_adherent_radie = nombre_adherent_radie;
		this.nombre_beneficiaire_inscrit = nombre_beneficiaire_inscrit;
		this.nombre_beneficiaire_radie = nombre_beneficiaire_radie;
		this.nombre_beneficiaire_cotisant = nombre_beneficiaire_cotisant;
		this.nombre_beneficiaire_effectif = nombre_beneficiaire_effectif;
		this.cotisation_emise = cotisation_emise;
		this.cotisations_percues = cotisations_percues;
		this.cotisations_acquises = cotisations_acquises;
	}
	
}
