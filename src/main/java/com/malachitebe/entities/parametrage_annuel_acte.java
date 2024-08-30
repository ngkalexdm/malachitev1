package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*.[Tab_parametrage_annuel_acte](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NOT NULL,
	[id_acte] [int] NOT NULL,
	[taux_utilisation_global] [int] NULL,
	[cout_moyen_prevu] [decimal](18, 2) NULL,
	[taux_prise_en_charge_acte] [int] NULL,
	[mois] [int] NULL,
	[date_creation] [date] NOT NULL,*/
@Entity(name="Tab_parametrage_annuel_acte")
public class parametrage_annuel_acte {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_exercice;
	private Integer id_acte;
	private Integer taux_utilisation_global;
	private Double cout_moyen_prevu;
	private Integer taux_prise_en_charge_acte;
	private Integer mois;
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
	public Integer getId_acte() {
		return id_acte;
	}
	public void setId_acte(Integer id_acte) {
		this.id_acte = id_acte;
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
	parametrage_annuel_acte(Integer id, Integer id_exercice, Integer id_acte, Integer taux_utilisation_global,
			Double cout_moyen_prevu, Integer taux_prise_en_charge_acte, Integer mois, Date date_creation) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.id_acte = id_acte;
		this.taux_utilisation_global = taux_utilisation_global;
		this.cout_moyen_prevu = cout_moyen_prevu;
		this.taux_prise_en_charge_acte = taux_prise_en_charge_acte;
		this.mois = mois;
		this.date_creation = date_creation;
	}
	public parametrage_annuel_acte() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "parametrage_annuel_acte [id=" + id + ", id_exercice=" + id_exercice + ", id_acte=" + id_acte
				+ ", taux_utilisation_global=" + taux_utilisation_global + ", cout_moyen_prevu=" + cout_moyen_prevu
				+ ", taux_prise_en_charge_acte=" + taux_prise_en_charge_acte + ", mois=" + mois + ", date_creation="
				+ date_creation + "]";
	}
	

}
