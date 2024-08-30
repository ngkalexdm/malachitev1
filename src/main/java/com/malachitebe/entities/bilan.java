package com.malachitebe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_bilan](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NULL,
	[investissement] [decimal](18, 0) NULL,
	[retard] [decimal](18, 0) NULL,
	[caisse] [decimal](18, 0) NULL,
	[anterieur] [decimal](18, 0) NULL,
	[resultat] [decimal](18, 0) NULL,
	[avance] [decimal](18, 0) NULL,
	[prestation] [decimal](18, 0) NULL,*/
@Entity(name="Tab_bilan")
public class bilan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer id_exercice;
	private Integer investissement;
	private Double retard;
	private Double caisse;
	private Double anterieur;
	private Double resultat;
	private Double avance;
	private Double prestation;
	
	public bilan(Integer id, Integer id_exercice, Integer investissement, Double retard, Double caisse, Double anterieur,
			Double resultat, Double avance, Double prestation) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.investissement = investissement;
		this.retard = retard;
		this.caisse = caisse;
		this.anterieur = anterieur;
		this.resultat = resultat;
		this.avance = avance;
		this.prestation = prestation;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public Integer getInvestissement() {
		return investissement;
	}
	public void setInvestissement(Integer investissement) {
		this.investissement = investissement;
	}
	public Double getRetard() {
		return retard;
	}
	public void setRetard(Double retard) {
		this.retard = retard;
	}
	public Double getCaisse() {
		return caisse;
	}
	public void setCaisse(Double caisse) {
		this.caisse = caisse;
	}
	public Double getAnterieur() {
		return anterieur;
	}
	public void setAnterieur(Double anterieur) {
		this.anterieur = anterieur;
	}
	public Double getResultat() {
		return resultat;
	}
	public void setResultat(Double resultat) {
		this.resultat = resultat;
	}
	public Double getAvance() {
		return avance;
	}
	public void setAvance(Double avance) {
		this.avance = avance;
	}
	public Double getPrestation() {
		return prestation;
	}
	public void setPrestation(Double prestation) {
		this.prestation = prestation;
	}
	
	
}
