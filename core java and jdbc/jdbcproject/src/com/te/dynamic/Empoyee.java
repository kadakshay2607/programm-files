package com.te.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Empoyee {
	
	public static void main(String[] args) {
		ArrayList<EmployeDetails> arrayList = new ArrayList<EmployeDetails>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id :");
		int id = scanner.nextInt();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info?user=root&password=lion");
			connection.prepareStatement("select * from info where id = 10;");
			preparedStatement.setInt(1, id);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			EmployeDetails details = new EmployeDetails();
			details.setId(result.getInt(1));
			details.setName(result.getString(2));
			details.setLoc(result.getString(3));
			arrayList.add(details);
		}
		
		arrayList.forEach(var -> System.out.println(var));
		
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
				preparedStatement.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
