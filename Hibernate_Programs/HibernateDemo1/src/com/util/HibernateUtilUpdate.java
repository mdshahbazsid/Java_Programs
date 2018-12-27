package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class HibernateUtilUpdate {

	public static void main(String[] args) {
		
		try 
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionfactory=config.buildSessionFactory();
			
			Session session=sessionfactory.openSession();
			
			Transaction transaction=session.beginTransaction();	
			
			Product product=(Product)session.get(Product.class,"P002");
			product.setPrice(6999);
			session.update(product);
			
			transaction.commit();
			session.close();
			System.out.println("Objet is Updated successfully");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Occured : "+e);
		}

	}

}
