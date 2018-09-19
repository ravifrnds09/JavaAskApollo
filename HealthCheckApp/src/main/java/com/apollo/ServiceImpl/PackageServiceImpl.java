package com.apollo.ServiceImpl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.apollo.DAO.PackageDAO;
import com.apollo.DAOImpl.PackageDAOImpl;
import com.apollo.Service.PackageService;
import com.apollo.model.HCPackage;
import com.apollo.model.HCPackageMappingComplete;
import com.apollo.model.HCPackageResponse;
import com.apollo.modelObject.PackageObject;

public class PackageServiceImpl implements PackageService{
	
	private final Logger logger = Logger.getLogger(PackageServiceImpl.class);
	
	PackageDAO packageDAO;
	HCPackageResponse packageResponse;
	
	@Override
	public List<HCPackage> getPackageService() {
		
		packageDAO = new PackageDAOImpl();
		
		ArrayList<HCPackage> packageList = new ArrayList<>();
		HCPackage hcPackage;
		
		try {
			logger.info("Package List Service Called");
			
			List<Object[]> packageListResponse = packageDAO.getPackageListDAO();
			
			for (Object[] packag : packageListResponse) {
				
				hcPackage = new HCPackage();
				hcPackage.setPackageId((int) packag[0]);
				hcPackage.setPackageName(packag[1]  == null ? "" : (String) packag[1]);
				hcPackage.setTestNamesString(packag[6]  == null ? "" : (String) packag[6]);
				hcPackage.setFrequency(packag[2]  == null ? "" : (String) packag[2]);
				hcPackage.setAgeGroup(packag[3]  == null ? "" : (String) packag[3]);
				hcPackage.setDescription(packag[4]  == null ? "" : (String) packag[4]);
				hcPackage.setRecommendedFor(packag[5]  == null ? "" : (String) packag[5]);
				hcPackage.setGender(packag[7]  == null ? "" : (String) packag[7]);
				hcPackage.setBodyPart(packag[8]  == null ? "" : (String) packag[8]);
				hcPackage.setClinicalCondi(packag[9]  == null ? "" : (String) packag[9]);
				packageList.add(hcPackage);
			}
			
		} catch(Exception e) {
			logger.info("Package List Service Called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		}
		return packageList;
	}

	@Override
	public HCPackageResponse addPackage(HCPackage packag) {
		
		packageDAO = new PackageDAOImpl();
		packageResponse = new HCPackageResponse();
		String response;
		
		try {
			logger.info("Package add Service called");
			
			response = packageDAO.addPackageDAO(packag);
			
			if (response == null) {
				packageResponse.setResponse("Failed to add package");
			} else {
				packageResponse.setResponse(response);
			}
			
		} catch (Exception e) {
			logger.info("Package add Service called: Exception: " + e.getStackTrace());
			packageResponse.setResponse("Failed to add package");
			e.printStackTrace();
		}
		
		return packageResponse;
	}

	@Override
	public HCPackageResponse updatePackage(HCPackage packag) {
		
		packageDAO = new PackageDAOImpl();
		packageResponse = new HCPackageResponse();
		String response;
		
		try {
			
			logger.info("Package update Service called");
			
			response = packageDAO.updatePackageDAO(packag);
			if (response == null) {
				packageResponse.setResponse("Failed to update package");
			} else {
				packageResponse.setResponse(response);
			}
			
		} catch (Exception e) {
			logger.info("Package update Service called: Exception: " + e.getStackTrace());
			packageResponse.setResponse("Failed to delete package");
			e.printStackTrace();
		}
		return packageResponse;
	}

	@Override
	public HCPackageResponse deletePackage(HCPackage packag) {
		
		packageDAO = new PackageDAOImpl();
		packageResponse = new HCPackageResponse();
		String response;
		
		try {
			
			logger.info("Package delete Service called");
			response = packageDAO.deletePackageDAO(packag);
			if (response == null) {
					packageResponse.setResponse("Failed to delete package");
			} else {
				packageResponse.setResponse(response);
			}
			
		} catch (Exception e) {
			logger.info("Package delete Service called: Exception: " + e.getStackTrace());
			packageResponse.setResponse("Failed to delete package");
			e.printStackTrace();
		}
		return packageResponse;
	}

	@Override
	public PackageObject getPackage(PackageObject packag) {
		
		packageDAO = new PackageDAOImpl();
		packageResponse = new HCPackageResponse();
		
		packageDAO.getPackageDAO(packag);
		
		return null;
	}

	@Override
	public List<HCPackageMappingComplete> getPackageDetailsByPackageAndAgeAndLocationAndGender(HCPackage hcPackage) {
		
		packageDAO = new PackageDAOImpl();
		
		List<HCPackageMappingComplete> completeList = new ArrayList<>();
		
		List<Object[]> response = packageDAO.getPackageDetailsByPackageAndAgeAndLocationAndGender(hcPackage);
		
		for (Object[] object : response) {
			
			HCPackageMappingComplete hcPackageMappingComplete = new HCPackageMappingComplete();
			hcPackageMappingComplete.setServiceId((BigInteger) object[0] != null ? (BigInteger) object[0] : BigInteger.ZERO);
			hcPackageMappingComplete.setServiceName((String) object[1] != null ? (String) object[1] : "");
			hcPackageMappingComplete.setPrice((BigInteger) object[2] != null ? (BigInteger) object[2] : BigInteger.ZERO);
			
			completeList.add(hcPackageMappingComplete);
		}
		
		return completeList;
		
	}

}
