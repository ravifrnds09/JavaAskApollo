package com.apollo.model;

import javax.xml.bind.annotation.XmlElement;

public class HCPersonalizedPackage {
	@XmlElement(name="CityId")
	private String cityId;
	@XmlElement(name="HRAID")
	private String hRAID;
	@XmlElement(name="PatientId")
	private String patientId;
	@XmlElement(name="UHID")
	private String uHID;
	@XmlElement(name="Firstname")
	private String firstname;
	@XmlElement(name="Lastname")
	private String lastname;
	@XmlElement(name="PhoneNo")
	private String phoneNo;
	@XmlElement(name="EmailId")
	private String emailId;
	@XmlElement(name="Age")
	private String age;
	@XmlElement(name="Gender")
	private String gender;
	
	
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String gethRAID() {
		return hRAID;
	}
	public void sethRAID(String hRAID) {
		this.hRAID = hRAID;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getuHID() {
		return uHID;
	}
	public void setuHID(String uHID) {
		this.uHID = uHID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "HCPersonalizedPackage [cityId=" + cityId + ", hRAID=" + hRAID + ", patientId=" + patientId + ", uHID="
				+ uHID + ", firstname=" + firstname + ", lastname=" + lastname + ", phoneNo=" + phoneNo + ", emailId="
				+ emailId + ", age=" + age + ", gender=" + gender + "]";
	}
	
	


}
