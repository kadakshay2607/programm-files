package com.te.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperations {

	Scanner scanner = new Scanner(System.in);

	public void staticCrud() {
		System.out.println("for Insert=1 / Update=2 / Delete=3 / Read=4");
		int s = scanner.nextInt();
		String url = "jdbc:mysql://localhost:3306/student_info?user=root&password=lion";
		String queryIn = "insert into info values(10,'john','pune',2019-02-20)";
		String queryUp = "update info set id = 60 where name = 'john'";
		String queryDl = "delete from info where id=10";
		String read = "select * from info";
		Connection connection = null;
		Statement statement = null;

		if (s == 1) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url);
				statement = connection.createStatement();
				int result = statement.executeUpdate(queryIn);
				if (result!=0) {
					System.out.println(result + " no of row affected");
					System.out.println("sucessfully");
					staticCrud();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					statement.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if (s == 2) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url);
				statement = connection.createStatement();
				int result = statement.executeUpdate(queryUp);
				if (result!=0) {
					System.out.println(result + " no of row affected");
					System.out.println("sucessfully");
					staticCrud();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					statement.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if (s == 3) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url);
				statement = connection.createStatement();
				int result = statement.executeUpdate(queryDl);
				if (result!=0) {
					System.out.println(result + " no of row affected");
					System.out.println("sucessfully");
					staticCrud();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					statement.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if (s == 4) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url);
				statement = connection.createStatement();
				ResultSet result = statement.executeQuery(read);
				while (result.next()) {
					System.out.println(result.getInt(1));
					System.out.println(result.getString(2));
					System.out.println(result.getString(3));
					System.out.println(result.getString(4));	
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					statement.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			staticCrud();
		}

	}

	public void dynamicCrud() {
		System.out.println("for Insert=1 / Update=2 / Delete=3 / Read=4");
		int d = scanner.nextInt();
		String url = "jdbc:mysql://localhost:3306/student_info?user=root&password=lion";
		String quIn = "insert into info values(?,?,?,?)";
		String quUp = "update info set id = ? where name = ?";
		String queryDl = "delete from info where id=?";
		String re ="select * from info where id=?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		if (d == 1) {

			System.out.println("Enter Id : ");
			int id = scanner.nextInt();
			System.out.println("Enter Name : ");
			String name = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Enter Location : ");
			String loc = scanner.nextLine();
			System.out.println("enter date :");
			String date = scanner.nextLine();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url);
				preparedStatement = connection.prepareStatement(quIn);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, loc);
				preparedStatement.setString(4,date);
				int result = preparedStatement.executeUpdate();
				if (result!=0) {
					System.out.println(result + " no of row affected");
					System.out.println("sucessfully");
					dynamicCrud();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					preparedStatement.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		else if (d == 2) {

			System.out.println("Enter Id : ");
			int id = scanner.nextInt();
			System.out.println("Enter Name : ");
			String name = scanner.nextLine();
			scanner.nextLine();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url);
				preparedStatement = connection.prepareStatement(quUp);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);

				int result = preparedStatement.executeUpdate();

				if (result!=0) {
					System.out.println(result + " no of row affected");
					System.out.println("sucessfully");
					dynamicCrud();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					preparedStatement.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if (d == 3) {

			System.out.println("Enter Id : ");
			int id = scanner.nextInt();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url);
				preparedStatement = connection.prepareStatement(queryDl);
				preparedStatement.setInt(1, id);

				int result = preparedStatement.executeUpdate();

				if (result!=0) {
					System.out.println(result + " no of row affected");
					System.out.println("sucessfully");
					dynamicCrud();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					preparedStatement.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if (d == 4) {

			System.out.println("Enter Id : ");
			int id = scanner.nextInt();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url);
				preparedStatement = connection.prepareStatement(re);
				preparedStatement.setInt(1, id);

				 ResultSet result = preparedStatement.executeQuery();

				while (result.next()) {
					System.out.println(result.getInt(1));
					System.out.println(result.getString(2));
					System.out.println(result.getString(3));
					System.out.println(result.getString(4));
					
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					preparedStatement.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
}
