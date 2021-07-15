package com.te.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JdbcDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id");
		int id = scanner.nextInt();
		System.out.println("enter name");
		String name = scanner.nextLine();
		scanner.nextLine();
		System.out.println("enter loc");
		String loc = scanner.next();
		System.out.println("enter date");
		String date = scanner.next();
		String  query = "insert into info values(?,?,?,?)";
		String url = "jdbc:mysql://localhost:3306/student_info?user=root&password=lion";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
     try {
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
    	java.sql.Date date3 = new java.sql.Date(date2.getTime());
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(url);
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, loc);
		preparedStatement.setDate(4, date3);
		int result = preparedStatement.executeUpdate();
	} catch (Exception e) {
		
		e.printStackTrace();
	}

	}

}
