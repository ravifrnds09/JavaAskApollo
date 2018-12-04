package com.apollo.DAOImpl;



import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.apollo.DAO.PackageTestDAO;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.PackageTest;

public class PackageTestDAOImpl implements PackageTestDAO {
	private final Logger logger = Logger.getLogger(PackageTestDAOImpl.class);
	private SessionFactory factory;
	private Session session;
	@Override
	public List SavePackages(PackageTest pack) {
		logger.info("Get Packages DAO");
		List list=null;
		try{
			factory=HibernateUtil.getSessionFactory();
			session=factory.openSession();
		    Query PackageQuery=session.createSQLQuery("CALL "+"hc_get_Medmantra_Package_Price_With_Location(:packageId,:locationId,:regionId,:age,:genderId)");
			PackageQuery.setParameter("packageId", pack.getPackageId());
			PackageQuery.setParameter("locationId",pack.getLocationId());
			PackageQuery.setParameter("regionId", pack.getRegionId());
			PackageQuery.setParameter("age", pack.getAge());
			PackageQuery.setParameter("genderId", pack.getGender());
			//int cnt=PackageQuery.executeUpdate();
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
