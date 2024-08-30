package com.malachitebe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_resultat](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NULL,
	[cotisation] [decimal](18, 2) NULL,
	[adhesion] [decimal](18, 2) NULL,
	[autre_produit_int] [decimal](18, 2) NULL,
	[autre_produit_ext] [decimal](18, 2) NULL,
	[prestation] [decimal](18, 2) NULL,
	[fonctionnement] [decimal](18, 2) NULL,
	[cotisation_irrecouvrable] [decimal](18, 2) NULL,
	[autre_charge_int] [decimal](18, 2) NULL,
	[autre_charge_ext] [decimal](18, 2) NULL,*/
@Entity(name="Tab_resultat")
public class resultat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_exercice;
	private Double cotisation;
	private Double adhesion;
	private Double autre_produit_int;
	private Double autre_produit_ext;
	private Double prestation;
	private Double fonctionnement;
	private Double cotisation_irrecouvrable;
	private Double autre_charge_int;
	private Double autre_charge_ext;
	
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
	public Double getCotisation() {
		return cotisation;
	}
	public void setCotisation(Double cotisation) {
		this.cotisation = cotisation;
	}
	public Double getAdhesion() {
		return adhesion;
	}
	public void setAdhesion(Double adhesion) {
		this.adhesion = adhesion;
	}
	public Double getAutre_produit_int() {
		return autre_produit_int;
	}
	public void setAutre_produit_int(Double autre_produit_int) {
		this.autre_produit_int = autre_produit_int;
	}
	public Double getAutre_produit_ext() {
		return autre_produit_ext;
	}
	public void setAutre_produit_ext(Double autre_produit_ext) {
		this.autre_produit_ext = autre_produit_ext;
	}
	public Double getPrestation() {
		return prestation;
	}
	public void setPrestation(Double prestation) {
		this.prestation = prestation;
	}
	public Double getFonctionnement() {
		return fonctionnement;
	}
	public void setFonctionnement(Double fonctionnement) {
		this.fonctionnement = fonctionnement;
	}
	public Double getCotisation_irrecouvrable() {
		return cotisation_irrecouvrable;
	}
	public void setCotisation_irrecouvrable(Double cotisation_irrecouvrable) {
		this.cotisation_irrecouvrable = cotisation_irrecouvrable;
	}
	public Double getAutre_charge_int() {
		return autre_charge_int;
	}
	public void setAutre_charge_int(Double autre_charge_int) {
		this.autre_charge_int = autre_charge_int;
	}
	public Double getAutre_charge_ext() {
		return autre_charge_ext;
	}
	public void setAutre_charge_ext(Double autre_charge_ext) {
		this.autre_charge_ext = autre_charge_ext;
	}
	resultat(Integer id, Integer id_exercice, Double cotisation, Double adhesion, Double autre_produit_int,
			Double autre_produit_ext, Double prestation, Double fonctionnement, Double cotisation_irrecouvrable,
			Double autre_charge_int, Double autre_charge_ext) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.cotisation = cotisation;
		this.adhesion = adhesion;
		this.autre_produit_int = autre_produit_int;
		this.autre_produit_ext = autre_produit_ext;
		this.prestation = prestation;
		this.fonctionnement = fonctionnement;
		this.cotisation_irrecouvrable = cotisation_irrecouvrable;
		this.autre_charge_int = autre_charge_int;
		this.autre_charge_ext = autre_charge_ext;
	}
	
}
