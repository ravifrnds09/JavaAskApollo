package com.apollo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.apollo.DAO.PackageTestDAO;
import com.apollo.DAOImpl.PackageTestDAOImpl;
import com.apollo.Service.PackageTestService;
import com.apollo.model.PackageTest;

public class PackageTestServiceImpl implements PackageTestService {
	
	private final Logger logger = Logger.getLogger(PackageTestServiceImpl.class);
	private PackageTestDAO dao;
	JSONObject obj;

	@Override
	public String RegisterPackges(PackageTest test) {
		dao=new PackageTestDAOImpl();
		List<PackageTest> list=null;
		PackageTest packTest=null;
		obj=new JSONObject();
		List testlist=dao.SavePackages(test);
		list=new ArrayList<>();
		String info=null;
		try {
			for (Object result : testlist) {
				Object[] obj = (Object[]) result;
				packTest = new PackageTest();
				packTest.setPackageName(obj[0].toString());
				packTest.setPackageinclusions(obj[1].toString());
				packTest.setTariff(obj[2].toString());
				packTest.setGender(obj[3].toString());
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
