package com.apollo.Service;

import java.util.List;

import com.apollo.model.HCPackageResponse;
import com.apollo.model.HCTest;
import com.apollo.modelObject.TestObject;

public interface TestService {
	
	public List<HCTest> getTestList();
	
	public HCPackageResponse addTest(HCTest test);
	
	public HCPackageResponse updateTest(HCTest test);
	
	public HCPackageResponse deleteTest(HCTest test);
	
	public TestObject getTest(TestObject test);
	
}
