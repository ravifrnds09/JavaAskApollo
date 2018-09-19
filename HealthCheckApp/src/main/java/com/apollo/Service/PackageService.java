package com.apollo.Service;

import java.util.List;

import com.apollo.model.HCPackage;
import com.apollo.model.HCPackageMappingComplete;
import com.apollo.model.HCPackageResponse;
import com.apollo.modelObject.PackageObject;

public interface PackageService {
		
	public List<HCPackage> getPackageService();
	
	public HCPackageResponse addPackage(HCPackage packag);
	
	public HCPackageResponse updatePackage(HCPackage packag);
	
	public HCPackageResponse deletePackage(HCPackage packag);
	
	public PackageObject getPackage(PackageObject packag);
	
	public List<HCPackageMappingComplete> getPackageDetailsByPackageAndAgeAndLocationAndGender(HCPackage hcPackage);
	
}
