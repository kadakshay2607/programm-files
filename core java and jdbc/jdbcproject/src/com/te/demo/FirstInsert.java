package com.te.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class FirstInsert {
	static Connection connection;
	 static Statement statement;

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/student_info?user=root&password=lion";
		String query = "insert into info values(10,'john','pune',2019-02-20)";
		try {
			//step 1 load and register the driver
			Class.forName("com.mysql.jdbc.Driver");//step 1
			//step 2 get the connection via driver
			connection = DriverManager.getConnection(url);//step 2
			//step 3 create statement obj and push the query via connection
			statement = connection.createStatement();//step 3
			//step 4 process the result returned by db
			int result = statement.executeUpdate(query);//step 4
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
