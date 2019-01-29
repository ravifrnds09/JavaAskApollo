package com.apollo.DAOImpl;



import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.apollo.DAO.PackageListDAO;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.PackageList;

public class PackageListDAOImpl implements PackageListDAO {
	private final Logger logger = Logger.getLogger(PackageListDAOImpl.class);
	private SessionFactory sessionFactory;
	private Session session;
	@Override
	public List SavePackages(PackageList pack) {
		logger.info("Get Packages DAO");
		List list=null;
		try{
			sessionFactory = HibernateUtil.getSessionFactory();
			session=sessionFactory.openSession();
			Query PackageQuery = session
					.createSQLQuery("CALL " + "hc_get_Medmantra_Package_Price_With_Location_New(?,?,?,?)");
			PackageQuery.setInteger(0, pack.getRegionId());
			PackageQuery.setInteger(1, pack.getHospitalId());
			PackageQuery.setInteger(2, pack.getAge());
			PackageQuery.setString(3, pack.getGender());
			list = PackageQuery.list();
			list=PackageQuery.list();
			
		}
		catch (Exception e) {
			logger.info("Package Registration DAO called: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				 session.close();
			}
			/*if (sessionFactory != null) {
				 sessionFactory.close();
			}*/
		}
		return list;
	}

	

}
