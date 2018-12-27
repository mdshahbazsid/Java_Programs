package Date_14_08_2018;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeMain {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtill.getsF();
		Session session=sf.openSession();
		session.beginTransaction();
		
		Employee obj=new Employee();
		obj.setId(3);
		obj.setName("Abhishek");
		obj.setAddress("GomtiNagar");
		obj.setPhone("7989799999");
		
		session.save(obj);
        
		/*Employee obj=(Employee)session.get(Employee.class,1);
		obj.setAddress("Sas house");
		session.update(obj);*/
		
		/*List<Employee> emplist=session.createQuery("from Employee").list();
		for(Employee obj:emplist) {
			System.out.println(obj.getName());
		}*/

		session.getTransaction().commit();
		session.close();
		
	}

}
