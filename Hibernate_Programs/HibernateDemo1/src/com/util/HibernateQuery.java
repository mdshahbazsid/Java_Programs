package com.util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Product;

public class HibernateQuery {

	public static void main(String[] args) {
		
		try 
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionfactory=config.buildSessionFactory();
			
			Session session=sessionfactory.openSession();
			
			Transaction transaction=session.beginTransaction();	
			
			//Fetching the data :
			Query query=session.createQuery("from Product");
			
			List<Product> listproduct=query.list();
			
			for(Product product:listproduct)
			{
				System.out.print(product.getProductId()+" :: ");
				System.out.print(product.getProductName()+" :: ");
				System.out.println(product.getPrice());
			}
			
			
			//Fetching the data using where clause :
		/*	Query query=session.createQuery("from Product where productName=:proname");
			query.setParameter("proname","Honor 9");
			List<Product> listproduct=query.list();
			for(Product product:listproduct)
			{
				System.out.print(product.getProductId()+" :: ");
				System.out.print(product.getProductName()+" :: ");
				System.out.println(product.getPrice());
			}*/
			
			session.close();
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occured : "+e);
		}
		

	}

}
