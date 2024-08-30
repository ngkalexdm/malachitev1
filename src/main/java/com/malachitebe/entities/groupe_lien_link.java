package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_groupe_lien_link](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_groupe] [int] NULL,
	[codemenu] [int] NULL,
	[id_sub_menu] [int] NULL,
	[actif] [bit] NOT NULL,
	[date_creation] [datetime] NOT NULL,*/
@Entity(name="Tab_groupe_lien_link")
public class groupe_lien_link {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long identite;
	private Integer id_garantie;
	private Integer id_zone;
	private String code_mutuelle;
	private Boolean beneficiaire=false;
	private Integer situation_actuelle;
	private Double salaire;
	private String username;
	private Date date_creation=new Date();

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdentite() {
		return identite;
	}
	public void setIdentite(Long identite) {
		this.identite = identite;
	}
	public Integer getId_garantie() {
		return id_garantie;
	}
	public void setId_garantie(Integer id_garantie) {
		this.id_garantie = id_garantie;
	}
	public Integer getId_zone() {
		return id_zone;
	}
	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
	}
	public String getCode_mutuelle() {
		return code_mutuelle;
	}
	public void setCode_mutuelle(String code_mutuelle) {
		this.code_mutuelle = code_mutuelle;
	}
	public Boolean getBeneficiaire() {
		return beneficiaire;
	}
	public void setBeneficiaire(Boolean beneficiaire) {
		this.beneficiaire = beneficiaire;
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
	public groupe_lien_link(Long id, Long identite, Integer id_garantie, Integer id_zone, String code_mutuelle,
			Boolean beneficiaire, Integer situation_actuelle, Double salaire, String username, Date date_creation) {
		super();
		this.id = id;
		this.identite = identite;
		this.id_garantie = id_garantie;
		this.id_zone = id_zone;
		this.code_mutuelle = code_mutuelle;
		this.beneficiaire = beneficiaire;
		this.situation_actuelle = situation_actuelle;
		this.salaire = salaire;
		this.username = username;
		this.date_creation = date_creation;
	}
	
}
