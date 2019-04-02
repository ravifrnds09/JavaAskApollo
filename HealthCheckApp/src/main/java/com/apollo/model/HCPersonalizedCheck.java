package com.apollo.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = Include.NON_NULL)
public class HCPersonalizedCheck {
	@XmlElement(name = "EdocCityId")
	private String cityId;
	@XmlElement(name = "HRAID")
	private String hRAID;
	@XmlElement(name = "PatientId")
	private String patientId;
	@XmlElement(name = "UHID")
	private String uHID;
	@XmlElement(name = "Firstname")
	private String firstname;
	@XmlElement(name = "Lastname")
	private String lastname;
	@XmlElement(name = "PhoneNo")
	private String phoneNo;
	@XmlElement(name = "EmailId")
	private String emailId;
	@XmlElement(name = "Age")
	private String age;
	@XmlElement(name = "Gender")
	private String gender;
	@XmlElement(name = "AreYouPregnant")
	private String areYouPregnant;
	@XmlElement(name = "IsSmoker")
	private String isSmoker;
	@XmlElement(name = "DescribeYourSleep")
	private String describeYourSleep;
	@XmlElement(name = "DescribeYourStressAtHome")
	private String describeYourStressAtHome;
	@XmlElement(name = "DescribeYourStressAtWork")
	private String describeYourStressAtWork;
	@XmlElement(name = "DescribeYourEnergyLevel")
	private String describeYourEnergyLevel;
	@XmlElement(name = "Diag_DiabetesmellitusProblems")
	private String diag_DiabetesmellitusProblems;
	@XmlElement(name = "Diag_BorderlineDiabetesProblems")
	private String diag_BorderlineDiabetesProblems;
	@XmlElement(name = "Diag_HighBloodPressureProblems")
	private String diag_HighBloodPressureProblems;
	@XmlElement(name = "Diag_HighCholesterolProblems")
	private String diag_HighCholesterolProblems;
	@XmlElement(name = "Diag_HeartrelatedProblems")
	private String diag_HeartrelatedProblems;
	@XmlElement(name = "Diag_AsthamaProblems")
	private String diag_AsthamaProblems;
	@XmlElement(name = "Diag_ThyroidProblems")
	private String diag_ThyroidProblems;
	@XmlElement(name = "Diag_HighUricAcidLevelProblems")
	private String diag_HighUricAcidLevelProblems;
	@XmlElement(name = "Diag_CancerProblems")
	private String diag_CancerProblems;
	@XmlElement(name = "Diag_LiverProblems")
	private String diag_LiverProblems;
	@XmlElement(name = "Diag_KidneyProblems")
	private String diag_KidneyProblems;
	@XmlElement(name = "Diag_OsteoporosisProblems")
	private String diag_OsteoporosisProblems;
	@XmlElement(name = "Diag_ArthritisProblems")
	private String diag_ArthritisProblems;
	@XmlElement(name = "Diag_OtherProblems")
	private String diag_OtherProblems;
	@XmlElement(name = "Diag_Cancer_Type_Bladder")
	private String diag_Cancer_Type_Bladder;
	@XmlElement(name = "Diag_Cancer_Type_Blood")
	private String diag_Cancer_Type_Blood;
	@XmlElement(name = "Diag_Cancer_Type_Breast")
	private String diag_Cancer_Type_Breast;
	@XmlElement(name = "Diag_Cancer_Type_Colon")
	private String diag_Cancer_Type_Colon;
	@XmlElement(name = "Diag_Cancer_Type_Eye")
	private String diag_Cancer_Type_Eye;
	@XmlElement(name = "Diag_Cancer_Type_Ovarian")
	private String diag_Cancer_Type_Ovarian;
	@XmlElement(name = "diag_Cancer_Type_Pancreas")
	private String diag_Cancer_Type_Pancreas;
	@XmlElement(name = "Diag_Cancer_Type_Pituitary")
	private String diag_Cancer_Type_Pituitary;
	@XmlElement(name = "Diag_Cancer_Type_Prostrate")
	private String diag_Cancer_Type_Prostrate;
	@XmlElement(name = "Diag_Cancer_Type_Skin")
	private String diag_Cancer_Type_Skin;
	@XmlElement(name = "Diag_Cancer_Type_Stomach")
	private String diag_Cancer_Type_Stomach;
	@XmlElement(name = "Diag_Cancer_Type_Thyroid")
	private String diag_Cancer_Type_Thyroid;
	@XmlElement(name = "Diag_Cancer_Type_Others")
	private String diag_Cancer_Type_Others;
	private String FH_Diabetes;
	private String FH_Hypertension;
	private String FH_ThyroidProblems;
	private String FH_HeartRelatedProblems;
	private String FH_Osteoporosis;
	private String FH_Cancer;
	private String FH_Cancer_Type_Bladder;
	private String FH_Cancer_Type_Blood;
	private String FH_Cancer_Type_Breast;
	private String FH_Cancer_Type_Colon;
	private String FH_Cancer_Type_Eye;
	private String FH_Cancer_Type_Ovarian;
	private String FH_Cancer_Type_Pancreas;
	private String FH_Cancer_Type_Pituitary;
	private String FH_Cancer_Type_Prostrate;
	private String FH_Cancer_Type_Skin;
	private String FH_Cancer_Type_Stomach;
	private String FH_Cancer_Type_Thyroid;
	private String FH_Cancer_Type_Others;
	private String HC_Heart;
	private String HC_Chest;
	private String HC_NervousSystem;
	private String HC_GastrointestinalSystem;
	private String HC_GenitourinarySystem;
	private String HC_MusclesAndJoints;
	private String HC_OralandDental;
	private String HC_Eyes;
	private String HC_Ears;
	private String HC_Nose;
	private String HC_Throat;
	private String HC_Skin;
	private String HC_Breast;
	private String HC_General;
	private String HC_Gynecology;
	private String HC_Heart_ChestPain;
	private String HC_Heart_RacingHeartBeatOrPalpitations;
	private String HC_Heart_DizzinessOrFainting;
	private String HC_Chest_Wheezing;
	private String HC_Chest_Cough;
	private String HC_Chest_DifficultyInBreathing;
	private String HC_NervousSystem_HeadacheOrMigraine;
	private String HC_NervousSystem_MemoryLoss;
	private String HC_NervousSystem_EpilepsyOrSeizureOrFits;
	private String HC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet;
	private String HC_NervousSystem_DizzinessOrFainting;
	private String HC_NervousSystem_TinglingOrNumbnessInOtherparts;
	private String HC_MusclesAndJoints_SwellingInLegsOrFeet;
	private String HC_MusclesAndJoints_SwellingInTwoOrMoreJoints;
	private String HC_MusclesAndJoints_PainInTwoOrMoreJoints;
	private String HC_MusclesAndJoints_StiffnessInTwoOrMoreJoints;
	private String HC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness;
	private String HC_MusclesAndJoints_Others;
	private String HC_GastrointestinalSystem_Constipation;
	private String HC_GastrointestinalSystem_DiahorreaOrLooseMotion;
	private String HC_GastrointestinalSystem_ChangeInBowelHabits;
	private String HC_GastrointestinalSystem_LossOfAppetite;
	private String HC_GastrointestinalSystem_AbdominalPain;
	private String HC_GastrointestinalSystem_AcidityOrHeartBurn;
	private String HC_GastrointestinalSystem_BloatingOrPassingGas;
	private String HC_GastrointestinalSystem_VomitingOrNausea;
	private String HC_GastrointestinalSystem_Belching;
	private String HC_GastrointestinalSystem_RectalBleeding;
	private String HC_GenitourinarySystem_UrinaryDisturbances;
	private String HC_GenitourinarySystem_BloodInUrine;
	private String HC_GenitourinarySystem_SexualDysfunction;
	private String HC_GenitourinarySystem_DischargeFromPrivateParts;
	private String HC_Dental_PainInTeethOrGums;
	private String HC_Dental_SensitiveTeeth;
	private String HC_Dental_Cavities;
	private String HC_Dental_BadBreath;
	private String HC_Dental_MouthUlcers;
	private String HC_Dental_BleedingInGums;
	private String HC_Eye_DisturbanceInVision;
	private String HC_Eye_EyePain;
	private String HC_Eye_IrritationAndRednessOrWateringOrItching;
	private String HC_Ear_EarPainOrDischarge;
	private String HC_Ear_HearingLoss;
	private String HC_Ear_RingingSoundInEars;
	private String HC_Ear_VertigoOrSpinningSensation;
	private String HC_Nose_SneezingDueToAllergies;
	private String HC_Nose_Sinusitis;
	private String HC_Nose_NoseBleeding;
	private String HC_Throat_ThroatIrritationOrPain;
	private String HC_Throat_VoiceChange;
	private String HC_Throat_Snoring;
	private String HC_Throat_ThroatSwelling;
	private String HC_Breast_BreastPain;
	private String HC_Breast_SwellingOrLump;
	private String HC_Breast_Discharge;
	private String HC_Breast_ChangeinBreastSize;
	private String HC_Breast_ChangeInBreastSkinColourOrTexture;
	private String HC_Skin_AllergicRash;
	private String HC_Skin_WhitePatches;
	private String HC_Skin_DrySkin;
	private String HC_Skin_FungalInfection;
	private String HC_Skin_DarkeningOfSkin;
	private String HC_Skin_Warts;
	private String HC_Skin_Corn;
	private String HC_General_WeightLossOrGain;
	private String HC_General_Fever;
	private String HC_General_Snoring;
	private String HC_General_HairFall;
	private String HC_General_VaricoseVeins;
	private String HC_General_SwellingInLegsOrFeet;
	private String HC_Gynaecology_IrregularPeriods;
	private String HC_Gynaecology_HeavyPeriods;
	private String HC_Gynaecology_MissedPeriods;
	private String HC_Gynaecology_VaginalDischargeOrIrritation;
	private String HC_Gynaecology_Spotting;
	private String HC_Gynaecology_PCODORPCOS;
	private String HC_Gynaecology_Infertility;

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

