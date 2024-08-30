package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_actes_couverts](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_acte] [int] NULL,
	[id_prestation] [int] NULL,
	[date_creation] [datetime] NULL,
	*/
@Entity(name="Tab_actes_couverts")
public class actes_couverts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_acte;
	private Integer id_prestation;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_acte() {
		return id_acte;
	}
	public void setId_acte(Integer id_acte) {
		this.id_acte = id_acte;
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
	public actes_couverts(Integer id, Integer id_acte, Integer id_prestation, Date date_creation) {
		super();
		this.id = id;
		this.id_acte = id_acte;
		this.id_prestation = id_prestation;
		this.date_creation = date_creation;
	}
	
}
