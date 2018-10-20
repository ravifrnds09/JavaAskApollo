package com.apollo.model;

public class PackageList {
	private Integer hospitalId;
	private Integer regionId;
	private String CustomerPackageName;
	private String Packageinclusions;
	private String Tariff;
	private Integer ServiceId;
	private String ServiceName;
	private String gender;
	private String fromAge;
	private String toAge;
	public Integer getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	public Integer getRegionId() {
		return regionId;
	}
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCustomerPackageName() {
		return CustomerPackageName;
	}
	public void setCustomerPackageName(String customerPackageName) {
		CustomerPackageName = customerPackageName;
	}
	public String getPackageinclusions() {
		return Packageinclusions;
	}
	public void setPackageinclusions(String packageinclusions) {
		Packageinclusions = packageinclusions;
	}
	public String getTariff() {
		return Tariff;
	}
	public void setTariff(String tariff) {
		Tariff = tariff;
	}
	
	public Integer getServiceId() {
		return ServiceId;
	}
	public void setServiceId(Integer serviceId) {
		ServiceId = serviceId;
	}
	public String getServiceName() {
		return ServiceName;
	}
	public void setServiceName(String serviceName) {
		ServiceName = serviceName;
	}
	public String getFromAge() {
		return fromAge;
	}
	public void setFromAge(String fromAge) {
		this.fromAge = fromAge;
	}
	public String getToAge() {
		return toAge;
	}
	public void setToAge(String toAge) {
		this.toAge = toAge;
	}
	@Override
	public String toString() {
		return "PackageList [hospitalId=" + hospitalId + ", regionId=" + regionId + ", gender=" + gender
				+ ", CustomerPackageName=" + CustomerPackageName + ", Packageinclusions=" + Packageinclusions
				+ ", Tariff=" + Tariff + ", ServiceId=" + ServiceId + ", ServiceName=" + ServiceName + "]";
	}
	
	
}
