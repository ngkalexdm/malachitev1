package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_identites](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[nom] [nvarchar](50) NULL,
	[prenom] [nvarchar](50) NULL,
	[sexe] [nvarchar](50) NULL,
	[lieu_naissance] [nvarchar](250) NULL,
	[naissance] [datetime] NULL,
	[profession] [nvarchar](50) NULL,
	[id_categorie] [int] NOT NULL,
	[adresse] [nvarchar](max) NULL,
	[id_quartier] [nvarchar](10) NULL,
	[id_commune] [int] NOT NULL,
	[telephone_fixe] [nvarchar](50) NULL,
	[telephone_portable] [nvarchar](50) NULL,
	[email] [nvarchar](250) NULL,
	[photo] [nvarchar](max) NULL,
	[responsable] [nvarchar](50) NULL,
	[contactresponsable] [nvarchar](50) NULL,
	[username] [nvarchar](250) NULL,
	[date_creation] [datetime] NOT NULL,*/
@Entity(name="Tab_identites")
public class identites {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String sexe;
	private String lieu_naissance;
	private Date naissance=new Date();
	private String profession;
	private Integer id_categorie;
	private Integer id_entreprise;
	private String adresse;
	private String id_quartier;
	private Integer id_commune;
	private String telephone_fixe;
	private String telephone_portable;
	private String email;
	private String photo;
	private String responsable;
	private String contactresponsable;
	private String username;
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
	public String getLieu_naissance() {
		return lieu_naissance;
	}
	public void setLieu_naissance(String lieu_naissance) {
		this.lieu_naissance = lieu_naissance;
	}
	public Date getNaissance() {
		return naissance;
	}
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Integer getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(Integer id_categorie) {
		this.id_categorie = id_categorie;
	}
	
	public Integer getId_entreprise() {
		return id_entreprise;
	}
	public void setId_entreprise(Integer id_entreprise) {
		this.id_entreprise = id_entreprise;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getId_quartier() {
		return id_quartier;
	}
	public void setId_quartier(String id_quartier) {
		this.id_quartier = id_quartier;
	}
	public Integer getId_commune() {
		return id_commune;
	}
	public void setId_commune(Integer id_commune) {
		this.id_commune = id_commune;
	}
	public String getTelephone_fixe() {
		return telephone_fixe;
	}
	public void setTelephone_fixe(String telephone_fixe) {
		this.telephone_fixe = telephone_fixe;
	}
	public String getTelephone_portable() {
		return telephone_portable;
	}
	public void setTelephone_portable(String telephone_portable) {
		this.telephone_portable = telephone_portable;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getContactresponsable() {
		return contactresponsable;
	}
	public void setContactresponsable(String contactresponsable) {
		this.contactresponsable = contactresponsable;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public identites(Long id, String nom, String prenom, String sexe, String lieu_naissance, Date naissance,
			String profession, Integer id_categorie, Integer id_entreprise, String adresse, String id_quartier,
			Integer id_commune, String telephone_fixe, String telephone_portable, String email, String photo,
			String responsable, String contactresponsable, String username, Date date_creation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.lieu_naissance = lieu_naissance;
		this.naissance = naissance;
		this.profession = profession;
		this.id_categorie = id_categorie;
		this.id_entreprise = id_entreprise;
		this.adresse = adresse;
		this.id_quartier = id_quartier;
		this.id_commune = id_commune;
		this.telephone_fixe = telephone_fixe;
		this.telephone_portable = telephone_portable;
		this.email = email;
		this.photo = photo;
		this.responsable = responsable;
		this.contactresponsable = contactresponsable;
		this.username = username;
		this.date_creation = date_creation;
	}
	public identites() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
