package com.apollo.DAO;

import java.util.List;

import com.apollo.model.HospitalList;

public interface LocationDAO {
	
	public List<Object[]> getAllLocationsDAO();
	
	public List getHospitals(HospitalList hospitalList);
	
}
