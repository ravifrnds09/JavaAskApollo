package com.apollo.ServiceImpl;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.apollo.DAO.PackageMappingDAO;
import com.apollo.DAOImpl.PackageMappingDAOImpl;
import com.apollo.Service.PackageMappingService;
import com.apollo.model.HCPackageMapping;
import com.apollo.model.HCPackageMappingComplete;
import com.apollo.model.HCPackageResponse;
import com.apollo.model.HCServiceMaster;

public class PackageMappingServiceImpl implements PackageMappingService{
	
	private final Logger logger = Logger.getLogger(PackageMappingServiceImpl.class);
	
	PackageMappingDAO packageMappingDAO;
	HCPackageResponse hcPackageResponse;
	
	@Override
	public List<HCPackageMappingComplete> getFullPackageDataService(HCPackageMapping hcPackage) {
		
		logger.info("Package Complete List Service Called");
		List<HCPackageMappingComplete> completeResponseList = new ArrayList<>();
		
		try {
			packageMappingDAO = new PackageMappingDAOImpl();
			HCPackageMappingComplete hcPackageMappingComplete;
			
			List<Object[]> completeList = packageMappingDAO.getFullPackageData(hcPackage);
			
			for (Object[] objects : completeList) {
				hcPackageMappingComplete = new HCPackageMappingComplete();
				
				hcPackageMappingComplete.setServiceId((BigInteger) objects[0]);
				hcPackageMappingComplete.setServiceName((String) objects[1] != null ? (String) objects[1] : "");
				hcPackageMappingComplete.setLocationName((String) objects[3] != null ? (String) objects[3] : "");
				hcPackageMappingComplete.setTestInclusions((String) objects[4] != null ? (String) objects[4] : "");
				hcPackageMappingComplete.setPrice((BigInteger) objects[5] != null ? (BigInteger) objects[5] : BigInteger.ZERO);
				
				completeResponseList.add(hcPackageMappingComplete);
			}
			
		} catch (Exception e) {

			logger.info("Package Complete List Service Called: Exception: " + e);
			e.printStackTrace();
		}
		return completeResponseList;
	}

	@Override
	public List<HCServiceMaster> serviceMasterListService() {
		
		List<HCServiceMaster> hcServiceMasterList = new ArrayList<>();
		List<Object[]> hcObjects;
		HCServiceMaster hcServiceMaster;
		packageMappingDAO = new PackageMappingDAOImpl();
		
		try {
			logger.info("Service Master list Service");
			
			hcObjects = packageMappingDAO.serviceMasterListDAO();
			for (Object[] object : hcObjects) {
				
				hcServiceMaster = new HCServiceMaster();
				
				hcServiceMaster.setServiceId((BigInteger) object[0]);
				//hcServiceMaster.setServiceCode((String) object[1]);
				hcServiceMaster.setServiceName((String) object[2]);
				//hcServiceMaster.setLocationId((String) object[3]);
				
				hcServiceMasterList.add(hcServiceMaster);
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return hcServiceMasterList;
	}
	
	@Override
	public List<HCPackageMapping> mappingListService() {
		
		List<HCPackageMapping> hcPackageMappingsList = new ArrayList<>();
		List<Object[]> hcObjects;
		HCPackageMapping hcPackageMapping;
		
		packageMappingDAO = new PackageMappingDAOImpl();
		
		try {
			
			hcObjects = packageMappingDAO.mappingListDAO();
			
			for (Object[] object : hcObjects) {
				
				hcPackageMapping = new HCPackageMapping();
				
				hcPackageMapping.setPackageId((int) object[0]);
				hcPackageMapping.setPackageName((String) object[1]==null ? "":(String) object[1]);
				hcPackageMapping.setServiceNamesString((String) object[2]);		
				hcPackageMapping.setSubPackagesString((String) object[3]);
				hcPackageMapping.setLocationId((Integer) object[4]);
				hcPackageMapping.setLocationName((String) object[5]);
				
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm");
				String requiredDate = df.format(object[6]);
				hcPackageMapping.setCreatedDate(requiredDate);
								
				hcPackageMappingsList.add(hcPackageMapping);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return hcPackageMappingsList;
	}

	@Override
	public HCPackageResponse mappingAddService(HCPackageMapping hcPackageMapping) {
		
		hcPackageResponse = new HCPackageResponse();
		
		try {
			
			packageMappingDAO = new PackageMappingDAOImpl();
			String response = (String) packageMappingDAO.mappingAddDAO(hcPackageMapping);
			hcPackageResponse.setResponse(response);
			
		} catch (Exception e) {
			hcPackageResponse.setResponse("Failed to Add Package Mapping");
			e.printStackTrace();
		}
		return hcPackageResponse;
	}

	@Override
	public HCPackageResponse mappingUpdateService(HCPackageMapping hcPackageMapping) {
		
		hcPackageResponse = new HCPackageResponse();
		
		try {
			
			packageMappingDAO = new PackageMappingDAOImpl();
			String response = (String) packageMappingDAO.mappingUpdateDAO(hcPackageMapping);
			hcPackageResponse.setResponse(response);
			
		} catch (Exception e) {
			hcPackageResponse.setResponse("Failed to Update Package Mapping");
			e.printStackTrace();
		}
		return hcPackageResponse;
	}

	@Override
	public HCPackageResponse mappingDeleteService(HCPackageMapping hcPackageMapping) {
		
		hcPackageResponse = new HCPackageResponse();
		
		try {
			
			packageMappingDAO = new PackageMappingDAOImpl();
			String response = (String) packageMappingDAO.mappingDeleteDAO(hcPackageMapping);
			hcPackageResponse.setResponse(response);
			
		} catch (Exception e) {
			hcPackageResponse.setResponse("Failed to delete Package Mapping");
			e.printStackTrace();
		}
		return hcPackageResponse;
	}
	
	@Override
	public List<HCServiceMaster> serviceMasterListSearchService(String searchName) {
		
		List<HCServiceMaster> hcServiceMasterList = new ArrayList<>();
		List<Object[]> hcObjects;
		HCServiceMaster hcServiceMaster;
		packageMappingDAO = new PackageMappingDAOImpl();
		
		try {
			logger.info("Service Master list Service");
			
			hcObjects = packageMappingDAO.serviceMasterSearchListDAO(searchName);
			for (Object[] object : hcObjects) {
				
				hcServiceMaster = new HCServiceMaster();
				
				hcServiceMaster.setServiceId((BigInteger) object[0]);
				hcServiceMaster.setServiceName((String) object[2]);
				
				hcServiceMasterList.add(hcServiceMaster);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hcServiceMasterList;
	}

	@Override
	public List<HCServiceMaster> getServiceMasterByLocationId(HCServiceMaster hcServiceMaster) {
		logger.info("Service Master list by Location ID Service");
		
		List<HCServiceMaster> hcServiceMasterList = new ArrayList<>();
		HCServiceMaster hcService;
		
		try {
			packageMappingDAO = new PackageMappingDAOImpl();
			List<Object[]> responseObject = packageMappingDAO.getServiceMasterByLocationID(hcServiceMaster);
			
			for (Object[] object : responseObject) {
				hcService = new HCServiceMaster();
				
				hcService.setServiceId((BigInteger) object[0]);
				hcService.setServiceCode((String) object[1] != null ? (String) object[1] : "");
				hcService.setServiceName((String) object[2] != null ? (String) object[2] : "");
				hcServiceMasterList.add(hcService);
			}
			
		} catch(Exception e) {
			logger.info("Service Master list by Location ID Service: Exception: " + e);
			e.printStackTrace();
		}
		
		return hcServiceMasterList;
	}
	
}
