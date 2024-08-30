package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*.[Tab_prestataires](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nom] [nvarchar](100) NULL,
	[actif] [bit] NOT NULL,
	[adresse] [nvarchar](200) NULL,
	[telephone] [nvarchar](50) NULL,
	[id_type_prestataire] [int] NULL,
	[id_statut] [int] NULL,
	[fax] [nvarchar](50) NULL,
	[mail] [nvarchar](50) NULL,
	[datre_creation] [datetime] NULL,*/
@Entity(name="Tab_prestataires")
public class prestataires {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private Boolean actif=false;	
	private String adresse;
	private String telephone;
	private Integer id_type_prestataire;
	private Integer id_statut;
	private String fax;
	private String mail;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getId_type_prestataire() {
		return id_type_prestataire;
	}
	public void setId_type_prestataire(Integer id_type_prestataire) {
		this.id_type_prestataire = id_type_prestataire;
	}
	public Integer getId_statut() {
		return id_statut;
	}
	public void setId_statut(Integer id_statut) {
		this.id_statut = id_statut;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	prestataires(Integer id, String nom, Boolean actif, String adresse, String telephone, Integer id_type_prestataire,
			Integer id_statut, String fax, String mail, Date date_creation) {
		super();
		this.id = id;
		this.nom = nom;
		this.actif = actif;
		this.adresse = adresse;
		this.telephone = telephone;
		this.id_type_prestataire = id_type_prestataire;
		this.id_statut = id_statut;
		this.fax = fax;
		this.mail = mail;
		this.date_creation = date_creation;
	}
	public prestataires() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
