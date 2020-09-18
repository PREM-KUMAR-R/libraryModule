package com.capestart.module.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.capestart.module.entity.RegisterEntity;


public class validateUserDetailsDaoImpl implements validateUserDetailsDao{

	@Override
	public boolean saveUserDetails(RegisterEntity register) {
		SessionFactory factory = getConnections();
		Session session=factory.openSession();
		try{
				Transaction transaction=session.beginTransaction();
            	session.save(register);
            	transaction.commit();
            	return true;
		}catch(Exception e) {
			return false;
		} finally {
			session.close();
		}
		
	}

	@Override
	public List<RegisterEntity> getUserDetails() {
		SessionFactory factory = getConnections();
		Session session=factory.openSession();
		try{
			Transaction transaction=session.beginTransaction();
			Query query = session.createQuery("From RegisterEntity");
			List registerEntityList=query.list();
        	transaction.commit();
        	return registerEntityList;
	}catch(Exception e) {
		return null;
	} finally {
		session.close();
	}
		
	}
	
	public SessionFactory getConnections() {
		Configuration con=new Configuration().configure().addAnnotatedClass(RegisterEntity.class);
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory factory=con.buildSessionFactory(registry);
		return factory;
	}

}
