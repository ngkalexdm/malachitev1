package com.malachitebe.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * 
 * [dbo].[Tab_actes](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nom] [nvarchar](100) NULL,
	[actif] [bit] NOT NULL,
	[global] [bit] NOT NULL,
	[date_creation] [datetime] NULL,
 *
 */
@Entity(name="Tab_actes")
public class actes {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String nom;
private Boolean actif=false;
private Boolean global=false;
private Date date_creation=new Date();

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Boolean getActif() {
	return actif;
}
public void setActif(Boolean actif) {
	this.actif = actif;
}
public Boolean getGlobal() {
	return global;
}
public void setGlobal(Boolean global) {
	this.global = global;
}
public Date getDate_creation() {
	return date_creation;
}
public void setDate_creation(Date date_creation) {
	this.date_creation = date_creation;
}
public actes(Integer id, String nom, Boolean actif, Boolean global, Date date_creation) {
	super();
	this.id = id;
	this.nom = nom;
	this.actif = actif;
	this.global = global;
	this.date_creation = date_creation;
}
public actes() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "actes [id=" + id + ", nom=" + nom + ", actif=" + actif + ", global=" + global + ", date_creation="
			+ date_creation + "]";
}

}
