package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*.[Tab_cour_dechange](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[id_devise] [int] NULL,
	[taux] [decimal](18, 2) NULL,
	[id_devise_convertie] [int] NULL,
	[operateur] [nvarchar](1) NULL,
	[date_creation] [date] NULL,*/
@Entity(name="Tab_cour_dechange")
public class cour_dechange {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_devise;
	private Double taux;
	private Integer id_devise_convertie;
	private String operateur;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_devise() {
		return id_devise;
	}
	public void setId_devise(Integer id_devise) {
		this.id_devise = id_devise;
	}
	public Double getTaux() {
		return taux;
	}
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	public Integer getId_devise_convertie() {
		return id_devise_convertie;
	}
	public void setId_devise_convertie(Integer id_devise_convertie) {
		this.id_devise_convertie = id_devise_convertie;
	}
	public String getOperateur() {
		return operateur;
	}
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public cour_dechange(Integer id, Integer id_devise, Double taux, Integer id_devise_convertie, String operateur,
			Date date_creation) {
		super();
		this.id = id;
		this.id_devise = id_devise;
		this.taux = taux;
		this.id_devise_convertie = id_devise_convertie;
		this.operateur = operateur;
		this.date_creation = date_creation;
	}
	
}
