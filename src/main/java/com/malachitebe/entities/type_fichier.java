package com.malachitebe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_type_fichier](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[type_fichier] [nvarchar](50) NULL,*/
@Entity(name="Tab_type_fichier")
public class type_fichier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type_fichier;
	
	public String getType_fichier() {
		return type_fichier;
	}
	public void setType_fichier(String type_fichier) {
		this.type_fichier = type_fichier;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	type_fichier(Long id, String type_fichier) {
		super();
		this.id = id;
		this.type_fichier = type_fichier;
	}
	type_fichier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