	public String getAreYouPregnant() {
		return areYouPregnant;
	}

	public void setAreYouPregnant(String areYouPregnant) {
		this.areYouPregnant = areYouPregnant;
	}

	public String getIsSmoker() {
		return isSmoker;
	}

	public void setIsSmoker(String isSmoker) {
		this.isSmoker = isSmoker;
	}

	public String getDescribeYourSleep() {
		return describeYourSleep;
	}

	public void setDescribeYourSleep(String describeYourSleep) {
		this.describeYourSleep = describeYourSleep;
	}

	public String getDescribeYourStressAtHome() {
		return describeYourStressAtHome;
	}

	public void setDescribeYourStressAtHome(String describeYourStressAtHome) {
		this.describeYourStressAtHome = describeYourStressAtHome;
	}

	public String getDescribeYourStressAtWork() {
		return describeYourStressAtWork;
	}

	public void setDescribeYourStressAtWork(String describeYourStressAtWork) {
		this.describeYourStressAtWork = describeYourStressAtWork;
	}

	public String getDescribeYourEnergyLevel() {
		return describeYourEnergyLevel;
	}

	public void setDescribeYourEnergyLevel(String describeYourEnergyLevel) {
		this.describeYourEnergyLevel = describeYourEnergyLevel;
	}

	public String getDiag_DiabetesmellitusProblems() {
		return diag_DiabetesmellitusProblems;
	}

	public void setDiag_DiabetesmellitusProblems(String diag_DiabetesmellitusProblems) {
		this.diag_DiabetesmellitusProblems = diag_DiabetesmellitusProblems;
	}

	public String getDiag_BorderlineDiabetesProblems() {
		return diag_BorderlineDiabetesProblems;
	}

	public void setDiag_BorderlineDiabetesProblems(String diag_BorderlineDiabetesProblems) {
		this.diag_BorderlineDiabetesProblems = diag_BorderlineDiabetesProblems;
	}

	public String getDiag_HighBloodPressureProblems() {
		return diag_HighBloodPressureProblems;
	}

	public void setDiag_HighBloodPressureProblems(String diag_HighBloodPressureProblems) {
		this.diag_HighBloodPressureProblems = diag_HighBloodPressureProblems;
	}

	public String getDiag_HighCholesterolProblems() {
		return diag_HighCholesterolProblems;
	}

	public void setDiag_HighCholesterolProblems(String diag_HighCholesterolProblems) {
		this.diag_HighCholesterolProblems = diag_HighCholesterolProblems;
	}

	public String getDiag_HeartrelatedProblems() {
		return diag_HeartrelatedProblems;
	}

	public void setDiag_HeartrelatedProblems(String diag_HeartrelatedProblems) {
		this.diag_HeartrelatedProblems = diag_HeartrelatedProblems;
	}

	public String getDiag_AsthamaProblems() {
		return diag_AsthamaProblems;
	}

	public void setDiag_AsthamaProblems(String diag_AsthamaProblems) {
		this.diag_AsthamaProblems = diag_AsthamaProblems;
	}

	public String getDiag_ThyroidProblems() {
		return diag_ThyroidProblems;
	}

	public void setDiag_ThyroidProblems(String diag_ThyroidProblems) {
		this.diag_ThyroidProblems = diag_ThyroidProblems;
	}

	public String getDiag_HighUricAcidLevelProblems() {
		return diag_HighUricAcidLevelProblems;
	}

	public void setDiag_HighUricAcidLevelProblems(String diag_HighUricAcidLevelProblems) {
		this.diag_HighUricAcidLevelProblems = diag_HighUricAcidLevelProblems;
	}

	public String getDiag_CancerProblems() {
		return diag_CancerProblems;
	}

	public void setDiag_CancerProblems(String diag_CancerProblems) {
		this.diag_CancerProblems = diag_CancerProblems;
	}

	public String getDiag_LiverProblems() {
		return diag_LiverProblems;
	}

	public void setDiag_LiverProblems(String diag_LiverProblems) {
		this.diag_LiverProblems = diag_LiverProblems;
	}

	public String getDiag_KidneyProblems() {
		return diag_KidneyProblems;
	}

	public void setDiag_KidneyProblems(String diag_KidneyProblems) {
		this.diag_KidneyProblems = diag_KidneyProblems;
	}

	public String getDiag_OsteoporosisProblems() {
		return diag_OsteoporosisProblems;
	}

	public void setDiag_OsteoporosisProblems(String diag_OsteoporosisProblems) {
		this.diag_OsteoporosisProblems = diag_OsteoporosisProblems;
	}

	public String getDiag_ArthritisProblems() {
		return diag_ArthritisProblems;
	}

	public void setDiag_ArthritisProblems(String diag_ArthritisProblems) {
		this.diag_ArthritisProblems = diag_ArthritisProblems;
	}

	public String getDiag_OtherProblems() {
		return diag_OtherProblems;
	}

	public void setDiag_OtherProblems(String diag_OtherProblems) {
		this.diag_OtherProblems = diag_OtherProblems;
	}

	public String getDiag_Cancer_Type_Bladder() {
		return diag_Cancer_Type_Bladder;
	}

	public void setDiag_Cancer_Type_Bladder(String diag_Cancer_Type_Bladder) {
		this.diag_Cancer_Type_Bladder = diag_Cancer_Type_Bladder;
	}

	public String getDiag_Cancer_Type_Blood() {
		return diag_Cancer_Type_Blood;
	}

	public void setDiag_Cancer_Type_Blood(String diag_Cancer_Type_Blood) {
		this.diag_Cancer_Type_Blood = diag_Cancer_Type_Blood;
	}

	public String getDiag_Cancer_Type_Breast() {
		return diag_Cancer_Type_Breast;
	}

	public void setDiag_Cancer_Type_Breast(String diag_Cancer_Type_Breast) {
		this.diag_Cancer_Type_Breast = diag_Cancer_Type_Breast;
	}

	public String getDiag_Cancer_Type_Colon() {
		return diag_Cancer_Type_Colon;
	}

	public void setDiag_Cancer_Type_Colon(String diag_Cancer_Type_Colon) {
		this.diag_Cancer_Type_Colon = diag_Cancer_Type_Colon;
	}

	public String getDiag_Cancer_Type_Eye() {
		return diag_Cancer_Type_Eye;
	}

	public void setDiag_Cancer_Type_Eye(String diag_Cancer_Type_Eye) {
		this.diag_Cancer_Type_Eye = diag_Cancer_Type_Eye;
	}

