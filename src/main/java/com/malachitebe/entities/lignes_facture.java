package com.malachitebe.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_lignes_facture](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nfacture] [bigint] NOT NULL,
	[id_acte] [int] NOT NULL,
	[montant] [decimal](18, 2) NOT NULL,
	[prise_en_charge] [decimal](18, 2) NOT NULL,
	[montant_total] [decimal](18, 2) NULL,
	[username] [nvarchar](20) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_lignes_facture")
public class lignes_facture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Long nfacture;
	private Integer id_acte;
	private Double montant;
	private Double prise_en_charge;
	private Double montant_total;
	private String username;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getNfacture() {
		return nfacture;
	}
	public void setNfacture(Long nfacture) {
		this.nfacture = nfacture;
	}
	public Integer getId_acte() {
		return id_acte;
	}
	public void setId_acte(Integer id_acte) {
		this.id_acte = id_acte;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Double getPrise_en_charge() {
		return prise_en_charge;
	}
	public void setPrise_en_charge(Double prise_en_charge) {
		this.prise_en_charge = prise_en_charge;
	}
	public Double getMontant_total() {
		return montant_total;
	}
	public void setMontant_total(Double montant_total) {
		this.montant_total = montant_total;
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
	public lignes_facture(Integer id, Long nfacture, Integer id_acte, Double montant, Double prise_en_charge,
			Double montant_total, String username, Date date_creation) {
		super();
		this.id = id;
		this.nfacture = nfacture;
		this.id_acte = id_acte;
		this.montant = montant;
		this.prise_en_charge = prise_en_charge;
		this.montant_total = montant_total;
		this.username = username;
		this.date_creation = date_creation;
	}
	public lignes_facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
