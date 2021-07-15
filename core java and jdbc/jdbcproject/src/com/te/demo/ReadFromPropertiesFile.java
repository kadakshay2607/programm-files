package com.te.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadFromPropertiesFile {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream =  new FileInputStream("details.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			System.out.println("first : "+properties.getProperty("james"));
			System.out.println("second : "+properties.getProperty("john"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
