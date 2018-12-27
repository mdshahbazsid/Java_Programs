package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.StudentAddress;
import com.model.StudentDetails;

public class StudentMain {

	public static void main(String[] args) {
		try 
		{
			Configuration config = new Configuration().configure();
			SessionFactory sessionFactory = config.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
/*1			StudentDetails studentDetails1 = new StudentDetails();
			studentDetails1.setName("Student_1");
			StudentDetails studentDetails2 = new StudentDetails();
			studentDetails2.setName("Student_2");
			StudentDetails studentDetails3 = new StudentDetails();
			studentDetails3.setName("Student_3");
			StudentDetails studentDetails4 = new StudentDetails();
			studentDetails4.setName("Student_4");
			StudentDetails studentDetails5 = new StudentDetails();
			studentDetails5.setName("Student_5");
			
			StudentAddress studentAddress1 = new StudentAddress();
			studentAddress1.setAddress("Address_1");
			StudentAddress studentAddress2 = new StudentAddress();
			studentAddress2.setAddress("Address_2");
			StudentAddress studentAddress3 = new StudentAddress();
			studentAddress3.setAddress("Address_3");
			
			studentDetails1.setStudentaddress(studentAddress1);
			studentDetails2.setStudentaddress(studentAddress1);
			studentDetails3.setStudentaddress(studentAddress3);
			studentDetails5.setStudentaddress(studentAddress3);
			studentDetails4.setStudentaddress(studentAddress2);
			
			session.save(studentDetails1);
			session.save(studentDetails2);
			session.save(studentDetails3);
			session.save(studentDetails4);
			session.save(studentDetails5);
			
			session.save(studentAddress1);
			session.save(studentAddress2);
			session.save(studentAddress3); 1*/
			
			StudentDetails studentDetails1 = new StudentDetails();
			studentDetails1.setName("Student_1");
			StudentDetails studentDetails2 = new StudentDetails();
			studentDetails2.setName("Student_2");
			
			StudentAddress studentAddress1 = new StudentAddress();
			studentAddress1.setAddress("Address_1");
			StudentAddress studentAddress2 = new StudentAddress();
			studentAddress2.setAddress("Address_2");
			StudentAddress studentAddress3 = new StudentAddress();
			studentAddress3.setAddress("Address_3");
			
			studentAddress1.setStudentdetails(studentDetails1);
			studentAddress2.setStudentdetails(studentDetails1);
			
			session.save(studentDetails1);
			session.save(studentDetails2);
			session.save(studentAddress1);
			session.save(studentAddress2);
			session.save(studentAddress3);
			
			transaction.commit();
			session.close();
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occurred"+e);
		}


	}

}
