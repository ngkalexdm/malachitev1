package com.malachitebe.models;

import java.util.Date;
import java.util.List;
import com.malachitebe.entities.type_cotisation;
public class garantie_santesModels {

    private Integer id_garantie ;
    private String nom ;
    private Integer id_type_cotisation ;
    private String type_cotisation ;
    private Double droit_adhesion ;
    private Integer observation ;
    private Boolean active ;
    private Double v1 ;
    private Double v2 ;
    private Double v3 ;
    private Double v4 ;
    private Double v5 ;
    private Double salaire ;
    private Date date_changement ;
    private Integer ancienne_p_observation ;
    private Integer delai_retard ;
    private Integer delai_reprise ;
    private Date date_creation ;

     private Double cotisation_mensuel ;
    private List<Integer> acte ;
    private List<actes_couvertModel> actes ;
    private Boolean actif ;

    private List<garantie_couvertureModel> prestations ;
    private List<type_cotisation> type_cotisations ;
	public Integer getId_garantie() {
		return id_garantie;
	}
	public void setId_garantie(Integer id_garantie) {
		this.id_garantie = id_garantie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getId_type_cotisation() {
		return id_type_cotisation;
	}
	public void setId_type_cotisation(Integer id_type_cotisation) {
		this.id_type_cotisation = id_type_cotisation;
	}
	public String getType_cotisation() {
		return type_cotisation;
	}
	public void setType_cotisation(String type_cotisation) {
		this.type_cotisation = type_cotisation;
	}
	public Double getDroit_adhesion() {
		return droit_adhesion;
	}
	public void setDroit_adhesion(Double droit_adhesion) {
		this.droit_adhesion = droit_adhesion;
	}
	public Integer getObservation() {
		return observation;
	}
	public void setObservation(Integer observation) {
		this.observation = observation;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Double getV1() {
		return v1;
	}
	public void setV1(Double v1) {
		this.v1 = v1;
	}
	public Double getV2() {
		return v2;
	}
	public void setV2(Double v2) {
		this.v2 = v2;
	}
	public Double getV3() {
		return v3;
	}
	public void setV3(Double v3) {
		this.v3 = v3;
	}
	public Double getV4() {
		return v4;
	}
	public void setV4(Double v4) {
		this.v4 = v4;
	}
	public Double getV5() {
		return v5;
	}
	public void setV5(Double v5) {
		this.v5 = v5;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public Date getDate_changement() {
		return date_changement;
	}
	public void setDate_changement(Date date_changement) {
		this.date_changement = date_changement;
	}
	public Integer getAncienne_p_observation() {
		return ancienne_p_observation;
	}
	public void setAncienne_p_observation(Integer ancienne_p_observation) {
		this.ancienne_p_observation = ancienne_p_observation;
	}
	public Integer getDelai_retard() {
		return delai_retard;
	}
	public void setDelai_retard(Integer delai_retard) {
		this.delai_retard = delai_retard;
	}
	public Integer getDelai_reprise() {
		return delai_reprise;
	}
	public void setDelai_reprise(Integer delai_reprise) {
		this.delai_reprise = delai_reprise;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public Double getCotisation_mensuel() {
		return cotisation_mensuel;
	}
	public void setCotisation_mensuel(Double cotisation_mensuel) {
		this.cotisation_mensuel = cotisation_mensuel;
	}
	public List<Integer> getActe() {
		return acte;
	}
	public void setActe(List<Integer> acte) {
		this.acte = acte;
	}
	public List<actes_couvertModel> getActes() {
		return actes;
	}
	public void setActes(List<actes_couvertModel> actes) {
		this.actes = actes;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public List<garantie_couvertureModel> getPrestations() {
		return prestations;
	}
	public void setPrestations(List<garantie_couvertureModel> prestations) {
		this.prestations = prestations;
	}
	public List<type_cotisation> getType_cotisations() {
		return type_cotisations;
	}
	public void setType_cotisations(List<type_cotisation> type_cotisations) {
		this.type_cotisations = type_cotisations;
	}
	garantie_santesModels(Integer id_garantie, String nom, Integer id_type_cotisation, String type_cotisation,
			Double droit_adhesion, Integer observation, Boolean active, Double v1, Double v2, Double v3, Double v4,
			Double v5, Double salaire, Date date_changement, Integer ancienne_p_observation, Integer delai_retard,
			Integer delai_reprise, Date date_creation, Double cotisation_mensuel, List<Integer> acte,
			List<actes_couvertModel> actes, Boolean actif, List<garantie_couvertureModel> prestations,
			List<com.malachitebe.entities.type_cotisation> type_cotisations) {
		super();
		this.id_garantie = id_garantie;
		this.nom = nom;
		this.id_type_cotisation = id_type_cotisation;
		this.type_cotisation = type_cotisation;
		this.droit_adhesion = droit_adhesion;
		this.observation = observation;
		this.active = active;
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
		this.v5 = v5;
		this.salaire = salaire;
		this.date_changement = date_changement;
		this.ancienne_p_observation = ancienne_p_observation;
		this.delai_retard = delai_retard;
		this.delai_reprise = delai_reprise;
		this.date_creation = date_creation;
		this.cotisation_mensuel = cotisation_mensuel;
		this.acte = acte;
		this.actes = actes;
		this.actif = actif;
		this.prestations = prestations;
		this.type_cotisations = type_cotisations;
	}
	garantie_santesModels() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
