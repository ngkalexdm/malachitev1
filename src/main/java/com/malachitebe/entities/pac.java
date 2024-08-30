package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_pac](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_adherent] [bigint] NOT NULL,
	[nom] [nvarchar](50) NULL,
	[prenom] [nvarchar](50) NULL,
	[sexe] [nvarchar](20) NULL,
	[naissance] [datetime] NULL,
	[parente] [nvarchar](20) NULL,
	[entree] [datetime] NULL,
	[en_stage] [bit] NOT NULL,
	[situation_actuelle] [int] NOT NULL,
	[code_mutuelle] [nvarchar](100) NULL,
	[photo] [image] NULL,
	[image] [nvarchar](max) NULL,
	[hors_stage] [bit] NOT NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_pac")
public class pac {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Long id_adherent;
	private String nom;
	private String prenom;
	private String sexe;
	private Date naissance=new Date();
	private String parente;
	private Date entree=new Date();
	private Boolean en_stage=false;
	private Integer situation_actuelle;
	private String code_mutuelle;
	private String image;
	private Boolean hors_stage=false;
	private Date date_creation=new Date();
	
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
	public Date getNaissance() {
		return naissance;
	}
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	public String getParente() {
		return parente;
	}
	public void setParente(String parente) {
		this.parente = parente;
	}
	public Date getEntree() {
		return entree;
	}
	public void setEntree(Date entree) {
		this.entree = entree;
	}
	public Boolean getEn_stage() {
		return en_stage;
	}
	public void setEn_stage(Boolean en_stage) {
		this.en_stage = en_stage;
	}
	public Integer getSituation_actuelle() {
		return situation_actuelle;
	}
	public void setSituation_actuelle(Integer situation_actuelle) {
		this.situation_actuelle = situation_actuelle;
	}
	public String getCode_mutuelle() {
		return code_mutuelle;
	}
	public void setCode_mutuelle(String code_mutuelle) {
		this.code_mutuelle = code_mutuelle;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Boolean getHors_stage() {
		return hors_stage;
	}
	public void setHors_stage(Boolean hors_stage) {
		this.hors_stage = hors_stage;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	pac(Integer id, Long id_adherent, String nom, String prenom, String sexe, Date naissance, String parente,
			Date entree, Boolean en_stage, Integer situation_actuelle, String code_mutuelle, String image,
			Boolean hors_stage, Date date_creation) {
		super();
		this.id = id;
		this.id_adherent = id_adherent;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.naissance = naissance;
		this.parente = parente;
		this.entree = entree;
		this.en_stage = en_stage;
		this.situation_actuelle = situation_actuelle;
		this.code_mutuelle = code_mutuelle;
		this.image = image;
		this.hors_stage = hors_stage;
		this.date_creation = date_creation;
	}
	
}
