package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_beneficiaires](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[identite] [bigint] NOT NULL,
	[id_adherent] [bigint] NOT NULL,
	[code_parente] [bigint] NOT NULL,
	[code_mutuelle] [nvarchar](200) NOT NULL,
	[id_zone] [int] NOT NULL,
	[situation_actuelle] [int] NOT NULL,
	[username] [nvarchar](250) NULL,
	[date_creation] [datetime] NOT NULL,*/
@Entity(name="Tab_beneficiaires")
public class beneficiaires {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long identite;
	private Long id_adherent;
	private String code_mutuelle;
	private Integer id_zone;
	private Integer situation_actuelle;
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
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
	}
	public String getCode_mutuelle() {
		return code_mutuelle;
	}
	public void setCode_mutuelle(String code_mutuelle) {
		this.code_mutuelle = code_mutuelle;
	}
	public Integer getId_zone() {
		return id_zone;
	}
	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
	}
	public Integer getSituation_actuelle() {
		return situation_actuelle;
	}
	public void setSituation_actuelle(Integer situation_actuelle) {
		this.situation_actuelle = situation_actuelle;
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
	public beneficiaires(Long id, Long identite, Long id_adherent, String code_mutuelle, Integer id_zone,
			Integer situation_actuelle, String username, Date date_creation) {
		super();
		this.id = id;
		this.identite = identite;
		this.id_adherent = id_adherent;
		this.code_mutuelle = code_mutuelle;
		this.id_zone = id_zone;
		this.situation_actuelle = situation_actuelle;
		this.username = username;
		this.date_creation = date_creation;
	}
	public beneficiaires() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
