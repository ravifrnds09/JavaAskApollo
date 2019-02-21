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
	private String unit_ID;
	private String payment_Availability;
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
	
	public String getUnit_ID() {
		return unit_ID;
	}
	public void setUnit_ID(String unit_ID) {
		this.unit_ID = unit_ID;
	}
	public String getPayment_Availability() {
		return payment_Availability;
	}
	public void setPayment_Availability(String payment_Availability) {
		this.payment_Availability = payment_Availability;
	}
	@Override
	public String toString() {
		return "HospitalList [cityId=" + cityId + ", HospitalId=" + HospitalId + ", HospitalName=" + HospitalName
				+ ", unit_ID=" + unit_ID + ", payment_Availability=" + payment_Availability + "]";
	}
	
	
	

}
