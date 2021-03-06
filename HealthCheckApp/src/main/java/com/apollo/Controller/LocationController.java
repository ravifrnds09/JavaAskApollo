package com.apollo.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.apollo.Service.LocationService;
import com.apollo.ServiceImpl.LocationServiceImpl;
import com.apollo.model.LocationResponse;

@Path("/location")
public class LocationController {
	
	private final Logger logger = Logger.getLogger(LocationController.class);
	LocationService locationService;
	
	@GET
	@Path("/getLocations")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LocationResponse> getLocations() {
		
		logger.info("Get All Medmantra Locations Controller");
		List<LocationResponse> locationResponse = new ArrayList<>();
		
		try {
			locationService = new LocationServiceImpl();
			locationResponse = locationService.getAllLocationService();
			
		} catch (Exception e) {
			logger.info("Get All Medmantra Locations Controller: Exception: " + e);
			e.printStackTrace();
		}
		
		return locationResponse;
	}
	
}
