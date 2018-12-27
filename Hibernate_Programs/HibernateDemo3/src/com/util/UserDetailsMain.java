package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.UserDetails;
import com.model.Vehicle;

public class UserDetailsMain {

	public static void main(String[] args) {
		
		try 
		{
			Configuration config = new Configuration().configure();
			SessionFactory sessionfactory = config.buildSessionFactory();
			Session session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			
/*1			UserDetails user = new UserDetails();
			user.setName("First_user");
			Vehicle vehicle = new Vehicle();
			vehicle.setVehiclename("Car");
			user.setVehicle(vehicle);
			session.save(user);
			session.save(vehicle);
			
			UserDetails user2 = new UserDetails();
			user2.setName("Second_user");
			Vehicle vehicle2 = new Vehicle();
			vehicle2.setVehiclename("MotorBike");
			user2.setVehicle(vehicle2);
			session.save(user2);
			session.save(vehicle2); 1*/
			
			UserDetails user = new UserDetails();
			user.setName("First_user");
			
			Vehicle vehicle1 = new Vehicle();
			vehicle1.setVehiclename("Car");
			Vehicle vehicle2 = new Vehicle();
			vehicle2.setVehiclename("MotorBike");
			
			user.getListofvehicles().add(vehicle1);
			user.getListofvehicles().add(vehicle2);
			session.save(user);
			session.save(vehicle1);
			session.save(vehicle2); 
			

			
			transaction.commit();
			session.close();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occures : "+e);
		}

	}

}
