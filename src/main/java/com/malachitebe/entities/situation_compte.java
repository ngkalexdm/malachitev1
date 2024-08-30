package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* [dbo].[Tab_situation_compte](
	[id] [bigint] NOT NULL,
	[id_adherent] [int] NULL,
	[situation_adherent] [nvarchar](255) NULL,
	[situation_compte] [nvarchar](255) NULL,
	[cotisation_emise] [int] NULL,
	[dates] [date] NOT NULL,*/
@Entity(name="Tab_situation_compte")
public class situation_compte {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_adherent;
	private String situation_adherent;
	private String situation_compte;
	private Integer cotisation_emise;
	private Date dates=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Integer id_adherent) {
		this.id_adherent = id_adherent;
	}
	public String getSituation_adherent() {
		return situation_adherent;
	}
	public void setSituation_adherent(String situation_adherent) {
		this.situation_adherent = situation_adherent;
	}
	public String getSituation_compte() {
		return situation_compte;
	}
	public void setSituation_compte(String situation_compte) {
		this.situation_compte = situation_compte;
	}
	public Integer getCotisation_emise() {
		return cotisation_emise;
	}
	public void setCotisation_emise(Integer cotisation_emise) {
		this.cotisation_emise = cotisation_emise;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	situation_compte(Integer id, Integer id_adherent, String situation_adherent, String situation_compte,
			Integer cotisation_emise, Date dates) {
		super();
		this.id = id;
		this.id_adherent = id_adherent;
		this.situation_adherent = situation_adherent;
		this.situation_compte = situation_compte;
		this.cotisation_emise = cotisation_emise;
		this.dates = dates;
	}
	

}
