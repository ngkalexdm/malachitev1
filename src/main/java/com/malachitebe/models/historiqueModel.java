package com.malachitebe.models;

public class historiqueModel {

    private Integer id_historique;
    private Long id_adherent;
    private Integer id_exercice;
    private Integer mois;
    private Double montant;
    private String date_Cotisation;
    private Integer id_devise;
    
	public Integer getId_historique() {
		return id_historique;
	}
	public void setId_historique(Integer id_historique) {
		this.id_historique = id_historique;
	}
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
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getDate_Cotisation() {
		return date_Cotisation;
	}
	public void setDate_Cotisation(String date_Cotisation) {
		this.date_Cotisation = date_Cotisation;
	}
	public Integer getId_devise() {
		return id_devise;
	}
	public void setId_devise(Integer id_devise) {
		this.id_devise = id_devise;
	}
	historiqueModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	historiqueModel(Integer id_historique, Long id_adherent, Integer id_exercice, Integer mois, Double montant,
			String date_Cotisation, Integer id_devise) {
		super();
		this.id_historique = id_historique;
		this.id_adherent = id_adherent;
		this.id_exercice = id_exercice;
		this.mois = mois;
		this.montant = montant;
		this.date_Cotisation = date_Cotisation;
		this.id_devise = id_devise;
	}
    
}
