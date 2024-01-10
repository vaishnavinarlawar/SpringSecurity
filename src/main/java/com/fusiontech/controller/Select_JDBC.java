package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_JDBC {

	public static void main(String[] args) {
		

		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/fusion", "root", "root");
			
			String sql ="select * from employeedetails";
			Statement statement= connection.createStatement();
			ResultSet rs=statement.executeQuery(sql);

			System.out.println(rs);
			
			while(rs.next())
			{
				System.out.println(rs.getString("empName"));
				//System.out.println(rs.getString("password"));
				//System.out.println(rs.getString(2));
				
				
			}
		} 
		catch (Exception e) 
		{
        e.printStackTrace();
		
		}
		
	}

}
