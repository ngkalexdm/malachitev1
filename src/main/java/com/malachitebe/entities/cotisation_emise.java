package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[Tab_cotisation_emise](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[id_adherent] [bigint] NULL,
	[id_exercice] [int] NULL,
	[mois_1] [decimal](18, 2) NULL,
	[mois_2] [decimal](18, 2) NULL,
	[mois_3] [decimal](18, 2) NULL,
	[mois_4] [decimal](18, 2) NULL,
	[mois_5] [decimal](18, 2) NULL,
	[mois_6] [decimal](18, 2) NULL,
	[mois_7] [decimal](18, 2) NULL,
	[mois_8] [decimal](18, 2) NULL,
	[mois_9] [decimal](18, 2) NULL,
	[mois_10] [decimal](18, 2) NULL,
	[mois_11] [decimal](18, 2) NULL,
	[mois_12] [decimal](18, 2) NULL,
	[date_creation] [datetime] NULL,*/
@Entity(name="Tab_cotisation_emise")
public class cotisation_emise {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Long id_adherent;
	private Integer id_exercice;
	private Double mois_1;
	private Double mois_2;
	private Double mois_3;
	private Double mois_4;
	private Double mois_5;
	private Double mois_6;
	private Double mois_7;
	private Double mois_8;
	private Double mois_9;
	private Double mois_10;
	private Double mois_11;
	private Double mois_12;
	private Date date_creation=new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public Double getMois_1() {
		return mois_1;
	}
	public void setMois_1(Double mois_1) {
		this.mois_1 = mois_1;
	}
	public Double getMois_2() {
		return mois_2;
	}
	public void setMois_2(Double mois_2) {
		this.mois_2 = mois_2;
	}
	public Double getMois_3() {
		return mois_3;
	}
	public void setMois_3(Double mois_3) {
		this.mois_3 = mois_3;
	}
	public Double getMois_4() {
		return mois_4;
	}
	public void setMois_4(Double mois_4) {
		this.mois_4 = mois_4;
	}
	public Double getMois_5() {
		return mois_5;
	}
	public void setMois_5(Double mois_5) {
		this.mois_5 = mois_5;
	}
	public Double getMois_6() {
		return mois_6;
	}
	public void setMois_6(Double mois_6) {
		this.mois_6 = mois_6;
	}
	public Double getMois_7() {
		return mois_7;
	}
	public void setMois_7(Double mois_7) {
		this.mois_7 = mois_7;
	}
	public Double getMois_8() {
		return mois_8;
	}
	public void setMois_8(Double mois_8) {
		this.mois_8 = mois_8;
	}
	public Double getMois_9() {
		return mois_9;
	}
	public void setMois_9(Double mois_9) {
		this.mois_9 = mois_9;
	}
	public Double getMois_10() {
		return mois_10;
	}
	public void setMois_10(Double mois_10) {
		this.mois_10 = mois_10;
	}
	public Double getMois_11() {
		return mois_11;
	}
	public void setMois_11(Double mois_11) {
		this.mois_11 = mois_11;
	}
	public Double getMois_12() {
		return mois_12;
	}
	public void setMois_12(Double mois_12) {
		this.mois_12 = mois_12;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public cotisation_emise(Integer id, Long id_adherent, Integer id_exercice, Double mois_1, Double mois_2, Double mois_3,
			Double mois_4, Double mois_5, Double mois_6, Double mois_7, Double mois_8, Double mois_9, Double mois_10,
			Double mois_11, Double mois_12, Date date_creation) {
		super();
		this.id = id;
		this.id_adherent = id_adherent;
		this.id_exercice = id_exercice;
		this.mois_1 = mois_1;
		this.mois_2 = mois_2;
		this.mois_3 = mois_3;
		this.mois_4 = mois_4;
		this.mois_5 = mois_5;
		this.mois_6 = mois_6;
		this.mois_7 = mois_7;
		this.mois_8 = mois_8;
		this.mois_9 = mois_9;
		this.mois_10 = mois_10;
		this.mois_11 = mois_11;
		this.mois_12 = mois_12;
		this.date_creation = date_creation;
	}
	public cotisation_emise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
