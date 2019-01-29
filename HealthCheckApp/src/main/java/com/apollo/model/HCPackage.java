package com.apollo.model;

public class HCPackage {
	
	private int packageId;
	
	private String packageName;
	
	private String gender;
	
	private String bodyPart;
	
	private String clinicalCondi;
	
	private String frequency;
	
	private String ageGroup;
	
	private String description;
	
	private String recommendedFor;
	
	private String testNamesString;
	
	private int genderId;
	
	private int ageId;
	
	private int locationId;

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBodyPart() {
		return bodyPart;
	}

	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}
	
	public String getClinicalCondi() {
		return clinicalCondi;
	}

	public void setClinicalCondi(String clinicalCondi) {
		this.clinicalCondi = clinicalCondi;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRecommendedFor() {
		return recommendedFor;
	}

	public void setRecommendedFor(String recommendedFor) {
		this.recommendedFor = recommendedFor;
	}

	public String getTestNamesString() {
		return testNamesString;
	}

	public void setTestNamesString(String testNamesString) {
		this.testNamesString = testNamesString;
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public int getAgeId() {
		return ageId;
	}

	public void setAgeId(int ageId) {
		this.ageId = ageId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "HCPackage [packageId=" + packageId + ", packageName=" + packageName + ", gender=" + gender
				+ ", bodyPart=" + bodyPart + ", clinicalCondi=" + clinicalCondi + ", frequency=" + frequency
				+ ", ageGroup=" + ageGroup + ", description=" + description + ", recommendedFor=" + recommendedFor
				+ ", testNamesString=" + testNamesString + ", genderId=" + genderId + ", ageId=" + ageId
				+ ", locationId=" + locationId + "]";
	}
	
			
}
