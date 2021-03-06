package com.apollo.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.apollo.DAO.LocationDAO;
import com.apollo.Util.HibernateUtil;

public class LocationDAOImpl implements LocationDAO{
	
	private final Logger logger = Logger.getLogger(LocationDAOImpl.class);
	private SessionFactory sessionFactory;
	private Session session;
	
	@Override
	public List<Object[]> getAllLocationsDAO() {
		logger.info("Get All Medmantra Locations DAO");
		
		List<Object[]> getLocationResponse = new ArrayList<>();
		
		try {
			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			
			Query getLocationDetails = session.createSQLQuery("CALL " + "hc_get_location()");
			getLocationResponse = getLocationDetails.list();
			
		} catch(Exception e) {
			logger.info("Get All Medmantra Locations DAO: Exception: " + e);
			e.printStackTrace();
		}
		
		return getLocationResponse;
	}
	
	
	
}
