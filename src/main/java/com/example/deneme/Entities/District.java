package com.example.deneme.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ilceler")
public class District {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int districtID;
	
	@Column(name = "sehir_id")
	private int cityID;
	
	@Column(name="ilce_adi")
	private String districtName;
	
	
	public District(int districtID, int cityID, String districtName) {
		this.districtID = districtID;
		this.cityID = cityID;
		this.districtName = districtName;
	}
	
	public District() {}
	
	
	public int getDistrictID() {
		return districtID;
	}
	public void setDistrictID(int districtID) {
		this.districtID = districtID;
	}
	public int getCityID() {
		return cityID;
	}
	public void setCityID(int cityID) {
		this.cityID = cityID;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

}
