package com.apollo.ServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.apollo.DAO.PackageListDAO;
import com.apollo.DAOImpl.PackageListDAOImpl;
import com.apollo.Service.PackageListService;
import com.apollo.model.PackageList;
import com.apollo.model.PackageTest;

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
	public String fetchPackages(PackageList packageTest) {
		dao = new PackageListDAOImpl();
		List<PackageList> list = null;
		PackageList packTest = null;
		obj = new JSONObject();
		List<Object> testlist = dao.fetchPackage(packageTest);
		list = new ArrayList<>();
		int toAge = Integer.parseInt(packageTest.getFromAge());
		try {
			
				for (Object result : testlist) {
					Object[] obj = (Object[]) result;
					packTest = new PackageList();
					String to = String.valueOf(obj[6]);
					String from = String.valueOf(obj[7]);
					int age = Integer.valueOf(to);
					int fromAge = Integer.valueOf(from);
					if (obj[5].equals(packageTest.getGender())) {
						if ((age <= toAge) && (toAge <= fromAge)) {
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
					}
				}
			
			System.out.println(list.size());
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
