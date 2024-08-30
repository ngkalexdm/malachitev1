package com.malachitebe.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_province](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[code_pays] [int] NOT NULL,
	[province] [nvarchar](80) NULL,
	[username] [nvarchar](50) NULL,
	[date_creation] [datetime] NOT NULL,*/
@Entity(name="Tab_province")
public class province {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer code_pays;
	private String province;
	private String username;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCode_pays() {
		return code_pays;
	}
	public void setCode_pays(Integer code_pays) {
		this.code_pays = code_pays;
	}
	public String getprovince() {
		return province;
	}
	public void setprovince(String province) {
		this.province = province;
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
	province(Integer id, Integer code_pays, String province, String username, Date date_creation) {
		super();
		this.id = id;
		this.code_pays = code_pays;
		this.province = province;
		this.username = username;
		this.date_creation = date_creation;
	}
	province() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	
	