package com.apollo.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.apollo.DAO.TestParameterDAO;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.HCTestParameter;

public class TestParameterDAOImpl implements TestParameterDAO {
	
	private final Logger logger = Logger.getLogger(TestParameterDAOImpl.class);
	private SessionFactory sessionFactory;
	private Session session;
	
	
	@Override
	public List<Object[]> testParamList() {
		
		logger.info("Test Parameter DAOImpl");
		
		List<Object[]> paramList = new ArrayList<>();
		try {
			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			
			Query paramListQrery = session.createSQLQuery("CALL " + "hc_get_test_param()");
			paramList = paramListQrery.list();
			
		} catch (Exception e) {
			logger.info("Test Parameter DAOImpl: Exception: " + e.getStackTrace());
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
	public String addTestParameterDAO(HCTestParameter testParameter) {
		
		String response = null;
		Transaction tx = null;
		
		try {

			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			logger.info("Test Parameter add DAOImpl");
			
			Query addParamQrery = session.createSQLQuery("CALL " + "hc_ins_test_param(?, ?, ?)");
			addParamQrery.setString(0, testParameter.getParamName());
			addParamQrery.setString(1, testParameter.getParamDesc());
			addParamQrery.setString(2, testParameter.getAlterName());
			response = (String) addParamQrery.uniqueResult();
			tx.commit();	
		} catch (Exception e) { 
			logger.info("Test Parameter add DAOImpl: Exception: " + e.getStackTrace());
			response = "Failed to add Test Parameter";
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
	public String updateTestParameterDAO(HCTestParameter testParameter) {
		
		String response;
		Transaction tx = null;
		try {
			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			logger.info("Test Parameter update DAOImpl");
			
			Query updateParamQrery = session.createSQLQuery("CALL " + "hc_update_test_param(?, ?, ?, ?)");
			updateParamQrery.setInteger(0, testParameter.getParamId());
			updateParamQrery.setString(1, testParameter.getParamName());
			updateParamQrery.setString(2, testParameter.getParamDesc());
			updateParamQrery.setString(3, testParameter.getAlterName());
			response = (String) updateParamQrery.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			logger.info("Test Parameter update DAOImpl: Exception: " + e.getStackTrace());
			response = "Failed to update Test Parameter";
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
	public String deleteTestParameterDAO(HCTestParameter testParameter) {
		
		String response = null;
		Transaction tx = null;
		
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			logger.info("Test Parameter delete DAOImpl");
			
			Query updateParamQrery = session.createSQLQuery("CALL " + "hc_del_test_param(?)");
			updateParamQrery.setInteger(0, testParameter.getParamId());
			response = (String) updateParamQrery.uniqueResult();
			tx.commit();
		} catch (Exception e) { 
			logger.info("Test Parameter delete DAOImpl: Exception: " + e.getStackTrace());
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
