package com.apollo.DAO;

import java.util.List;

import com.apollo.model.HCPackageMapping;
import com.apollo.model.HCServiceMaster;

public interface PackageMappingDAO {

	public List<Object[]> getFullPackageData(HCPackageMapping hcPackage);
	
	public List<Object[]> serviceMasterListDAO();
	
	public List<Object[]> mappingListDAO();
	
    public Object mappingAddDAO(HCPackageMapping hcPackageMapping);
    
    public Object mappingUpdateDAO(HCPackageMapping hcPackageMapping);
    
    public Object mappingDeleteDAO(HCPackageMapping hcPackageMapping);
    
    public List<Object[]> serviceMasterSearchListDAO(String searchName);
    
    public List<Object[]> getServiceMasterByLocationID(HCServiceMaster hcServiceMaster);
	
}
