package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_garantie_couverture](
		[id] [int] IDENTITY(1,1) NOT NULL,
		[id_garantie] [int] NOT NULL,
		[id_acte] [int] NOT NULL,
		[actif] [bit] NOT NULL,
		[date_creation] [datetime] NULL,*/
@Entity(name="Tab_garantie_couverture")
public class garantie_couverture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_garantie;
	private Integer id_acte;
	private Boolean actif=false;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_garantie() {
		return id_garantie;
	}
	public void setId_garantie(Integer id_garantie) {
		this.id_garantie = id_garantie;
	}
	public Integer getId_acte() {
		return id_acte;
	}
	public void setId_acte(Integer id_acte) {
		this.id_acte = id_acte;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public garantie_couverture(Integer id, Integer id_garantie, Integer id_acte, Boolean actif, Date date_creation) {
		super();
		this.id = id;
		this.id_garantie = id_garantie;
		this.id_acte = id_acte;
		this.actif = actif;
		this.date_creation = date_creation;
	}
	
	
}
