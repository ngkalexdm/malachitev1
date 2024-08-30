package com.malachitebe.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_actes_prestataires](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[id_prestataire] [int] NOT NULL,
	[id_acte] [int] NOT NULL,
	[cout_prevu] [decimal](18, 2) NOT NULL,
	[date_creation] [datetime] NULL,
	*/
@Entity(name="Tab_actes_prestataires")
public class actes_prestataires {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer id_prestataire;
	private Integer id_acte;
	private Double cout_prevu=0.0;
	private Date date_creation=new Date();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getId_prestataire() {
		return id_prestataire;
	}
	public void setId_prestataire(Integer id_prestataire) {
		this.id_prestataire = id_prestataire;
	}
	public Integer getId_acte() {
		return id_acte;
	}
	public void setId_acte(Integer id_acte) {
		this.id_acte = id_acte;
	}
	public Double getCout_prevu() {
		return cout_prevu;
	}
	public void setCout_prevu(Double cout_prevu) {
		this.cout_prevu = cout_prevu;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public actes_prestataires(Long id, Integer id_prestataire, Integer id_acte, Double cout_prevu, Date date_creation) {
		super();
		this.id = id;
		this.id_prestataire = id_prestataire;
		this.id_acte = id_acte;
		this.cout_prevu = cout_prevu;
		this.date_creation = date_creation;
	}
	public actes_prestataires() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "actes_prestataires [id=" + id + ", id_prestataire=" + id_prestataire + ", id_acte=" + id_acte
				+ ", cout_prevu=" + cout_prevu + ", date_creation=" + date_creation + "]";
	}
	
}
