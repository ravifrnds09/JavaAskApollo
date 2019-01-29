package com.apollo.Service;

import java.util.List;

import com.apollo.model.HospitalList;
import com.apollo.model.LocationResponse;

public interface LocationService {
	
	public List<LocationResponse> getAllLocationService();
	public String GetHospitals(HospitalList cityId);
}
