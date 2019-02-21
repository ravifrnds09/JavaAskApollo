package com.apollo.model;

import org.hibernate.validator.NotNull;

public class TestParameterDesc {
	private String packageName;
	private String parameter;
	@NotNull
	private String description;
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
	@Override
	public String toString() {
		return "TestParameterDesc [packageName=" + packageName + ", parameter=" + parameter + ", description="
				+ description + "]";
	}

}
