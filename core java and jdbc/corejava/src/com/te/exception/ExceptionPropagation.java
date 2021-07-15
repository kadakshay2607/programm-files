package com.te.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionPropagation {

	public static void main(String[] args) throws IOException {
		excep();

	}
	public static void excep() throws IOException {
		File file = new File("C:\\Users\\akshay kad\\Desktop\\TYBATCH12\\new.txt");
		file.createNewFile();
		
	}

}
