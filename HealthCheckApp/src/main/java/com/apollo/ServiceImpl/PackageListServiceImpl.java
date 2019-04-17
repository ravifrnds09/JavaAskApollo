package com.apollo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import com.apollo.DAOImpl.PackageListDAOImpl;
import com.apollo.Service.PackageListService;
import com.apollo.model.PackageList;
import com.apollo.model.PackageListV2;
import com.apollo.model.TestParameterDesc;

public class PackageListServiceImpl implements PackageListService {

	private final Logger logger = Logger.getLogger(PackageListServiceImpl.class);
	PackageListDAOImpl dao;

	@Override
	public String RegisterPackges(PackageList test) {
		dao = new PackageListDAOImpl();
		List<PackageList> list = null;
		PackageList packTest = null;
		JSONObject object = new JSONObject();
		List testlist = dao.SavePackages(test);
		list = new ArrayList<>();
		String info = null;
		try {
			for (Object result : testlist) {
				Object[] obj = (Object[]) result;
				packTest = new PackageList();
				packTest.setServiceId(Integer.parseInt(obj[0].toString()));
				packTest.setServiceName(obj[1].toString());
				packTest.setCustomerPackageName(obj[2].toString());
				packTest.setPackageinclusions(obj[3].toString());
				packTest.setTariff(obj[4].toString());
				packTest.setGender(obj[5].toString());
				packTest.setFromAge(obj[6].toString());
				packTest.setToAge(obj[7].toString());
				packTest.setFrequency(obj[8].toString());
				packTest.setPackage_Description(obj[9].toString());
				packTest.setAge_Group_Recommended(obj[10].toString());
				packTest.setRecommended_For(obj[11].toString());
				list.add(packTest);
			}
			if (list.size() == 0) {
				object.put("status", "no record");
			} else {
				object.put("status", "success");
				object.put("ApolloPackages", list);
			}
			// logger.info("Package add Service called");
		} catch (Exception e) {
			// logger.info("Package add Service called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		return object.toString();
	}

	@Override
	public String getTestParameter(TestParameterDesc desc) {
		logger.info("Get Parameter Descriptions Service is called "+desc.toString());
		dao = new PackageListDAOImpl();
		List<TestParameterDesc> list = null;
		TestParameterDesc descList = null;
		JSONObject inputObj = new JSONObject();
		List testlist = dao.getTestParameter(desc);
		String descption = desc.getPackageName();
		List paramList = new ArrayList();
		list = new ArrayList<>();
		try {
			for (Object result : testlist) {
				Object[] obj = (Object[]) result;
				descList = new TestParameterDesc();
				descList.setParameter(obj[0].toString() != null ? obj[0].toString() : "");
				descList.setDescription(obj[1].toString().equals("NA") ? "" : obj[1].toString());
				list.add(descList);
				JSONObject addrObj = new JSONObject();
				addrObj.put("parameter", descList.getParameter());
				addrObj.put("describtion", descList.getDescription());
				paramList.add(addrObj);
			}
			if (list.size() == 0) {
				inputObj.put(descption, paramList);
			} else {
				inputObj.put(descption, paramList);
			}
		} catch (Exception e) {
			 logger.info("Package add Service called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		logger.info("Test Parameter Description Service response is  " + inputObj.toString());
		return inputObj.toString();
	}

	@Override
	public String getPackges(PackageListV2 packageList) {
		logger.info("Package List with Inclusion Details Service  V2 is called  ");
		dao = new PackageListDAOImpl();
		List daoList = dao.getPackages(packageList);
		List resultList = new ArrayList<>();
		JSONObject resultJson = new JSONObject();
		JSONObject printJson = null;
		try {
			for (Object object : daoList) {
				Object[] resultObject = (Object[]) object;
				printJson = new JSONObject();
				printJson.put("recommended_For", resultObject[11].toString());
				printJson.put("gender", resultObject[5].toString());
				String[] inclusion = resultObject[3].toString().split(",");
				JSONObject testInclusionJson = new JSONObject();
				JSONObject inclusionJson = null;
				JSONArray arr = new JSONArray();
				for (int i = 0; i < inclusion.length; i++) {
					inclusionJson = new JSONObject();
					TestParameterDesc testParameterDesc = new TestParameterDesc();
					testParameterDesc.setPackageName(inclusion[i].replaceAll("\n", ""));
					PackageListServiceImpl packageListServiceImpl = new PackageListServiceImpl();
					String info = packageListServiceImpl.getTestParameter(testParameterDesc);
					JSONObject json2 = new JSONObject(info);
					testInclusionJson.put(inclusion[i], json2.getJSONArray(inclusion[i]));
					inclusionJson.put("inclusionName", inclusion[i]);
					inclusionJson.put("inclusions", json2.getJSONArray(inclusion[i]));
					arr.put(inclusionJson);
				}
				printJson.put("packageinclusionsParametersAndDescription", arr);
				printJson.put("packageinclusionsParametersAndDiscription", testInclusionJson);
				printJson.put("age_Group_Recommended", resultObject[11].toString());
				printJson.put("fromAge", resultObject[6].toString());
				printJson.put("serviceName", resultObject[1].toString());
				printJson.put("frequency", resultObject[8].toString());
				printJson.put("toAge", resultObject[7].toString());
				printJson.put("package_Description", resultObject[9].toString());
				printJson.put("customerPackageName", resultObject[2].toString());
				printJson.put("tariff", resultObject[4].toString());
				printJson.put("packageinclusions", resultObject[3].toString());
				printJson.put("serviceId", Integer.parseInt(resultObject[0].toString()));
				resultList.add(printJson);
				if (resultList.size() == 0) {
					resultJson.put("status", "no records");
				} else {
					resultJson.put("ApolloPackages", resultList);
					resultJson.put("status", "success");
				}
			}
		} catch (Exception e) {
			logger.info("HealthCheck Package Exception is called "+e);
			e.printStackTrace();
		}
		logger.info("Health Check Package List Service V2 Response is   " + resultJson.toString());
		return resultJson.toString();
	}

	@Override
	public String getActualNames(PackageListV2 packageList) {
		logger.info("Package List with Inclusion Details Service V3 is called  ");
		dao = new PackageListDAOImpl();
		List daoList = dao.getActualNames(packageList);
		List resultList = new ArrayList<>();
		JSONObject resultJson = new JSONObject();
		JSONObject printJson = null;
		try {
			for (Object object : daoList) {
				Object[] resultObject = (Object[]) object;
				printJson = new JSONObject();
				printJson.put("recommended_For", resultObject[12].toString());
				printJson.put("gender", resultObject[6].toString());
				printJson.put("age_Group_Recommended", resultObject[11].toString());
				String[] inclusion = resultObject[3].toString().split(",");
				String[] inclusion1 = resultObject[4].toString().split(",");
				JSONObject testInclusionJson = new JSONObject();
				JSONObject inclusionJson = null;
				JSONArray arr = new JSONArray();
				for (int i = 0; i < inclusion.length; i++) {
					inclusionJson = new JSONObject();
					TestParameterDesc testParameterDesc = new TestParameterDesc();
					testParameterDesc.setPackageName(inclusion1[i].replaceAll("\n", ""));
					PackageListServiceImpl packageListServiceImpl = new PackageListServiceImpl();
					String info = packageListServiceImpl.getTestParameter(testParameterDesc);
					JSONObject json2 = new JSONObject(info);
					testInclusionJson.put(inclusion[i], json2.getJSONArray(inclusion1[i]));
					inclusionJson.put("inclusionName", inclusion[i]);
					inclusionJson.put("inclusions", json2.getJSONArray(inclusion1[i]));
					arr.put(inclusionJson);
				}
				printJson.put("packageinclusionsParametersAndDiscription", testInclusionJson);
				printJson.put("packageinclusionsParametersAndDescription", arr);
				printJson.put("fromAge", resultObject[7].toString());
				printJson.put("serviceName", resultObject[1].toString());
				printJson.put("frequency", resultObject[9].toString());
				printJson.put("testActualName", resultObject[4].toString());
				printJson.put("toAge", resultObject[8].toString());
				printJson.put("package_Description", resultObject[10].toString());
				printJson.put("testActualName", resultObject[4].toString());
				printJson.put("customerPackageName", resultObject[2].toString());
				printJson.put("tariff", resultObject[5].toString());
				printJson.put("packageinclusions", resultObject[3].toString());
				printJson.put("serviceId", Integer.parseInt(resultObject[0].toString()));
				resultList.add(printJson);
				if (resultList.size() == 0) {
					resultJson.put("status", "no records");
				} else {
					resultJson.put("ApolloPackages", resultList);
					resultJson.put("status", "success");
				}
			}
		} catch (Exception e) {
			logger.info("HealthCheck Package Exception is called "+e);
			e.printStackTrace();
		}
		logger.info("Health Check Package List Service V3 Response is   " + resultJson.toString());
		return resultJson.toString();
	}

	@Override
	public String getTestParameterV2(TestParameterDesc desc) {
		logger.info("Get Parameter Descriptions Service is called "+desc.toString());
		dao = new PackageListDAOImpl();
		List<TestParameterDesc> list = null;
		TestParameterDesc descList = null;
		JSONObject inputObj = new JSONObject();
		List testlist = dao.getTestParameter(desc);
		String descption = desc.getPackageName();
		List paramList = new ArrayList();
		list = new ArrayList<>();
		try {
			for (Object result : testlist) {
				Object[] obj = (Object[]) result;
				descList = new TestParameterDesc();
				descList.setParameter(obj[0].toString() != null ? obj[0].toString() : "");
				descList.setDescription(obj[1].toString().equals("NA") ? "" : obj[1].toString());
				list.add(descList);
				//if(descList.getParameter().equals("Surgical Examination (Men)") && descList.getGender().equalsIgnoreCase("male"))
				JSONObject addrObj = new JSONObject();
				addrObj.put("parameter", descList.getParameter());
				addrObj.put("describtion", descList.getDescription());
				paramList.add(addrObj);
			}
			if (list.size() == 0) {
				inputObj.put(descption, paramList);
			} else {
				inputObj.put(descption, paramList);
			}
		} catch (Exception e) {
			 logger.info("Package add Service called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		logger.info("Test Parameter Description Service response is  " + inputObj.toString());
		return inputObj.toString();
	}

}
