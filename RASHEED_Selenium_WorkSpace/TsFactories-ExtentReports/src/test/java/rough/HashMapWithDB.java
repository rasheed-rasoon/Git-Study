package rough;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class HashMapWithDB {

	public static String regNum=null;
	public static String entreprenueruname=null;
	public static String allotedOfficerUname=null;

	public static void main(String[] args) {
		try{  
			//Class.forName("com.postgresql.jdbc.Driver").newInstance();
			
			Class.forName("org.postgresql.Driver").newInstance();
			
			Connection con=DriverManager.getConnection(  
			"jdbc:postgresql://10.2.17.139:5432/ts_factories_test","ts_factories","ts_factories");  
			HashMap<String, String> tsfact=new HashMap<String,String>();
			
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select application_id from new_factory_approval where status='pending' limit 1");  
			while(rs.next())  
			System.out.println(rs.getString(1));  
			tsfact.put(regNum,rs.getString(1));
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
		
	}


