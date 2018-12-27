package DatabaseH2;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.h2.tools.Server;

public class H2Database {
	private final static String Driver="org.h2.Driver";
	private final static String Url="jdbc:h2:tcp://localhost/~/test1";
	private final static String UserName="sa1";
	private final static String Password="";

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Server ser=null;
		Connection conn=null;
		Statement stmt=null;
		try {
			ser=Server.createTcpServer().start();
			Class.forName(Driver);
			conn=DriverManager.getConnection(Url,UserName,Password);
			stmt=conn.createStatement();
			System.out.println("\t Menu\n1.Insert Student Record\n2.Insert Course\n3.Update Student Marks\n4.Show All Details of Student");
			int i1=sc.nextInt();
			switch(i1)
			{
			case 2: System.out.print("Add Course Name : ");
			        String cname=sc.nextLine();
			        System.out.print("Add Description : ");
			        String desc=sc.nextLine();
			
			String query1="insert into course(C_NAME,DESCRIPTION)values('"+cname+"','"+desc+"')";
			int x=stmt.executeUpdate(query1);
			if(x>0) 
			  System.out.println("Record inserted");
			break;
			case 1: String query2="select * from course";
			        ResultSet rs=stmt.executeQuery(query2);
			        System.out.println("C_ID\tC_NAME\t\tDESCRIPTION");
			        while(rs.next())
			        {
			        	System.out.println(rs.getInt(3)+"\t"+rs.getString(1)+"\t\t"+rs.getString(2));
			        }
			        System.out.print("Please Select the Course ID : ");
			        int i2=sc.nextInt();
			        if(i2==3||i2==4||i2==5)
			        {
			          System.out.println("Enter Student name : ");
			          String sname=sc.nextLine();
			          System.out.println("Enter Student Phone no :");
			          String sphone=sc.nextLine();
			          System.out.println("Enter Student Address :");
			          String sadd=sc.nextLine();
			          String query3="insert into student(S_NAME,PHONE,ADDRESS,C_ID)values('"+sname+"','"+sphone+"','"+sadd+"',"+i2+")";
			          int x1=stmt.executeUpdate(query3);
					  if(x1>0) 
						 System.out.println("Record inserted");
			        }
			 break;
			 case 3: String query4="select * from student";
	                 ResultSet rs1=stmt.executeQuery(query4);
	                 System.out.println("S_ID\t S_Name"); 
	                 while(rs1.next())
			         {
			        	System.out.println(rs1.getInt(5)+"\t"+rs1.getString(1));
			         }
	                 System.out.print("Please Enter Student Id : ");
	                 int j=sc.nextInt();
	                 String query5="select C_ID from Student where S_ID = "+j+"";
	                 ResultSet rs2=stmt.executeQuery(query5);
	                 rs2.next();
	                 int c_id=rs2.getInt(1);
	                 System.out.print("Enter the Marks : ");
	                 int marks=sc.nextInt();
	                 String query6="insert into marks values("+marks+","+j+","+c_id+")";
	                 int x2=stmt.executeUpdate(query6);
	                 if(x2>0)
	                	 System.out.println("Marks Entered Successfully");
	          break;
			 case 4: String query7="SELECT marks.total_marks,marks.c_id,marks.s_id,student.S_name,student.phone,student.address,course.c_name,course.description\r\n" + 
			 		"FROM marks,student,course\r\n" + 
			 		"WHERE marks.s_id=student.s_id AND student.s_id=course.c_id;";
			         ResultSet rs3=stmt.executeQuery(query7);
			         System.out.println("S_ID   C_ID    S_NAME \t\t PHONE\t\tADDRESS\t\t\t  TOTAL_MARKS \t C_NAME\t\tDESCRIPTION");
			         while(rs3.next())
			         {
			         System.out.print(rs3.getInt(3)+"\t"+rs3.getInt(2)+"   "+rs3.getString(4)+"\t "+rs3.getString(5)+"\t"+rs3.getString(6)+"   "+rs3.getInt(1)+"\t "+rs3.getString(7)+"\t\t"+rs3.getString(8));
			         }
			  break;
			}
		    }
		        catch (SQLException e) 
				{
					e.printStackTrace();
				} 
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				} 
			
	}

}
