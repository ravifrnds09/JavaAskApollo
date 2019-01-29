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

import com.apollo.Service.PackageService;
import com.apollo.ServiceImpl.PackageServiceImpl;
import com.apollo.model.HCPackage;
import com.apollo.model.HCPackageMappingComplete;
import com.apollo.model.HCPackageResponse;
import com.apollo.modelObject.PackageObject;

@Path("/package")
public class PackageController {
	
	private final Logger logger = Logger.getLogger(PackageController.class);
	
	PackageService packageService;
	HCPackageResponse hcPackageResponse;
		
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCPackage> packageList() {
		
		logger.info("Package List Controller Called");
		
		packageService = new PackageServiceImpl();
		List<HCPackage> packageList = new ArrayList<>();
		
		try {
			packageList = packageService.getPackageService();
			logger.info("Package List Controller Called: Response : " + packageList);
		} catch (Exception e) {
			logger.info("Package List Controller Called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
				
		return packageList;
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public HCPackageResponse addPackage(HCPackage packag) {
		
		logger.info("Package add controller called");
		hcPackageResponse = new HCPackageResponse();
		
		try {
			
			packageService = new PackageServiceImpl();
			packageService.addPackage(packag);
			logger.info("Package List Controller Called: Response : "+packag.toString()+" "+packageService.addPackage(packag));
		} catch(Exception e) {
			logger.info("Package add controller called: Exception: " + e.getStackTrace());
			hcPackageResponse.setResponse("Falied to add Package");
		}
		
		return hcPackageResponse;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public HCPackageResponse updatePackage(HCPackage packag) {
		
		logger.info("Package update controller called");
		hcPackageResponse = new HCPackageResponse();
		
		try {

			packageService = new PackageServiceImpl();
			packageService.updatePackage(packag);
			
			logger.info("Package update controller called: " + packag.toString()+" "+hcPackageResponse.toString());
			
		} catch(Exception e) {
			logger.info("Package update controller called: Exception: " + e.getStackTrace());
			hcPackageResponse.setResponse("Falied to update Package");
		}
		
		return hcPackageResponse;
	}
	
	@POST
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	public HCPackageResponse deletePackage(HCPackage packag) {
				
		logger.info("Package delete controller called");
		hcPackageResponse = new HCPackageResponse();
		
		try {
			
			packageService = new PackageServiceImpl();
			hcPackageResponse = packageService.deletePackage(packag);
			logger.info("Package delete controller called: " + packag.toString()+" "+hcPackageResponse.toString());
		} catch(Exception e) {
			logger.info("Package delete controller called: Exception: " + e.getStackTrace());
			hcPackageResponse.setResponse("Falied to delete Package");
		}
		
		return hcPackageResponse;
				
	}	
	
	@POST
	@Path("/get")
	@Consumes(MediaType.APPLICATION_JSON)
	public void getPackage(PackageObject packag) {
				
		packageService = new PackageServiceImpl();
		packageService.getPackage(packag);
		
	}
	
	@POST
	@Path("/getPackageDetailsByPackageAndAgeAndLocationAndGender")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCPackageMappingComplete> getPackageDetailsByPackageAndAgeAndLocationAndGender(HCPackage packageObject) {
				
		logger.info("Package details by Service Id, Age, Location and Gender controller called");
		List<HCPackageMappingComplete> response = new ArrayList<>();
		try {
			
			packageService = new PackageServiceImpl();
			response = packageService.getPackageDetailsByPackageAndAgeAndLocationAndGender(packageObject);
			
		} catch(Exception e) {
			logger.info("Package details by Service Id, Age, Location and Gender controller called: Exception: " + e.getStackTrace());
		}
		
		return response;
	}	
	
}
