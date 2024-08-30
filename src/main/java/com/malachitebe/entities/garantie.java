package com.malachitebe.entities;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_garantie](
	[id_garantie] [int] IDENTITY(1,1) NOT NULL,
	[nom] [nvarchar](50) NULL,
	[id_type_cotisation] [int] NULL,
	[droit_adhesion] [decimal](18, 2) NULL,
	[observation] [int] NULL,
	[active] [bit] NOT NULL,
	[v1] [decimal](18, 2) NOT NULL,
	[v2] [decimal](18, 2) NOT NULL,
	[v3] [decimal](18, 2) NOT NULL,
	[v4] [decimal](18, 2) NOT NULL,
	[v5] [decimal](18, 2) NOT NULL,
	[date_changement] [datetime] NULL,
	[ancienne_p_observation] [int] NULL,
	[delai_retard] [int] NULL,
	[delai_reprise] [int] NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_garantie")
public class garantie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column()
	private String nom;
	@Column()
	private Integer id_type_cotisation;
	@Column()
	private Double droit_adhesion;
	@Column()
	private Integer observation;
	@Column()
	private Boolean active=false;
	@Column()
	private Double v1;
	@Column()
	private Double v2;
	@Column()
	private Double v3;
	@Column()
	private Double v4;
	@Column()
	private Double v5;
	@CreatedDate()
	private Date date_changement=new Date();
	@Column()
	private Integer ancienne_p_observation;
	@Column()
	private Integer delai_retard;
	@Column()
	private Integer delai_reprise;
	@CreatedDate()
	private Date date_creation=new Date();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public garantie(Integer id, String nom, Integer id_type_cotisation, Double droit_adhesion, Integer observation,
			Boolean active, Double v1, Double v2, Double v3, Double v4, Double v5, Date date_changement,
			Integer ancienne_p_observation, Integer delai_retard, Integer delai_reprise, Date date_creation) {
		super();
		this.id = id;
		this.nom = nom;
		this.id_type_cotisation = id_type_cotisation;
		this.droit_adhesion = droit_adhesion;
		this.observation = observation;
		this.active = active;
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
		this.v5 = v5;
		this.date_changement = date_changement;
		this.ancienne_p_observation = ancienne_p_observation;
		this.delai_retard = delai_retard;
		this.delai_reprise = delai_reprise;
		this.date_creation = date_creation;
	}
	
	
}
