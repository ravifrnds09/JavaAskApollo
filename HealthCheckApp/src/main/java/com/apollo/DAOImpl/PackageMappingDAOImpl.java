package com.apollo.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.apollo.DAO.PackageMappingDAO;
import com.apollo.Util.HibernateUtil;
import com.apollo.model.HCPackageMapping;
import com.apollo.model.HCServiceMaster;

public class PackageMappingDAOImpl implements PackageMappingDAO{
	
	private final Logger logger = Logger.getLogger(PackageMappingDAOImpl.class);
	
	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Object[]> getFullPackageData(HCPackageMapping hcPackage) {
		
		List<Object[]> completeList = new ArrayList<>();
		
		try {
			logger.info("Package Complete List DAO Called");
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			
			//Query serviceListQrery = session.createSQLQuery("CALL " + "hc_get_service_master_td(?)");
			Query serviceListQrery = session.createSQLQuery("CALL " + "hc_get_service_master_td_dup(?, ?)");
			serviceListQrery.setString(0, hcPackage.getSubPackagesString());
			serviceListQrery.setInteger(1, hcPackage.getLocationId());
			completeList = serviceListQrery.list();
			
			
		} catch (Exception e) {
			logger.info("Package Complete List DAO Called: Exception" + e);
			e.printStackTrace();
		}finally {
			if (session != null) {
				 session.close();
			}
			/*if (sessionFactory != null) {
				 sessionFactory.close();
			}*/
		}
		
		return completeList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> serviceMasterListDAO() {
		
		List<Object[]> serviceList = new ArrayList<>();
		try {
			logger.info("Service Master list DAO");
			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			
			Query serviceListQrery = session.createSQLQuery("CALL " + "hc_get_service_master()");
			serviceList = serviceListQrery.list();
			
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
			
		return serviceList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> mappingListDAO() {
		
		List<Object[]> mappingList = new ArrayList<>();
		
		try {
			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			
			Query mappingListQrery = session.createSQLQuery("CALL " + "hc_get_package_mapping()");
			//Query mappingListQrery = session.createSQLQuery("CALL " + "hc_get_package_mapping_dup()");
			mappingList = mappingListQrery.list();
			
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
			
		return mappingList;
		
	}

	@Override
	public Object mappingAddDAO(HCPackageMapping hcPackageMapping) {
		
		Object response = "";
		Transaction tx = null;
		
		try {

			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Query mappingAddQrery = session.createSQLQuery("CALL " + "hc_ins_package_mapping(?, ?, ?)");
			mappingAddQrery.setInteger(0, hcPackageMapping.getPackageId());
			mappingAddQrery.setString(1, hcPackageMapping.getServiceNamesString());
			mappingAddQrery.setInteger(2, hcPackageMapping.getLocationId());
			response = (String) mappingAddQrery.uniqueResult();
			
			tx.commit();
			
		} catch (Exception e) {
			response = "Failed to add Package Mapping";
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
	public Object mappingUpdateDAO(HCPackageMapping hcPackageMapping) {
		
		Object response = "";
		Transaction tx = null;
		
		try {

			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Query serviceUpdateQrery = session.createSQLQuery("CALL " + "hc_update_package_mapping(?, ?, ?)");
			serviceUpdateQrery.setInteger(0, hcPackageMapping.getPackageId());
			serviceUpdateQrery.setString(1, hcPackageMapping.getServiceNamesString());
			serviceUpdateQrery.setInteger(2, hcPackageMapping.getLocationId());
			String result = (String) serviceUpdateQrery.uniqueResult();
			//System.out.println(result);
			
			tx.commit();
			response = "Successfully updated";
			
		} catch (Exception e) {
			response = "Failed to Update Package Mapping";
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
	public Object mappingDeleteDAO(HCPackageMapping hcPackageMapping) {
		
		Object response = "";
		Transaction tx = null;
		
		try {
			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Query mappingDeleteQrery = session.createSQLQuery("delete from package_mapping where package_id = ? and location_id = ?");
			mappingDeleteQrery.setInteger(0, hcPackageMapping.getPackageId());	
			mappingDeleteQrery.setInteger(1, hcPackageMapping.getLocationId());	
			mappingDeleteQrery.executeUpdate();
			tx.commit();
			response = "Successfully deleted";
			
			/*Query mappingDeleteQrery = session.createSQLQuery("CALL " + "hc_del_package_mapping(?)");
			mappingDeleteQrery.setInteger(0, hcPackageMapping.getPackageId());
			response = mappingDeleteQrery.uniqueResult();*/
			
		} catch (Exception e) {
			response = "Failed to delete Package Mapping";
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
	public List<Object[]> serviceMasterSearchListDAO(String searchName) {
		List<Object[]> serviceList = new ArrayList<>();
		try {
			logger.info("Service Master Search list DAO");
			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			
			Query serviceListQrery = session.createSQLQuery("CALL " + "hc_get_service_master_search(?)");
			serviceListQrery.setString(0, searchName);
			serviceList = serviceListQrery.list();
			
		} catch (Exception e) {
			logger.info("Service Master Search list DAO: Exception: " + e.getStackTrace());
			e.printStackTrace();
		} finally {
			if (session != null) {
				 session.close();
			}
		}
			
		return serviceList;
	}

	@Override
	public List<Object[]> getServiceMasterByLocationID(HCServiceMaster hcServiceMaster) {
		logger.info("Service Master list DAO");
		List<Object[]> serviceListResponse = new ArrayList<>();
		try {
			
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			
			Query serviceListByLocationIdQrery = session.createSQLQuery("CALL " + "hc_get_service_master_location(?)");
			serviceListByLocationIdQrery.setString(0, hcServiceMaster.getLocationId());
			
			serviceListResponse = serviceListByLocationIdQrery.list();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return serviceListResponse;
	}

}
