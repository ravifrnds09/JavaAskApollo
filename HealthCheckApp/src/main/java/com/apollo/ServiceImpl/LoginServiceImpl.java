package com.apollo.ServiceImpl;

import org.apache.log4j.Logger;

import com.apollo.DAO.LoginDAO;
import com.apollo.DAOImpl.LoginDAOImpl;
import com.apollo.Service.LoginService;
import com.apollo.model.HCPackageResponse;
import com.apollo.model.Login;

public class LoginServiceImpl implements LoginService{

	private final Logger logger = Logger.getLogger(LoginServiceImpl.class);
	
	LoginDAO loginService;
	HCPackageResponse hcPackageResponse;
	
	@Override
	public HCPackageResponse checkUserService(Login login) {
		
		loginService = new LoginDAOImpl();
		hcPackageResponse = new HCPackageResponse();
		
		try {
			

			logger.info("Login Service API");
			
			String response = (String) loginService.checkUserService(login);
			hcPackageResponse.setResponse(response);
			
		} catch (Exception e) {

			logger.info("Login Service API" + e.getMessage());
			hcPackageResponse.setResponse("Invalid UserName or Password");
			e.printStackTrace();
		}
		
		return hcPackageResponse;
	}

}
