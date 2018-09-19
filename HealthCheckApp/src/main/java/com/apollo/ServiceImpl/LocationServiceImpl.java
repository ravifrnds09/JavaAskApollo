package com.apollo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.apollo.DAO.LocationDAO;
import com.apollo.DAOImpl.LocationDAOImpl;
import com.apollo.Service.LocationService;
import com.apollo.model.LocationResponse;

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
			}
			
		} catch(Exception e) {
			logger.info("Get All Medmantra Locations Service: Exception: " + e);
			e.printStackTrace();
		}
		
		return locationResponseList;
	}

}
