package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_profession](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[profession] [nvarchar](80) NULL,
	[username] [nvarchar](30) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_profession")
public class profession {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String profession;
	private String username;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
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
	profession(Integer id, String profession, String username, Date date_creation) {
		super();
		this.id = id;
		this.profession = profession;
		this.username = username;
		this.date_creation = date_creation;
	}
	
}
