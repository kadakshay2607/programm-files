package com.te.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class FirstRead {

	static Connection connection;
	static Statement Statement;

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/student_info?user=root&password=lion";
		String query = "select * from info;";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url);
			Statement = connection.createStatement();
			ResultSet resultSet = Statement.executeQuery(query);
			
			while (resultSet.next()) {
				System.out.println("Id : "+resultSet.getInt(1));
				System.out.println("Name : "+resultSet.getString(2));
				System.out.println("Loc : "+resultSet.getString(3));
				System.out.println("Date : "+resultSet.getString(4));
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
       finally {
		try {
			if (connection!=null) {
				connection.close();	
			}
			if (Statement!=null) {
				connection.close();
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
			
		}
	}

	}

}
