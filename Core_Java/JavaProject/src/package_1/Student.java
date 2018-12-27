package package_1;

public class Student {

	int studentId;
	String studentName;
	Course course;
	
	public Student(int sid,String sname,String cid,String cname) {
		studentId=sid;
		studentName=sname;
		course =new Course(cid,cname);
	}
	public void displayStudentDetails() {
		System.out.println("Student ID = "+studentId);
		System.out.println("Student Name = "+studentName);
		course.displayCourseDetail();
	}
	public static void main(String args[]) {
		Student obj=new Student(101,"Ganesh","C101","Java");
		obj.displayStudentDetails();
		
	}
}

class Course{
	
	String courseId;
	String courseName;
	
	public Course(String cid,String cname) {
		courseId=cid;
		courseName=cname;
	}
	public void displayCourseDetail() {
		System.out.println("Course ID = "+courseId);
		System.out.println("Course Name = "+courseName);
	}
}
