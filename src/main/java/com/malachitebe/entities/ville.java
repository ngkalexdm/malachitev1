package com.malachitebe.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_ville](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[code_province] [int] NOT NULL,
	[ville] [nvarchar](80) NULL,
	[username] [nvarchar](50) NULL,
	[date_creation] [datetime] NOT NULL,*/
@Entity(name="Tab_ville")
public class ville {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer code_province;
	private String ville;
	private String username;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getcode_province() {
		return code_province;
	}
	public void setcode_province(Integer code_province) {
		this.code_province = code_province;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
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
	ville(Integer id, Integer code_province, String ville, String username, Date date_creation) {
		super();
		this.id = id;
		this.code_province = code_province;
		this.ville = ville;
		this.username = username;
		this.date_creation = date_creation;
	}
	ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	
	