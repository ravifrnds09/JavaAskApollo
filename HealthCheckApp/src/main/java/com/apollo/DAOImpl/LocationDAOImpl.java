package com.apollo.DAOImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.apollo.DAO.LocationDAO;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.HospitalList;

public class LocationDAOImpl implements LocationDAO {

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
			logger.info("Get All Medmantra Locations DAO Response is  " + getLocationResponse);

		} catch (Exception e) {
			logger.info("Get All Medmantra Locations DAO: Exception: " + e);
			e.printStackTrace();
		}

		return getLocationResponse;
	}

	@Override
	public List GetHospitals(HospitalList cityId) {
		logger.info("Get Packages DAO");
		List result = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			Query PackageQuery = session.createSQLQuery("CALL " + "hc_get_hospitals_list(?)");
			PackageQuery.setString(0, cityId.getCityId());
			result = PackageQuery.list();
			logger.info("Hospital List DAO called List  " + result);
		} catch (Exception e) {
			logger.info("Hospital List DAO called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			/*
			 * if (sessionFactory != null) { sessionFactory.close(); }
			 */
		}
		return result;
	}

}
