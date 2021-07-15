package com.te.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CreateReader {
	
	public static void reader() {
		try {
			FileReader fileReader = new FileReader("C:\\Users\\akshay kad\\Desktop\\TYBATCH12\\document\\new.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String str	= bufferedReader.readLine();
			System.out.println("Text in file is :");
			System.out.println(str);
		} catch (Exception e) {
			System.out.println("file not create");
		}
	}

	public static void main(String[] args) {
		reader();
	}

}
