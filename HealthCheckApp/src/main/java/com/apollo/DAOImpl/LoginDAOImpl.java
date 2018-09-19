package com.apollo.DAOImpl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.apollo.DAO.LoginDAO;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.Login;

public class LoginDAOImpl implements LoginDAO{

	private final Logger logger = Logger.getLogger(LoginDAOImpl.class);
	private SessionFactory sessionFactory = null;
	private Session session = null;

	@Override
	public Object checkUserService(Login login) {
		
		Object response = "Invalid UserName or Password";
		
		try {

			logger.info("Login DAO API");
			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			
			Query userQrery = session.createSQLQuery("CALL " + "hc_user_details(? ,?)");
			userQrery.setString(0, login.getUserName());
			userQrery.setString(1, login.getPassword());
			response = userQrery.uniqueResult();
			
		} catch (Exception e) {
			logger.info("Login DAO API: message: " + e.getMessage());
			logger.info("Login DAO API: stacktrace: " + e);
			response = "Invalid UserName or Password";
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