	public String getDiag_Cancer_Type_Ovarian() {
		return diag_Cancer_Type_Ovarian;
	}

	public void setDiag_Cancer_Type_Ovarian(String diag_Cancer_Type_Ovarian) {
		this.diag_Cancer_Type_Ovarian = diag_Cancer_Type_Ovarian;
	}

	public String getDiag_Cancer_Type_Pancreas() {
		return diag_Cancer_Type_Pancreas;
	}

	public void setDiag_Cancer_Type_Pancreas(String diag_Cancer_Type_Pancreas) {
		this.diag_Cancer_Type_Pancreas = diag_Cancer_Type_Pancreas;
	}

	public String getDiag_Cancer_Type_Pituitary() {
		return diag_Cancer_Type_Pituitary;
	}

	public void setDiag_Cancer_Type_Pituitary(String diag_Cancer_Type_Pituitary) {
		this.diag_Cancer_Type_Pituitary = diag_Cancer_Type_Pituitary;
	}

	public String getDiag_Cancer_Type_Prostrate() {
		return diag_Cancer_Type_Prostrate;
	}

	public void setDiag_Cancer_Type_Prostrate(String diag_Cancer_Type_Prostrate) {
		this.diag_Cancer_Type_Prostrate = diag_Cancer_Type_Prostrate;
	}

	public String getDiag_Cancer_Type_Skin() {
		return diag_Cancer_Type_Skin;
	}

	public void setDiag_Cancer_Type_Skin(String diag_Cancer_Type_Skin) {
		this.diag_Cancer_Type_Skin = diag_Cancer_Type_Skin;
	}

	public String getDiag_Cancer_Type_Stomach() {
		return diag_Cancer_Type_Stomach;
	}

	public void setDiag_Cancer_Type_Stomach(String diag_Cancer_Type_Stomach) {
		this.diag_Cancer_Type_Stomach = diag_Cancer_Type_Stomach;
	}

	public String getDiag_Cancer_Type_Thyroid() {
		return diag_Cancer_Type_Thyroid;
	}

	public void setDiag_Cancer_Type_Thyroid(String diag_Cancer_Type_Thyroid) {
		this.diag_Cancer_Type_Thyroid = diag_Cancer_Type_Thyroid;
	}

	public String getDiag_Cancer_Type_Others() {
		return diag_Cancer_Type_Others;
	}

	public void setDiag_Cancer_Type_Others(String diag_Cancer_Type_Others) {
		this.diag_Cancer_Type_Others = diag_Cancer_Type_Others;
	}

	public String getFH_Diabetes() {
		return FH_Diabetes;
	}

	public void setFH_Diabetes(String fH_Diabetes) {
		FH_Diabetes = fH_Diabetes;
	}

	public String getFH_Hypertension() {
		return FH_Hypertension;
	}

	public void setFH_Hypertension(String fH_Hypertension) {
		FH_Hypertension = fH_Hypertension;
	}

	public String getFH_ThyroidProblems() {
		return FH_ThyroidProblems;
	}

	public void setFH_ThyroidProblems(String fH_ThyroidProblems) {
		FH_ThyroidProblems = fH_ThyroidProblems;
	}

	public String getFH_HeartRelatedProblems() {
		return FH_HeartRelatedProblems;
	}

	public void setFH_HeartRelatedProblems(String fH_HeartRelatedProblems) {
		FH_HeartRelatedProblems = fH_HeartRelatedProblems;
	}

	public String getFH_Osteoporosis() {
		return FH_Osteoporosis;
	}

	public void setFH_Osteoporosis(String fH_Osteoporosis) {
		FH_Osteoporosis = fH_Osteoporosis;
	}

	public String getFH_Cancer() {
		return FH_Cancer;
	}

	public void setFH_Cancer(String fH_Cancer) {
		FH_Cancer = fH_Cancer;
	}

	public String getFH_Cancer_Type_Bladder() {
		return FH_Cancer_Type_Bladder;
	}

	public void setFH_Cancer_Type_Bladder(String fH_Cancer_Type_Bladder) {
		FH_Cancer_Type_Bladder = fH_Cancer_Type_Bladder;
	}

	public String getFH_Cancer_Type_Blood() {
		return FH_Cancer_Type_Blood;
	}

	public void setFH_Cancer_Type_Blood(String fH_Cancer_Type_Blood) {
		FH_Cancer_Type_Blood = fH_Cancer_Type_Blood;
	}

	public String getFH_Cancer_Type_Breast() {
		return FH_Cancer_Type_Breast;
	}

	public void setFH_Cancer_Type_Breast(String fH_Cancer_Type_Breast) {
		FH_Cancer_Type_Breast = fH_Cancer_Type_Breast;
	}

	public String getFH_Cancer_Type_Colon() {
		return FH_Cancer_Type_Colon;
	}

	public void setFH_Cancer_Type_Colon(String fH_Cancer_Type_Colon) {
		FH_Cancer_Type_Colon = fH_Cancer_Type_Colon;
	}

	public String getFH_Cancer_Type_Eye() {
		return FH_Cancer_Type_Eye;
	}

	public void setFH_Cancer_Type_Eye(String fH_Cancer_Type_Eye) {
		FH_Cancer_Type_Eye = fH_Cancer_Type_Eye;
	}

	public String getFH_Cancer_Type_Ovarian() {
		return FH_Cancer_Type_Ovarian;
	}

	public void setFH_Cancer_Type_Ovarian(String fH_Cancer_Type_Ovarian) {
		FH_Cancer_Type_Ovarian = fH_Cancer_Type_Ovarian;
	}

	public String getFH_Cancer_Type_Pancreas() {
		return FH_Cancer_Type_Pancreas;
	}

	public void setFH_Cancer_Type_Pancreas(String fH_Cancer_Type_Pancreas) {
		FH_Cancer_Type_Pancreas = fH_Cancer_Type_Pancreas;
	}

	public String getFH_Cancer_Type_Pituitary() {
		return FH_Cancer_Type_Pituitary;
	}

	public void setFH_Cancer_Type_Pituitary(String fH_Cancer_Type_Pituitary) {
		FH_Cancer_Type_Pituitary = fH_Cancer_Type_Pituitary;
	}

	public String getFH_Cancer_Type_Prostrate() {
		return FH_Cancer_Type_Prostrate;
	}

	public void setFH_Cancer_Type_Prostrate(String fH_Cancer_Type_Prostrate) {
		FH_Cancer_Type_Prostrate = fH_Cancer_Type_Prostrate;
	}

	public String getFH_Cancer_Type_Skin() {
		return FH_Cancer_Type_Skin;
	}

	public void setFH_Cancer_Type_Skin(String fH_Cancer_Type_Skin) {
		FH_Cancer_Type_Skin = fH_Cancer_Type_Skin;
	}

	public String getFH_Cancer_Type_Stomach() {
		return FH_Cancer_Type_Stomach;
	}

	public void setFH_Cancer_Type_Stomach(String fH_Cancer_Type_Stomach) {
		FH_Cancer_Type_Stomach = fH_Cancer_Type_Stomach;
	}

	public String getFH_Cancer_Type_Thyroid() {
		return FH_Cancer_Type_Thyroid;
	}

	public void setFH_Cancer_Type_Thyroid(String fH_Cancer_Type_Thyroid) {
		FH_Cancer_Type_Thyroid = fH_Cancer_Type_Thyroid;
	}

	public String getFH_Cancer_Type_Others() {
		return FH_Cancer_Type_Others;
	}

	public void setFH_Cancer_Type_Others(String fH_Cancer_Type_Others) {
		FH_Cancer_Type_Others = fH_Cancer_Type_Others;
	}

	public String getHC_Heart() {
		return HC_Heart;
	}

	public void setHC_Heart(String hC_Heart) {
		HC_Heart = hC_Heart;
	}

	public String getHC_Chest() {
		return HC_Chest;
	}

	public void setHC_Chest(String hC_Chest) {
		HC_Chest = hC_Chest;
	}

	public String getHC_NervousSystem() {
		return HC_NervousSystem;
	}

	public void setHC_NervousSystem(String hC_NervousSystem) {
		HC_NervousSystem = hC_NervousSystem;
	}

	public String getHC_GastrointestinalSystem() {
		return HC_GastrointestinalSystem;
	}

