package com.malachitebe.models;

import java.util.Date;

public class mouvementModel {

    private Long id_Mouvement ;
    private Integer id_adherent ;
    private Integer id_exercise ;
    private Integer annees ;
    private String date_mouvement ;
    private String motif_mouvement ;
    private String nature_mouvement ;
    private String type_mouvement ;
    private Date date_creation ;
    
	public Long getId_Mouvement() {
		return id_Mouvement;
	}
	public void setId_Mouvement(Long id_Mouvement) {
		this.id_Mouvement = id_Mouvement;
	}
	public Integer getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Integer id_adherent) {
		this.id_adherent = id_adherent;
	}
	public Integer getId_exercise() {
		return id_exercise;
	}
	public void setId_exercise(Integer id_exercise) {
		this.id_exercise = id_exercise;
	}
	public Integer getAnnees() {
		return annees;
	}
	public void setAnnees(Integer annees) {
		this.annees = annees;
	}
	public String getDate_mouvement() {
		return date_mouvement;
	}
	public void setDate_mouvement(String date_mouvement) {
		this.date_mouvement = date_mouvement;
	}
	public String getMotif_mouvement() {
		return motif_mouvement;
	}
	public void setMotif_mouvement(String motif_mouvement) {
		this.motif_mouvement = motif_mouvement;
	}
	public String getNature_mouvement() {
		return nature_mouvement;
	}
	public void setNature_mouvement(String nature_mouvement) {
		this.nature_mouvement = nature_mouvement;
	}
	public String getType_mouvement() {
		return type_mouvement;
	}
	public void setType_mouvement(String type_mouvement) {
		this.type_mouvement = type_mouvement;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	mouvementModel(Long id_Mouvement, Integer id_adherent, Integer id_exercise, Integer annees, String date_mouvement,
			String motif_mouvement, String nature_mouvement, String type_mouvement, Date date_creation) {
		super();
		this.id_Mouvement = id_Mouvement;
		this.id_adherent = id_adherent;
		this.id_exercise = id_exercise;
		this.annees = annees;
		this.date_mouvement = date_mouvement;
		this.motif_mouvement = motif_mouvement;
		this.nature_mouvement = nature_mouvement;
		this.type_mouvement = type_mouvement;
		this.date_creation = date_creation;
	}
	mouvementModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
