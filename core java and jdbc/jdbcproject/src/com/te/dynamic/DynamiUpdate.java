package com.te.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamiUpdate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id");
		int id = scanner.nextInt();
		System.out.println("enter name");
		String string = scanner.next();
		scanner.nextLine();
		Connection connection = null;
		PreparedStatement PreparedStatement = null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info?user=root&password=lion");
		    PreparedStatement = connection.prepareStatement("update info set name=? where id=?");
		    PreparedStatement.setString(1, string);
		    PreparedStatement.setInt(2, id);
		    int result = PreparedStatement.executeUpdate();
		   if (result!=0) {
			   System.out.println(result+" no of row affected");
			
		}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
				PreparedStatement.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