	public void setHC_GastrointestinalSystem(String hC_GastrointestinalSystem) {
		HC_GastrointestinalSystem = hC_GastrointestinalSystem;
	}

	public String getHC_GenitourinarySystem() {
		return HC_GenitourinarySystem;
	}

	public void setHC_GenitourinarySystem(String hC_GenitourinarySystem) {
		HC_GenitourinarySystem = hC_GenitourinarySystem;
	}

	public String getHC_MusclesAndJoints() {
		return HC_MusclesAndJoints;
	}

	public void setHC_MusclesAndJoints(String hC_MusclesAndJoints) {
		HC_MusclesAndJoints = hC_MusclesAndJoints;
	}

	public String getHC_OralandDental() {
		return HC_OralandDental;
	}

	public void setHC_OralandDental(String hC_OralandDental) {
		HC_OralandDental = hC_OralandDental;
	}

	public String getHC_Eyes() {
		return HC_Eyes;
	}

	public void setHC_Eyes(String hC_Eyes) {
		HC_Eyes = hC_Eyes;
	}

	public String getHC_Ears() {
		return HC_Ears;
	}

	public void setHC_Ears(String hC_Ears) {
		HC_Ears = hC_Ears;
	}

	public String getHC_Nose() {
		return HC_Nose;
	}

	public void setHC_Nose(String hC_Nose) {
		HC_Nose = hC_Nose;
	}

	public String getHC_Throat() {
		return HC_Throat;
	}

	public void setHC_Throat(String hC_Throat) {
		HC_Throat = hC_Throat;
	}

	public String getHC_Skin() {
		return HC_Skin;
	}

	public void setHC_Skin(String hC_Skin) {
		HC_Skin = hC_Skin;
	}

	public String getHC_Breast() {
		return HC_Breast;
	}

	public void setHC_Breast(String hC_Breast) {
		HC_Breast = hC_Breast;
	}

	public String getHC_General() {
		return HC_General;
	}

	public void setHC_General(String hC_General) {
		HC_General = hC_General;
	}

	public String getHC_Gynecology() {
		return HC_Gynecology;
	}

	public void setHC_Gynecology(String hC_Gynecology) {
		HC_Gynecology = hC_Gynecology;
	}

	public String getHC_Heart_ChestPain() {
		return HC_Heart_ChestPain;
	}

	public void setHC_Heart_ChestPain(String hC_Heart_ChestPain) {
		HC_Heart_ChestPain = hC_Heart_ChestPain;
	}

	public String getHC_Heart_RacingHeartBeatOrPalpitations() {
		return HC_Heart_RacingHeartBeatOrPalpitations;
	}

	public void setHC_Heart_RacingHeartBeatOrPalpitations(String hC_Heart_RacingHeartBeatOrPalpitations) {
		HC_Heart_RacingHeartBeatOrPalpitations = hC_Heart_RacingHeartBeatOrPalpitations;
	}

	public String getHC_Heart_DizzinessOrFainting() {
		return HC_Heart_DizzinessOrFainting;
	}

	public void setHC_Heart_DizzinessOrFainting(String hC_Heart_DizzinessOrFainting) {
		HC_Heart_DizzinessOrFainting = hC_Heart_DizzinessOrFainting;
	}

	public String getHC_Chest_Wheezing() {
		return HC_Chest_Wheezing;
	}

	public void setHC_Chest_Wheezing(String hC_Chest_Wheezing) {
		HC_Chest_Wheezing = hC_Chest_Wheezing;
	}

	public String getHC_Chest_Cough() {
		return HC_Chest_Cough;
	}

	public void setHC_Chest_Cough(String hC_Chest_Cough) {
		HC_Chest_Cough = hC_Chest_Cough;
	}

	public String getHC_Chest_DifficultyInBreathing() {
		return HC_Chest_DifficultyInBreathing;
	}

	public void setHC_Chest_DifficultyInBreathing(String hC_Chest_DifficultyInBreathing) {
		HC_Chest_DifficultyInBreathing = hC_Chest_DifficultyInBreathing;
	}

	public String getHC_NervousSystem_HeadacheOrMigraine() {
		return HC_NervousSystem_HeadacheOrMigraine;
	}

	public void setHC_NervousSystem_HeadacheOrMigraine(String hC_NervousSystem_HeadacheOrMigraine) {
		HC_NervousSystem_HeadacheOrMigraine = hC_NervousSystem_HeadacheOrMigraine;
	}

	public String getHC_NervousSystem_MemoryLoss() {
		return HC_NervousSystem_MemoryLoss;
	}

	public void setHC_NervousSystem_MemoryLoss(String hC_NervousSystem_MemoryLoss) {
		HC_NervousSystem_MemoryLoss = hC_NervousSystem_MemoryLoss;
	}

	public String getHC_NervousSystem_EpilepsyOrSeizureOrFits() {
		return HC_NervousSystem_EpilepsyOrSeizureOrFits;
	}

	public void setHC_NervousSystem_EpilepsyOrSeizureOrFits(String hC_NervousSystem_EpilepsyOrSeizureOrFits) {
		HC_NervousSystem_EpilepsyOrSeizureOrFits = hC_NervousSystem_EpilepsyOrSeizureOrFits;
	}

	public String getHC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet() {
		return HC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet;
	}

	public void setHC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet(
			String hC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet) {
		HC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet = hC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet;
	}

	public String getHC_NervousSystem_DizzinessOrFainting() {
		return HC_NervousSystem_DizzinessOrFainting;
	}

	public void setHC_NervousSystem_DizzinessOrFainting(String hC_NervousSystem_DizzinessOrFainting) {
		HC_NervousSystem_DizzinessOrFainting = hC_NervousSystem_DizzinessOrFainting;
	}

	public String getHC_NervousSystem_TinglingOrNumbnessInOtherparts() {
		return HC_NervousSystem_TinglingOrNumbnessInOtherparts;
	}

	public void setHC_NervousSystem_TinglingOrNumbnessInOtherparts(
			String hC_NervousSystem_TinglingOrNumbnessInOtherparts) {
		HC_NervousSystem_TinglingOrNumbnessInOtherparts = hC_NervousSystem_TinglingOrNumbnessInOtherparts;
	}

	public String getHC_MusclesAndJoints_SwellingInLegsOrFeet() {
		return HC_MusclesAndJoints_SwellingInLegsOrFeet;
	}

	public void setHC_MusclesAndJoints_SwellingInLegsOrFeet(String hC_MusclesAndJoints_SwellingInLegsOrFeet) {
		HC_MusclesAndJoints_SwellingInLegsOrFeet = hC_MusclesAndJoints_SwellingInLegsOrFeet;
	}

	public String getHC_MusclesAndJoints_SwellingInTwoOrMoreJoints() {
		return HC_MusclesAndJoints_SwellingInTwoOrMoreJoints;
	}

	public void setHC_MusclesAndJoints_SwellingInTwoOrMoreJoints(String hC_MusclesAndJoints_SwellingInTwoOrMoreJoints) {
		HC_MusclesAndJoints_SwellingInTwoOrMoreJoints = hC_MusclesAndJoints_SwellingInTwoOrMoreJoints;
	}

	public String getHC_MusclesAndJoints_PainInTwoOrMoreJoints() {
		return HC_MusclesAndJoints_PainInTwoOrMoreJoints;
	}

	public void setHC_MusclesAndJoints_PainInTwoOrMoreJoints(String hC_MusclesAndJoints_PainInTwoOrMoreJoints) {
		HC_MusclesAndJoints_PainInTwoOrMoreJoints = hC_MusclesAndJoints_PainInTwoOrMoreJoints;
	}

	public String getHC_MusclesAndJoints_StiffnessInTwoOrMoreJoints() {
		return HC_MusclesAndJoints_StiffnessInTwoOrMoreJoints;
	}

	public void setHC_MusclesAndJoints_StiffnessInTwoOrMoreJoints(
			String hC_MusclesAndJoints_StiffnessInTwoOrMoreJoints) {
		HC_MusclesAndJoints_StiffnessInTwoOrMoreJoints = hC_MusclesAndJoints_StiffnessInTwoOrMoreJoints;
	}

	public String getHC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness() {
		return HC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness;
	}

