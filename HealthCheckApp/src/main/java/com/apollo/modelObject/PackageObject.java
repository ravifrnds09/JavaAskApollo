package com.apollo.modelObject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="package_details")
public class PackageObject {
	
	private int id;
	
	private String packageName;
	
	private String frequency;
	
	private String ageGroup;
	
	private String description;
	
	private String recommendedFor;
	
	private List<TestObject> test;
	
	private String testNamesString;
	
	private List<ServiceMasterObject> service;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumns({@JoinColumn(name = "service_master_id", referencedColumnName = "SERVICEID"),
        @JoinColumn(name = "location_master_id", referencedColumnName = "LOCATIONID")
    })
	/*@JoinTable(name = "package_service_maping", joinColumns = { @JoinColumn(name = "package_id") },inverseJoinColumns = { @JoinColumn(name = "service_master_id")})
	@JoinColumns({
				  @JoinColumn(name = "serviceMasterPK")
				})*/
	public List<ServiceMasterObject> getService() {
		return service;
	}

	public void setService(List<ServiceMasterObject> service) {
		this.service = service;
	}

	@Transient
	public String getTestNamesString() {
		return testNamesString;
	}

	public void setTestNamesString(String testNamesString) {
		this.testNamesString = testNamesString;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "package_test_maping", joinColumns = { @JoinColumn(name = "package_id") },
	inverseJoinColumns = { @JoinColumn(name = "test_id") })
	public List<TestObject> getTest() {
		return test;
	}

	public void setTest(List<TestObject> test) {
		this.test = test;
	}

	@Id
	@Column(name="package_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="package_name")
	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	@Column(name="package_frequency")
	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Column(name="package_age_group")
	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	@Column(name="package_description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="package_recommended_for")
	public String getRecommendedFor() {
		return recommendedFor;
	}

	public void setRecommendedFor(String recommendedFor) {
		this.recommendedFor = recommendedFor;
	}
	
}
