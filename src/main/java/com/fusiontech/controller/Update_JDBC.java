package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update_JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fusion","root" ,"root");


			String sql ="update employeedetails set empName ='Arvind' where empName ='Sanket' ";
			Statement statement = con.createStatement();
			int records = statement.executeUpdate(sql);
			System.out.println(records);
			if (records > 0) {
				System.out.println("sucess case");
			} else {
				System.out.println("failure case");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


			}


