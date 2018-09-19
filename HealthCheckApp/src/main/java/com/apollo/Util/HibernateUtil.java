package com.apollo.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory factory;
	
	private HibernateUtil(){}
	public static synchronized SessionFactory getSessionFactory(){
		
		if(factory == null){
			factory = new Configuration().configure("com/apollo/configuration/HealthCheck.cfg.xml")
					.buildSessionFactory();
		}
		return factory;
	}
	
}
