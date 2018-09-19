package com.apollo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.apollo.DAO.TestDAO;
import com.apollo.DAOImpl.TestDAOImpl;
import com.apollo.Service.TestService;
import com.apollo.model.HCPackageResponse;
import com.apollo.model.HCTest;
import com.apollo.modelObject.TestObject;

public class TestServiceImpl implements TestService{
	
	private final Logger logger = Logger.getLogger(TestServiceImpl.class);
	
	TestDAO testDAO;
	HCPackageResponse packageResponse;
	
	@Override
	public List<HCTest> getTestList() {
		
		testDAO = new TestDAOImpl();
		List<HCTest> testList = new ArrayList<>();
		HCTest hcTest;
		
		
		try {
			logger.info("Test list service called");
			testDAO = new TestDAOImpl();
			
			List<Object[]> testListresponse = testDAO.getTestDAO();
			
			for (Object[] testObject : testListresponse) {
				
				hcTest = new HCTest();
				hcTest.setTestId((int) testObject[0]);
				hcTest.setTestName(testObject[1] == null ? "" : (String) testObject[1]);
				hcTest.setTestDesc(testObject[3] == null ? "" : (String) testObject[3]);
				hcTest.setParamNamesString(testObject[2] == null ? "" : (String) testObject[2]);
				
				testList.add(hcTest);
			}
			
		} catch (Exception e) {
			logger.info("Test list service called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		
		return testList;
	}

	@Override
	public HCPackageResponse addTest(HCTest test) {
		
		testDAO = new TestDAOImpl();
		packageResponse = new HCPackageResponse();
		String response;
		
		try {
			logger.info("Test add Service called");
			
			testDAO = new TestDAOImpl();
			
			response = String.valueOf(testDAO.addTestDAO(test));
			if (response != null) {
				packageResponse.setResponse(response);
			} else {
				packageResponse.setResponse("Falied to add Test");
			}
			
		} catch (Exception e) {
			logger.info("Test add Service called: Exception: " + e.getStackTrace());
			packageResponse.setResponse("Falied to add Test");
			e.printStackTrace();
		}
		return packageResponse;
	}

	@Override
	public HCPackageResponse updateTest(HCTest test) {
		
		testDAO = new TestDAOImpl();
		packageResponse = new HCPackageResponse();
		String response;
		
		try {

			logger.info("Test update Service called");
			testDAO = new TestDAOImpl();
			response = testDAO.updateTestDAO(test);
			if (response != null) {
				
				packageResponse.setResponse(response);
				
			} else {
				packageResponse.setResponse("Falied to update Test");
			}
			
		} catch (Exception e) {
			logger.info("Test update service called: Exception: " + e.getStackTrace());
			packageResponse.setResponse("Falied to update Test");
			e.printStackTrace();
		}
		return packageResponse;
	}

	@Override
	public HCPackageResponse deleteTest(HCTest test) {
		
		packageResponse = new HCPackageResponse();
		String response;
		
		try {
			logger.info("Test delete service called");

			testDAO = new TestDAOImpl();
			response = testDAO.deleteTestDAO(test);
			
			if (response != null) {
				
				packageResponse.setResponse(response);
				
			} else {
				packageResponse.setResponse("Falied to delete Test");
			}
			
		} catch (Exception e) {
			logger.info("Test delete service called: Exception: " + e.getStackTrace());
			packageResponse.setResponse("Falied to delete Test");
			e.printStackTrace();
		}
		return packageResponse;
	}

	@Override
	public TestObject getTest(TestObject test) {
		
		TestObject testResponse = null;
		
		try {
			
			testDAO = new TestDAOImpl();
			testResponse = testDAO.getTest(test);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return testResponse;
	}

}
