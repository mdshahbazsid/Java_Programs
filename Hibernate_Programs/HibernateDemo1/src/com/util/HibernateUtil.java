package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class HibernateUtil {

	public static void main(String[] args) {
		
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
		    SessionFactory sessionfactory=config.buildSessionFactory();
		    Session session=sessionfactory.openSession();
		    
		    Transaction transaction=session.beginTransaction();
		    
		    com.model.Product product=new com.model.Product();
		    
		    product.setProductId("P002");
		    product.setProductName("Redmi 6A");
		    product.setPrice(7000);
		    
		    session.save(product);
		    
		    transaction.commit();
		    
		    session.close();
		    
		    System.out.println("Object is Saved Succesfully"); 
		} 
		catch (Exception e)
		{
			System.out.println("Exception Occurs : "+e);
		}

	}

}
