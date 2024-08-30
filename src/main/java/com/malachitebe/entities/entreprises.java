package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/**
 [Tab_entreprises](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[intitule] [varchar](250) NULL,
	[idnat] [varchar](50) NULL,
	[recm] [varchar](50) NULL,
	[nid] [varchar](50) NULL,
	[telephone] [varchar](50) NULL,
	[email] [varchar](250) NULL,
	[website] [varchar](max) NULL,
	[responsable] [varchar](50) NULL,
	[username] [varchar](250) NULL,
	[date_creation] [date] NULL,
 */
@Entity(name="Tab_entreprises")
public class entreprises {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String intitule;
	private String idnat;
	private String recm;
	private String nid;
	private String telephone;
	private String email;
	private String website;
	private String responsable;
	private String username;
	private Date date_creation=new Date();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getIdnat() {
		return idnat;
	}
	public void setIdnat(String idnat) {
		this.idnat = idnat;
	}
	public String getRecm() {
		return recm;
	}
	public void setRecm(String recm) {
		this.recm = recm;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
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
	public entreprises(Integer id, String intitule, String idnat, String recm, String nid, String telephone,
			String email, String website, String responsable, String username, Date date_creation) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.idnat = idnat;
		this.recm = recm;
		this.nid = nid;
		this.telephone = telephone;
		this.email = email;
		this.website = website;
		this.responsable = responsable;
		this.username = username;
		this.date_creation = date_creation;
	}
	public entreprises() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
