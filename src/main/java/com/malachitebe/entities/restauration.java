package com.malachitebe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* [dbo].[Tab_restauration](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[date] [nvarchar](50) NULL,
	[heure] [nvarchar](50) NULL,
	[nom_fichier] [nvarchar](50) NULL*/
@Entity(name="Tab_restauration")
public class restauration {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String date;
	private String heure;
	private String nom_fichier;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public String getNom_fichier() {
		return nom_fichier;
	}
	public void setNom_fichier(String nom_fichier) {
		this.nom_fichier = nom_fichier;
	}
	restauration(Integer id, String date, String heure, String nom_fichier) {
		super();
		this.id = id;
		this.date = date;
		this.heure = heure;
		this.nom_fichier = nom_fichier;
	}
	
}
