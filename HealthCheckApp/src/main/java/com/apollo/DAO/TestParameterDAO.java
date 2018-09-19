package com.apollo.DAO;

import java.util.List;

import com.apollo.model.HCTestParameter;

public interface TestParameterDAO {
	
	public List<Object[]> testParamList();
	
	public String addTestParameterDAO(HCTestParameter testParameter);
	
	public String updateTestParameterDAO(HCTestParameter testParameter);
	
	public String deleteTestParameterDAO(HCTestParameter testParameter);
	
}
