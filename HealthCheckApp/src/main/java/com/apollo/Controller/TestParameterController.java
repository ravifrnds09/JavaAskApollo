package com.apollo.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.apollo.Service.TestParameterService;
import com.apollo.ServiceImpl.TestParameterServiceImpl;
import com.apollo.model.HCPackageResponse;
import com.apollo.model.HCTestParameter;

@Path("/testparameter")
public class TestParameterController {
	
	private final Logger logger = Logger.getLogger(TestParameterController.class);
	
	TestParameterService testParameterService;
	HCPackageResponse testParameterResponse;
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCTestParameter> testParameterList() {

		logger.info("list parameter controller called");
		
		testParameterService = new TestParameterServiceImpl();
		List<HCTestParameter> listObj =null;
		try {
			listObj = testParameterService.testParamList();		
			
			logger.info("list parameter controller called: : " + listObj);
		} catch(Exception e) {
			logger.info("list parameter controller called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}

		return listObj;
	}
	
	
	@POST
	@Path("/delete1")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse testParameterdelete(HCTestParameter testParameter) {
		
		logger.info("delete parameter controller called");
		
		testParameterResponse = new HCPackageResponse();
		
		try {
			
			testParameterService = new TestParameterServiceImpl();
			testParameterResponse = testParameterService.deleteTestParameter(testParameter);
			logger.info("delete parameter controller called: : " + testParameterResponse);
			logger.info("delete parameter controller called: : " + testParameter.toString());
		} catch (Exception e) {
			logger.info("delete parameter controller called: Exception: " + e.getStackTrace());
			testParameterResponse.setResponse("Failed to delete Test Parameter");
			e.printStackTrace();
		}
		return testParameterResponse;
		
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse testParameterUpdate(HCTestParameter testParameter) {
		
		logger.info("update parameter controller called");
		
		testParameterResponse = new HCPackageResponse();
		
		try {
			
			testParameterService = new TestParameterServiceImpl();
			testParameterResponse  = testParameterService.updateTestParameter(testParameter);
			
			logger.info("update parameter controller called: : " + testParameterResponse);
			logger.info("update parameter controller called: : " + testParameter.toString());
			
		} catch (Exception e) {
			logger.info("update parameter controller called: Exception: " + e.getStackTrace());
			testParameterResponse.setResponse("Failed to update Test Parameter");
			e.printStackTrace();
		}
		return testParameterResponse;
		
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse testParameterAdd(HCTestParameter testParameter) {

		logger.info("add parameter controller called");
		testParameterResponse = new HCPackageResponse();
		
		try {
			
			testParameterService = new TestParameterServiceImpl();
			testParameterResponse = testParameterService.addTestParameter(testParameter);
			logger.info("add parameter controller called: : " + testParameterResponse);
			logger.info("add parameter controller called: Response : " + testParameter.toString());
		} catch (Exception e) {
			logger.info("add parameter controller called: Exception: " + e.getStackTrace());
			testParameterResponse.setResponse("Failed to add Test Parameter");
			e.printStackTrace();
		}
		return testParameterResponse;
	}
}
