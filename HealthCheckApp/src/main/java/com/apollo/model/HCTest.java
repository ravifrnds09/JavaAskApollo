package com.apollo.model;

public class HCTest {
		
	private int testId;
	
	private String testName;
	
	private String testDesc;
	
	private String paramNamesString;
	
	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestDesc() {
		return testDesc;
	}

	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}

	public String getParamNamesString() {
		return paramNamesString;
	}

	public void setParamNamesString(String paramNamesString) {
		this.paramNamesString = paramNamesString;
	}

	@Override
	public String toString() {
		return "HCTest [testId=" + testId + ", testName=" + testName + ", testDesc=" + testDesc + ", paramNamesString="
				+ paramNamesString + "]";
	}
	
		
}