	public void setHC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness(
			String hC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness) {
		HC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness = hC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness;
	}

	public String getHC_MusclesAndJoints_Others() {
		return HC_MusclesAndJoints_Others;
	}

	public void setHC_MusclesAndJoints_Others(String hC_MusclesAndJoints_Others) {
		HC_MusclesAndJoints_Others = hC_MusclesAndJoints_Others;
	}

	public String getHC_GastrointestinalSystem_Constipation() {
		return HC_GastrointestinalSystem_Constipation;
	}

	public void setHC_GastrointestinalSystem_Constipation(String hC_GastrointestinalSystem_Constipation) {
		HC_GastrointestinalSystem_Constipation = hC_GastrointestinalSystem_Constipation;
	}

	public String getHC_GastrointestinalSystem_DiahorreaOrLooseMotion() {
		return HC_GastrointestinalSystem_DiahorreaOrLooseMotion;
	}

	public void setHC_GastrointestinalSystem_DiahorreaOrLooseMotion(
			String hC_GastrointestinalSystem_DiahorreaOrLooseMotion) {
		HC_GastrointestinalSystem_DiahorreaOrLooseMotion = hC_GastrointestinalSystem_DiahorreaOrLooseMotion;
	}

	public String getHC_GastrointestinalSystem_ChangeInBowelHabits() {
		return HC_GastrointestinalSystem_ChangeInBowelHabits;
	}

	public void setHC_GastrointestinalSystem_ChangeInBowelHabits(String hC_GastrointestinalSystem_ChangeInBowelHabits) {
		HC_GastrointestinalSystem_ChangeInBowelHabits = hC_GastrointestinalSystem_ChangeInBowelHabits;
	}

	public String getHC_GastrointestinalSystem_LossOfAppetite() {
		return HC_GastrointestinalSystem_LossOfAppetite;
	}

	public void setHC_GastrointestinalSystem_LossOfAppetite(String hC_GastrointestinalSystem_LossOfAppetite) {
		HC_GastrointestinalSystem_LossOfAppetite = hC_GastrointestinalSystem_LossOfAppetite;
	}

	public String getHC_GastrointestinalSystem_AbdominalPain() {
		return HC_GastrointestinalSystem_AbdominalPain;
	}

	public void setHC_GastrointestinalSystem_AbdominalPain(String hC_GastrointestinalSystem_AbdominalPain) {
		HC_GastrointestinalSystem_AbdominalPain = hC_GastrointestinalSystem_AbdominalPain;
	}

	public String getHC_GastrointestinalSystem_AcidityOrHeartBurn() {
		return HC_GastrointestinalSystem_AcidityOrHeartBurn;
	}

	public void setHC_GastrointestinalSystem_AcidityOrHeartBurn(String hC_GastrointestinalSystem_AcidityOrHeartBurn) {
		HC_GastrointestinalSystem_AcidityOrHeartBurn = hC_GastrointestinalSystem_AcidityOrHeartBurn;
	}

	public String getHC_GastrointestinalSystem_BloatingOrPassingGas() {
		return HC_GastrointestinalSystem_BloatingOrPassingGas;
	}

	public void setHC_GastrointestinalSystem_BloatingOrPassingGas(
			String hC_GastrointestinalSystem_BloatingOrPassingGas) {
		HC_GastrointestinalSystem_BloatingOrPassingGas = hC_GastrointestinalSystem_BloatingOrPassingGas;
	}

	public String getHC_GastrointestinalSystem_VomitingOrNausea() {
		return HC_GastrointestinalSystem_VomitingOrNausea;
	}

	public void setHC_GastrointestinalSystem_VomitingOrNausea(String hC_GastrointestinalSystem_VomitingOrNausea) {
		HC_GastrointestinalSystem_VomitingOrNausea = hC_GastrointestinalSystem_VomitingOrNausea;
	}

	public String getHC_GastrointestinalSystem_Belching() {
		return HC_GastrointestinalSystem_Belching;
	}

	public void setHC_GastrointestinalSystem_Belching(String hC_GastrointestinalSystem_Belching) {
		HC_GastrointestinalSystem_Belching = hC_GastrointestinalSystem_Belching;
	}

	public String getHC_GastrointestinalSystem_RectalBleeding() {
		return HC_GastrointestinalSystem_RectalBleeding;
	}

	public void setHC_GastrointestinalSystem_RectalBleeding(String hC_GastrointestinalSystem_RectalBleeding) {
		HC_GastrointestinalSystem_RectalBleeding = hC_GastrointestinalSystem_RectalBleeding;
	}

	public String getHC_GenitourinarySystem_UrinaryDisturbances() {
		return HC_GenitourinarySystem_UrinaryDisturbances;
	}

	public void setHC_GenitourinarySystem_UrinaryDisturbances(String hC_GenitourinarySystem_UrinaryDisturbances) {
		HC_GenitourinarySystem_UrinaryDisturbances = hC_GenitourinarySystem_UrinaryDisturbances;
	}

	public String getHC_GenitourinarySystem_BloodInUrine() {
		return HC_GenitourinarySystem_BloodInUrine;
	}

	public void setHC_GenitourinarySystem_BloodInUrine(String hC_GenitourinarySystem_BloodInUrine) {
		HC_GenitourinarySystem_BloodInUrine = hC_GenitourinarySystem_BloodInUrine;
	}

	public String getHC_GenitourinarySystem_SexualDysfunction() {
		return HC_GenitourinarySystem_SexualDysfunction;
	}

	public void setHC_GenitourinarySystem_SexualDysfunction(String hC_GenitourinarySystem_SexualDysfunction) {
		HC_GenitourinarySystem_SexualDysfunction = hC_GenitourinarySystem_SexualDysfunction;
	}

	public String getHC_GenitourinarySystem_DischargeFromPrivateParts() {
		return HC_GenitourinarySystem_DischargeFromPrivateParts;
	}

	public void setHC_GenitourinarySystem_DischargeFromPrivateParts(
			String hC_GenitourinarySystem_DischargeFromPrivateParts) {
		HC_GenitourinarySystem_DischargeFromPrivateParts = hC_GenitourinarySystem_DischargeFromPrivateParts;
	}

	public String getHC_Dental_PainInTeethOrGums() {
		return HC_Dental_PainInTeethOrGums;
	}

	public void setHC_Dental_PainInTeethOrGums(String hC_Dental_PainInTeethOrGums) {
		HC_Dental_PainInTeethOrGums = hC_Dental_PainInTeethOrGums;
	}

	public String getHC_Dental_SensitiveTeeth() {
		return HC_Dental_SensitiveTeeth;
	}

	public void setHC_Dental_SensitiveTeeth(String hC_Dental_SensitiveTeeth) {
		HC_Dental_SensitiveTeeth = hC_Dental_SensitiveTeeth;
	}

	public String getHC_Dental_Cavities() {
		return HC_Dental_Cavities;
	}

	public void setHC_Dental_Cavities(String hC_Dental_Cavities) {
		HC_Dental_Cavities = hC_Dental_Cavities;
	}

	public String getHC_Dental_BadBreath() {
		return HC_Dental_BadBreath;
	}

	public void setHC_Dental_BadBreath(String hC_Dental_BadBreath) {
		HC_Dental_BadBreath = hC_Dental_BadBreath;
	}

	public String getHC_Dental_MouthUlcers() {
		return HC_Dental_MouthUlcers;
	}

	public void setHC_Dental_MouthUlcers(String hC_Dental_MouthUlcers) {
		HC_Dental_MouthUlcers = hC_Dental_MouthUlcers;
	}

	public String getHC_Dental_BleedingInGums() {
		return HC_Dental_BleedingInGums;
	}

	public void setHC_Dental_BleedingInGums(String hC_Dental_BleedingInGums) {
		HC_Dental_BleedingInGums = hC_Dental_BleedingInGums;
	}

	public String getHC_Eye_DisturbanceInVision() {
		return HC_Eye_DisturbanceInVision;
	}

	public void setHC_Eye_DisturbanceInVision(String hC_Eye_DisturbanceInVision) {
		HC_Eye_DisturbanceInVision = hC_Eye_DisturbanceInVision;
	}

	public String getHC_Eye_EyePain() {
		return HC_Eye_EyePain;
	}

