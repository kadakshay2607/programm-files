package com.te.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class StorePropertyFile {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("details.properties");
			Properties properties = new Properties();
			properties.setProperty("james", "123");
			properties.setProperty("john", "456");
			properties.store(fileOutputStream, "file stored");
			System.out.println("file stored sucessfully");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
