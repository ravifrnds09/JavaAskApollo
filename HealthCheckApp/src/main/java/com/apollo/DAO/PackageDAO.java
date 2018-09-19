package com.apollo.DAO;

import java.util.List;

import com.apollo.model.HCPackage;
import com.apollo.modelObject.PackageObject;

public interface PackageDAO {
	
	public List<Object[]> getPackageListDAO();
	
	public String addPackageDAO(HCPackage packag);
	
	public String updatePackageDAO(HCPackage packag);
	
	public String deletePackageDAO(HCPackage packag);
	
	public PackageObject getPackageDAO(PackageObject packag);
	
	public List<Object[]> getPackageDetailsByPackageAndAgeAndLocationAndGender(HCPackage hcPackage);
	
}
