package com.malachitebe.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*.[Tab_ville_edc](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[code_Ville] [nvarchar](255) NULL,
	[ville] [nvarchar](255) NULL,
	[code_Province] [nvarchar](255) NULL,*/
@Entity(name="Tab_ville_edc")
public class ville_edc {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String code_Ville;
	private String ville;
	private String code_Province;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode_Ville() {
		return code_Ville;
	}
	public void setCode_Ville(String code_Ville) {
		this.code_Ville = code_Ville;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCode_Province() {
		return code_Province;
	}
	public void setCode_Province(String code_Province) {
		this.code_Province = code_Province;
	}
	ville_edc(Long id, String code_Ville, String ville, String code_Province) {
		super();
		this.id = id;
		this.code_Ville = code_Ville;
		this.ville = ville;
		this.code_Province = code_Province;
	}
	
}
