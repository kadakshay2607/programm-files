package com.te.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateWriter {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("C:\\\\\\\\Users\\\\\\\\akshay kad\\\\\\\\Desktop\\\\\\\\TYBATCH12\\\\\\\\document\\\\new.txt");
			fileWriter.write("hi , how are you?");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("unable to create file");
		}

	}

}
