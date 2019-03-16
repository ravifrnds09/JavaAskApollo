package com.apollo.Service;

import com.apollo.model.PackageList;
import com.apollo.model.PackageListV2;
import com.apollo.model.PackageListV3;
import com.apollo.model.TestParameterDesc;

public interface PackageListService {
	public String RegisterPackges(PackageList test);
	public String getTestParameter(TestParameterDesc desc);
	public String getPackges(PackageListV2 packageList);
	public String getActualNames(PackageListV3 packageListV3);
	

}
