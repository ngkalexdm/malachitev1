package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_etat_pac](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_pac] [int] NULL,
	[id_adherent] [bigint] NOT NULL,
	[date] [datetime] NULL,
	[etat] [nvarchar](255) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_etat_pac")
public class etat_pac {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_pac;
	private Long id_adherent;
	private Date date=new Date();
	private String etat;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_pac() {
		return id_pac;
	}
	public void setId_pac(Integer id_pac) {
		this.id_pac = id_pac;
	}
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
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
	public etat_pac(Integer id, Integer id_pac, Long id_adherent, Date date, String etat, Date date_creation) {
		super();
		this.id = id;
		this.id_pac = id_pac;
		this.id_adherent = id_adherent;
		this.date = date;
		this.etat = etat;
		this.date_creation = date_creation;
	}
	
}
