package com.apollo.Service;

import java.util.List;

import com.apollo.model.HCPackageMapping;
import com.apollo.model.HCPackageMappingComplete;
import com.apollo.model.HCPackageResponse;
import com.apollo.model.HCServiceMaster;

public interface PackageMappingService {
	
	public List<HCPackageMappingComplete> getFullPackageDataService(HCPackageMapping hcPackage);
	
	public List<HCServiceMaster> serviceMasterListService();
	
	public List<HCPackageMapping> mappingListService();
	
    public HCPackageResponse mappingAddService(HCPackageMapping hcPackageMapping);
    
    public HCPackageResponse mappingUpdateService(HCPackageMapping hcPackageMapping);
    
    public HCPackageResponse mappingDeleteService(HCPackageMapping hcPackageMapping);
    
    public List<HCServiceMaster> serviceMasterListSearchService(String searchName);
    
    public List<HCServiceMaster> getServiceMasterByLocationId(HCServiceMaster hcServiceMaster);
}
