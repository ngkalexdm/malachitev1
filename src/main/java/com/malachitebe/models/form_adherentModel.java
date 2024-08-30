package com.malachitebe.models;

import java.util.Date;

public class form_adherentModel {

    private Long id_adherent ;
    private Long identite ;
    private Integer id_zone ;
    private Integer id_garantie ;
    private Integer id_categorie ;
    private Integer id_entreprise ;
    private Integer id_commune ;
    private Long id_beneficiaire ;
    private String nom ;
    private String prenom ;
    private String sexe ;
    private Date naissance ;
    private String datenaistes;
    private String id_quartier ;
    private String adresse ;
    private String lieu_naissance ;
    private String profession ;
    private String localisation ;
    private String telephone_fixe ;
    private String telephone_portable ;
    private Integer situation_actuelle ;
    private Double salaire ;
    private String photo ;
    private String code_mutuelle ;
    private String categorie ;
    private String responsable ;
    private String contactresponsable;
    private String contact ;
    private Long code_parente ;
    private Boolean beneficiaire ;
    private Boolean is_pac ;
    private String email ;
    
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
	}
	public Long getIdentite() {
		return identite;
	}
	public void setIdentite(Long identite) {
		this.identite = identite;
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
	public Integer getId_commune() {
		return id_commune;
	}
	public void setId_commune(Integer id_commune) {
		this.id_commune = id_commune;
	}
	public Long getId_beneficiaire() {
		return id_beneficiaire;
	}
	public void setId_beneficiaire(Long id_beneficiaire) {
		this.id_beneficiaire = id_beneficiaire;
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
	public String getId_quartier() {
		return id_quartier;
	}
	public void setId_quartier(String id_quartier) {
		this.id_quartier = id_quartier;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLieu_naissance() {
		return lieu_naissance;
	}
	public void setLieu_naissance(String lieu_naissance) {
		this.lieu_naissance = lieu_naissance;
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
	public Integer getSituation_actuelle() {
		return situation_actuelle;
	}
	public void setSituation_actuelle(Integer situation_actuelle) {
		this.situation_actuelle = situation_actuelle;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getCode_mutuelle() {
		return code_mutuelle;
	}
	public void setCode_mutuelle(String code_mutuelle) {
		this.code_mutuelle = code_mutuelle;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Long getCode_parente() {
		return code_parente;
	}
	public void setCode_parente(Long code_parente) {
		this.code_parente = code_parente;
	}
	public Boolean getBeneficiaire() {
		return beneficiaire;
	}
	public void setBeneficiaire(Boolean beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	public Boolean getIs_pac() {
		return is_pac;
	}
	public void setIs_pac(Boolean is_pac) {
		this.is_pac = is_pac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	public String getDatenaistes() {
		return datenaistes;
	}
	public void setDatenaistes(String datenaistes) {
		this.datenaistes = datenaistes;
	}
	
	public String getContactresponsable() {
		return contactresponsable;
	}
	public void setContactresponsable(String contactresponsable) {
		this.contactresponsable = contactresponsable;
	}
	
	public form_adherentModel(Long id_adherent, Long identite, Integer id_zone, Integer id_garantie,
			Integer id_categorie, Integer id_entreprise, Integer id_commune, Long id_beneficiaire, String nom,
			String prenom, String sexe, Date naissance, String datenaistes, String id_quartier, String adresse,
			String lieu_naissance, String profession, String localisation, String telephone_fixe,
			String telephone_portable, Integer situation_actuelle, Double salaire, String photo, String code_mutuelle,
			String categorie, String responsable, String contactresponsable, String contact, Long code_parente,
			Boolean beneficiaire, Boolean is_pac, String email) {
		super();
		this.id_adherent = id_adherent;
		this.identite = identite;
		this.id_zone = id_zone;
		this.id_garantie = id_garantie;
		this.id_categorie = id_categorie;
		this.id_entreprise = id_entreprise;
		this.id_commune = id_commune;
		this.id_beneficiaire = id_beneficiaire;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.naissance = naissance;
		this.datenaistes = datenaistes;
		this.id_quartier = id_quartier;
		this.adresse = adresse;
		this.lieu_naissance = lieu_naissance;
		this.profession = profession;
		this.localisation = localisation;
		this.telephone_fixe = telephone_fixe;
		this.telephone_portable = telephone_portable;
		this.situation_actuelle = situation_actuelle;
		this.salaire = salaire;
		this.photo = photo;
		this.code_mutuelle = code_mutuelle;
		this.categorie = categorie;
		this.responsable = responsable;
		this.contactresponsable = contactresponsable;
		this.contact = contact;
		this.code_parente = code_parente;
		this.beneficiaire = beneficiaire;
		this.is_pac = is_pac;
		this.email = email;
	}
	public form_adherentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
