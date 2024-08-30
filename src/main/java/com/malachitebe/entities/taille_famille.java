package com.malachitebe.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_taille_famille](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[id_adherent] [int] NULL,
	[mois_1] [int] NULL,
	[mois_2] [int] NULL,
	[mois_3] [int] NULL,
	[mois_4] [int] NULL,
	[mois_5] [int] NULL,
	[mois_6] [int] NULL,
	[mois_7] [int] NULL,
	[mois_8] [int] NULL,
	[mois_9] [int] NULL,
	[mois_10] [int] NULL,
	[mois_11] [int] NULL,
	[mois_12] [int] NULL,*/
@Entity(name="Tab_taille_famille")
public class taille_famille {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer id_adherent;
	private Integer mois_1;
	private Integer mois_2;
	private Integer mois_3;
	private Integer mois_4;
	private Integer mois_5;
	private Integer mois_6;
	private Integer mois_7;
	private Integer mois_8;
	private Integer mois_9;
	private Integer mois_10;
	private Integer mois_11;
	private Integer mois_12;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Integer id_adherent) {
		this.id_adherent = id_adherent;
	}
	public Integer getMois_1() {
		return mois_1;
	}
	public void setMois_1(Integer mois_1) {
		this.mois_1 = mois_1;
	}
	public Integer getMois_2() {
		return mois_2;
	}
	public void setMois_2(Integer mois_2) {
		this.mois_2 = mois_2;
	}
	public Integer getMois_3() {
		return mois_3;
	}
	public void setMois_3(Integer mois_3) {
		this.mois_3 = mois_3;
	}
	public Integer getMois_4() {
		return mois_4;
	}
	public void setMois_4(Integer mois_4) {
		this.mois_4 = mois_4;
	}
	public Integer getMois_5() {
		return mois_5;
	}
	public void setMois_5(Integer mois_5) {
		this.mois_5 = mois_5;
	}
	public Integer getMois_6() {
		return mois_6;
	}
	public void setMois_6(Integer mois_6) {
		this.mois_6 = mois_6;
	}
	public Integer getMois_7() {
		return mois_7;
	}
	public void setMois_7(Integer mois_7) {
		this.mois_7 = mois_7;
	}
	public Integer getMois_8() {
		return mois_8;
	}
	public void setMois_8(Integer mois_8) {
		this.mois_8 = mois_8;
	}
	public Integer getMois_9() {
		return mois_9;
	}
	public void setMois_9(Integer mois_9) {
		this.mois_9 = mois_9;
	}
	public Integer getMois_10() {
		return mois_10;
	}
	public void setMois_10(Integer mois_10) {
		this.mois_10 = mois_10;
	}
	public Integer getMois_11() {
		return mois_11;
	}
	public void setMois_11(Integer mois_11) {
		this.mois_11 = mois_11;
	}
	public Integer getMois_12() {
		return mois_12;
	}
	public void setMois_12(Integer mois_12) {
		this.mois_12 = mois_12;
	}
	taille_famille(Long id, Integer id_adherent, Integer mois_1, Integer mois_2, Integer mois_3, Integer mois_4,
			Integer mois_5, Integer mois_6, Integer mois_7, Integer mois_8, Integer mois_9, Integer mois_10,
			Integer mois_11, Integer mois_12) {
		super();
		this.id = id;
		this.id_adherent = id_adherent;
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
	}
	
}
