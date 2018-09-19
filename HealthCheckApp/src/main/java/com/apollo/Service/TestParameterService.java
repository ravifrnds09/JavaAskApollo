package com.apollo.Service;

import java.util.List;

import com.apollo.model.HCPackageResponse;
import com.apollo.model.HCTestParameter;

public interface TestParameterService {
	
	public List<HCTestParameter> testParamList();
		
	public HCPackageResponse addTestParameter(HCTestParameter testParameter);
	
	public HCPackageResponse updateTestParameter(HCTestParameter testParameter);
	
	public HCPackageResponse deleteTestParameter(HCTestParameter testParameter);
	
}
