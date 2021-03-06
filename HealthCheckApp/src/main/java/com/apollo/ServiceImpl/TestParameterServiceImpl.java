package com.apollo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.apollo.DAO.TestParameterDAO;
import com.apollo.DAOImpl.TestParameterDAOImpl;
import com.apollo.Service.TestParameterService;
import com.apollo.model.HCPackageResponse;
import com.apollo.model.HCTestParameter;

public class TestParameterServiceImpl implements TestParameterService {
	
	TestParameterDAO testParameterDAO;
	
	private final Logger logger = Logger.getLogger(TestParameterServiceImpl.class);

	@Override
	public List<HCTestParameter> testParamList() {
		
		testParameterDAO = new TestParameterDAOImpl();
		
		List<HCTestParameter> testParameterList = new ArrayList<>();
		HCTestParameter hcTestParameter;
		
		try {
			
			logger.info("Test Parameter list ServiceImpl called");
			
			List<Object[]> testParameterListResponse = testParameterDAO.testParamList();	
			
			for (Object[] object : testParameterListResponse) {
				
				hcTestParameter = new HCTestParameter();
				hcTestParameter.setParamId((int) object[0]);
				hcTestParameter.setParamName(object[1] == null ? "" : (String) object[1]);
				hcTestParameter.setParamDesc(object[2] == null ? "" : (String) object[2]);
				hcTestParameter.setAlterName(object[3] == null ? "" : (String) object[3]);
				
				testParameterList.add(hcTestParameter);
				
			}
			
		} catch (Exception e) {
			logger.info("Test Parameter list ServiceImpl called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		
		return testParameterList;
	}

	@Override
	public HCPackageResponse addTestParameter(HCTestParameter testParameter) {
		
		HCPackageResponse testParameterResponse = new HCPackageResponse();
		
		try { 
			
			logger.info("Test Parameter add ServiceImpl called");
			
			testParameterDAO = new TestParameterDAOImpl();
			
			String response = testParameterDAO.addTestParameterDAO(testParameter);
			testParameterResponse.setResponse(response);
				
		} catch (Exception e) {
			logger.info("Test Parameter add ServiceImpl called: Exception: " + e.getStackTrace());
			testParameterResponse.setResponse("Failed to add Test Parameter");
			e.printStackTrace();
		}
		return testParameterResponse;
	}
	
	@Override
	public HCPackageResponse updateTestParameter(HCTestParameter testParameter) {
		
		HCPackageResponse testParameterResponse = new HCPackageResponse();
		
		try { 
			
			logger.info("Test Parameter update ServiceImpl called: Exception: ");
			testParameterDAO = new TestParameterDAOImpl();
			String response = testParameterDAO.updateTestParameterDAO(testParameter);
			testParameterResponse.setResponse(response);
			
		} catch (Exception e) {
			logger.info("Test Parameter update ServiceImpl called: Exception: " + e.getStackTrace());
			testParameterResponse.setResponse("Failed to Update Test Parameter");
			e.printStackTrace();
		}
		return testParameterResponse;
	}

	@Override
	public HCPackageResponse deleteTestParameter(HCTestParameter testParameter) {
		
		HCPackageResponse testParameterResponse = new HCPackageResponse();
		
		try { 
			
			logger.info("Test Parameter delete ServiceImpl called: Exception: ");
			testParameterDAO = new TestParameterDAOImpl();
			String response = testParameterDAO.deleteTestParameterDAO(testParameter);
			testParameterResponse.setResponse(response);
			
		} catch (Exception e) {
			logger.info("Test Parameter delete ServiceImpl called: Exception: " + e.getStackTrace());
			testParameterResponse.setResponse("Failed to Update Test Parameter");
			e.printStackTrace();
		}
		return testParameterResponse;
	}
	
}
