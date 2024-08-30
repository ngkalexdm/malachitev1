package com.malachitebe.models;

import java.util.Date;
import java.util.List;

import com.malachitebe.entities.users_systeme_last_login;

public class users_systemeModel {
	        private Integer indice;
	        private Long id_user;
	        private String nom;
	        private String prenom;
	        private String username;
	        private String password;
	        private String confirm_password;
	        private String telephone1;
	        private String telephone2;
	        private String adresse_mail;
	        private String fonction;
	        private Integer id_fosa;
	        private String nom_fosa;
	        private Integer id_groupe;
	        private String nom_groupe;
	        private Boolean actif;
	        private Date date_creation;
	        private List<users_systeme_last_login> dernier_login;
	        private Boolean remember_me;
			public Integer getIndice() {
				return indice;
			}
			public void setIndice(Integer indice) {
				this.indice = indice;
			}
			public Long getId_user() {
				return id_user;
			}
			public void setId_user(Long id_user) {
				this.id_user = id_user;
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
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public String getConfirm_password() {
				return confirm_password;
			}
			public void setConfirm_password(String confirm_password) {
				this.confirm_password = confirm_password;
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
			public String getNom_fosa() {
				return nom_fosa;
			}
			public void setNom_fosa(String nom_fosa) {
				this.nom_fosa = nom_fosa;
			}
			public Integer getId_groupe() {
				return id_groupe;
			}
			public void setId_groupe(Integer id_groupe) {
				this.id_groupe = id_groupe;
			}
			public String getNom_groupe() {
				return nom_groupe;
			}
			public void setNom_groupe(String nom_groupe) {
				this.nom_groupe = nom_groupe;
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
			public List<users_systeme_last_login> getDernier_login() {
				return dernier_login;
			}
			public void setDernier_login(List<users_systeme_last_login> dernier_login) {
				this.dernier_login = dernier_login;
			}
			public Boolean getRemember_me() {
				return remember_me;
			}
			public void setRemember_me(Boolean remember_me) {
				this.remember_me = remember_me;
			}
			
			users_systemeModel(Integer indice, Long id_user, String nom, String prenom, String username,
					String password, String confirm_password, String telephone1, String telephone2, String adresse_mail,
					String fonction, Integer id_fosa, String nom_fosa, Integer id_groupe, String nom_groupe,
					Boolean actif, Date date_creation, List<users_systeme_last_login> dernier_login,
					Boolean remember_me) {
				super();
				this.indice = indice;
				this.id_user = id_user;
				this.nom = nom;
				this.prenom = prenom;
				this.username = username;
				this.password = password;
				this.confirm_password = confirm_password;
				this.telephone1 = telephone1;
				this.telephone2 = telephone2;
				this.adresse_mail = adresse_mail;
				this.fonction = fonction;
				this.id_fosa = id_fosa;
				this.nom_fosa = nom_fosa;
				this.id_groupe = id_groupe;
				this.nom_groupe = nom_groupe;
				this.actif = actif;
				this.date_creation = date_creation;
				this.dernier_login = dernier_login;
				this.remember_me = remember_me;
			}
			
			users_systemeModel() {
				super();
				// TODO Auto-generated constructor stub
			}
	        
	   
}
