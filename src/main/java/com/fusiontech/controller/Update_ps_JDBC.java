package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_ps_JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fusion", "root",
					"root");

			String sql = "update employeedetails set empName =? where empName =? ";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, "ROHIT_1");
			ps.setString(2, "ROHIT");
			int records = ps.executeUpdate();
			if (records > 0) {
				System.out.println("succes case ");

			} else {
				System.out.println("failure case");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
