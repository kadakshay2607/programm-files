package com.te.demo;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		try {
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
