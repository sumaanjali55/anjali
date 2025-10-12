package DBUti;

import java.sql.*;
public class DBUtil {
	
		private static Connection con;
		private static final String Driver="com.mysql.cj.jdbc.Driver";
		private static final String USERNAME="root";
		private static final String PASSWORD="Lakshmi@1306";
		private static final String URL="jdbc:mysql://localhost:3306/jdbc";
		
		
		public static Connection getConnection()
		{
			try {
				Class.forName(Driver);
				System.out.println("Driver loaded Succesfully");
				
				con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
				System.out.println("connection established");
				
			
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return con;
		}

	}

