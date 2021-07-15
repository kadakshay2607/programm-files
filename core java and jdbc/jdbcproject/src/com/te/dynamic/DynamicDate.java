package com.te.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DynamicDate {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement sta = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter date dd/mm/yyyy : ");
		String date = scanner.nextLine();
		try {
			java.util.Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			Date dat = new Date(date2.getTime());
			String io = dat.toString();
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info?user=root&password=lion");
			sta = conn.prepareStatement("select * from info where date= ?");
			sta.setString(1,io);
			ResultSet result = sta.executeQuery();
			while (result.next()) {
				System.out.println("Id : "+result.getInt(1));
				System.out.println("Name : "+result.getString(2));
				System.out.println("Loc : "+result.getString(3));
				System.out.println("Date : "+result.getString(4));	
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				sta.close();
				scanner.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
