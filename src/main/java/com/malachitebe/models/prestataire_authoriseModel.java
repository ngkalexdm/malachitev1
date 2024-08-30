package com.malachitebe.models;

import java.util.List;
import java.util.Date;

public class prestataire_authoriseModel {
	
        private Integer id_prestataire ;
        private Integer id_type_prestataire ;
        private Integer id_statut ;
        private String nom_prestataire ;
        private String nom ;
        private Boolean actif_prestataire ;
        private Boolean actif ;
        private String adresse ;
        private String telephone ;
        private String fax ;
        private String mail ;
        private String type_prestataire ;
        private String statut ;
        private Date date_creation=new Date() ;
        private Date date=new Date();
        private List<Integer> acte ;
        private List<actes_couvertModel> actes ;
        
        
		public Date getDate_creation() {
			return date_creation;
		}
		public void setDate_creation(Date date_creation) {
			this.date_creation = date_creation;
		}
		public Integer getId_prestataire() {
			return id_prestataire;
		}
		public void setId_prestataire(Integer id_prestataire) {
			this.id_prestataire = id_prestataire;
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
		public String getNom_prestataire() {
			return nom_prestataire;
		}
		public void setNom_prestataire(String nom_prestataire) {
			this.nom_prestataire = nom_prestataire;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public Boolean getActif_prestataire() {
			return actif_prestataire;
		}
		public void setActif_prestataire(Boolean actif_prestataire) {
			this.actif_prestataire = actif_prestataire;
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
		public String getType_prestataire() {
			return type_prestataire;
		}
		public void setType_prestataire(String type_prestataire) {
			this.type_prestataire = type_prestataire;
		}
		public String getStatut() {
			return statut;
		}
		public void setStatut(String statut) {
			this.statut = statut;
		}
		
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public List<Integer> getActe() {
			return acte;
		}
		public void setActe(List<Integer> acte) {
			this.acte = acte;
		}
		public List<actes_couvertModel> getActes() {
			return actes;
		}
		public void setActes(List<actes_couvertModel> actes) {
			this.actes = actes;
		}
	
		public prestataire_authoriseModel(Integer id_prestataire, Integer id_type_prestataire, Integer id_statut,
				String nom_prestataire, String nom, Boolean actif_prestataire, Boolean actif, String adresse,
				String telephone, String fax, String mail, String type_prestataire, String statut, Date date_creation,
				Date date, List<Integer> acte, List<actes_couvertModel> actes) {
			super();
			this.id_prestataire = id_prestataire;
			this.id_type_prestataire = id_type_prestataire;
			this.id_statut = id_statut;
			this.nom_prestataire = nom_prestataire;
			this.nom = nom;
			this.actif_prestataire = actif_prestataire;
			this.actif = actif;
			this.adresse = adresse;
			this.telephone = telephone;
			this.fax = fax;
			this.mail = mail;
			this.type_prestataire = type_prestataire;
			this.statut = statut;
			this.date_creation = date_creation;
			this.date = date;
			this.acte = acte;
			this.actes = actes;
		}
	public	prestataire_authoriseModel() {
			super();
			// TODO Auto-generated constructor stub
		}
        
        
    
}
