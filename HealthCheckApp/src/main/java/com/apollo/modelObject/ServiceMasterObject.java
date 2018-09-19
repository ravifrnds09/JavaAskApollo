package com.apollo.modelObject;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="services_master")
//@IdClass(ServiceMasterPK.class)
public class ServiceMasterObject {
	
	private String serviceCode;
	
	private String serviceName;
	
	private String serviceDesc;
	
	private Integer serviceTypeId;
	
	private Integer serviceCategoryId;
	
	private ServiceMasterPKObject serviceMasterPK;

	@EmbeddedId
	public ServiceMasterPKObject getServiceMasterPK() {
		return serviceMasterPK;
	}

	public void setServiceMasterPK(ServiceMasterPKObject serviceMasterPK) {
		this.serviceMasterPK = serviceMasterPK;
	}
	
	private Integer serviceId;
	
	private String locationId;
	
	@Id
	@Column(name="SERVICEID")
	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	@Id
	@Column(name="LOCATIONID")
	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	
	@Column(name="SERVICECODE")
	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	@Column(name="SERVICENAME")
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@Column(name="SERVICEDESCRIPTION")
	public String getServiceDesc() {
		return serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	@Column(name="SERVICETYPEID")
	public Integer getServiceTypeId() {
		return serviceTypeId;
	}

	public void setServiceTypeId(Integer serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	@Column(name="SERVICECATEGORYID")
	public Integer getServiceCategoryId() {
		return serviceCategoryId;
	}

	public void setServiceCategoryId(Integer serviceCategoryId) {
		this.serviceCategoryId = serviceCategoryId;
	}
	
}
