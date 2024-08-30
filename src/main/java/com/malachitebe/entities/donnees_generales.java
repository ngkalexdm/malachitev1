package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_donnees_generales](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[nom] [nvarchar](200) NULL,
	[sigle] [nvarchar](50) NULL,
	[adresse] [nvarchar](200) NULL,
	[pays] [nvarchar](50) NULL,
	[devise] [nvarchar](50) NULL,
	[type_mas] [nvarchar](50) NULL,
	[derniere_ouverture] [datetime] NULL,
	[compte] [nvarchar](50) NULL,
	[mot_de_passe] [nvarchar](50) NULL,
	[question] [nvarchar](100) NULL,
	[reponse] [nvarchar](50) NULL,
	[option_enregistrement] [nvarchar](50) NULL,
	[debut_utilisation] [nvarchar](50) NULL,
	[mise_a_niveau] [bit] NOT NULL,
	[date_creation] [date] NOT NULL,*/
@Entity(name="Tab_donnees_generales")
public class donnees_generales {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String sigle;
	private String adresse;
	private String pays;
	private String devise;
	private String type_mas;
	private Date derniere_ouverture=new Date();
	private String compte;
	private String mot_de_passe;
	private String question;
	private String reponse;
	private String option_enregistrement;
	private String debut_utilisation;
	private Boolean mise_a_niveau=false;
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
	public String getSigle() {
		return sigle;
	}
	public void setSigle(String sigle) {
		this.sigle = sigle;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getDevise() {
		return devise;
	}
	public void setDevise(String devise) {
		this.devise = devise;
	}
	public String getType_mas() {
		return type_mas;
	}
	public void setType_mas(String type_mas) {
		this.type_mas = type_mas;
	}
	public Date getDerniere_ouverture() {
		return derniere_ouverture;
	}
	public void setDerniere_ouverture(Date derniere_ouverture) {
		this.derniere_ouverture = derniere_ouverture;
	}
	public String getCompte() {
		return compte;
	}
	public void setCompte(String compte) {
		this.compte = compte;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public String getOption_enregistrement() {
		return option_enregistrement;
	}
	public void setOption_enregistrement(String option_enregistrement) {
		this.option_enregistrement = option_enregistrement;
	}
	public String getDebut_utilisation() {
		return debut_utilisation;
	}
	public void setDebut_utilisation(String debut_utilisation) {
		this.debut_utilisation = debut_utilisation;
	}
	public Boolean getMise_a_niveau() {
		return mise_a_niveau;
	}
	public void setMise_a_niveau(Boolean mise_a_niveau) {
		this.mise_a_niveau = mise_a_niveau;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public donnees_generales(Long id, String nom, String sigle, String adresse, String pays, String devise, String type_mas,
			Date derniere_ouverture, String compte, String mot_de_passe, String question, String reponse,
			String option_enregistrement, String debut_utilisation, Boolean mise_a_niveau, Date date_creation) {
		super();
		this.id = id;
		this.nom = nom;
		this.sigle = sigle;
		this.adresse = adresse;
		this.pays = pays;
		this.devise = devise;
		this.type_mas = type_mas;
		this.derniere_ouverture = derniere_ouverture;
		this.compte = compte;
		this.mot_de_passe = mot_de_passe;
		this.question = question;
		this.reponse = reponse;
		this.option_enregistrement = option_enregistrement;
		this.debut_utilisation = debut_utilisation;
		this.mise_a_niveau = mise_a_niveau;
		this.date_creation = date_creation;
	}
	
}
