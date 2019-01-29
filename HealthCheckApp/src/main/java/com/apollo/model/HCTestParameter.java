package com.apollo.model;

public class HCTestParameter {
	
	private int paramId;
	
	private String paramName;
	
	private String paramDesc;
	
	private String alterName;

	public int getParamId() {
		return paramId;
	}

	public void setParamId(int paramId) {
		this.paramId = paramId;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamDesc() {
		return paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

	public String getAlterName() {
		return alterName;
	}

	public void setAlterName(String alterName) {
		this.alterName = alterName;
	}

	@Override
	public String toString() {
		return "HCTestParameter [paramId=" + paramId + ", paramName=" + paramName + ", paramDesc=" + paramDesc
				+ ", alterName=" + alterName + "]";
	}
	
			
}
