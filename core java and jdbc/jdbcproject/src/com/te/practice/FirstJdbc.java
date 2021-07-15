package com.te.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FirstJdbc {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("eneter id");
		int id = scanner.nextInt();
//		System.out.println("enter name");
//	    String name = scanner.next();
//	    System.out.println("eneter date");
//	    String da = scanner.nextLine();
		try {
//			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(da);
//			java.sql.Date date2 = new java.sql.Date(date.getTime());
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=lion");
			PreparedStatement statement = connection.prepareStatement("delete from auto where id=?");
			statement.setInt(1, id);
//			statement.setString(1, name);
			//statement.setDate(3, date2);
			int result = statement.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
