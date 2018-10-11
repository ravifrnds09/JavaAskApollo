package com.apollo.ServiceImpl;

import java.util.ArrayList;
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
		dao=new PackageListDAOImpl();
		List<PackageList> list=null;
		PackageList packTest=null;
		obj=new JSONObject();
		List testlist=dao.SavePackages(test);
		System.out.println(testlist);
		list=new ArrayList<>();
		String info=null;
		try {
			for (Object result : testlist) {
				Object[] obj = (Object[]) result;
				packTest = new PackageList();
				packTest.setServiceId(Integer.parseInt(obj[0].toString()));
				packTest.setServiceName(obj[1].toString());
				packTest.setCustomerPackageName(obj[2].toString());
				packTest.setPackageinclusions(obj[3].toString());
				packTest.setTariff(obj[4].toString());
				//packTest.setGender(obj[5].toString());
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
