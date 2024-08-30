package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_statut_prestataire](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[statut] [nvarchar](50) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_statut_prestataire")
public class statut_prestataire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String statut;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	
	statut_prestataire(Integer id, String statut, Date date_creation) {
		super();
		this.id = id;
		this.statut = statut;
		this.date_creation = date_creation;
	}
	
	statut_prestataire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
