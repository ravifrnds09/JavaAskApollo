package com.apollo.model;

import java.math.BigInteger;

public class HCServiceMaster {
	
	private BigInteger serviceId;
	
	private String serviceCode;
	
	private String serviceName;
	
	private String locationId;
	
	public BigInteger getServiceId() {
		return serviceId;
	}

	public void setServiceId(BigInteger serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	
}
