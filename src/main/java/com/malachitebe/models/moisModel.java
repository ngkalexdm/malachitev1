package com.malachitebe.models;

public class moisModel {

    private Integer code;
    private String mois;
    
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMois() {
		return mois;
	}
	public void setMois(String mois) {
		this.mois = mois;
	}
	moisModel(Integer code, String mois) {
		super();
		this.code = code;
		this.mois = mois;
	}
	moisModel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
