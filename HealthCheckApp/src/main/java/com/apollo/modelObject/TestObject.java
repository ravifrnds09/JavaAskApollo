package com.apollo.modelObject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="package_test_details")
public class TestObject {
	
	private int testID;
	
	private String name;
	
	private String description;
	
	private String testParametersString;

	@Transient
	public String getTestParametersString() {
		return testParametersString;
	}

	public void setTestParametersString(String testParametersString) {
		this.testParametersString = testParametersString;
	}

	private List<TestParameterObject> testParameters;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "package_parameter_test_details", joinColumns = { @JoinColumn(name = "test_id") },
	inverseJoinColumns = { @JoinColumn(name = "param_id") })
	public List<TestParameterObject> getTestParameters() {
		return testParameters;
	}

	public void setTestParameters(List<TestParameterObject> testParameters) {
		this.testParameters = testParameters;
	}
	

	@Id
	@GeneratedValue
	@Column(name="id")
	public int getTestID() {
		return testID;
	}

	public void setTestID(int testID) {
		this.testID = testID;
	}

	@Column(name="test_name")
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Column(name="test_description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
		
}
