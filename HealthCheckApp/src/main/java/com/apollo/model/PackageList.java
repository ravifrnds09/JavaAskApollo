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
	private String Frequency;
	private String Package_Description;
	private String Age_Group_Recommended;
	private String Recommended_For;
	private int age;
	public String getFrequency() {
		return Frequency;
	}
	public void setFrequency(String frequency) {
		Frequency = frequency;
	}
	public String getPackage_Description() {
		return Package_Description;
	}
	public void setPackage_Description(String package_Description) {
		Package_Description = package_Description;
	}
	public String getAge_Group_Recommended() {
		return Age_Group_Recommended;
	}
	public void setAge_Group_Recommended(String age_Group_Recommended) {
		Age_Group_Recommended = age_Group_Recommended;
	}
	public String getRecommended_For() {
		return Recommended_For;
	}
	public void setRecommended_For(String recommended_For) {
		Recommended_For = recommended_For;
	}
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
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PackageList [hospitalId=" + hospitalId + ", regionId=" + regionId + ", CustomerPackageName="
				+ CustomerPackageName + ", Packageinclusions=" + Packageinclusions + ", Tariff=" + Tariff
				+ ", ServiceId=" + ServiceId + ", ServiceName=" + ServiceName + ", gender=" + gender + ", fromAge="
				+ fromAge + ", toAge=" + toAge + ", Frequency=" + Frequency + ", Package_Description="
				+ Package_Description + ", Age_Group_Recommended=" + Age_Group_Recommended + ", Recommended_For="
				+ Recommended_For + ", age=" + age + "]";
	}
	
	
}
