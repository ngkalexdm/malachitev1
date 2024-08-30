package com.malachitebe.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_adherent_radie](
	[id] [bigint] NOT NULL,
	[nom] [nvarchar](50) NULL,
	[prenom] [nvarchar](50) NULL,
	[sexe] [nvarchar](50) NULL,
	[localisation] [nvarchar](50) NULL,
	[telephone] [nvarchar](50) NULL,
	[entree] [nvarchar](50) NULL,
	[arriere] [int] NULL,
	[mois] [int] NULL,
	[id_exercice] [int] NULL,
	[code_mutuelle] [nvarchar](50) NULL,
	[avance] [int] NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_adherent_radie")
public class adherent_radie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	private String nom;
	private String prenom;
	private String sexe;
	private String telephone;
	private String entree;
	private Integer arriere;
	private Integer mois;
	private Integer id_exercice;
	private String code_mutuelle;
	private Integer avance;
	private Date date_creation=new Date();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEntree() {
		return entree;
	}
	public void setEntree(String entree) {
		this.entree = entree;
	}
	public Integer getArriere() {
		return arriere;
	}
	public void setArriere(Integer arriere) {
		this.arriere = arriere;
	}
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public String getCode_mutuelle() {
		return code_mutuelle;
	}
	public void setCode_mutuelle(String code_mutuelle) {
		this.code_mutuelle = code_mutuelle;
	}
	public Integer getAvance() {
		return avance;
	}
	public void setAvance(Integer avance) {
		this.avance = avance;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public adherent_radie(Long id, String nom, String prenom, String sexe, String telephone, String entree, Integer arriere,
			Integer mois, Integer id_exercice, String code_mutuelle, Integer avance, Date date_creation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.telephone = telephone;
		this.entree = entree;
		this.arriere = arriere;
		this.mois = mois;
		this.id_exercice = id_exercice;
		this.code_mutuelle = code_mutuelle;
		this.avance = avance;
		this.date_creation = date_creation;
	}
	
}
