package com.apollo.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.apollo.Service.PackageListService;
import com.apollo.ServiceImpl.PackageListServiceImpl;
import com.apollo.model.PackageList;
import com.apollo.model.PackageListV2;
import com.apollo.model.TestParameterDesc;

@Path("/package")
public class PackageListController {
	private static Logger logger = Logger.getLogger(PackageListController.class);
	private PackageListService service;

	@POST
	@Path("/list")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String PackageDetails(PackageList test) {

		logger.info("packageTest Controller");
		service = new PackageListServiceImpl();
		return service.RegisterPackges(test);
	}

	@POST
	@Path("/listV2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getPackageDetails(PackageListV2 packageList) {
		String response = "fail";
		logger.info("Package ListV2   Controller is called");
		try {
			service = new PackageListServiceImpl();
			response = service.getPackges(packageList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@POST
	@Path("/getTestParameter")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getTestParameter(TestParameterDesc testParameterDesc) {
		String response = null;
		logger.info("TestParameter Discription  Controller is called");
		try {
			service = new PackageListServiceImpl();
			response = service.getTestParameter(testParameterDesc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	@POST
	@Path("/listV3")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getTestActualName(PackageListV2 packageList) {
		String response = "fail";
		logger.info("Package ListV2   Controller is called");
		try {
			service = new PackageListServiceImpl();
			response = service.getActualNames(packageList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

}
