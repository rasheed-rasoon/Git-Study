package programsOnStrings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {
	public static void main(String args[]){  
		try{  
		Class.forName("com.postgresql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:postgresql://10.2.17.139:5432/ts_factories_test","ts_factories","ts_factories");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select application_id from new_factory_approval where status='pending' ");  
		while(rs.next())  
		System.out.println(rs.getInt(1));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  

}