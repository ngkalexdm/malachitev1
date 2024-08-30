package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*].[Tab_type_cotisation](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[type_cotisation] [nvarchar](50) NULL,
	[date_creation] [date] NOT NULL,*/

@Entity(name="Tab_type_cotisation")
public class type_cotisation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String type_cotisation;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType_cotisation() {
		return type_cotisation;
	}
	public void setType_cotisation(String type_cotisation) {
		this.type_cotisation = type_cotisation;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public type_cotisation(Integer id, String type_cotisation, Date date_creation) {
		super();
		this.id = id;
		this.type_cotisation = type_cotisation;
		this.date_creation = date_creation;
	}
	public type_cotisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
