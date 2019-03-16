package com.apollo.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONObject;

import com.apollo.DAO.PackageListDAO;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.PackageList;
import com.apollo.model.PackageListV2;
import com.apollo.model.PackageListV3;
import com.apollo.model.TestParameterDesc;

public class PackageListDAOImpl implements PackageListDAO {
	private final Logger logger = Logger.getLogger(PackageListDAOImpl.class);
	private SessionFactory sessionFactory;
	private Session session;

	@SuppressWarnings("rawtypes")
	@Override
	public List SavePackages(PackageList pack) {
		logger.info("Get Packages DAO");
		List list = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			Query PackageQuery = session
					.createSQLQuery("CALL " + "hc_get_Medmantra_Package_Price_With_Location_New(?,?,?,?)");
			PackageQuery.setInteger(0, pack.getRegionId());
			PackageQuery.setInteger(1, pack.getHospitalId());
			PackageQuery.setInteger(2, pack.getAge());
			PackageQuery.setString(3, pack.getGender());
			list = PackageQuery.list();
			list = PackageQuery.list();

		} catch (Exception e) {
			logger.info("Package Registration DAO called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			/*
			 * if (sessionFactory != null) { sessionFactory.close(); }
			 */
		}
		return list;
	}

	@Override
	public List getTestParameter(TestParameterDesc desc) {
		logger.info("Get Packages DAO");
		List list = null;
		List paramList = new ArrayList();
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			Query PackageQuery = session.createSQLQuery("CALL " + "hc_get_test_param_Package(?)");
			PackageQuery.setString(0, desc.getPackageName());
			list = PackageQuery.list();
		} catch (Exception e) {
			logger.info("Package Registration DAO called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			/*
			 * if (sessionFactory != null) { sessionFactory.close(); }
			 */
		}
		return list;
	}

	@Override
	public List getPackages(PackageListV2 packageList) {
		logger.info("Get Packages DAO");
		List list = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			Query PackageQuery = session
					.createSQLQuery("CALL " + "hc_get_Medmantra_Package_Price_With_Location_New(?,?,?,?)");
			PackageQuery.setInteger(0, packageList.getRegionId());
			PackageQuery.setInteger(1, packageList.getHospitalId());
			PackageQuery.setInteger(2, packageList.getAge());
			PackageQuery.setString(3, packageList.getGender());
			list = PackageQuery.list();
			list = PackageQuery.list();
		} catch (Exception e) {
			logger.info("Package Registration DAO called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			/*
			 * if (sessionFactory != null) { sessionFactory.close(); }
			 */
		}
		return list;
	}

	@Override
	public List getActualNames(PackageListV3 packageListV3) {
		logger.info("Get Packages DAO");
		List list = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			Query PackageQuery = session
					.createSQLQuery("CALL " + "DUMMY_hc_get_Medmantra_Package_Price_With_Location_New(?,?,?,?)");
			PackageQuery.setInteger(0, packageListV3.getRegionId());
			PackageQuery.setInteger(1, packageListV3.getHospitalId());
			PackageQuery.setInteger(2, packageListV3.getAge());
			PackageQuery.setString(3, packageListV3.getGender());
			list = PackageQuery.list();
			list = PackageQuery.list();
		} catch (Exception e) {
			logger.info("Package Registration DAO called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			/*
			 * if (sessionFactory != null) { sessionFactory.close(); }
			 */
		}
		return list;
	}

}
