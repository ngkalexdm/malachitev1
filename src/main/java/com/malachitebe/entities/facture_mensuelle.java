package com.malachitebe.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_facture_mensuelle](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NULL,
	[id_prestation] [int] NULL,
	[id_acte] [int] NULL,
	[id_prestataire] [int] NULL,
	[id_zone] [int] NULL,
	[mois] [int] NULL,
	[total] [decimal](18, 2) NULL,
	[prise_en_charge] [int] NULL,
	[nombre_acte] [int] NULL,
	[dates] [date] NOT NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_facture_mensuelle")
public class facture_mensuelle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_exercice;
	private Integer id_prestation;
	private Integer id_acte;
	private Integer id_prestataire;
	private Integer id_zone;
	private Integer mois;
	private Double total;
	private Integer prise_en_charge;
	private Integer nombre_acte;
	private Date dates=new Date();
	private Date date_creation=new Date();
	
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
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public facture_mensuelle(Integer id, Integer id_exercice, Integer id_prestation, Integer id_acte, Integer id_prestataire,
			Integer id_zone, Integer mois, Double total, Integer prise_en_charge, Integer nombre_acte, Date dates,
			Date date_creation) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.id_prestation = id_prestation;
		this.id_acte = id_acte;
		this.id_prestataire = id_prestataire;
		this.id_zone = id_zone;
		this.mois = mois;
		this.total = total;
		this.prise_en_charge = prise_en_charge;
		this.nombre_acte = nombre_acte;
		this.dates = dates;
		this.date_creation = date_creation;
	}
	
}
