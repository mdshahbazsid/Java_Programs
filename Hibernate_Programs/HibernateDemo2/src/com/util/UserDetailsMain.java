package com.util;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.spi.AdditionalJaxbMappingProducer;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.UserDetails;

public class UserDetailsMain {

	public static void main(String[] args) {
		
		try 
		{
			Configuration config = new Configuration().configure();
			SessionFactory sessionfactory = config.buildSessionFactory();
			Session session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			UserDetails user = new UserDetails();
//			user.setId(1001);
			user.setName("Shabaz");
			user.setDate(new Date());
			
			/*Address homeaddress = new Address();
			homeaddress.setStreet("home Street 1");
			homeaddress.setCity("home City 1");
			homeaddress.setState("home State 1");
			homeaddress.setPincode(123456);
			user.setHomeaddress(homeaddress);*/
			
			
			/*Address officeaddress = new Address();
			officeaddress.setStreet("office Street 1");
			officeaddress.setCity("office City 1");
			officeaddress.setState("office State 1");
			officeaddress.setPincode(909090);
			user.setOfficeaddress(officeaddress);*/
			
			Address add1 = new Address();
			add1.setStreet("home Street 1");
			add1.setCity("home City 1");
			add1.setState("home State 1");
			add1.setPincode(123456);
			
			Address add2 = new Address();
			add2.setStreet("home Street 2");
			add2.setCity("home City 2");
			add2.setState("home State 2"); 
			add2.setPincode(123457);
			
			Address add3 = new Address();
			add3.setStreet("home Street 3");
			add3.setCity("home City 3");
			add3.setState("home State 3"); 
			add3.setPincode(123458);
			
			user.getListofaddress().add(add1);
			user.getListofaddress().add(add2);
			user.getListofaddress().add(add3);
			
			user.setDescription("Description for user 1");
			session.save(user);
			
			transaction.commit();
			session.close();
		}
		catch (Exception e)
		{
			System.out.println("Exception Occured : "+e);
		}
		
	}

}
