package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_facture_acte](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_facture] [int] NOT NULL,
	[id_acte] [int] NOT NULL,
	[id_devise] [int] NULL,
	[total] [decimal](18, 2) NOT NULL,
	[prise_en_charge] [decimal](18, 2) NOT NULL,
	[date_creation] [datetime] NOT NULL,*/
@Entity(name="Tab_facture_acte")
public class facture_acte {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_facture;
	private Integer id_acte;
	private Integer id_devise;
	private Double total;
	private Double prise_en_charge;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_facture() {
		return id_facture;
	}
	public void setId_facture(Integer id_facture) {
		this.id_facture = id_facture;
	}
	public Integer getId_acte() {
		return id_acte;
	}
	public void setId_acte(Integer id_acte) {
		this.id_acte = id_acte;
	}
	public Integer getId_devise() {
		return id_devise;
	}
	public void setId_devise(Integer id_devise) {
		this.id_devise = id_devise;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getPrise_en_charge() {
		return prise_en_charge;
	}
	public void setPrise_en_charge(Double prise_en_charge) {
		this.prise_en_charge = prise_en_charge;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public facture_acte(Integer id, Integer id_facture, Integer id_acte, Integer id_devise, Double total,
			Double prise_en_charge, Date date_creation) {
		super();
		this.id = id;
		this.id_facture = id_facture;
		this.id_acte = id_acte;
		this.id_devise = id_devise;
		this.total = total;
		this.prise_en_charge = prise_en_charge;
		this.date_creation = date_creation;
	}
	
}
