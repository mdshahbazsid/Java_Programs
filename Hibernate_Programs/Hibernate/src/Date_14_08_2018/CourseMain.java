package Date_14_08_2018;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CourseMain {
	public static void main(String args[]) {
		SessionFactory sf = HibernateUtill.getsF();
		Session session=sf.openSession();
		session.beginTransaction();
	
		Course obj=new Course();
		obj.setCourseName("Bootstrap");
		obj.setDiscription("Web Designing");
		
		session.save(obj);
		session.getTransaction().commit();
		session.close();
		
	}

}
