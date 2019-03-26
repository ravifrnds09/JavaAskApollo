package com.apollo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.apollo.DAO.PackageListDAO;
import com.apollo.DAOImpl.PackageListDAOImpl;
import com.apollo.Service.PackageListService;
import com.apollo.model.PackageList;
import com.apollo.model.PackageListV2;
import com.apollo.model.PackageListV3;
import com.apollo.model.TestParameterDesc;

public class PackageListServiceImpl implements PackageListService {

	private final Logger logger = Logger.getLogger(PackageListServiceImpl.class);
	private PackageListDAO dao;
	JSONObject obj;

	@Override
	public String RegisterPackges(PackageList test) {
		dao = new PackageListDAOImpl();
		List<PackageList> list = null;
		PackageList packTest = null;
		obj = new JSONObject();
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
				obj.put("status", "no record");
			} else {
				obj.put("status", "success");
				obj.put("ApolloPackages", list);
			}
			logger.info("Package add Service called");
		} catch (Exception e) {
			logger.info("Package add Service called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		return obj.toString();
	}

	@Override
	public String getTestParameter(TestParameterDesc desc) {
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
			logger.info("Package add Service called");
		} catch (Exception e) {
			logger.info("Package add Service called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		return inputObj.toString();
	}

	@Override
	public String getPackges(PackageListV2 packageList) {
		dao = new PackageListDAOImpl();
		PackageListServiceImpl packageListServiceImpl = null;
		List<PackageListV2> list = null;
		PackageListV2 packTest = null;
		obj = new JSONObject();
		List testlist = dao.getPackages(packageList);
		list = new ArrayList<>();
		String info = null;
		TestParameterDesc testParameterDesc = null;
		JSONObject json2 = null;
		JSONObject testParam = null;
		try {
			for (Object result : testlist) {
				Object[] obj = (Object[]) result;
				packTest = new PackageListV2();
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
				String[] inclusion = packTest.getPackageinclusions().split(",");
				testParam = new JSONObject();
				for (int i = 0; i < inclusion.length; i++) {
					testParameterDesc = new TestParameterDesc();
					testParameterDesc.setPackageName(inclusion[i]);
					packageListServiceImpl = new PackageListServiceImpl();
					info = packageListServiceImpl.getTestParameter(testParameterDesc);
					json2 = new JSONObject(info);
					testParam.put(inclusion[i], json2.getJSONArray(inclusion[i]));
				}
				packTest.setPackageinclusionsParametersAndDiscription(testParam);
				list.add(packTest);
			}
			if (list.size() == 0) {
				obj.put("status", "no record");
			} else {
				obj.put("status", "success");
				obj.put("ApolloPackages", list);
			}
			logger.info("Package add Service called");
		} catch (Exception e) {
			logger.info("Package add Service called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		return obj.toString();
	}

	@Override
	public String getActualNames(PackageListV3 packageListV3) {
		dao = new PackageListDAOImpl();
		PackageListServiceImpl packageListServiceImpl = null;
		List<PackageListV3> list = null;
		PackageListV3 packTest = null;
		obj = new JSONObject();
		List testlist = dao.getActualNames(packageListV3);
		list = new ArrayList<>();
		String info = null;
		TestParameterDesc testParameterDesc = null;
		JSONObject json2 = null;
		JSONObject testParam = null;
		try {
			for (Object result : testlist) {
				Object[] obj = (Object[]) result;
				packTest = new PackageListV3();
				packTest.setServiceId(Integer.parseInt(obj[0].toString()));
				packTest.setServiceName(obj[1].toString());
				packTest.setCustomerPackageName(obj[2].toString());
				packTest.setPackageinclusions(obj[3].toString());
				packTest.setTestActualName(obj[4].toString());
				packTest.setTariff(obj[5].toString());
				packTest.setGender(obj[6].toString());
				packTest.setFromAge(obj[7].toString());
				packTest.setToAge(obj[8].toString());
				packTest.setFrequency(obj[9].toString());
				packTest.setPackage_Description(obj[10].toString());
				packTest.setAge_Group_Recommended(obj[11].toString());
				packTest.setRecommended_For(obj[12].toString());
				String[] inclusion = packTest.getPackageinclusions().split(",");
				String[] inclusion1 = packTest.getTestActualName().split(",");
				testParam = new JSONObject();
				for (int i = 0; i < inclusion.length; i++) {
					testParameterDesc = new TestParameterDesc();
					testParameterDesc.setPackageName(inclusion1[i].replaceAll("\n", ""));
					packageListServiceImpl = new PackageListServiceImpl();
					info = packageListServiceImpl.getTestParameter(testParameterDesc);
					json2 = new JSONObject(info);
					testParam.put(inclusion[i], json2.getJSONArray(inclusion1[i]));

				}
				packTest.setPackageinclusionsParametersAndDiscription(testParam);
				list.add(packTest);
			}
			if (list.size() == 0) {
				obj.put("status", "no record");
			} else {
				obj.put("status", "success");
				obj.put("ApolloPackages", list);
			}
			logger.info("Package add Service called");
		} catch (Exception e) {
			logger.info("Package add Service called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		return obj.toString();
	}

	

}
