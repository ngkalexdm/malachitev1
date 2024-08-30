package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_situation_adherents](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[intitule_situation] [nvarchar](150) NOT NULL,
	[dates] [date] NOT NULL,*/
@Entity(name="Tab_situation_adherents")
public class situation_adherents {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String intitule_situation;
	private Date dates=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIntitule_situation() {
		return intitule_situation;
	}
	public void setIntitule_situation(String intitule_situation) {
		this.intitule_situation = intitule_situation;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	situation_adherents(Integer id, String intitule_situation, Date dates) {
		super();
		this.id = id;
		this.intitule_situation = intitule_situation;
		this.dates = dates;
	}
	
}
