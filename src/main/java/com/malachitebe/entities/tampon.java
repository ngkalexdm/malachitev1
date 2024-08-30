package com.malachitebe.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*[dbo].[Tab_tampon](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[v1] [nvarchar](50) NULL,
	[v2] [nvarchar](50) NULL,
	[v3] [nvarchar](50) NULL,
	[v4] [nvarchar](50) NULL,
	[v5] [nvarchar](50) NULL,
	[v6] [nvarchar](50) NULL,
	[v7] [nvarchar](50) NULL,
	[v8] [nvarchar](50) NULL,
	[v9] [nvarchar](50) NULL,
	[v10] [nvarchar](50) NULL,
	[v11] [datetime] NULL,
	[id_adherent] [nvarchar](50) NULL,-*/
@Entity(name="Tab_tampon")
public class tampon {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String v1;
	private String v2;
	private String v3;
	private String v4;
	private String v5;
	private String v6;
	private String v7;
	private String v8;
	private String v9;
	private String v10;
	private Date v11=new Date();
	private String id_adherent;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getV1() {
		return v1;
	}
	public void setV1(String v1) {
		this.v1 = v1;
	}
	public String getV2() {
		return v2;
	}
	public void setV2(String v2) {
		this.v2 = v2;
	}
	public String getV3() {
		return v3;
	}
	public void setV3(String v3) {
		this.v3 = v3;
	}
	public String getV4() {
		return v4;
	}
	public void setV4(String v4) {
		this.v4 = v4;
	}
	public String getV5() {
		return v5;
	}
	public void setV5(String v5) {
		this.v5 = v5;
	}
	public String getV6() {
		return v6;
	}
	public void setV6(String v6) {
		this.v6 = v6;
	}
	public String getV7() {
		return v7;
	}
	public void setV7(String v7) {
		this.v7 = v7;
	}
	public String getV8() {
		return v8;
	}
	public void setV8(String v8) {
		this.v8 = v8;
	}
	public String getV9() {
		return v9;
	}
	public void setV9(String v9) {
		this.v9 = v9;
	}
	public String getV10() {
		return v10;
	}
	public void setV10(String v10) {
		this.v10 = v10;
	}
	public Date getV11() {
		return v11;
	}
	public void setV11(Date v11) {
		this.v11 = v11;
	}
	public String getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(String id_adherent) {
		this.id_adherent = id_adherent;
	}
	tampon(Long id, String v1, String v2, String v3, String v4, String v5, String v6, String v7, String v8, String v9,
			String v10, Date v11, String id_adherent) {
		super();
		this.id = id;
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
		this.v5 = v5;
		this.v6 = v6;
		this.v7 = v7;
		this.v8 = v8;
		this.v9 = v9;
		this.v10 = v10;
		this.v11 = v11;
		this.id_adherent = id_adherent;
	}
	
}
