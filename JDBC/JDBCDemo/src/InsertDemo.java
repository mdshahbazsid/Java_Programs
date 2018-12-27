import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {
	
	private final static String Driver="org.h2.Driver";
	private final static String DUrl="jdbc:h2:tcp://localhost/~/test3";
	private final static String DUname="root";
	private final static String DPwd="";

	public static void main(String[] args) {
		
		try 
		{
			Class.forName(Driver);
			Connection conn=DriverManager.getConnection(DUrl, DUname, DPwd);
			PreparedStatement pstmt=conn.prepareStatement("insert into product values(?,?,?)");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter product id : ");
			String id=sc.next();
			System.out.println("Enter product name : ");
			String name=sc.next();
			System.out.println("Enter product price : ");
			int price=sc.nextInt();
			
			pstmt.setString(1,id);
			pstmt.setString(2,name);
			pstmt.setInt(3,price);
			
			int row_aff=pstmt.executeUpdate();
			if(row_aff>0)
				System.out.println("Row inserted Successfully");
			else
				System.out.println("Row insertion Fails");
			
			pstmt.close();
			conn.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Occured"+e);
		}
	}

}
