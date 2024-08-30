package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_users_systeme](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[nom] [nvarchar](50) NULL,
	[prenom] [nvarchar](25) NULL,
	[username] [nvarchar](50) NULL,
	[telephone1] [nvarchar](18) NULL,
	[telephone2] [nvarchar](18) NULL,
	[adresse_mail] [nvarchar](255) NULL,
	[fonction] [nvarchar](50) NULL,
	[id_fosa] [int] NULL,
	[id_group] [int] NOT NULL,
	[actif] [bit] NOT NULL,
	[date_creation] [datetime] NOT NULL,*/
 @Entity(name="Tab_users_systeme")
public class users_systeme {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String username;
	private String telephone1;
	private String telephone2;
	private String adresse_mail;
	private String fonction;
	private Integer id_fosa;
	private Integer id_group;
	private Boolean actif=false;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTelephone1() {
		return telephone1;
	}
	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}
	public String getTelephone2() {
		return telephone2;
	}
	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}
	public String getAdresse_mail() {
		return adresse_mail;
	}
	public void setAdresse_mail(String adresse_mail) {
		this.adresse_mail = adresse_mail;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public Integer getId_fosa() {
		return id_fosa;
	}
	public void setId_fosa(Integer id_fosa) {
		this.id_fosa = id_fosa;
	}
	public Integer getId_group() {
		return id_group;
	}
	public void setId_group(Integer id_group) {
		this.id_group = id_group;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	users_systeme(Long id, String nom, String prenom, String username, String telephone1, String telephone2,
			String adresse_mail, String fonction, Integer id_fosa, Integer id_group, Boolean actif,
			Date date_creation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.telephone1 = telephone1;
		this.telephone2 = telephone2;
		this.adresse_mail = adresse_mail;
		this.fonction = fonction;
		this.id_fosa = id_fosa;
		this.id_group = id_group;
		this.actif = actif;
		this.date_creation = date_creation;
	}
	
}
