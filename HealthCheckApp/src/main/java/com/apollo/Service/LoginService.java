package com.apollo.Service;

import com.apollo.model.HCPackageResponse;
import com.apollo.model.Login;

public interface LoginService {
	
	public HCPackageResponse checkUserService(Login login);
	
}
