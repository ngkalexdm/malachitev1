package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_parametrage_annuel_zone](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NULL,
	[id_zone] [int] NULL,
	[taille_population_cible] [int] NULL,
	[mois] [int] NULL,
	[date_creation] [date] NOT NULL,*/
@Entity(name="Tab_parametrage_annuel_zone")
public class parametrage_annuel_zone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_exercice;
	private Integer id_zone;	
	private Integer taille_population_cible;
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
	public Integer getId_zone() {
		return id_zone;
	}
	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
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
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	parametrage_annuel_zone(Integer id, Integer id_exercice, Integer id_zone, Integer taille_population_cible,
			Integer mois, Date date_creation) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.id_zone = id_zone;
		this.taille_population_cible = taille_population_cible;
		this.mois = mois;
		this.date_creation = date_creation;
	}
	
}
