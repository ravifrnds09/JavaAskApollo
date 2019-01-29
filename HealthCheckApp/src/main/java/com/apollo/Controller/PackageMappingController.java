package com.apollo.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.apollo.Service.PackageMappingService;
import com.apollo.ServiceImpl.PackageMappingServiceImpl;
import com.apollo.model.HCPackageMapping;
import com.apollo.model.HCPackageMappingComplete;
import com.apollo.model.HCPackageResponse;
import com.apollo.model.HCServiceMaster;

@Path("/mapping")
public class PackageMappingController {
	
	private final Logger logger = Logger.getLogger(PackageMappingController.class);
	
	PackageMappingService packageMappingService;
	

	@POST
	@Path("/completeList")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCPackageMappingComplete> fullPackageData(HCPackageMapping hcPackage) {
				
		logger.info("Package Complete List Controller Called");
		
		packageMappingService = new PackageMappingServiceImpl();
		List<HCPackageMappingComplete> packageList = new ArrayList<>();
		
		logger.info("Package Complete List Controller Called Response "+packageList);
		
		try {
			packageList = packageMappingService.getFullPackageDataService(hcPackage);
			logger.info("Package Complete List Controller Called Response "+packageList);
		} catch (Exception e) {
			logger.info("Package List Controller Called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
				
		return packageList;
	}
	
	@GET
	@Path("/serviceList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCServiceMaster> serviceMasterList() {
		List<HCServiceMaster> hcServiceList = new ArrayList<>();
		logger.info("Service Master list Controller ");
		
		try {
			
			packageMappingService = new PackageMappingServiceImpl();
			hcServiceList = packageMappingService.serviceMasterListService();
			logger.info("Package Master List Controller Called Response "+hcServiceList);
		} catch (Exception e) {
			logger.info("Service Master list Controller : Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		
		return hcServiceList;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCPackageMapping> mappingList() {
		
		List<HCPackageMapping> hcPackageMappingsList = new ArrayList<>();
		logger.info("Package Mapping list Controller");
		
		try {
			
			packageMappingService = new PackageMappingServiceImpl();
			hcPackageMappingsList = packageMappingService.mappingListService();
			logger.info("Package Mapping list Controller: list  " + hcPackageMappingsList);
			
		} catch (Exception e) {
			logger.info("Package Mapping list Controller: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		
		return hcPackageMappingsList;
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse mappingAdd(HCPackageMapping hcPackageMapping) {
		
		HCPackageResponse hcPackageResponse = new HCPackageResponse();
		logger.info("Add Package Mapping Controller Called");
		
		try {
			
			packageMappingService = new PackageMappingServiceImpl();
			hcPackageResponse = packageMappingService.mappingAddService(hcPackageMapping);
			logger.info("Add Package Mapping Controller Called: Adding Service : " + hcPackageResponse);
			logger.info("Add Package Mapping Controller Called: Adding Service : " + hcPackageMapping.toString());
		} catch (Exception e) {
			logger.info("Add Package Mapping Controller Called: Exception: " + e.getStackTrace());
			hcPackageResponse.setResponse("Failed to Add Package Mapping");
			e.printStackTrace();
		}
		return hcPackageResponse;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse mappingUpdate(HCPackageMapping hcPackageMapping) {
		
		HCPackageResponse hcPackageResponse = new HCPackageResponse();
		logger.info("Update Package Mapping Controller Called");
		
		try {
			
			packageMappingService = new PackageMappingServiceImpl();
			hcPackageResponse = packageMappingService.mappingUpdateService(hcPackageMapping);
			logger.info("Update Package Mapping Controller Called: Update Mapping: " + hcPackageResponse);
		} catch (Exception e) {
			logger.info("Update Package Mapping Controller Called: Exception: " + e.getStackTrace());
			hcPackageResponse.setResponse("Failed to Update Package Mapping");
			e.printStackTrace();
		}
		return hcPackageResponse;
	}
	
	@POST
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse mappingDelete(HCPackageMapping hcPackageMapping) {
		
		HCPackageResponse hcPackageResponse = new HCPackageResponse();
		logger.info("Delete Package Mapping Controller Called");
		
		try {
			
			packageMappingService = new PackageMappingServiceImpl();
			hcPackageResponse = packageMappingService.mappingDeleteService(hcPackageMapping);
			logger.info("Delete Package Mapping Delete Controller Called: : " + hcPackageResponse);
			logger.info("Delete Package Mapping Delete Controller Called "+hcPackageMapping.toString());
			
		} catch (Exception e) {
			logger.info("Delete Package Mapping Controller Called: Exception: " + e.getStackTrace());
			hcPackageResponse.setResponse("Failed to delete Package Mapping");
			e.printStackTrace();
		}
		return hcPackageResponse;
	}
	
	@GET
	@Path("/serviceListSearch")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCServiceMaster> serviceMasterListSearch(@QueryParam("search") String PackageName) {
		
		List<HCServiceMaster> hcServiceList = new ArrayList<>();
		logger.info("Service Master list Controller Search: PackageName: " + PackageName);
		try {
						
			packageMappingService = new PackageMappingServiceImpl();
			hcServiceList = packageMappingService.serviceMasterListSearchService(PackageName);
			logger.info("Service Master list Controller Search: : " + hcServiceList);
			logger.info("Service Master list Controller Search: : " + PackageName.toString());
		} catch (Exception e) {
			logger.info("Service Master list Controller Search: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		
		return hcServiceList;
	}
	
	@POST
	@Path("/serviceListByLocationId")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCServiceMaster> getServiceMasterListByLocationID(HCServiceMaster hcServiceMaster) {
		
		List<HCServiceMaster> hcServiceList = new ArrayList<>();
		logger.info("Service Master list Controller Location: Location Id: " + hcServiceMaster.getLocationId());
		try {
						
			packageMappingService = new PackageMappingServiceImpl();
			hcServiceList = packageMappingService.getServiceMasterByLocationId(hcServiceMaster);
			
			logger.info("Service Master list Controller serviceListByLocationId is called : " +hcServiceList);
			logger.info("Service Master list Controller serviceListByLocationId is called : " +hcServiceMaster.toString());
		} catch (Exception e) {
			logger.info("Service Master list Controller Search: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		
		return hcServiceList;
	}
	
	@POST
	@Path("/savePackageMappingByPackageIdAndLocationId")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<HCServiceMaster> savePackageMappingByPackageIdAndLocationId(HCServiceMaster hcServiceMaster) {
		
		List<HCServiceMaster> hcServiceList = new ArrayList<>();
		logger.info("Service Master list Controller Location: Location Id: " + hcServiceMaster.getLocationId());
		try {
						
			packageMappingService = new PackageMappingServiceImpl();
			hcServiceList = packageMappingService.getServiceMasterByLocationId(hcServiceMaster);
			logger.info("Service Master list Controller savePackageMappingByPackageIdAndLocationId Search: : " + hcServiceList);
			logger.info("Service Master list Controller savePackageMappingByPackageIdAndLocationId Search: : " + hcServiceMaster.toString());
		} catch (Exception e) {
			logger.info("Service Master list Controller Search: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		
		return hcServiceList;
	}
	
}
