package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* [dbo].[Tab_parametrage_annuel](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NOT NULL,
	[taille_population_cible] [int] NULL,
	[objectif] [decimal](18, 0) NULL,
	[taille_moyenne_f] [decimal](18, 0) NULL,
	[date_creation] [date] NULL,*/
@Entity(name="Tab_parametrage_annuel")
public class parametrage_annuel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_exercice;
	private Integer taille_population_cible;
	private Double objectif;
	private Double taille_moyenne_f;
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
	public Integer getTaille_population_cible() {
		return taille_population_cible;
	}
	public void setTaille_population_cible(Integer taille_population_cible) {
		this.taille_population_cible = taille_population_cible;
	}
	public Double getObjectif() {
		return objectif;
	}
	public void setObjectif(Double objectif) {
		this.objectif = objectif;
	}
	public Double getTaille_moyenne_f() {
		return taille_moyenne_f;
	}
	public void setTaille_moyenne_f(Double taille_moyenne_f) {
		this.taille_moyenne_f = taille_moyenne_f;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	parametrage_annuel(Integer id, Integer id_exercice, Integer taille_population_cible, Double objectif,
			Double taille_moyenne_f, Date date_creation) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.taille_population_cible = taille_population_cible;
		this.objectif = objectif;
		this.taille_moyenne_f = taille_moyenne_f;
		this.date_creation = date_creation;
	}
	
}