	public void setHC_Eye_EyePain(String hC_Eye_EyePain) {
		HC_Eye_EyePain = hC_Eye_EyePain;
	}

	public String getHC_Eye_IrritationAndRednessOrWateringOrItching() {
		return HC_Eye_IrritationAndRednessOrWateringOrItching;
	}

	public void setHC_Eye_IrritationAndRednessOrWateringOrItching(
			String hC_Eye_IrritationAndRednessOrWateringOrItching) {
		HC_Eye_IrritationAndRednessOrWateringOrItching = hC_Eye_IrritationAndRednessOrWateringOrItching;
	}

	public String getHC_Ear_EarPainOrDischarge() {
		return HC_Ear_EarPainOrDischarge;
	}

	public void setHC_Ear_EarPainOrDischarge(String hC_Ear_EarPainOrDischarge) {
		HC_Ear_EarPainOrDischarge = hC_Ear_EarPainOrDischarge;
	}

	public String getHC_Ear_HearingLoss() {
		return HC_Ear_HearingLoss;
	}

	public void setHC_Ear_HearingLoss(String hC_Ear_HearingLoss) {
		HC_Ear_HearingLoss = hC_Ear_HearingLoss;
	}

	public String getHC_Ear_RingingSoundInEars() {
		return HC_Ear_RingingSoundInEars;
	}

	public void setHC_Ear_RingingSoundInEars(String hC_Ear_RingingSoundInEars) {
		HC_Ear_RingingSoundInEars = hC_Ear_RingingSoundInEars;
	}

	public String getHC_Ear_VertigoOrSpinningSensation() {
		return HC_Ear_VertigoOrSpinningSensation;
	}

	public void setHC_Ear_VertigoOrSpinningSensation(String hC_Ear_VertigoOrSpinningSensation) {
		HC_Ear_VertigoOrSpinningSensation = hC_Ear_VertigoOrSpinningSensation;
	}

	public String getHC_Nose_SneezingDueToAllergies() {
		return HC_Nose_SneezingDueToAllergies;
	}

	public void setHC_Nose_SneezingDueToAllergies(String hC_Nose_SneezingDueToAllergies) {
		HC_Nose_SneezingDueToAllergies = hC_Nose_SneezingDueToAllergies;
	}

	public String getHC_Nose_Sinusitis() {
		return HC_Nose_Sinusitis;
	}

	public void setHC_Nose_Sinusitis(String hC_Nose_Sinusitis) {
		HC_Nose_Sinusitis = hC_Nose_Sinusitis;
	}

	public String getHC_Nose_NoseBleeding() {
		return HC_Nose_NoseBleeding;
	}

	public void setHC_Nose_NoseBleeding(String hC_Nose_NoseBleeding) {
		HC_Nose_NoseBleeding = hC_Nose_NoseBleeding;
	}

	public String getHC_Throat_ThroatIrritationOrPain() {
		return HC_Throat_ThroatIrritationOrPain;
	}

	public void setHC_Throat_ThroatIrritationOrPain(String hC_Throat_ThroatIrritationOrPain) {
		HC_Throat_ThroatIrritationOrPain = hC_Throat_ThroatIrritationOrPain;
	}

	public String getHC_Throat_VoiceChange() {
		return HC_Throat_VoiceChange;
	}

	public void setHC_Throat_VoiceChange(String hC_Throat_VoiceChange) {
		HC_Throat_VoiceChange = hC_Throat_VoiceChange;
	}

	public String getHC_Throat_Snoring() {
		return HC_Throat_Snoring;
	}

	public void setHC_Throat_Snoring(String hC_Throat_Snoring) {
		HC_Throat_Snoring = hC_Throat_Snoring;
	}

	public String getHC_Throat_ThroatSwelling() {
		return HC_Throat_ThroatSwelling;
	}

	public void setHC_Throat_ThroatSwelling(String hC_Throat_ThroatSwelling) {
		HC_Throat_ThroatSwelling = hC_Throat_ThroatSwelling;
	}

	public String getHC_Breast_BreastPain() {
		return HC_Breast_BreastPain;
	}

	public void setHC_Breast_BreastPain(String hC_Breast_BreastPain) {
		HC_Breast_BreastPain = hC_Breast_BreastPain;
	}

	public String getHC_Breast_SwellingOrLump() {
		return HC_Breast_SwellingOrLump;
	}

	public void setHC_Breast_SwellingOrLump(String hC_Breast_SwellingOrLump) {
		HC_Breast_SwellingOrLump = hC_Breast_SwellingOrLump;
	}

	public String getHC_Breast_Discharge() {
		return HC_Breast_Discharge;
	}

	public void setHC_Breast_Discharge(String hC_Breast_Discharge) {
		HC_Breast_Discharge = hC_Breast_Discharge;
	}

	public String getHC_Breast_ChangeinBreastSize() {
		return HC_Breast_ChangeinBreastSize;
	}

	public void setHC_Breast_ChangeinBreastSize(String hC_Breast_ChangeinBreastSize) {
		HC_Breast_ChangeinBreastSize = hC_Breast_ChangeinBreastSize;
	}

	public String getHC_Breast_ChangeInBreastSkinColourOrTexture() {
		return HC_Breast_ChangeInBreastSkinColourOrTexture;
	}

	public void setHC_Breast_ChangeInBreastSkinColourOrTexture(String hC_Breast_ChangeInBreastSkinColourOrTexture) {
		HC_Breast_ChangeInBreastSkinColourOrTexture = hC_Breast_ChangeInBreastSkinColourOrTexture;
	}

	public String getHC_Skin_AllergicRash() {
		return HC_Skin_AllergicRash;
	}

	public void setHC_Skin_AllergicRash(String hC_Skin_AllergicRash) {
		HC_Skin_AllergicRash = hC_Skin_AllergicRash;
	}

	public String getHC_Skin_WhitePatches() {
		return HC_Skin_WhitePatches;
	}

	public void setHC_Skin_WhitePatches(String hC_Skin_WhitePatches) {
		HC_Skin_WhitePatches = hC_Skin_WhitePatches;
	}

	public String getHC_Skin_DrySkin() {
		return HC_Skin_DrySkin;
	}

	public void setHC_Skin_DrySkin(String hC_Skin_DrySkin) {
		HC_Skin_DrySkin = hC_Skin_DrySkin;
	}

	public String getHC_Skin_FungalInfection() {
		return HC_Skin_FungalInfection;
	}

	public void setHC_Skin_FungalInfection(String hC_Skin_FungalInfection) {
		HC_Skin_FungalInfection = hC_Skin_FungalInfection;
	}

	public String getHC_Skin_DarkeningOfSkin() {
		return HC_Skin_DarkeningOfSkin;
	}

	public void setHC_Skin_DarkeningOfSkin(String hC_Skin_DarkeningOfSkin) {
		HC_Skin_DarkeningOfSkin = hC_Skin_DarkeningOfSkin;
	}

	public String getHC_Skin_Warts() {
		return HC_Skin_Warts;
	}

	public void setHC_Skin_Warts(String hC_Skin_Warts) {
		HC_Skin_Warts = hC_Skin_Warts;
	}

	public String getHC_Skin_Corn() {
		return HC_Skin_Corn;
	}

	public void setHC_Skin_Corn(String hC_Skin_Corn) {
		HC_Skin_Corn = hC_Skin_Corn;
	}

	public String getHC_General_WeightLossOrGain() {
		return HC_General_WeightLossOrGain;
	}

	public void setHC_General_WeightLossOrGain(String hC_General_WeightLossOrGain) {
		HC_General_WeightLossOrGain = hC_General_WeightLossOrGain;
	}

	public String getHC_General_Fever() {
		return HC_General_Fever;
	}

	public void setHC_General_Fever(String hC_General_Fever) {
		HC_General_Fever = hC_General_Fever;
	}

	public String getHC_General_Snoring() {
		return HC_General_Snoring;
	}

	public void setHC_General_Snoring(String hC_General_Snoring) {
		HC_General_Snoring = hC_General_Snoring;
	}

	public String getHC_General_HairFall() {
		return HC_General_HairFall;
	}

	public void setHC_General_HairFall(String hC_General_HairFall) {
		HC_General_HairFall = hC_General_HairFall;
	}

