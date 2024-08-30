package com.malachitebe.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_facture_prestataire](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_adherent] [bigint] NOT NULL,
	[id_pac] [int] NOT NULL,
	[id_prestation] [int] NOT NULL,
	[id_prestataire] [int] NOT NULL,
	[code] [nvarchar](255) NULL,
	[id_exercice] [int] NULL,
	[mois] [int] NOT NULL,
	[total] [decimal](18, 2) NOT NULL,
	[prise_en_charge] [decimal](18, 2) NOT NULL,
	[paye] [bit] NOT NULL,
	[dates] [datetime] NULL,
	[facture_anormale] [bit] NOT NULL,
	[commentaire_facture_anormale] [nvarchar](255) NULL,
	[nom_beneficiaire_existant] [nvarchar](255) NULL,
	[prenom_beneficiaire_existant] [nvarchar](255) NULL,
	[code_mutuelle_beneficiaire_inexistant] [nvarchar](255) NULL,
	[facture_non_detaille] [bit] NOT NULL,
	[etat_adherent_fact_anormale] [nvarchar](255) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_facture_prestataire")
public class facture_prestataire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Long id_adherent;
	private Integer id_pac;
	private Integer id_prestation;
	private Integer id_prestataire;
	private String code;
	private Integer id_exercice;
	private Integer mois;
	private Double total;
	private Double prise_en_charge;
	private Boolean paye=false;
	private Date dates=new Date();
	private Boolean facture_anormale=false;
	private String commentaire_facture_anormale;
	private String nom_beneficiaire_existant;
	private String prenom_beneficiaire_existant;
	private String code_mutuelle_beneficiaire_inexistant;
	private Boolean facture_non_detaille=false;
	private String etat_adherent_fact_anormale;
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
	public Integer getId_pac() {
		return id_pac;
	}
	public void setId_pac(Integer id_pac) {
		this.id_pac = id_pac;
	}
	public Integer getId_prestation() {
		return id_prestation;
	}
	public void setId_prestation(Integer id_prestation) {
		this.id_prestation = id_prestation;
	}
	public Integer getId_prestataire() {
		return id_prestataire;
	}
	public void setId_prestataire(Integer id_prestataire) {
		this.id_prestataire = id_prestataire;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getPrise_en_charge() {
		return prise_en_charge;
	}
	public void setPrise_en_charge(Double prise_en_charge) {
		this.prise_en_charge = prise_en_charge;
	}
	public Boolean getPaye() {
		return paye;
	}
	public void setPaye(Boolean paye) {
		this.paye = paye;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	public Boolean getFacture_anormale() {
		return facture_anormale;
	}
	public void setFacture_anormale(Boolean facture_anormale) {
		this.facture_anormale = facture_anormale;
	}
	public String getCommentaire_facture_anormale() {
		return commentaire_facture_anormale;
	}
	public void setCommentaire_facture_anormale(String commentaire_facture_anormale) {
		this.commentaire_facture_anormale = commentaire_facture_anormale;
	}
	public String getNom_beneficiaire_existant() {
		return nom_beneficiaire_existant;
	}
	public void setNom_beneficiaire_existant(String nom_beneficiaire_existant) {
		this.nom_beneficiaire_existant = nom_beneficiaire_existant;
	}
	public String getPrenom_beneficiaire_existant() {
		return prenom_beneficiaire_existant;
	}
	public void setPrenom_beneficiaire_existant(String prenom_beneficiaire_existant) {
		this.prenom_beneficiaire_existant = prenom_beneficiaire_existant;
	}
	public String getCode_mutuelle_beneficiaire_inexistant() {
		return code_mutuelle_beneficiaire_inexistant;
	}
	public void setCode_mutuelle_beneficiaire_inexistant(String code_mutuelle_beneficiaire_inexistant) {
		this.code_mutuelle_beneficiaire_inexistant = code_mutuelle_beneficiaire_inexistant;
	}
	public Boolean getFacture_non_detaille() {
		return facture_non_detaille;
	}
	public void setFacture_non_detaille(Boolean facture_non_detaille) {
		this.facture_non_detaille = facture_non_detaille;
	}
	public String getEtat_adherent_fact_anormale() {
		return etat_adherent_fact_anormale;
	}
	public void setEtat_adherent_fact_anormale(String etat_adherent_fact_anormale) {
		this.etat_adherent_fact_anormale = etat_adherent_fact_anormale;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public facture_prestataire(Integer id, Long id_adherent, Integer id_pac, Integer id_prestation, Integer id_prestataire,
			String code, Integer id_exercice, Integer mois, Double total, Double prise_en_charge, Boolean paye,
			Date dates, Boolean facture_anormale, String commentaire_facture_anormale, String nom_beneficiaire_existant,
			String prenom_beneficiaire_existant, String code_mutuelle_beneficiaire_inexistant,
			Boolean facture_non_detaille, String etat_adherent_fact_anormale, Date date_creation) {
		super();
		this.id = id;
		this.id_adherent = id_adherent;
		this.id_pac = id_pac;
		this.id_prestation = id_prestation;
		this.id_prestataire = id_prestataire;
		this.code = code;
		this.id_exercice = id_exercice;
		this.mois = mois;
		this.total = total;
		this.prise_en_charge = prise_en_charge;
		this.paye = paye;
		this.dates = dates;
		this.facture_anormale = facture_anormale;
		this.commentaire_facture_anormale = commentaire_facture_anormale;
		this.nom_beneficiaire_existant = nom_beneficiaire_existant;
		this.prenom_beneficiaire_existant = prenom_beneficiaire_existant;
		this.code_mutuelle_beneficiaire_inexistant = code_mutuelle_beneficiaire_inexistant;
		this.facture_non_detaille = facture_non_detaille;
		this.etat_adherent_fact_anormale = etat_adherent_fact_anormale;
		this.date_creation = date_creation;
	}
	
}
