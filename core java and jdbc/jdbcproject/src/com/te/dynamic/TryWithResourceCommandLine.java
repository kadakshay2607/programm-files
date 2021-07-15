package com.te.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TryWithResourceCommandLine {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/student_info?user=root&password=lion";
		String query = "update info set name = ? where id = ?";
		
		try(Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);)
		{
			preparedStatement.setString(1,args[0]);
			preparedStatement.setInt(2,Integer.parseInt(args[1]));
			
			int result = preparedStatement.executeUpdate();
			
			if (result!=0) {
				System.out.println("data added sucessfully");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
