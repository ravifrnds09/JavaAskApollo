package com.apollo.ServiceImpl;

import org.apache.log4j.Logger;

import com.apollo.DAO.HCPackagePriceDAO;
import com.apollo.DAOImpl.HCPackagePriceDAOImpl;
import com.apollo.Service.HCPackagePriceService;
import com.apollo.model.HCPersonalizedCheck;

public class HCPackagePriceServiceImpl implements HCPackagePriceService {
	Logger logger = Logger.getLogger(HCPackagePriceServiceImpl.class);

	@Override
	public String getPersonalizedDetails(HCPersonalizedCheck hCPersonalizedCheck) {
		logger.info("Personalized Health Check Service is called");
		HCPackagePriceDAO hCPackagePriceDAO = null;
		String response = "fail";
		try {
			hCPackagePriceDAO = new HCPackagePriceDAOImpl();
			response = hCPackagePriceDAO.getPersonalizedDetails(hCPersonalizedCheck);
		} catch (Exception e) {
			logger.info("Personalized Health Check Service Exception called " + e);
			response = "{\"status\":\"fail\"}";
		}
		logger.info("Personalized Health Check Service response " + response);
		return response;
	}

}
