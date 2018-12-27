package DatabaseH2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.tools.Server;

public class DBConfig implements printString{
	private final static String Driver="org.h2.Driver";
	private final static String Url="jdbc:h2:tcp://localhost/~/test2";
	private final static String UserName="sa2";
	private final static String Password="";
	private Server server=null;
	private Connection conn=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	public void println(String s) {
		System.out.println(s);
	}
	
	public void openConnection() {
		
		try {
			
			this.server=Server.createPgServer().start();
			Class.forName(Driver);
			this.conn=DriverManager.getConnection(Url, UserName, Password);
			this.stmt=this.conn.createStatement();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public boolean executeUpdate(String sql) {
		try {
			int f=this.stmt.executeUpdate(sql);
			if(f>0)
				return true;
			else 
				return false;
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public void executeQuery(String sql) {
		try {
			this.rs=this.stmt.executeQuery(sql);
			this.println("C_ID\tC_NAME\t\tC_ADDRESS");
			while(this.rs.next())
			{
				String s=this.rs.getInt(1)+"\t"+this.rs.getString(2)+"\t"+this.rs.getString(3);
				this.println(s);
			}
			
		}
		catch (Exception e) {
		     e.printStackTrace();
		}
	}
	public void closeConnection() {
		try {
			
			this.stmt.close();
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}

 interface printString{
	public void println(String s);
}

