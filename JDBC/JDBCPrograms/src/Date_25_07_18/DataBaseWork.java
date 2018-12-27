package Date_25_07_18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.tools.Server;

public class DataBaseWork {

	private final static String DB_DRIVER="org.h2.Driver";
	private final static String DB_URL="jdbc:h2:tcp://localhost/~/test";
	private final static String DB_USERNAME="sa";
	private final static String DB_PASSWORD="";
	
	public static void main(String[] args) {
		Server server=null;
		Connection conn=null;
		Statement stmt=null;
		try {
			server = Server.createTcpServer().start();
			Class.forName(DB_DRIVER);
			conn=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			stmt=conn.createStatement();
			String query="create table customer(cid int primary key auto_increment,customer_name varchar(255),phone_no number(10),address clob)";
			int x=stmt.executeUpdate(query);
			if(x>0) {
				System.out.println("Table Created");
			}
			/*int x=stmt.executeUpdate("insert into customer(CUSTOMER_NAME ,PHONE_NO ,ADDRESS)values('Vivek Singh','9999043210','House no. 567/90-A Balaganj U.P')");
			if(x>0)
		    System.out.println("Data added");*/
			/*int x=stmt.executeUpdate("delete customer where cid=6");
			if(x>0)
		    System.out.println("Data deleted");*/
			
			ResultSet rs=stmt.executeQuery("Select customer_name from customer where cid=2");
			while(rs.next()) {
				System.out.println(rs.getString(1));/*+"\t"+rs.getString(2)+"\t\t\t"+rs.getString(3));*/
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			server.stop();
		}
		
	}

}
