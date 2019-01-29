package com.apollo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(value=Include.NON_NULL)
public class HospitalList {
	private String cityId;
	private int HospitalId;
	private String HospitalName;
	
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public int getHospitalId() {
		return HospitalId;
	}
	public void setHospitalId(int hospitalId) {
		HospitalId = hospitalId;
	}
	public String getHospitalName() {
		return HospitalName;
	}
	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}
	@Override
	public String toString() {
		return "HospitalList [cityId=" + cityId + ", HospitalId=" + HospitalId + ", HospitalName=" + HospitalName + "]";
	}
	
	

}
