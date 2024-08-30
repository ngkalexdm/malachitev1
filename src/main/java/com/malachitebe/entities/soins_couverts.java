package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_soins_couverts](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_prestataire] [int] NOT NULL,
	[id_prestation] [int] NOT NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_soins_couverts")
public class soins_couverts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_prestataire;
	private Integer id_prestation;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_prestataire() {
		return id_prestataire;
	}
	public void setId_prestataire(Integer id_prestataire) {
		this.id_prestataire = id_prestataire;
	}
	public Integer getId_prestation() {
		return id_prestation;
	}
	public void setId_prestation(Integer id_prestation) {
		this.id_prestation = id_prestation;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	soins_couverts(Integer id, Integer id_prestataire, Integer id_prestation, Date date_creation) {
		super();
		this.id = id;
		this.id_prestataire = id_prestataire;
		this.id_prestation = id_prestation;
		this.date_creation = date_creation;
	}
	
}
