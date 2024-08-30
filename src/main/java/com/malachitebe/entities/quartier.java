package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* [dbo].[Tab_quartier](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[code_commune] [int] NOT NULL,
	[quartier] [nvarchar](80) NULL,
	[username] [nvarchar](50) NULL,
	[date_creation] [datetime] NOT NULL,*/
@Entity(name="Tab_quartier")
public class quartier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer code_commune;
	private String quartier;
	private String username;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCode_commune() {
		return code_commune;
	}
	public void setCode_commune(Integer code_commune) {
		this.code_commune = code_commune;
	}
	public String getQuartier() {
		return quartier;
	}
	public void setQuartier(String quartier) {
		this.quartier = quartier;
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
	quartier(Integer id, Integer code_commune, String quartier, String username, Date date_creation) {
		super();
		this.id = id;
		this.code_commune = code_commune;
		this.quartier = quartier;
		this.username = username;
		this.date_creation = date_creation;
	}
	quartier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
