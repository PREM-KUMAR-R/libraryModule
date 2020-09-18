package com.capestart.module.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.capestart.module.entity.BooksEntity;
import com.capestart.module.entity.RegisterEntity;

public class bookDetailsDaoImpl implements bookDetailsDao {

	@Override
	public boolean saveBookDetails(BooksEntity bookEntity) {
		SessionFactory factory = getConnections();
		Session session=factory.openSession();
		try{
				Transaction transaction=session.beginTransaction();
            	session.save(bookEntity);
            	transaction.commit();
            	return true;
		}catch(Exception e) {
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public List<BooksEntity> getBookDetails() {
		SessionFactory factory = getConnections();
		Session session=factory.openSession();
		try{
			Transaction transaction=session.beginTransaction();
			Query query = session.createQuery("From RegisterEntity");
			List bookEntityList=query.list();
        	transaction.commit();
        	return bookEntityList;
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
