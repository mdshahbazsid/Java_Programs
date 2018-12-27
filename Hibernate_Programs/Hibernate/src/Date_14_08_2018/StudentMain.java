package Date_14_08_2018;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentMain {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtill.getsF();
		Session session=sf.openSession();
		session.beginTransaction();
		
		Student obj=new Student();
	
		obj.setSid(4);
		obj.setName("Kartik");
		obj.setAge("21");
		obj.setAddress("Daliganj");
	
		obj.setCourse((Course)session.get(Course.class, 3)); 
		
//		obj=(Student)session.get(Student.class,2);
//		System.out.println(obj);
	
		session.saveOrUpdate(obj);
		session.getTransaction().commit();
		session.close();
	}

}
