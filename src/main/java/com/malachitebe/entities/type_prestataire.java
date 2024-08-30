package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*dbo].[Tab_type_prestataire](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[type_prestataire] [nvarchar](50) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_type_prestataire")
public class type_prestataire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String type_prestataire;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType_prestataire() {
		return type_prestataire;
	}
	public void setType_prestataire(String type_prestataire) {
		this.type_prestataire = type_prestataire;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public type_prestataire(Integer id, String type_prestataire, Date date_creation) {
		super();
		this.id = id;
		this.type_prestataire = type_prestataire;
		this.date_creation = date_creation;
	}
	public type_prestataire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
