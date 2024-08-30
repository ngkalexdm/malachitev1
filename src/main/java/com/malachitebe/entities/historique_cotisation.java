package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_historique_cotisation](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_adherent] [bigint] NOT NULL,
	[id_exercice] [int] NULL,
	[id_devise] [int] NULL,
	[mois] [int] NULL,
	[montant] [decimal](18, 2) NULL,
	[date_cotisation] [datetime] NULL,*/
@Entity(name="Tab_historique_cotisation")
public class historique_cotisation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	private Long id_adherent;	
	private Integer id_exercice;
	private Integer annee;
	private Integer id_devise;
	private Integer mois;
	private Double montant;
	private Double taux;
	private Date date_cotisation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public Integer getId_devise() {
		return id_devise;
	}
	public void setId_devise(Integer id_devise) {
		this.id_devise = id_devise;
	}
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Date getDate_cotisation() {
		return date_cotisation;
	}
	public void setDate_cotisation(Date date_cotisation) {
		this.date_cotisation = date_cotisation;
	}
	public Integer getAnnee() {
		return annee;
	}
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Double getTaux() {
		return taux;
	}
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
	public historique_cotisation(Integer id, Long id_adherent, Integer id_exercice, Integer annee, Integer id_devise,
			Integer mois, Double montant, Double taux, Date date_cotisation) {
		super();
		this.id = id;
		this.id_adherent = id_adherent;
		this.id_exercice = id_exercice;
		this.annee = annee;
		this.id_devise = id_devise;
		this.mois = mois;
		this.montant = montant;
		this.taux = taux;
		this.date_cotisation = date_cotisation;
	}
	public historique_cotisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
