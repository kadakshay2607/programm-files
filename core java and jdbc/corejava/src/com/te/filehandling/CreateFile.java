package com.te.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\akshay kad\\Desktop\\TYBATCH12\\new.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("File not create");
		}

	}

}