	public String getHC_General_VaricoseVeins() {
		return HC_General_VaricoseVeins;
	}

	public void setHC_General_VaricoseVeins(String hC_General_VaricoseVeins) {
		HC_General_VaricoseVeins = hC_General_VaricoseVeins;
	}

	public String getHC_General_SwellingInLegsOrFeet() {
		return HC_General_SwellingInLegsOrFeet;
	}

	public void setHC_General_SwellingInLegsOrFeet(String hC_General_SwellingInLegsOrFeet) {
		HC_General_SwellingInLegsOrFeet = hC_General_SwellingInLegsOrFeet;
	}

	public String getHC_Gynaecology_IrregularPeriods() {
		return HC_Gynaecology_IrregularPeriods;
	}

	public void setHC_Gynaecology_IrregularPeriods(String hC_Gynaecology_IrregularPeriods) {
		HC_Gynaecology_IrregularPeriods = hC_Gynaecology_IrregularPeriods;
	}

	public String getHC_Gynaecology_HeavyPeriods() {
		return HC_Gynaecology_HeavyPeriods;
	}

	public void setHC_Gynaecology_HeavyPeriods(String hC_Gynaecology_HeavyPeriods) {
		HC_Gynaecology_HeavyPeriods = hC_Gynaecology_HeavyPeriods;
	}

	public String getHC_Gynaecology_MissedPeriods() {
		return HC_Gynaecology_MissedPeriods;
	}

	public void setHC_Gynaecology_MissedPeriods(String hC_Gynaecology_MissedPeriods) {
		HC_Gynaecology_MissedPeriods = hC_Gynaecology_MissedPeriods;
	}

	public String getHC_Gynaecology_VaginalDischargeOrIrritation() {
		return HC_Gynaecology_VaginalDischargeOrIrritation;
	}

	public void setHC_Gynaecology_VaginalDischargeOrIrritation(String hC_Gynaecology_VaginalDischargeOrIrritation) {
		HC_Gynaecology_VaginalDischargeOrIrritation = hC_Gynaecology_VaginalDischargeOrIrritation;
	}

	public String getHC_Gynaecology_Spotting() {
		return HC_Gynaecology_Spotting;
	}

	public void setHC_Gynaecology_Spotting(String hC_Gynaecology_Spotting) {
		HC_Gynaecology_Spotting = hC_Gynaecology_Spotting;
	}

	public String getHC_Gynaecology_PCODORPCOS() {
		return HC_Gynaecology_PCODORPCOS;
	}

	public void setHC_Gynaecology_PCODORPCOS(String hC_Gynaecology_PCODORPCOS) {
		HC_Gynaecology_PCODORPCOS = hC_Gynaecology_PCODORPCOS;
	}

	public String getHC_Gynaecology_Infertility() {
		return HC_Gynaecology_Infertility;
	}

	public void setHC_Gynaecology_Infertility(String hC_Gynaecology_Infertility) {
		HC_Gynaecology_Infertility = hC_Gynaecology_Infertility;
	}

