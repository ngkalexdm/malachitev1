package com.malachitebe.models;

public class exercicesModel {

    private Integer id_exercice ;
    private Integer annees ;
    private Integer mois ;
    private String intitule_mois ;
    private Boolean cloture ;
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public Integer getAnnees() {
		return annees;
	}
	public void setAnnees(Integer annees) {
		this.annees = annees;
	}
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	public String getIntitule_mois() {
		return intitule_mois;
	}
	public void setIntitule_mois(String intitule_mois) {
		this.intitule_mois = intitule_mois;
	}
	public Boolean getCloture() {
		return cloture;
	}
	public void setCloture(Boolean cloture) {
		this.cloture = cloture;
	}
	public exercicesModel(Integer id_exercice, Integer annees, Integer mois, String intitule_mois, Boolean cloture) {
		super();
		this.id_exercice = id_exercice;
		this.annees = annees;
		this.mois = mois;
		this.intitule_mois = intitule_mois;
		this.cloture = cloture;
	}
	
	public exercicesModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
