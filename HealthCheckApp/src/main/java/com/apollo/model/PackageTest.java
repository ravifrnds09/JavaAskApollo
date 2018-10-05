package com.apollo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(value=Include.NON_NULL)
public class PackageTest {
	private Integer packageId;
	private Integer locationId;
	private Integer regionId;
	private Integer age;
	private String gender;
	private String PackageName;
	private String Packageinclusions;
	private String Tariff;
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPackageName() {
		return PackageName;
	}
	public void setPackageName(String packageName) {
		PackageName = packageName;
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
	@Override
	public String toString() {
		return "PackageTest [PackageName=" + PackageName + ", Packageinclusions=" + Packageinclusions + ", Tariff="
				+Tariff + ", Gender=" + gender + "]";
	}
	
	
}
