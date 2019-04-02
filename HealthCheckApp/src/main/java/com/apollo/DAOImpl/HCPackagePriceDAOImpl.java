package com.apollo.DAOImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONArray;
import org.json.JSONObject;

import com.apollo.DAO.HCPackagePriceDAO;
import com.apollo.ServiceImpl.PackageListServiceImpl;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.HCPersonalizedCheck;
import com.apollo.model.TestParameterDesc;

public class HCPackagePriceDAOImpl implements HCPackagePriceDAO {
	Logger logger = Logger.getLogger(HCPackagePriceDAOImpl.class);
	private SessionFactory sessionFactory;
	private Session session;

	@Override
	public String getPersonalizedDetails(HCPersonalizedCheck hCPersonalizedCheck) {
		logger.info("Personalized HealthCheck DAO is called");
		JSONObject jsonObj = new JSONObject();
		;
		List getResponse = null;

		try {
			ObjectMapper mapperObj = new ObjectMapper();
			String jsonStr = mapperObj.writeValueAsString(hCPersonalizedCheck);
			logger.info("Personalized HealthCheck request json " + jsonStr);
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			/*
			 * Query registerQuery = session.createSQLQuery("CALL" +
			 * " hc_get_Personalised_Package('1', '1', '96F23536-E845-4232-87C2-94F0DE826FF5', 'RHA0.0000000017',  'Srinu','Suryadevara','9703902559', 'srinusuryadevara@gmail.com', 'FeMale', '31','', 'No', 'Good', 'Mild', 'Moderate', 'Tired',  '', 'Yes', 'yes', 'yes', 'yes','yes','yes', 'yes', 'yes', 'yes', 'yes', 'yes', '', '', 'yes', 'yes', '', 'yes', '', '', '', '', '', '', '', '', '', 'yes', '', '', '', '', 'yes', 'yes', 'yes', '', '', '', '', '', '', '', '', '', '', '', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes')"
			 * );
			 */
			Query registerQuery = session.createSQLQuery("CALL "
					+ "hc_get_Personalised_Package(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			registerQuery.setString(0, hCPersonalizedCheck.getCityId());
			registerQuery.setString(1, hCPersonalizedCheck.gethRAID());
			registerQuery.setString(2, hCPersonalizedCheck.getPatientId());
			registerQuery.setString(3, hCPersonalizedCheck.getuHID());
			registerQuery.setString(4, hCPersonalizedCheck.getFirstname());
			registerQuery.setString(5, hCPersonalizedCheck.getLastname());
			registerQuery.setString(6, hCPersonalizedCheck.getPhoneNo());
			registerQuery.setString(7, hCPersonalizedCheck.getEmailId());
			registerQuery.setString(8, hCPersonalizedCheck.getGender());
			registerQuery.setString(9, hCPersonalizedCheck.getAge());
			registerQuery.setString(10, hCPersonalizedCheck.getAreYouPregnant());
			registerQuery.setString(11, hCPersonalizedCheck.getIsSmoker());
			registerQuery.setString(12, hCPersonalizedCheck.getDescribeYourSleep());
			registerQuery.setString(13, hCPersonalizedCheck.getDescribeYourStressAtHome());
			registerQuery.setString(14, hCPersonalizedCheck.getDescribeYourStressAtWork());
			registerQuery.setString(15, hCPersonalizedCheck.getDescribeYourEnergyLevel());
			registerQuery.setString(16, hCPersonalizedCheck.getDiag_DiabetesmellitusProblems());
			registerQuery.setString(17, hCPersonalizedCheck.getDiag_BorderlineDiabetesProblems());
			registerQuery.setString(18, hCPersonalizedCheck.getDiag_HighBloodPressureProblems());
			registerQuery.setString(19, hCPersonalizedCheck.getDiag_HighCholesterolProblems());
			registerQuery.setString(20, hCPersonalizedCheck.getDiag_HeartrelatedProblems());
			registerQuery.setString(21, hCPersonalizedCheck.getDiag_AsthamaProblems());
			registerQuery.setString(22, hCPersonalizedCheck.getDiag_ThyroidProblems());
			registerQuery.setString(23, hCPersonalizedCheck.getDiag_HighUricAcidLevelProblems());
			registerQuery.setString(24, hCPersonalizedCheck.getDiag_CancerProblems());
			registerQuery.setString(25, hCPersonalizedCheck.getDiag_LiverProblems());
			registerQuery.setString(26, hCPersonalizedCheck.getDiag_KidneyProblems());
			registerQuery.setString(27, hCPersonalizedCheck.getDiag_OsteoporosisProblems());
			registerQuery.setString(28, hCPersonalizedCheck.getDiag_ArthritisProblems());
			registerQuery.setString(29, hCPersonalizedCheck.getDiag_OtherProblems());
			registerQuery.setString(30, hCPersonalizedCheck.getDiag_Cancer_Type_Bladder());
			registerQuery.setString(31, hCPersonalizedCheck.getDiag_Cancer_Type_Blood());
			registerQuery.setString(32, hCPersonalizedCheck.getDiag_Cancer_Type_Breast());
			registerQuery.setString(33, hCPersonalizedCheck.getDiag_Cancer_Type_Colon());
			registerQuery.setString(34, hCPersonalizedCheck.getDiag_Cancer_Type_Eye());
			registerQuery.setString(35, hCPersonalizedCheck.getDiag_Cancer_Type_Ovarian());
			registerQuery.setString(36, hCPersonalizedCheck.getDiag_Cancer_Type_Pancreas());
			registerQuery.setString(37, hCPersonalizedCheck.getDiag_Cancer_Type_Pituitary());
			registerQuery.setString(38, hCPersonalizedCheck.getDiag_Cancer_Type_Prostrate());
			registerQuery.setString(39, hCPersonalizedCheck.getDiag_Cancer_Type_Skin());
			registerQuery.setString(40, hCPersonalizedCheck.getDiag_Cancer_Type_Stomach());
			registerQuery.setString(41, hCPersonalizedCheck.getDiag_Cancer_Type_Thyroid());
			registerQuery.setString(42, hCPersonalizedCheck.getDiag_Cancer_Type_Others());
			registerQuery.setString(43, hCPersonalizedCheck.getFH_Diabetes());
			registerQuery.setString(44, hCPersonalizedCheck.getFH_Hypertension());
			registerQuery.setString(45, hCPersonalizedCheck.getFH_ThyroidProblems());
			registerQuery.setString(46, hCPersonalizedCheck.getFH_HeartRelatedProblems());
			registerQuery.setString(47, hCPersonalizedCheck.getFH_Osteoporosis());
			registerQuery.setString(48, hCPersonalizedCheck.getFH_Cancer());
			registerQuery.setString(49, hCPersonalizedCheck.getFH_Cancer_Type_Bladder());
			registerQuery.setString(50, hCPersonalizedCheck.getFH_Cancer_Type_Blood());
			registerQuery.setString(51, hCPersonalizedCheck.getFH_Cancer_Type_Breast());
			registerQuery.setString(52, hCPersonalizedCheck.getFH_Cancer_Type_Colon());
			registerQuery.setString(53, hCPersonalizedCheck.getFH_Cancer_Type_Eye());
			registerQuery.setString(54, hCPersonalizedCheck.getFH_Cancer_Type_Ovarian());
			registerQuery.setString(55, hCPersonalizedCheck.getFH_Cancer_Type_Pancreas());
			registerQuery.setString(56, hCPersonalizedCheck.getFH_Cancer_Type_Pituitary());
			registerQuery.setString(57, hCPersonalizedCheck.getFH_Cancer_Type_Prostrate());
			registerQuery.setString(58, hCPersonalizedCheck.getFH_Cancer_Type_Skin());
			registerQuery.setString(59, hCPersonalizedCheck.getFH_Cancer_Type_Stomach());
			registerQuery.setString(60, hCPersonalizedCheck.getFH_Cancer_Type_Thyroid());
			registerQuery.setString(61, hCPersonalizedCheck.getFH_Cancer_Type_Others());
			registerQuery.setString(62, hCPersonalizedCheck.getHC_Heart());
			registerQuery.setString(63, hCPersonalizedCheck.getHC_Chest());
			registerQuery.setString(64, hCPersonalizedCheck.getHC_NervousSystem());
			registerQuery.setString(65, hCPersonalizedCheck.getHC_GastrointestinalSystem());
			registerQuery.setString(66, hCPersonalizedCheck.getHC_GenitourinarySystem());
			registerQuery.setString(67, hCPersonalizedCheck.getHC_MusclesAndJoints());
			registerQuery.setString(68, hCPersonalizedCheck.getHC_OralandDental());
			registerQuery.setString(69, hCPersonalizedCheck.getHC_Eyes());
			registerQuery.setString(70, hCPersonalizedCheck.getHC_Ears());
			registerQuery.setString(71, hCPersonalizedCheck.getHC_Nose());
			registerQuery.setString(72, hCPersonalizedCheck.getHC_Throat());
			registerQuery.setString(73, hCPersonalizedCheck.getHC_Skin());
			registerQuery.setString(74, hCPersonalizedCheck.getHC_Breast());
			registerQuery.setString(75, hCPersonalizedCheck.getHC_General());
			registerQuery.setString(76, hCPersonalizedCheck.getHC_Gynecology());
			registerQuery.setString(77, hCPersonalizedCheck.getHC_Heart_ChestPain());
			registerQuery.setString(78, hCPersonalizedCheck.getHC_Heart_RacingHeartBeatOrPalpitations());
			registerQuery.setString(79, hCPersonalizedCheck.getHC_Heart_DizzinessOrFainting());
			registerQuery.setString(80, hCPersonalizedCheck.getHC_Chest_Wheezing());
			registerQuery.setString(81, hCPersonalizedCheck.getHC_Chest_Cough());
			registerQuery.setString(82, hCPersonalizedCheck.getHC_Chest_DifficultyInBreathing());
			registerQuery.setString(83, hCPersonalizedCheck.getHC_NervousSystem_HeadacheOrMigraine());
			registerQuery.setString(84, hCPersonalizedCheck.getHC_NervousSystem_MemoryLoss());
			registerQuery.setString(85, hCPersonalizedCheck.getHC_NervousSystem_EpilepsyOrSeizureOrFits());
			registerQuery.setString(86,
					hCPersonalizedCheck.getHC_NervousSystem_TinglingOrNumbnessInhandsOrlegsOrfeet());
			registerQuery.setString(87, hCPersonalizedCheck.getHC_NervousSystem_DizzinessOrFainting());
			registerQuery.setString(88, hCPersonalizedCheck.getHC_NervousSystem_TinglingOrNumbnessInOtherparts());
			registerQuery.setString(89, hCPersonalizedCheck.getHC_MusclesAndJoints_SwellingInLegsOrFeet());
			registerQuery.setString(90, hCPersonalizedCheck.getHC_MusclesAndJoints_SwellingInTwoOrMoreJoints());
			registerQuery.setString(91, hCPersonalizedCheck.getHC_MusclesAndJoints_PainInTwoOrMoreJoints());
			registerQuery.setString(92, hCPersonalizedCheck.getHC_MusclesAndJoints_StiffnessInTwoOrMoreJoints());
			registerQuery.setString(93, hCPersonalizedCheck.getHC_MusclesAndJoints_GeneralBodyPainOrMuscleWeakness());
			registerQuery.setString(94, hCPersonalizedCheck.getHC_MusclesAndJoints_Others());
			registerQuery.setString(95, hCPersonalizedCheck.getHC_GastrointestinalSystem_Constipation());
			registerQuery.setString(96, hCPersonalizedCheck.getHC_GastrointestinalSystem_DiahorreaOrLooseMotion());
			registerQuery.setString(97, hCPersonalizedCheck.getHC_GastrointestinalSystem_ChangeInBowelHabits());
			registerQuery.setString(98, hCPersonalizedCheck.getHC_GastrointestinalSystem_LossOfAppetite());
			registerQuery.setString(99, hCPersonalizedCheck.getHC_GastrointestinalSystem_AbdominalPain());
			registerQuery.setString(100, hCPersonalizedCheck.getHC_GastrointestinalSystem_AcidityOrHeartBurn());
			registerQuery.setString(101, hCPersonalizedCheck.getHC_GastrointestinalSystem_BloatingOrPassingGas());
			registerQuery.setString(102, hCPersonalizedCheck.getHC_GastrointestinalSystem_VomitingOrNausea());
			registerQuery.setString(103, hCPersonalizedCheck.getHC_GastrointestinalSystem_Belching());
			registerQuery.setString(104, hCPersonalizedCheck.getHC_GastrointestinalSystem_RectalBleeding());
			registerQuery.setString(105, hCPersonalizedCheck.getHC_GenitourinarySystem_UrinaryDisturbances());
			registerQuery.setString(106, hCPersonalizedCheck.getHC_GenitourinarySystem_BloodInUrine());
			registerQuery.setString(107, hCPersonalizedCheck.getHC_GenitourinarySystem_SexualDysfunction());
			registerQuery.setString(108, hCPersonalizedCheck.getHC_GenitourinarySystem_DischargeFromPrivateParts());
			registerQuery.setString(109, hCPersonalizedCheck.getHC_Dental_PainInTeethOrGums());
			registerQuery.setString(110, hCPersonalizedCheck.getHC_Dental_SensitiveTeeth());
			registerQuery.setString(111, hCPersonalizedCheck.getHC_Dental_Cavities());
			registerQuery.setString(112, hCPersonalizedCheck.getHC_Dental_BadBreath());
			registerQuery.setString(113, hCPersonalizedCheck.getHC_Dental_MouthUlcers());
			registerQuery.setString(114, hCPersonalizedCheck.getHC_Dental_BleedingInGums());
			registerQuery.setString(115, hCPersonalizedCheck.getHC_Eye_DisturbanceInVision());
			registerQuery.setString(116, hCPersonalizedCheck.getHC_Eye_EyePain());
			registerQuery.setString(117, hCPersonalizedCheck.getHC_Eye_IrritationAndRednessOrWateringOrItching());
			registerQuery.setString(118, hCPersonalizedCheck.getHC_Ear_EarPainOrDischarge());
			registerQuery.setString(119, hCPersonalizedCheck.getHC_Ear_HearingLoss());
			registerQuery.setString(120, hCPersonalizedCheck.getHC_Ear_RingingSoundInEars());
			registerQuery.setString(121, hCPersonalizedCheck.getHC_Ear_VertigoOrSpinningSensation());
			registerQuery.setString(122, hCPersonalizedCheck.getHC_Nose_SneezingDueToAllergies());
			registerQuery.setString(123, hCPersonalizedCheck.getHC_Nose_Sinusitis());
			registerQuery.setString(124, hCPersonalizedCheck.getHC_Nose_NoseBleeding());
			registerQuery.setString(125, hCPersonalizedCheck.getHC_Throat_ThroatIrritationOrPain());
			registerQuery.setString(126, hCPersonalizedCheck.getHC_Throat_VoiceChange());
			registerQuery.setString(127, hCPersonalizedCheck.getHC_Throat_Snoring());
			registerQuery.setString(128, hCPersonalizedCheck.getHC_Throat_ThroatSwelling());
			registerQuery.setString(129, hCPersonalizedCheck.getHC_Breast_BreastPain());
			registerQuery.setString(130, hCPersonalizedCheck.getHC_Breast_SwellingOrLump());
			registerQuery.setString(131, hCPersonalizedCheck.getHC_Breast_Discharge());
			registerQuery.setString(132, hCPersonalizedCheck.getHC_Breast_ChangeinBreastSize());
			registerQuery.setString(133, hCPersonalizedCheck.getHC_Breast_ChangeInBreastSkinColourOrTexture());
			registerQuery.setString(134, hCPersonalizedCheck.getHC_Skin_AllergicRash());
			registerQuery.setString(135, hCPersonalizedCheck.getHC_Skin_WhitePatches());
			registerQuery.setString(136, hCPersonalizedCheck.getHC_Skin_DrySkin());
			registerQuery.setString(137, hCPersonalizedCheck.getHC_Skin_FungalInfection());
			registerQuery.setString(138, hCPersonalizedCheck.getHC_Skin_DarkeningOfSkin());
			registerQuery.setString(139, hCPersonalizedCheck.getHC_Skin_Warts());
			registerQuery.setString(140, hCPersonalizedCheck.getHC_Skin_Corn());
			registerQuery.setString(141, hCPersonalizedCheck.getHC_General_WeightLossOrGain());
			registerQuery.setString(142, hCPersonalizedCheck.getHC_General_Fever());
			registerQuery.setString(143, hCPersonalizedCheck.getHC_General_Snoring());
			registerQuery.setString(144, hCPersonalizedCheck.getHC_General_HairFall());
			registerQuery.setString(145, hCPersonalizedCheck.getHC_General_VaricoseVeins());
			registerQuery.setString(146, hCPersonalizedCheck.getHC_General_SwellingInLegsOrFeet());
			registerQuery.setString(147, hCPersonalizedCheck.getHC_Gynaecology_IrregularPeriods());
			registerQuery.setString(148, hCPersonalizedCheck.getHC_Gynaecology_HeavyPeriods());
			registerQuery.setString(149, hCPersonalizedCheck.getHC_Gynaecology_MissedPeriods());
			registerQuery.setString(150, hCPersonalizedCheck.getHC_Gynaecology_VaginalDischargeOrIrritation());
			registerQuery.setString(151, hCPersonalizedCheck.getHC_Gynaecology_Spotting());
			registerQuery.setString(152, hCPersonalizedCheck.getHC_Gynaecology_PCODORPCOS());
			registerQuery.setString(153, hCPersonalizedCheck.getHC_Gynaecology_Infertility());
			getResponse = registerQuery.list();
			List responseList = new ArrayList();
			JSONObject obj4 = null;
			JSONArray arr = new JSONArray();
			for (Object result : getResponse) {
				Object[] obj = (Object[]) result;
				obj4 = new JSONObject();
				obj4.put("ServiceId", String.valueOf(obj[0]));
				obj4.put("ServiceName", obj[1].toString());
				obj4.put("CustomerPackageName", obj[2].toString());
				obj4.put("Tariff", obj[5].toString());
				obj4.put("Gender", obj[6].toString());
				obj4.put("FromAge", obj[7].toString());
				obj4.put("ToAge", obj[8].toString());
				obj4.put("Frequency", obj[9].toString());
				obj4.put("Package_Description", obj[10].toString());
				obj4.put("Age_Group_Recommended", obj[11].toString());
				obj4.put("Recommended_For", obj[12].toString());
				obj4.put("RecommendedTestsForEdoc", obj[13].toString());
				JSONArray jar = new JSONArray();
				if (obj[13].toString().equals("")) {
					obj4.put("RecommendedTests", "");
				} else {
					String[] Rcm = obj[13].toString().split(",");
					String[] trf = obj[14].toString().split(",");
					JSONObject tarrifObj = null;
					JSONObject tarrifObjEdoc = null;
					JSONObject RcmObj = new JSONObject();
					for (int i = 0; i < trf.length; i++) {
						tarrifObj = new JSONObject();
						tarrifObjEdoc = new JSONObject();
						tarrifObj.put("Tarrif", trf[i]);
						RcmObj.put(Rcm[i], tarrifObj);
						tarrifObjEdoc.put("recommendedTestTariff", trf[i]);
						tarrifObjEdoc.put("recommendedTestName", Rcm[i]);
						jar.put(tarrifObjEdoc);
					}
					obj4.put("RecommendedTestsAndTariffForEdoc", jar);
					obj4.put("RecommendedTests", RcmObj);
				}
				String[] inclusion = obj[3].toString().split(",");
				String[] inclusion1 = obj[4].toString().split(",");
				List<String> arrayList = new ArrayList<>();
				Collections.addAll(arrayList, inclusion);
				List<String> arrayList1 = new ArrayList<>();
				Collections.addAll(arrayList1, inclusion1);
				if (obj[6].toString().equalsIgnoreCase("male") && arrayList.contains("Pap Smear (for Women)")
						&& arrayList1.contains("Pap Smear (for Women)")) {
					arrayList.remove("Pap Smear (for Women)");
					arrayList1.remove("Pap Smear (for Women)");
				}
				inclusion = arrayList.toArray(new String[0]);
				inclusion1 = arrayList1.toArray(new String[0]);
				String inclusionStr = convertStringArrayToString(inclusion, ",") ;
				JSONObject testParam = new JSONObject();
				JSONObject json = null;
				for (int i = 0; i < inclusion.length; i++) {
					TestParameterDesc testParameterDesc = new TestParameterDesc();
					testParameterDesc.setPackageName(inclusion1[i]);
					PackageListServiceImpl packageListServiceImpl = new PackageListServiceImpl();
					String info = packageListServiceImpl.getTestParameter(testParameterDesc);
					JSONObject json2 = new JSONObject(info);
					json = new JSONObject();
					json.put("inclusionName", inclusion[i]);
					testParam.put(inclusion[i], json2.getJSONArray(inclusion1[i]));
					json.put("inclusions", json2.getJSONArray(inclusion1[i]));
					arr.put(json);
				}
				obj4.put("Packageinclusions", inclusionStr);
				obj4.put("packageinclusionsParametersAndDescription", arr);
				obj4.put("PackageinclusionsParametersAndDiscription", testParam);
				responseList.add(obj4);
			}

			if (responseList.size() == 0) {
				jsonObj.put("status", "no records");
			} else {
				jsonObj.put("packageDetails", responseList);
				jsonObj.put("status", "success");
			}
		} catch (Exception e) {
			logger.info("Personalized HealthCheck DAO Exception is called " + e);
			jsonObj.put("status", "fail");
			e.printStackTrace();
		}
		logger.info("Personalized HealthCheck DAO  response " + jsonObj.toString());
		return jsonObj.toString();
	}
	private static String convertStringArrayToString(String[] strArr, String delimiter) {
		StringBuilder sb = new StringBuilder();
		for (String str : strArr)
			sb.append(str).append(delimiter);
		return sb.substring(0, sb.length() - 1);
	}

}
