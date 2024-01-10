package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Statement;

public class JDBCDemo {
	
	public static void main(String[] args) throws Exception {
		System.out.println("HI");
		
		String url = "jdbc:mysql://localhost:3306/fusion";
		String userName = "root";
		String password = "root";
		
		String query = "select * from employeedetails";
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection conn = DriverManager.getConnection(url, userName, password);
		 
		 java.sql.Statement st = conn.createStatement();
		 ResultSet rs = st.executeQuery(query);
		 
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1)+" "+rs.getString(1)+" "+rs.getString(2));
		 }
		 
		 conn.close();
		 
		 
		// PreparableStatement st = (PreparableStatement) conn.prepareStatement(query);
		 
	}

}