package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_communes](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[code_ville] [int] NOT NULL,
	[commune] [nvarchar](80) NULL,
	[username] [nvarchar](50) NULL,
	[date_creation] [datetime] NOT NULL,*/
@Entity(name="Tab_communes")
public class communes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer code_ville;
	private String commune;
	private String username;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCode_ville() {
		return code_ville;
	}
	public void setCode_ville(Integer code_ville) {
		this.code_ville = code_ville;
	}
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public communes(Integer id, Integer code_ville, String commune, String username, Date date_creation) {
		super();
		this.id = id;
		this.code_ville = code_ville;
		this.commune = commune;
		this.username = username;
		this.date_creation = date_creation;
	}
	communes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
