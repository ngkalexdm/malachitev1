package com.malachitebe.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_mouvement_adherent](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[id_adherent] [bigint] NULL,
	[id_exercise] [int] NULL,
	[date_mouvement] [nvarchar](50) NULL,
	[motif_mouvement] [nvarchar](100) NULL,
	[nature_mouvement] [nvarchar](50) NULL,
	[type_mouvement] [nvarchar](50) NULL,
	[date_creation] [datetime] NOT NULL,*/
@Entity(name="Tab_mouvement_adherent")
public class mouvement_adherent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long id_adherent;
	private Integer id_exercise;
	private String date_mouvement;
	private String motif_mouvement;
	private String nature_mouvement;
	private String type_mouvement;
	private Date date_creation=new Date();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
	}
	public Integer getId_exercise() {
		return id_exercise;
	}
	public void setId_exercise(Integer id_exercise) {
		this.id_exercise = id_exercise;
	}
	public String getDate_mouvement() {
		return date_mouvement;
	}
	public void setDate_mouvement(String date_mouvement) {
		this.date_mouvement = date_mouvement;
	}
	public String getMotif_mouvement() {
		return motif_mouvement;
	}
	public void setMotif_mouvement(String motif_mouvement) {
		this.motif_mouvement = motif_mouvement;
	}
	public String getNature_mouvement() {
		return nature_mouvement;
	}
	public void setNature_mouvement(String nature_mouvement) {
		this.nature_mouvement = nature_mouvement;
	}
	public String getType_mouvement() {
		return type_mouvement;
	}
	public void setType_mouvement(String type_mouvement) {
		this.type_mouvement = type_mouvement;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	mouvement_adherent(Long id, Long id_adherent, Integer id_exercise, String date_mouvement, String motif_mouvement,
			String nature_mouvement, String type_mouvement, Date date_creation) {
		super();
		this.id = id;
		this.id_adherent = id_adherent;
		this.id_exercise = id_exercise;
		this.date_mouvement = date_mouvement;
		this.motif_mouvement = motif_mouvement;
		this.nature_mouvement = nature_mouvement;
		this.type_mouvement = type_mouvement;
		this.date_creation = date_creation;
	}
	
}
