package Hiber;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Main {


	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
//		Employee obj=new Employee();
//		obj.setFirst_Name("name 6");
//		obj.setLast_Name("nm 6");
//		obj.setSalary(21000);
//		session.save(obj);
//		tx.commit();
		
//		<Fetching records>
		
		/*Query q=session.createQuery("from Employee");
		List<Employee> employee=q.list();
		for(Employee e: employee) {
			System.out.println(e);
		}*/
		
		/*Query q=session.createQuery("from Employee where sal > 40000");
		List<Employee> employee=q.list();
		for(Employee e: employee) {
			System.out.println(e);
		}*/
		
		Query q=session.createQuery("from Employee where id=3");
		Employee employee=(Employee) q.uniqueResult();
		
			System.out.println(employee);
		 session.getTransaction().commit();
	}

}
