package com.te.scrumteam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BankDataBase {

	String url = "jdbc:mysql://localhost:3306/student_info";
	String user = "root";
	String pwd = "lion";
	Scanner sc = new Scanner(System.in);
	Connection con ;
	PreparedStatement p ;

	public BankDataBase() {

	}

	public void Insert() {

		try {

			System.out.println("enter the Account number");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			sc.nextLine();
			System.out.println("enter the Account balance");
			double Balance=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the address");
			String address = sc.nextLine();
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pwd);

			String query = "insert into bank values(?,?,?,?)";
			p = con.prepareStatement(query);
			p.setInt(1, id);
			p.setString(2, name);
			p.setDouble(3, Balance);
			p.setString(4, address);
			int result = p.executeUpdate();
			if (result != 0) {
				System.out.println("Amount deposite is " + Balance+" Rs" );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void withdrawl() throws Exception  {

		System.out.println("enter the account number ");
		int id=sc.nextInt();
		System.out.println("enter the amount");
		double amount=sc.nextDouble();
		con = DriverManager.getConnection(url, user, pwd);
		if(amount>0) {
			String query1 = "update bank  set Balance=Balance - ? where Id=?"; 

			p = con.prepareStatement(query1);	
			p.setDouble(1, amount);
			p.setInt(2, id);
			int result = p.executeUpdate();
			if (result != 0) {
				System.out.println("withdraw amount is " + amount+"Rs");
			}else {
				System.out.println("the account number is wrong");
				withdrawl();
			}	
		}
	}
	public void remainingbalance() {
		System.out.println("Enter Account No: ");
		int id=sc.nextInt();
		String query3="select Balance from bank where id=?";
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
			p=con.prepareStatement(query3);
			p.setInt(1, id);
			ResultSet result=p.executeQuery();
			if(result.next()) {
				System.out.println("the balance is "+result.getDouble("Balance"));
			}else {
				System.out.println("the account number is wrong");
				remainingbalance();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				p.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}	

