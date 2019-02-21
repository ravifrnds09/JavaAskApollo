package com.apollo.Service;

import java.util.List;

import org.json.JSONObject;

import com.apollo.model.PackageList;
import com.apollo.model.PackageListV2;
import com.apollo.model.TestParameterDesc;

public interface PackageListService {
	public String RegisterPackges(PackageList test);
	public String getTestParameter(TestParameterDesc desc);
	public String getPackges(PackageListV2 packageList);

}
