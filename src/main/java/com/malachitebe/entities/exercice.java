package com.malachitebe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_exercice](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[annees] [int] NULL,
	[cloture] [bit] NOT NULL,*/
@Entity(name="Tab_exercice")
public class exercice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer annees;
	private Boolean cloture=false;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAnnees() {
		return annees;
	}
	public void setAnnees(Integer annees) {
		this.annees = annees;
	}
	public Boolean getCloture() {
		return cloture;
	}
	public void setCloture(Boolean cloture) {
		this.cloture = cloture;
	}
	public exercice(Integer id, Integer annees, Boolean cloture) {
		super();
		this.id = id;
		this.annees = annees;
		this.cloture = cloture;
	}
	public exercice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
