package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*Tab_etat_adherent](
	[id] [bigint] NOT NULL,
	[date] [datetime] NULL,
	[etat] [nvarchar](255) NULL,
	[date_creation] [bigint] NOT NULL,*/
@Entity(name="Tab_etat_adherent")
public class etat_adherent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date date=new Date();
	private String etat;
	private Date date_creation=new Date();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	
	public etat_adherent(Long id, Date date, String etat, Date date_creation) {
		super();
		this.id = id;
		this.date = date;
		this.etat = etat;
		this.date_creation = date_creation;
	}
	
}