	@Override
	public String toString() {
		return "HCPersonalizedCheck [EdocCityId=" + cityId + ", HRAID=" + hRAID + ", PatientId=" + patientId + ", UHID="
				+ uHID + ", Firstname=" + firstname + ", Lastname=" + lastname + ", PhoneNo=" + phoneNo + ", EmailId="
				+ emailId + ", Age=" + age + ", Gender=" + gender + ", AreYouPregnant=" + areYouPregnant + ", IsSmoker="
				+ isSmoker + ", describeYourSleep=" + describeYourSleep + ", describeYourStressAtHome="
				+ describeYourStressAtHome + ", describeYourStressAtWork=" + describeYourStressAtWork
				+ ", describeYourEnergyLevel=" + describeYourEnergyLevel + ", diag_DiabetesmellitusProblems="
				+ diag_DiabetesmellitusProblems + ", diag_BorderlineDiabetesProblems=" + diag_BorderlineDiabetesProblems
				+ ", diag_HighBloodPressureProblems=" + diag_HighBloodPressureProblems
				+ ", diag_HighCholesterolProblems=" + diag_HighCholesterolProblems + ", diag_HeartrelatedProblems="
				+ diag_HeartrelatedProblems + ", diag_AsthamaProblems=" + diag_AsthamaProblems
				+ ", diag_ThyroidProblems=" + diag_ThyroidProblems + ", diag_HighUricAcidLevelProblems="
				+ diag_HighUricAcidLevelProblems + ", diag_CancerProblems=" + diag_CancerProblems
				+ ", diag_LiverProblems=" + diag_LiverProblems + ", diag_KidneyProblems=" + diag_KidneyProblems
				+ ", diag_OsteoporosisProblems=" + diag_OsteoporosisProblems + ", diag_ArthritisProblems="
				+ diag_ArthritisProblems + ", diag_OtherProblems=" + diag_OtherProblems + ", diag_Cancer_Type_Bladder="
				+ diag_Cancer_Type_Bladder + ", diag_Cancer_Type_Blood=" + diag_Cancer_Type_Blood
				+ ", diag_Cancer_Type_Breast=" + diag_Cancer_Type_Breast + ", diag_Cancer_Type_Colon="
				+ diag_Cancer_Type_Colon + ", diag_Cancer_Type_Eye=" + diag_Cancer_Type_Eye
				+ ", diag_Cancer_Type_Ovarian=" + diag_Cancer_Type_Ovarian + ", diag_Cancer_Type_Pancreas="
				+ diag_Cancer_Type_Pancreas + ", diag_Cancer_Type_Pituitary=" + diag_Cancer_Type_Pituitary
				+ ", diag_Cancer_Type_Prostrate=" + diag_Cancer_Type_Prostrate + ", diag_Cancer_Type_Skin="
				+ diag_Cancer_Type_Skin + ", diag_Cancer_Type_Stomach=" + diag_Cancer_Type_Stomach
				+ ", diag_Cancer_Type_Thyroid=" + diag_Cancer_Type_Thyroid + ", diag_Cancer_Type_Others="
				+ diag_Cancer_Type_Others + ", FH_Diabetes=" + FH_Diabetes + ", FH_Hypertension=" + FH_Hypertension
				+ ", FH_ThyroidProblems=" + FH_ThyroidProblems + ", FH_HeartRelatedProblems=" + FH_HeartRelatedProblems
				+ ", FH_Osteoporosis=" + FH_Osteoporosis + ", FH_Cancer=" + FH_Cancer + ", FH_Cancer_Type_Bladder="
				+ FH_Cancer_Type_Bladder + ", FH_Cancer_Type_Blood=" + FH_Cancer_Type_Blood + ", FH_Cancer_Type_Breast="
				+ FH_Cancer_Type_Breast + ", FH_Cancer_Type_Colon=" + FH_Cancer_Type_Colon + ", FH_Cancer_Type_Eye="
				+ FH_Cancer_Type_Eye + ", FH_Cancer_Type_Ovarian=" + FH_Cancer_Type_Ovarian
				+ ", FH_Cancer_Type_Pancreas=" + FH_Cancer_Type_Pancreas + ", FH_Cancer_Type_Pituitary="
				+ FH_Cancer_Type_Pituitary + ", FH_Cancer_Type_Prostrate=" + FH_Cancer_Type_Prostrate
				+ ", FH_Cancer_Type_Skin=" + FH_Cancer_Type_Skin + ", FH_Cancer_Type_Stomach=" + FH_Cancer_Type_Stomach
				+ ", FH_Cancer_Type_Thyroid=" + FH_Cancer_Type_Thyroid + ", FH_Cancer_Type_Others="
				+ FH_Cancer_Type_Others + ", HC_Heart=" + HC_Heart + ", HC_Chest=" + HC_Chest + ", HC_NervousSystem="
				+ HC_NervousSystem + ", HC_GastrointestinalSystem=" + HC_GastrointestinalSystem
				+ ", HC_GenitourinarySystem=" + HC_GenitourinarySystem + ", HC_MusclesAndJoints=" + HC_MusclesAndJoints
				+ ", HC_OralandDental=" + HC_OralandDental + ", HC_Eyes=" + HC_Eyes + ", HC_Ears=" + HC_Ears
				+ ", HC_Nose=" + HC_Nose + ", HC_Throat=" + HC_Throat + ", HC_Skin=" + HC_Skin + ", HC_Breast="
				+ HC_Breast + ", HC_General=" + HC_General + ", HC_Gynecology=" + HC_Gynecology
				+ ", HC_Heart_ChestPain=" + HC_Heart_ChestPain + ", HC_Heart_RacingHeartBeatOrPalpitations="
				+ HC_Heart_RacingHeartBeatOrPalpitations + ", HC_Heart_DizzinessOrFainting="
				+ HC_Heart_DizzinessOrFainting + ", HC_Chest_Wheezing=" + HC_Chest_Wheezing + ", HC_Chest_Cough="
				+ HC_Chest_Cough + ", HC_Chest_DifficultyInBreathing=" + HC_Chest_DifficultyInBreathing
				+ ", HC_NervousSystem_HeadacheOrMigraine=" + HC_NervousSystem_HeadacheOrMigraine
				+ ", HC_NervousSystem_MemoryLoss=" + HC_NervousSystem_MemoryLoss
				+ ", HC_NervousSystem_EpilepsyOrSeizureOrFits=" + HC_NervousSystem_EpilepsyOrSeizureOrFits
				+ ", HC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet="
				+ HC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet + ", HC_NervousSystem_DizzinessOrFainting="
				+ HC_NervousSystem_DizzinessOrFainting + ", HC_NervousSystem_TinglingOrNumbnessInOtherparts="
				+ HC_NervousSystem_TinglingOrNumbnessInOtherparts + ", HC_MusclesAndJoints_SwellingInLegsOrFeet="
				+ HC_MusclesAndJoints_SwellingInLegsOrFeet + ", HC_MusclesAndJoints_SwellingInTwoOrMoreJoints="
				+ HC_MusclesAndJoints_SwellingInTwoOrMoreJoints + ", HC_MusclesAndJoints_PainInTwoOrMoreJoints="
				+ HC_MusclesAndJoints_PainInTwoOrMoreJoints + ", HC_MusclesAndJoints_StiffnessInTwoOrMoreJoints="
				+ HC_MusclesAndJoints_StiffnessInTwoOrMoreJoints
				+ ", HC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness="
				+ HC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness + ", HC_MusclesAndJoints_Others="
				+ HC_MusclesAndJoints_Others + ", HC_GastrointestinalSystem_Constipation="
				+ HC_GastrointestinalSystem_Constipation + ", HC_GastrointestinalSystem_DiahorreaOrLooseMotion="
				+ HC_GastrointestinalSystem_DiahorreaOrLooseMotion + ", HC_GastrointestinalSystem_ChangeInBowelHabits="
				+ HC_GastrointestinalSystem_ChangeInBowelHabits + ", HC_GastrointestinalSystem_LossOfAppetite="
				+ HC_GastrointestinalSystem_LossOfAppetite + ", HC_GastrointestinalSystem_AbdominalPain="
				+ HC_GastrointestinalSystem_AbdominalPain + ", HC_GastrointestinalSystem_AcidityOrHeartBurn="
				+ HC_GastrointestinalSystem_AcidityOrHeartBurn + ", HC_GastrointestinalSystem_BloatingOrPassingGas="
				+ HC_GastrointestinalSystem_BloatingOrPassingGas + ", HC_GastrointestinalSystem_VomitingOrNausea="
				+ HC_GastrointestinalSystem_VomitingOrNausea + ", HC_GastrointestinalSystem_Belching="
				+ HC_GastrointestinalSystem_Belching + ", HC_GastrointestinalSystem_RectalBleeding="
				+ HC_GastrointestinalSystem_RectalBleeding + ", HC_GenitourinarySystem_UrinaryDisturbances="
				+ HC_GenitourinarySystem_UrinaryDisturbances + ", HC_GenitourinarySystem_BloodInUrine="
				+ HC_GenitourinarySystem_BloodInUrine + ", HC_GenitourinarySystem_SexualDysfunction="
				+ HC_GenitourinarySystem_SexualDysfunction + ", HC_GenitourinarySystem_DischargeFromPrivateParts="
				+ HC_GenitourinarySystem_DischargeFromPrivateParts + ", HC_Dental_PainInTeethOrGums="
				+ HC_Dental_PainInTeethOrGums + ", HC_Dental_SensitiveTeeth=" + HC_Dental_SensitiveTeeth
				+ ", HC_Dental_Cavities=" + HC_Dental_Cavities + ", HC_Dental_BadBreath=" + HC_Dental_BadBreath
				+ ", HC_Dental_MouthUlcers=" + HC_Dental_MouthUlcers + ", HC_Dental_BleedingInGums="
				+ HC_Dental_BleedingInGums + ", HC_Eye_DisturbanceInVision=" + HC_Eye_DisturbanceInVision
				+ ", HC_Eye_EyePain=" + HC_Eye_EyePain + ", HC_Eye_IrritationAndRednessOrWateringOrItching="
				+ HC_Eye_IrritationAndRednessOrWateringOrItching + ", HC_Ear_EarPainOrDischarge="
				+ HC_Ear_EarPainOrDischarge + ", HC_Ear_HearingLoss=" + HC_Ear_HearingLoss
				+ ", HC_Ear_RingingSoundInEars=" + HC_Ear_RingingSoundInEars + ", HC_Ear_VertigoOrSpinningSensation="
				+ HC_Ear_VertigoOrSpinningSensation + ", HC_Nose_SneezingDueToAllergies="
				+ HC_Nose_SneezingDueToAllergies + ", HC_Nose_Sinusitis=" + HC_Nose_Sinusitis
				+ ", HC_Nose_NoseBleeding=" + HC_Nose_NoseBleeding + ", HC_Throat_ThroatIrritationOrPain="
				+ HC_Throat_ThroatIrritationOrPain + ", HC_Throat_VoiceChange=" + HC_Throat_VoiceChange
				+ ", HC_Throat_Snoring=" + HC_Throat_Snoring + ", HC_Throat_ThroatSwelling=" + HC_Throat_ThroatSwelling
				+ ", HC_Breast_BreastPain=" + HC_Breast_BreastPain + ", HC_Breast_SwellingOrLump="
				+ HC_Breast_SwellingOrLump + ", HC_Breast_Discharge=" + HC_Breast_Discharge
				+ ", HC_Breast_ChangeinBreastSize=" + HC_Breast_ChangeinBreastSize
				+ ", HC_Breast_ChangeInBreastSkinColourOrTexture=" + HC_Breast_ChangeInBreastSkinColourOrTexture
				+ ", HC_Skin_AllergicRash=" + HC_Skin_AllergicRash + ", HC_Skin_WhitePatches=" + HC_Skin_WhitePatches
				+ ", HC_Skin_DrySkin=" + HC_Skin_DrySkin + ", HC_Skin_FungalInfection=" + HC_Skin_FungalInfection
				+ ", HC_Skin_DarkeningOfSkin=" + HC_Skin_DarkeningOfSkin + ", HC_Skin_Warts=" + HC_Skin_Warts
				+ ", HC_Skin_Corn=" + HC_Skin_Corn + ", HC_General_WeightLossOrGain=" + HC_General_WeightLossOrGain
				+ ", HC_General_Fever=" + HC_General_Fever + ", HC_General_Snoring=" + HC_General_Snoring
				+ ", HC_General_HairFall=" + HC_General_HairFall + ", HC_General_VaricoseVeins="
				+ HC_General_VaricoseVeins + ", HC_General_SwellingInLegsOrFeet=" + HC_General_SwellingInLegsOrFeet
				+ ", HC_Gynaecology_IrregularPeriods=" + HC_Gynaecology_IrregularPeriods
				+ ", HC_Gynaecology_HeavyPeriods=" + HC_Gynaecology_HeavyPeriods + ", HC_Gynaecology_MissedPeriods="
				+ HC_Gynaecology_MissedPeriods + ", HC_Gynaecology_VaginalDischargeOrIrritation="
				+ HC_Gynaecology_VaginalDischargeOrIrritation + ", HC_Gynaecology_Spotting=" + HC_Gynaecology_Spotting
				+ ", HC_Gynaecology_PCODORPCOS=" + HC_Gynaecology_PCODORPCOS + ", HC_Gynaecology_Infertility="
				+ HC_Gynaecology_Infertility + "]";
	}

	



}
