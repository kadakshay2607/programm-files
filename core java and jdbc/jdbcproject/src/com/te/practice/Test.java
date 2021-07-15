package com.te.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info?user=root&password=lion");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from info");
			while (result.next()) {
				
				
			}
		} catch (Exception e) {
	
			e.printStackTrace();
		}

	}

}
