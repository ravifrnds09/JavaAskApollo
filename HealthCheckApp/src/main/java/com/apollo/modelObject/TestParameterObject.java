package com.apollo.modelObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Package_parameter_details")
public class TestParameterObject {
	
	public TestParameterObject() {
		
	}
	
	private int paramID;
	
	private String name;
	
	private String description;
	
	@Id
	@GeneratedValue
	@Column(name="id")
	public int getParamID() {
		return paramID;
	}

	public void setParamID(int paramID) {
		this.paramID = paramID;
	}

	@Column(name="parameter_description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="parameter_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
