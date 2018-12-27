package package_3;

public class StringDemo2 {

	public static void main(String arg[]) {
		
		String str="s191163100128";
		System.out.println("year : "+str.substring(1,3));
		System.out.println("center code : "+str.substring(3,8));
		System.out.println("roll no. : "+str.substring(8));
		

		String record="E1001,Sudhir,Hyderabad,55000";
		
		String recordDetail[]=record.split(",");
		
		System.out.println("Employee ID:"+recordDetail[0]);
		System.out.println("Employee Name:"+recordDetail[1]);
		System.out.println("Employee Address:"+recordDetail[2]);
		System.out.println("Employee Salary:"+recordDetail[3]);
	}
}
