package com.apollo.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.apollo.Service.TestService;
import com.apollo.ServiceImpl.TestServiceImpl;
import com.apollo.model.HCPackageResponse;
import com.apollo.model.HCTest;

@Path("/test")
public class TestController {
	
	private final Logger logger = Logger.getLogger(TestController.class);
	
	TestService testService;
	HCPackageResponse hcPackageResponse;
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCTest> testList() {
		
		logger.info("Test list controller called");
		List<HCTest> testList = new ArrayList<>();
		
		try {
		
			testService = new TestServiceImpl();
			testList = testService.getTestList();
			
		} catch (Exception e) {
			logger.info("Test list controller called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		
		return testList;
	}

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse addList(HCTest test) {
		
		logger.info("Test add controller called");
		hcPackageResponse = new HCPackageResponse();
		
		try {
			
			testService = new TestServiceImpl();
			hcPackageResponse = testService.addTest(test);
			
		} catch(Exception e) {
			logger.info("Test add controller called: Exception: " + e.getStackTrace());
			hcPackageResponse.setResponse("Falied to add Test");
		}
		return hcPackageResponse;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse updateTest(HCTest test) {
		
		logger.info("Test update controller called");
		
		hcPackageResponse = new HCPackageResponse();
		
		try {
		
			testService = new TestServiceImpl();
			testService.updateTest(test);
		
		} catch(Exception e) {
			logger.info("Test update controller called: Exception: " + e.getStackTrace());
			hcPackageResponse.setResponse("Falied to update Test");
		}
		return hcPackageResponse;
	}
	
	@POST
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse deleteTest(HCTest test) {
		
		logger.info("Test delete controller called");
		
		hcPackageResponse = new HCPackageResponse();
		
		try {	
			testService = new TestServiceImpl();
			testService.deleteTest(test);
			
		} catch(Exception e) {
			logger.info("Test delete controller called: Exception: " + e.getStackTrace());
			hcPackageResponse.setResponse("Falied to delete Test");
		}
		return hcPackageResponse;
		
	}
	
	
}
