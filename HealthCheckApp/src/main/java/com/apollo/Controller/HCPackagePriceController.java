package com.apollo.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;
import com.apollo.Service.HCPackagePriceService;
import com.apollo.ServiceImpl.HCPackagePriceServiceImpl;
import com.apollo.model.HCPersonalizedCheck;

@Path("/personalized")
public class HCPackagePriceController {
	private final Logger logger = Logger.getLogger(HCPackagePriceController.class);

	@Path("/personalizedPackage")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getPersonalizedDetails(HCPersonalizedCheck hCPersonalizedCheck) {
		logger.info("Personalized HealthCheck Controller is called");
		HCPackagePriceService hCPackagePriceService = null;
		String response = "fail";
		try {
			hCPackagePriceService = new HCPackagePriceServiceImpl();
			response = hCPackagePriceService.getPersonalizedDetails(hCPersonalizedCheck);
			logger.info("Personalized HealthCheck Controller Response is " + response);
		} catch (Exception e) {
			response = "{\"status\":\"fail\"}";
			logger.info("Personalized HealthCheck Controller Exception is " + e);
		}
		return response;
	}

}
