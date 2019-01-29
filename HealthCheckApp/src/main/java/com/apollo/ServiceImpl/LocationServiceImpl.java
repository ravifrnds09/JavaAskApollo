package com.apollo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.apollo.DAO.LocationDAO;
import com.apollo.DAOImpl.LocationDAOImpl;
import com.apollo.Service.LocationService;
import com.apollo.model.HospitalList;
import com.apollo.model.LocationResponse;
import com.apollo.model.PackageList;


public class LocationServiceImpl implements LocationService {
	
	private final Logger logger = Logger.getLogger(LocationService.class);
	LocationDAO locationDAO;
	
	@Override
	public List<LocationResponse> getAllLocationService() {
		logger.info("Get All Medmantra Locations Service");
		
		List<LocationResponse> locationResponseList = new ArrayList<>();
		
		try {
			locationDAO = new LocationDAOImpl();
			List<Object[]> locationObjectResponseList = locationDAO.getAllLocationsDAO();
			LocationResponse locationResponse;
			for (Object[] object : locationObjectResponseList) {
				locationResponse = new LocationResponse();
				locationResponse.setLocationId((String) object[0]);
				locationResponse.setLocationName((String) object[1]);
				locationResponseList.add(locationResponse);
				logger.info("Get All Medmantra Locations Service Response is "+locationResponse.toString());
			}
			
		} catch(Exception e) {
			logger.info("Get All Medmantra Locations Service: Exception: " + e);
			e.printStackTrace();
		}
		
		return locationResponseList;
	}
	@Override
	public String GetHospitals(HospitalList cityId) {
		logger.info("Get Hospitals Locations Service Response is ");
		locationDAO = new LocationDAOImpl();
		String response = null;
		List list=null;
		HospitalList packTest=null;
		JSONObject obj=new JSONObject();
		List testlist=locationDAO.GetHospitals(cityId);
		list=new ArrayList<>();
		String info=null;
		try {
			for (Object result : testlist) {
				Object[] object = (Object[]) result;
				packTest = new HospitalList();
				packTest.setHospitalId(Integer.parseInt(object[0].toString()));
				packTest.setHospitalName(object[1].toString());
				list.add(packTest);
				logger.info("Get Hospitals Locations Service Response is "+packTest.toString());
			}
			if (list.size() == 0) {
				obj.put("hospialList", list);
				obj.put("status", "no record");
			} else {
					obj.put("hospialList", list);
					obj.put("status", "success");
			}
			logger.info("Package add Service called");
		} catch (Exception e) {
			logger.info("Package add Service called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		return obj.toString();
	}

}
