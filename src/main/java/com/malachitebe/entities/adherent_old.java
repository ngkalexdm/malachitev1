package com.malachitebe.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_adherent_old](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[id_adherent] [bigint] NOT NULL,
	[id_personnel] [bigint] NOT NULL,
	[id_zone] [int] NULL,
	[id_garantie] [int] NULL,
	[nom] [nvarchar](50) NULL,
	[prenom] [nvarchar](50) NULL,
	[sexe] [nvarchar](50) NULL,
	[naissance] [datetime] NULL,
	[profession] [nvarchar](50) NULL,
	[localisation] [nvarchar](150) NULL,
	[telephone_fixe] [nvarchar](50) NULL,
	[telephone_portable] [nvarchar](50) NULL,
	[entree] [nvarchar](50) NULL,
	[situation_actuelle] [int] NOT NULL,
	[en_stage] [bit] NOT NULL,
	[suspendu] [bit] NOT NULL,
	[code_radiation] [bit] NOT NULL,
	[salaire] [decimal](18, 0) NOT NULL,
	[photo] [image] NULL,
	[image] [nvarchar](max) NULL,
	[autre_code] [nvarchar](200) NULL,
	[code_parente] [bigint] NOT NULL,
	[arriere_avance_initial] [int] NULL,
	[avance_initial] [int] NULL,
	[arriere_initial] [int] NULL,
	[date_annulation] [nvarchar](50) NULL,
	[date_radiation] [nvarchar](50) NULL,
	[motif_suspension] [nvarchar](100) NULL,
	[type_suspension] [nvarchar](50) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_adherent_old")
public class adherent_old {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long id_adherent;	
	private Long id_personnel;
	private Integer id_zone;
	private Integer id_garantie;
	private String nom;
	private String prenom;
	private String sexe;
	private Date naissance=new Date();
	private String profession;
	private String localisation;
	private String telephone_fixe;
	private String telephone_portable;
	private String entree;
	private Integer situation_actuelle;
	private Boolean en_stage=false;
	private Boolean suspendu=false;
	private Boolean code_radiation=false;	
	private Double salaire;
	private String image;
	private String autre_code;
	private Long code_parente;
	private Integer arriere_avance_initial;
	private Integer avance_initial;
	private Integer arriere_initial;
	private String date_annulation;
	private String date_radiation;
	private String motif_suspension;
	private String type_suspension;
	private Date date_creation=new Date();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
	}
	public Long getId_personnel() {
		return id_personnel;
	}
	public void setId_personnel(Long id_personnel) {
		this.id_personnel = id_personnel;
	}
	public Integer getId_zone() {
		return id_zone;
	}
	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
	}
	public Integer getId_garantie() {
		return id_garantie;
	}
	public void setId_garantie(Integer id_garantie) {
		this.id_garantie = id_garantie;
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
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
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
	public String getEntree() {
		return entree;
	}
	public void setEntree(String entree) {
		this.entree = entree;
	}
	public Integer getSituation_actuelle() {
		return situation_actuelle;
	}
	public void setSituation_actuelle(Integer situation_actuelle) {
		this.situation_actuelle = situation_actuelle;
	}
	public Boolean getEn_stage() {
		return en_stage;
	}
	public void setEn_stage(Boolean en_stage) {
		this.en_stage = en_stage;
	}
	public Boolean getSuspendu() {
		return suspendu;
	}
	public void setSuspendu(Boolean suspendu) {
		this.suspendu = suspendu;
	}
	public Boolean getCode_radiation() {
		return code_radiation;
	}
	public void setCode_radiation(Boolean code_radiation) {
		this.code_radiation = code_radiation;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAutre_code() {
		return autre_code;
	}
	public void setAutre_code(String autre_code) {
		this.autre_code = autre_code;
	}
	public Long getCode_parente() {
		return code_parente;
	}
	public void setCode_parente(Long code_parente) {
		this.code_parente = code_parente;
	}
	public Integer getArriere_avance_initial() {
		return arriere_avance_initial;
	}
	public void setArriere_avance_initial(Integer arriere_avance_initial) {
		this.arriere_avance_initial = arriere_avance_initial;
	}
	public Integer getAvance_initial() {
		return avance_initial;
	}
	public void setAvance_initial(Integer avance_initial) {
		this.avance_initial = avance_initial;
	}
	public Integer getArriere_initial() {
		return arriere_initial;
	}
	public void setArriere_initial(Integer arriere_initial) {
		this.arriere_initial = arriere_initial;
	}
	public String getDate_annulation() {
		return date_annulation;
	}
	public void setDate_annulation(String date_annulation) {
		this.date_annulation = date_annulation;
	}
	public String getDate_radiation() {
		return date_radiation;
	}
	public void setDate_radiation(String date_radiation) {
		this.date_radiation = date_radiation;
	}
	public String getMotif_suspension() {
		return motif_suspension;
	}
	public void setMotif_suspension(String motif_suspension) {
		this.motif_suspension = motif_suspension;
	}
	public String getType_suspension() {
		return type_suspension;
	}
	public void setType_suspension(String type_suspension) {
		this.type_suspension = type_suspension;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public adherent_old(Long id, Long id_adherent, Long id_personnel, Integer id_zone, Integer id_garantie, String nom,
			String prenom, String sexe, Date naissance, String profession, String localisation, String telephone_fixe,
			String telephone_portable, String entree, Integer situation_actuelle, Boolean en_stage, Boolean suspendu,
			Boolean code_radiation, Double salaire, String image, String autre_code, Long code_parente,
			Integer arriere_avance_initial, Integer avance_initial, Integer arriere_initial, String date_annulation,
			String date_radiation, String motif_suspension, String type_suspension, Date date_creation) {
		super();
		this.id = id;
		this.id_adherent = id_adherent;
		this.id_personnel = id_personnel;
		this.id_zone = id_zone;
		this.id_garantie = id_garantie;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.naissance = naissance;
		this.profession = profession;
		this.localisation = localisation;
		this.telephone_fixe = telephone_fixe;
		this.telephone_portable = telephone_portable;
		this.entree = entree;
		this.situation_actuelle = situation_actuelle;
		this.en_stage = en_stage;
		this.suspendu = suspendu;
		this.code_radiation = code_radiation;
		this.salaire = salaire;
		this.image = image;
		this.autre_code = autre_code;
		this.code_parente = code_parente;
		this.arriere_avance_initial = arriere_avance_initial;
		this.avance_initial = avance_initial;
		this.arriere_initial = arriere_initial;
		this.date_annulation = date_annulation;
		this.date_radiation = date_radiation;
		this.motif_suspension = motif_suspension;
		this.type_suspension = type_suspension;
		this.date_creation = date_creation;
	}
	
}
