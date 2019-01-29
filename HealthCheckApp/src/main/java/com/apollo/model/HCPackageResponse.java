package com.apollo.model;

import java.util.List;

public class HCPackageResponse {
	
	private String response;
	
	private List<HCTestParameter> testParamResponseList;
	
	private List<HCTest> testResponseList;
	
	private List<HCPackage> packageResponseList;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<HCTestParameter> getTestParamResponseList() {
		return testParamResponseList;
	}

	public void setTestParamResponseList(List<HCTestParameter> testParamResponseList) {
		this.testParamResponseList = testParamResponseList;
	}

	public List<HCTest> getTestResponseList() {
		return testResponseList;
	}

	public void setTestResponseList(List<HCTest> testResponseList) {
		this.testResponseList = testResponseList;
	}

	public List<HCPackage> getPackageResponseList() {
		return packageResponseList;
	}

	public void setPackageResponseList(List<HCPackage> packageResponseList) {
		this.packageResponseList = packageResponseList;
	}

	@Override
	public String toString() {
		return "HCPackageResponse [response=" + response + ", testParamResponseList=" + testParamResponseList
				+ ", testResponseList=" + testResponseList + ", packageResponseList=" + packageResponseList + "]";
	}
	
			
}
