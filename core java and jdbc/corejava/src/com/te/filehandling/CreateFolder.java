package com.te.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFolder {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\akshay kad\\Desktop\\TYBATCH12\\document");
        if (!file.exists()) {
        	file.mkdir();
        	System.out.println("A new folder created.");
		} else {
			System.out.println("A folder is already created.");
		}
        File file2 = new File("C:\\\\Users\\\\akshay kad\\\\Desktop\\\\TYBATCH12\\\\document\\new.txt");
        try {
			file2.createNewFile();
			System.out.println("file is created");
		} catch (IOException e) {
			System.out.println("unabl to create");
		}
	}

}
