package com.malachitebe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/*[dbo].[Tab_pyramide_age_malade](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[id_exercice] [int] NULL,
	[sexe] [nvarchar](50) NULL,
	[a_10] [int] NULL,
	[a_20] [int] NULL,
	[a_30] [int] NULL,
	[a_40] [int] NULL,
	[a_50] [int] NULL,
	[a_60] [int] NULL,
	[a_70] [int] NULL,
	[a_80] [int] NULL,
	[a_90] [int] NULL,
	[a_100] [int] NULL,*/
@Entity(name="Tab_pyramide_age_malade")
public class pyramide_age_malade {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer id_exercice;
	private String sexe;
	private Integer a_10 ;
	private Integer a_20 ;
	private Integer a_30 ;
	private Integer a_40 ;
	private Integer a_50 ;
	private Integer a_60 ;
	private Integer a_70 ;
	private Integer a_80 ;
	private Integer a_90 ;
	private Integer a_100 ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		this.id_exercice = id_exercice;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Integer getA_10() {
		return a_10;
	}
	public void setA_10(Integer a_10) {
		this.a_10 = a_10;
	}
	public Integer getA_20() {
		return a_20;
	}
	public void setA_20(Integer a_20) {
		this.a_20 = a_20;
	}
	public Integer getA_30() {
		return a_30;
	}
	public void setA_30(Integer a_30) {
		this.a_30 = a_30;
	}
	public Integer getA_40() {
		return a_40;
	}
	public void setA_40(Integer a_40) {
		this.a_40 = a_40;
	}
	public Integer getA_50() {
		return a_50;
	}
	public void setA_50(Integer a_50) {
		this.a_50 = a_50;
	}
	public Integer getA_60() {
		return a_60;
	}
	public void setA_60(Integer a_60) {
		this.a_60 = a_60;
	}
	public Integer getA_70() {
		return a_70;
	}
	public void setA_70(Integer a_70) {
		this.a_70 = a_70;
	}
	public Integer getA_80() {
		return a_80;
	}
	public void setA_80(Integer a_80) {
		this.a_80 = a_80;
	}
	public Integer getA_90() {
		return a_90;
	}
	public void setA_90(Integer a_90) {
		this.a_90 = a_90;
	}
	public Integer getA_100() {
		return a_100;
	}
	public void setA_100(Integer a_100) {
		this.a_100 = a_100;
	}
	public pyramide_age_malade(Long id, Integer id_exercice, String sexe, Integer a_10, Integer a_20, Integer a_30,
			Integer a_40, Integer a_50, Integer a_60, Integer a_70, Integer a_80, Integer a_90, Integer a_100) {
		super();
		this.id = id;
		this.id_exercice = id_exercice;
		this.sexe = sexe;
		this.a_10 = a_10;
		this.a_20 = a_20;
		this.a_30 = a_30;
		this.a_40 = a_40;
		this.a_50 = a_50;
		this.a_60 = a_60;
		this.a_70 = a_70;
		this.a_80 = a_80;
		this.a_90 = a_90;
		this.a_100 = a_100;
	}
}
