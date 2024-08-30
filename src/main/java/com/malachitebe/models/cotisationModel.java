package com.malachitebe.models;

import java.util.Date;

public class cotisationModel {

    private Long id_adherent=(long) 0;
    private Integer id_exercice=0;
    private String intitule_cotisation;
    private Double mois_1=0.0;
    private Double mois_2=0.0;
    private Double mois_3=0.0;
    private Double mois_4=0.0;
    private Double mois_5=0.0;
    private Double mois_6=0.0;
    private Double mois_7=0.0;
    private Double mois_8=0.0;
    private Double mois_9=0.0;
    private Double mois_10=0.0;
    private Double mois_11=0.0;
    private Double mois_12=0.0;
    private Date date_creation;
    private Boolean cotisation_percues;
    
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public String getIntitule_cotisation() {
		return intitule_cotisation;
	}
	public void setIntitule_cotisation(String intitule_cotisation) {
		this.intitule_cotisation = intitule_cotisation;
	}
	public Double getMois_1() {
		return mois_1;
	}
	public void setMois_1(Double mois_1) {
		this.mois_1 = mois_1;
	}
	public Double getMois_2() {
		return mois_2;
	}
	public void setMois_2(Double mois_2) {
		this.mois_2 = mois_2;
	}
	public Double getMois_3() {
		return mois_3;
	}
	public void setMois_3(Double mois_3) {
		this.mois_3 = mois_3;
	}
	public Double getMois_4() {
		return mois_4;
	}
	public void setMois_4(Double mois_4) {
		this.mois_4 = mois_4;
	}
	public Double getMois_5() {
		return mois_5;
	}
	public void setMois_5(Double mois_5) {
		this.mois_5 = mois_5;
	}
	public Double getMois_6() {
		return mois_6;
	}
	public void setMois_6(Double mois_6) {
		this.mois_6 = mois_6;
	}
	public Double getMois_7() {
		return mois_7;
	}
	public void setMois_7(Double mois_7) {
		this.mois_7 = mois_7;
	}
	public Double getMois_8() {
		return mois_8;
	}
	public void setMois_8(Double mois_8) {
		this.mois_8 = mois_8;
	}
	public Double getMois_9() {
		return mois_9;
	}
	public void setMois_9(Double mois_9) {
		this.mois_9 = mois_9;
	}
	public Double getMois_10() {
		return mois_10;
	}
	public void setMois_10(Double mois_10) {
		this.mois_10 = mois_10;
	}
	public Double getMois_11() {
		return mois_11;
	}
	public void setMois_11(Double mois_11) {
		this.mois_11 = mois_11;
	}
	public Double getMois_12() {
		return mois_12;
	}
	public void setMois_12(Double mois_12) {
		this.mois_12 = mois_12;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public Boolean getCotisation_percues() {
		return cotisation_percues;
	}
	public void setCotisation_percues(Boolean cotisation_percues) {
		this.cotisation_percues = cotisation_percues;
	}
	
	cotisationModel(Long id_adherent, Integer id_exercice, String intitule_cotisation, Double mois_1, Double mois_2,
			Double mois_3, Double mois_4, Double mois_5, Double mois_6, Double mois_7, Double mois_8, Double mois_9,
			Double mois_10, Double mois_11, Double mois_12, Date date_creation, Boolean cotisation_percues,
			cotisationModel cotisation_percue, cotisationModel cotisation_emise, cotisationModel arriere_avance) {
		super();
		this.id_adherent = id_adherent;
		this.id_exercice = id_exercice;
		this.intitule_cotisation = intitule_cotisation;
		this.mois_1 = mois_1;
		this.mois_2 = mois_2;
		this.mois_3 = mois_3;
		this.mois_4 = mois_4;
		this.mois_5 = mois_5;
		this.mois_6 = mois_6;
		this.mois_7 = mois_7;
		this.mois_8 = mois_8;
		this.mois_9 = mois_9;
		this.mois_10 = mois_10;
		this.mois_11 = mois_11;
		this.mois_12 = mois_12;
		this.date_creation = date_creation;
	}
	public cotisationModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
