package com.apollo.DAO;

import java.util.List;

import com.apollo.model.HCTest;
import com.apollo.modelObject.TestObject;

public interface TestDAO {
	
	public List<Object[]> getTestDAO();
	
	public String addTestDAO(HCTest test);
	
	public String updateTestDAO(HCTest test);
	
	public String deleteTestDAO(HCTest test);
	
	public TestObject getTest(TestObject test);
		
}
