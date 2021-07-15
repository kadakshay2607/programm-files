package com.te.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id ");
		int id = scanner.nextInt();
		System.out.println("name ");
		String name = scanner.next();
		scanner.nextLine();
		System.out.println("enter address ");
		String loc = scanner.next();
		scanner.nextLine();
		System.out.println("enter date ");
		String date = scanner.next();
		scanner.nextLine();
		Connection connection = null;
		java.sql.PreparedStatement preparedStatement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info?user=root&password=lion");
			preparedStatement  = connection.prepareStatement("insert into info values(?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, loc);
			preparedStatement.setString(4, date);
			
	      int result = preparedStatement.executeUpdate();
	      if (result!=0) {
	    	  System.out.println(result+ " no of row affected");
			
		}
	      
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
				preparedStatement.close();
				scanner.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
