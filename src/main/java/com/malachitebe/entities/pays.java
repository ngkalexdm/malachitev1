package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_pays](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[pays] [nvarchar](250) NULL,
	[sigle] [nvarchar](5) NULL,
	[username] [nvarchar](50) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_pays")
public class pays {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String pays;
	private String sigle;
	private String username;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getSigle() {
		return sigle;
	}
	public void setSigle(String sigle) {
		this.sigle = sigle;
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
	pays(Integer id, String pays, String sigle, String username, Date date_creation) {
		super();
		this.id = id;
		this.pays = pays;
		this.sigle = sigle;
		this.username = username;
		this.date_creation = date_creation;
	}
	
	pays() {
		super();
		// TODO Auto-generated constructor stub
	}
}
