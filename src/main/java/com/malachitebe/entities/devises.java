package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_devises](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[devise] [nvarchar](150) NOT NULL,
	[abbreviation] [nvarchar](50) NOT NULL,
	[monnaie_locale] [bit] NOT NULL,
	[Symbole] [nvarchar](10) NULL,
	[date_creation] [date] NOT NULL,*/
@Entity(name="Tab_devises")
public class devises {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String devise;
	private String abbreviation;
	private Boolean monnaie_locale=false;
	private String Symbole;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDevise() {
		return devise;
	}
	public void setDevise(String devise) {
		this.devise = devise;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public Boolean getMonnaie_locale() {
		return monnaie_locale;
	}
	public void setMonnaie_locale(Boolean monnaie_locale) {
		this.monnaie_locale = monnaie_locale;
	}
	public String getSymbole() {
		return Symbole;
	}
	public void setSymbole(String symbole) {
		Symbole = symbole;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	
	public devises(Integer id, String devise, String abbreviation, Boolean monnaie_locale, String symbole,
			Date date_creation) {
		super();
		this.id = id;
		this.devise = devise;
		this.abbreviation = abbreviation;
		this.monnaie_locale = monnaie_locale;
		Symbole = symbole;
		this.date_creation = date_creation;
	}
	
	public devises() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
