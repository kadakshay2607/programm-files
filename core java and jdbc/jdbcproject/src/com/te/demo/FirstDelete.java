package com.te.demo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class FirstDelete {
	 static Connection connection;
	 static Statement statement;

	public static void main(String[] args) {
		
	
		try {
			FileInputStream fileInputStream = new FileInputStream("details.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			String ur = properties.getProperty("url");
			String query = properties.getProperty("query_d");
			String dr = properties.getProperty("driver_d");
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(ur);
			statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			if (result!=0) {
				System.out.println(result + " no of row affected");
				System.out.println("sucessfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (connection!=null) {
					connection.close();	
				}
				if (statement!=null) {
					connection.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
