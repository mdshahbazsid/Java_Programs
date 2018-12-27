package DatabaseH2;

public class DBConfigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DBConfig obj=new DBConfig();
        obj.openConnection();
       /* if(obj.executeUpdate("insert into customer(C_NAME,C_ADDRESS)values('Abhay','Daliganj')")==true)
        System.out.println("Query Executed Successfully");
        else
        System.out.println("Error in Connection or SQL Query");*/
        obj.executeQuery("show column from customer");
        
        obj.closeConnection();
        
	}

}
