package com.apollo.DAO;

import java.util.List;

import com.apollo.model.PackageList;
import com.apollo.model.PackageListV2;
import com.apollo.model.TestParameterDesc;

public interface PackageListDAO {
	public List SavePackages(PackageList pack);

	public List getTestParameter(TestParameterDesc desc);
	
	public List getPackages(PackageListV2 packageList);

}
