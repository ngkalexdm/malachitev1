package com.malachitebe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_users_systeme_last_login](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NULL,
	[ip_address] [nvarchar](50) NULL,
	[date_login] [nvarchar](50) NULL,
	[computer_name] [nvarchar](50) NULL,
	[web_browser_name] [nvarchar](50) NULL,*/
@Entity(name="Tab_users_systeme_last_login")
public class users_systeme_last_login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String ip_address;
	private String date_login;
	private String computer_name;
	private String web_browser_name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getDate_login() {
		return date_login;
	}
	public void setDate_login(String date_login) {
		this.date_login = date_login;
	}
	public String getComputer_name() {
		return computer_name;
	}
	public void setComputer_name(String computer_name) {
		this.computer_name = computer_name;
	}
	public String getWeb_browser_name() {
		return web_browser_name;
	}
	public void setWeb_browser_name(String web_browser_name) {
		this.web_browser_name = web_browser_name;
	}
	users_systeme_last_login(Long id, String username, String ip_address, String date_login, String computer_name,
			String web_browser_name) {
		super();
		this.id = id;
		this.username = username;
		this.ip_address = ip_address;
		this.date_login = date_login;
		this.computer_name = computer_name;
		this.web_browser_name = web_browser_name;
	}
	
}
