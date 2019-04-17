package com.apollo.model;

import org.hibernate.validator.NotNull;

public class TestParameterDesc {
	private String packageName;
	private String parameter;
	@NotNull
	private String description;
	private String Gender;
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "TestParameterDesc [packageName=" + packageName + ", parameter=" + parameter + ", description="
				+ description + "]";
	}

}
