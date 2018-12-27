package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class HibernateUtilDelete {

	public static void main(String arg[]) {
		
		try 
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionfactory=config.buildSessionFactory();
			
			Session session=sessionfactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Product product=(Product)session.get(Product.class,"P002");
			
			session.delete(product);
			
			transaction.commit();
			
			session.close();
			System.out.println("Object is Deleted Successfully");
		}
		catch (Exception e) 
		{
			System.out.println("Exception Ocuured : "+e );
		}
	}
}
