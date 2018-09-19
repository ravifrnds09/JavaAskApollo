package com.apollo.DAOImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.apollo.DAO.TestDAO;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.HCTest;
import com.apollo.modelObject.TestObject;

public class TestDAOImpl implements TestDAO {
	
	private final Logger logger = Logger.getLogger(TestDAOImpl.class);
	
	SessionFactory sessionFactory = null;
	Session session = null;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getTestDAO() {
		
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		List<Object[]> paramList = null;
		try {	
			logger.info("Test list DAO called");
			Query testListQrery = session.createSQLQuery("CALL " + "hc_get_test()");
			paramList = testListQrery.list();
					
		} catch (Exception e) {
			logger.info("Test list DAO called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				 session.close();
			}
			/*if (sessionFactory != null) {
				 sessionFactory.close();
			}*/
		}
		  
		return paramList;
	}

	@Override
	public String addTestDAO(HCTest test) {
		
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		String response = null;
		
		try {
			logger.info("Test add DAO called");
			
			Query testAddQrery = session.createSQLQuery("CALL " + "hc_ins_test(?, ?, ?)");
			testAddQrery.setString(0, test.getTestName());
			testAddQrery.setString(1, test.getParamNamesString().equals("")  ? null : test.getParamNamesString());
			testAddQrery.setString(2, test.getTestDesc());
			response = (String) testAddQrery.uniqueResult();
					
			tx.commit();
		} catch (Exception e) {
			logger.info("Test add DAO called: Exception: " + e.getStackTrace());
			response = "Falied to add Test";
			session.close();
			sessionFactory.close();
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
	public String updateTestDAO(HCTest test) {

		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction tx = null;
		String response = null;
		
		try {
			logger.info("Test update DAO called");
			tx = session.beginTransaction();
			Query testUpdateQrery = session.createSQLQuery("CALL " + "hc_update_test(?, ?, ?, ?)");
			testUpdateQrery.setInteger(0, test.getTestId());
			testUpdateQrery.setString(1, test.getTestName());
			testUpdateQrery.setString(2, test.getTestDesc());
			testUpdateQrery.setString(3, test.getParamNamesString());
			response = (String) testUpdateQrery.uniqueResult();
			
			tx.commit();
		} catch (Exception e) {
			logger.info("Test update DAO called: Exception: " + e.getStackTrace());
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
	public String deleteTestDAO(HCTest test) {
		
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		String response = null;
		
		try {

			logger.info("Test delete DAO called");
			Query testDeleteQrery = session.createSQLQuery("CALL " + "hc_del_test(?)");
			testDeleteQrery.setInteger(0, test.getTestId());
			testDeleteQrery.executeUpdate();
			
			response = "Successfully deleted";
			
		} catch (Exception e) {
			logger.info("Test delete DAO called: Exception: " + e.getStackTrace());
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
	public TestObject getTest(TestObject test) {

		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		TestObject response = null;
		
		try {
			
			response = (TestObject) session.get(TestObject.class, test.getTestID());	
						
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
		
		return response;
	}
	
}
