package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_groupe_travaille](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nom_groupe] [nvarchar](50) NULL,
	[action] [int] NOT NULL,
	[actif] [bit] NOT NULL,
	[date_creation] [date] NOT NULL,*/
@Entity(name="Tab_groupe_travaille")
public class groupe_travaille {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom_groupe;
	private Integer action;
	private Boolean actif=false;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom_groupe() {
		return nom_groupe;
	}
	public void setNom_groupe(String nom_groupe) {
		this.nom_groupe = nom_groupe;
	}
	public Integer getAction() {
		return action;
	}
	public void setAction(Integer action) {
		this.action = action;
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
	public  groupe_travaille(Integer id, String nom_groupe, Integer action, Boolean actif, Date date_creation) {
		super();
		this.id = id;
		this.nom_groupe = nom_groupe;
		this.action = action;
		this.actif = actif;
		this.date_creation = date_creation;
	}
	
}
