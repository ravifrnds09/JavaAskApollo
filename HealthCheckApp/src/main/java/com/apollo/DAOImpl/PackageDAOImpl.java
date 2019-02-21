package com.apollo.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.apollo.DAO.PackageDAO;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.HCPackage;
import com.apollo.modelObject.PackageObject;

public class PackageDAOImpl implements PackageDAO {
	
	private final Logger logger = Logger.getLogger(PackageDAOImpl.class);
	
	SessionFactory sessionFactory = null;
	Session session = null;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getPackageListDAO() {
		
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		List<Object[]> packageList = null;
		
		try {
			logger.info("Package List DAO Called");
			
			Query packageListQrery = session.createSQLQuery("CALL " + "hc_get_package()");
			packageList = packageListQrery.list();
		
		} catch (Exception e) {
			logger.info("Package List DAO Called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				 session.close();
			}
			/*if (sessionFactory != null) {
				 sessionFactory.close();
			}*/
		}
		  
		return packageList;
	}

	@Override
	public String addPackageDAO(HCPackage packag) {
		
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction tx = null;
		String response = null;
		
		try {
			logger.info("Package add DAO called");
			tx = session.beginTransaction();
			
			Query packageAddQuery = session.createSQLQuery("CALL " + "hc_ins_package(?, ?, ?, ?, ?, ?, ?, ? ,?,?,?)");
			packageAddQuery.setString(0, packag.getPackageName());
			packageAddQuery.setString(1, packag.getFrequency());
			packageAddQuery.setString(2, packag.getAgeGroup());
			packageAddQuery.setString(3, packag.getDescription());
			packageAddQuery.setString(4, packag.getRecommendedFor());
			packageAddQuery.setString(5, packag.getTestNamesString() == "" ? null : packag.getTestNamesString());
			packageAddQuery.setString(6, packag.getGender());
			packageAddQuery.setString(7, packag.getBodyPart());
			packageAddQuery.setString(8, packag.getClinicalCondi());
			packageAddQuery.setString(9, packag.getFromAge());
			packageAddQuery.setString(10, packag.getToAge());
			response = (String) packageAddQuery.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			logger.info("Package add DAO called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				 session.close();
			}
			/*if (sessionFactory != null) {
				 sessionFactory.close();
			}*/
		}
		return response;
	}

	@Override
	public String updatePackageDAO(HCPackage packag) {
		
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		String response = null;
		Transaction tx = null;
		
		try {
			logger.info("Package update DAO called");
			tx = session.beginTransaction();
			
			Query packageUpdateQuery = session.createSQLQuery("CALL " + "hc_update_package(?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)");
			packageUpdateQuery.setInteger(0, packag.getPackageId());
			packageUpdateQuery.setString(1, packag.getPackageName());
			packageUpdateQuery.setString(2, packag.getFrequency());
			packageUpdateQuery.setString(3, packag.getAgeGroup());
			packageUpdateQuery.setString(4, packag.getDescription());
			packageUpdateQuery.setString(5, packag.getRecommendedFor());
			packageUpdateQuery.setString(6, packag.getTestNamesString());
			packageUpdateQuery.setString(7, packag.getGender());
			packageUpdateQuery.setString(8, packag.getBodyPart());
			packageUpdateQuery.setString(9, packag.getClinicalCondi());
			packageUpdateQuery.setString(10, packag.getFromAge());
			packageUpdateQuery.setString(11, packag.getToAge());
			response = (String) packageUpdateQuery.uniqueResult();
			tx.commit();
			
		} catch (Exception e) {
			logger.info("Package update DAO called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				 session.close();
			}
			/*if (sessionFactory != null) {
				 sessionFactory.close();
			}*/
		}
		return response;
	}

	@Override
	public String deletePackageDAO(HCPackage packag) {
		
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		String response = null;
		Transaction tx = null;
		
		try {
			logger.info("Package delete DAO called");
			
			tx = session.beginTransaction();
			
			Query packageDeleteQuery = session.createSQLQuery("CALL " + "hc_del_package(?)");
			packageDeleteQuery.setInteger(0, packag.getPackageId());
			packageDeleteQuery.executeUpdate();		
			response = "Successfully deleted Package";
			
			tx.commit();
			
		} catch (Exception e) {
			logger.info("Package delete DAO called: Exception: " + e.getStackTrace());
			response = "Failed to delete Package";
			e.printStackTrace();
		} finally {
			if (session != null) {
				 session.close();
			}
			/*if (sessionFactory != null) {
				 sessionFactory.close();
			}*/
		}
		return response;
		
	}

	@Override
	public PackageObject getPackageDAO(PackageObject packag) {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		PackageObject packageResponse = null;
		
		try {
			
			packageResponse = (PackageObject) session.get(PackageObject.class, packag.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				 session.close();
			}
			/*if (sessionFactory != null) {
				 sessionFactory.close();
			}*/
		}
		
		return packageResponse;
	}

	@Override
	public List<Object[]> getPackageDetailsByPackageAndAgeAndLocationAndGender(HCPackage hcPackage) {
		
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction tx = null;
		List<Object[]> response = new ArrayList<>();
		
		try {
			
			logger.info("getPackageDetailsByPackageAndAgeAndLocationAndGender DAO called");
			tx = session.beginTransaction();
			
			Query packageAddQuery = session.createSQLQuery("CALL " + "hc_get_Medmantra_Package_Price(?, ?, ?, ?)");
			packageAddQuery.setInteger(0, hcPackage.getPackageId());
			packageAddQuery.setInteger(1, hcPackage.getLocationId());
			packageAddQuery.setInteger(2, hcPackage.getAgeId());
			packageAddQuery.setInteger(3, hcPackage.getGenderId());
			response = packageAddQuery.list();
			tx.commit();
			
		} catch (Exception e) {
			logger.error("getPackageDetailsByPackageAndAgeAndLocationAndGender DAO called: Exception: " + e);
			e.printStackTrace();
		} finally {
			if (session != null) {
				 session.close();
			}
		}
		return response;		
	}

}
