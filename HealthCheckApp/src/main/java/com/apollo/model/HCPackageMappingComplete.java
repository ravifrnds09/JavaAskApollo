package com.apollo.model;

import java.math.BigInteger;

public class HCPackageMappingComplete {
	
	

	private BigInteger serviceId;
	
	private String serviceName;
	
	private String locationId;
	
	private String locationName;
	
	private String testInclusions;
	
	private BigInteger price;

	public BigInteger getServiceId() {
		return serviceId;
	}

	public void setServiceId(BigInteger serviceId) {
		this.serviceId = serviceId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getTestInclusions() {
		return testInclusions;
	}

	public void setTestInclusions(String testInclusions) {
		this.testInclusions = testInclusions;
	}

	public BigInteger getPrice() {
		return price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "HCPackageMappingComplete [serviceId=" + serviceId + ", serviceName=" + serviceName + ", locationId="
				+ locationId + ", locationName=" + locationName + ", testInclusions=" + testInclusions + ", price="
				+ price + "]";
	}
	
}
