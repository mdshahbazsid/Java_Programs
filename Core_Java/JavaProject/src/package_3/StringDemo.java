package package_3;

public class StringDemo {

	int empId;
	String empName;
	
	public StringDemo()
	{
		empId=1001;
		empName="Sudhir";
	}
	
	public String toString() //Overriding the toString method 
	{
		return "Employee Id:"+empId+" Employee Name:"+empName;
	}
	
	public static void main(String arg[])
	{
		
		StringDemo employee=new StringDemo();
		
		System.out.println(employee);
		
		System.out.println(employee.hashCode());
		
	
		byte buffer[]= {65,66,67,68,69};
		
		String byteString=new String(buffer);
		
		System.out.println("String Created using Byte Array:"+byteString);
		
		
		char name[]= {'S','u','d','h','i','r'};
		
		String charString=new String(name);
		
		System.out.println("String created using Character Array:"+charString);
		
		
	}
}
