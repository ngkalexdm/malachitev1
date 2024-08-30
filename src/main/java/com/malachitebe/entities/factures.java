package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*.[Tab_factures](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_adherent] [bigint] NOT NULL,
	[id_beneficaire] [int] NOT NULL,
	[id_prestataire] [int] NOT NULL,
	[id_devise] [int] NULL,
	[nfacture] [bigint] NULL,
	[date] [date] NULL,
	[ref_facture_prestataire] [nvarchar](20) NULL,
	[id_exercice] [int] NULL,
	[mois] [int] NOT NULL,
	[montant_prestataire] [decimal](18, 2) NULL,
	[prise_en_charge] [decimal](18, 2) NULL,
	[montant_facture] [decimal](18, 2) NOT NULL,
	[facture_non_detaille] [bit] NOT NULL,
	[anomalie] [bit] NOT NULL,
	[commentaires] [nvarchar](255) NULL,
	[etat_facture] [int] NOT NULL,
	[username] [nvarchar](20) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_factures")
public class factures {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Long id_adherent;
	private Long id_beneficaire;
	private Integer id_prestataire;
	private Integer id_devise;
	private Long nfacture;
	private Date date=new Date();
	private String ref_facture_prestataire;
	private Integer id_exercice;
	private Integer mois;
	private Double montant_prestataire;
	private Double prise_en_charge;
	private Double montant_facture;
	private Boolean facture_non_detaille=false;
	private Boolean anomalie=false;
	private String commentaires;
	private Integer etat_facture;
	private String username;
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
	public Long getId_beneficaire() {
		return id_beneficaire;
	}
	public void setId_beneficaire(Long id_beneficaire) {
		this.id_beneficaire = id_beneficaire;
	}
	public Integer getId_prestataire() {
		return id_prestataire;
	}
	public void setId_prestataire(Integer id_prestataire) {
		this.id_prestataire = id_prestataire;
	}
	public Integer getId_devise() {
		return id_devise;
	}
	public void setId_devise(Integer id_devise) {
		this.id_devise = id_devise;
	}
	public Long getNfacture() {
		return nfacture;
	}
	public void setNfacture(Long nfacture) {
		this.nfacture = nfacture;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRef_facture_prestataire() {
		return ref_facture_prestataire;
	}
	public void setRef_facture_prestataire(String ref_facture_prestataire) {
		this.ref_facture_prestataire = ref_facture_prestataire;
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
	public Double getMontant_prestataire() {
		return montant_prestataire;
	}
	public void setMontant_prestataire(Double montant_prestataire) {
		this.montant_prestataire = montant_prestataire;
	}
	public Double getPrise_en_charge() {
		return prise_en_charge;
	}
	public void setPrise_en_charge(Double prise_en_charge) {
		this.prise_en_charge = prise_en_charge;
	}
	public Double getMontant_facture() {
		return montant_facture;
	}
	public void setMontant_facture(Double montant_facture) {
		this.montant_facture = montant_facture;
	}
	public Boolean getFacture_non_detaille() {
		return facture_non_detaille;
	}
	public void setFacture_non_detaille(Boolean facture_non_detaille) {
		this.facture_non_detaille = facture_non_detaille;
	}
	public Boolean getAnomalie() {
		return anomalie;
	}
	public void setAnomalie(Boolean anomalie) {
		this.anomalie = anomalie;
	}
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	public Integer getEtat_facture() {
		return etat_facture;
	}
	public void setEtat_facture(Integer etat_facture) {
		this.etat_facture = etat_facture;
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
	public factures(Integer id, Long id_adherent, Long id_beneficaire, Integer id_prestataire, Integer id_devise,
			Long nfacture, Date date, String ref_facture_prestataire, Integer id_exercice, Integer mois,
			Double montant_prestataire, Double prise_en_charge, Double montant_facture, Boolean facture_non_detaille,
			Boolean anomalie, String commentaires, Integer etat_facture, String username, Date date_creation) {
		super();
		this.id = id;
		this.id_adherent = id_adherent;
		this.id_beneficaire = id_beneficaire;
		this.id_prestataire = id_prestataire;
		this.id_devise = id_devise;
		this.nfacture = nfacture;
		this.date = date;
		this.ref_facture_prestataire = ref_facture_prestataire;
		this.id_exercice = id_exercice;
		this.mois = mois;
		this.montant_prestataire = montant_prestataire;
		this.prise_en_charge = prise_en_charge;
		this.montant_facture = montant_facture;
		this.facture_non_detaille = facture_non_detaille;
		this.anomalie = anomalie;
		this.commentaires = commentaires;
		this.etat_facture = etat_facture;
		this.username = username;
		this.date_creation = date_creation;
	}
	public factures() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
