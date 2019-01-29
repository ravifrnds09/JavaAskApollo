package com.apollo.model;

public class HCPackageMapping {
	
	private int packageId;
	
	private String packageName;
	
	private String serviceNamesString;
	
	private String subPackagesString;
	
	private Integer locationId;
	
	private String locationName;
	
	private String createdDate;

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getServiceNamesString() {
		return serviceNamesString;
	}

	public void setServiceNamesString(String serviceNamesString) {
		this.serviceNamesString = serviceNamesString;
	}

	public String getSubPackagesString() {
		return subPackagesString;
	}

	public void setSubPackagesString(String subPackagesString) {
		this.subPackagesString = subPackagesString;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "HCPackageMapping [packageId=" + packageId + ", packageName=" + packageName + ", serviceNamesString="
				+ serviceNamesString + ", subPackagesString=" + subPackagesString + ", locationId=" + locationId
				+ ", locationName=" + locationName + ", createdDate=" + createdDate + "]";
	}
	
	
}
