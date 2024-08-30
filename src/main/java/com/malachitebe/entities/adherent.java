package com.malachitebe.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_adherent](
[id] [bigint] IDENTITY(1,1) NOT NULL,
[identite] [bigint] NOT NULL,
[id_garantie] [int] NOT NULL,
[id_zone] [int] NOT NULL,
[code_mutuelle] [nvarchar](200) NOT NULL,
[beneficiaire] [bit] NOT NULL,
[situation_actuelle] [int] NOT NULL,
[salaire] [decimal](18, 2) NOT NULL,
[username] [nvarchar](250) NULL,
[date_creation] [datetime] NOT NULL,
[etat] [bit] NULL,
*/
@Entity(name="Tab_adherent")
public class adherent {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long identite;
	private Integer id_garantie;
	private Integer id_zone;
	private String code_mutuelle;
	private Boolean beneficiaire=false;
	private Integer situation_actuelle;
	private Double salaire=0.0;
	private String username;
	private Date date_creation=new Date();
	private Boolean etat=false;
	
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
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public adherent(Long id, Long identite, Integer id_garantie, Integer id_zone, String code_mutuelle, Boolean beneficiaire,
			Integer situation_actuelle, Double salaire, String username, Date date_creation, Boolean etat) {
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
		this.etat = etat;
	}
	public adherent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "adherent [id=" + id + ", identite=" + identite + ", id_garantie=" + id_garantie + ", id_zone=" + id_zone
				+ ", code_mutuelle=" + code_mutuelle + ", beneficiaire=" + beneficiaire + ", situation_actuelle="
				+ situation_actuelle + ", salaire=" + salaire + ", username=" + username + ", date_creation="
				+ date_creation + ", etat=" + etat + "]";
	}
	
}
