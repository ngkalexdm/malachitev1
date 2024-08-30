package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_parametrage_annuel_prestataire](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NULL,
	[id_prestataire] [int] NULL,
	[mois] [int] NULL,
	[date_creation] [date] NOT NULL,*/
@Entity(name="Tab_parametrage_annuel_prestataire")
public class parametrage_annuel_prestataire {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_exercice;
	private Integer id_prestataire;
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
	public Integer getId_prestataire() {
		return id_prestataire;
	}
	public void setId_prestataire(Integer id_prestataire) {
		this.id_prestataire = id_prestataire;
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
	parametrage_annuel_prestataire(Integer id, Integer id_exercice, Integer id_prestataire, Integer mois,
			Date date_creation) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.id_prestataire = id_prestataire;
		this.mois = mois;
		this.date_creation = date_creation;
	}
	
}
