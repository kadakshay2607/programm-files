package com.te.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileScan extends CreateReader {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the input:");
			FileWriter fileWriter = new FileWriter("C:\\Users\\akshay kad\\Desktop\\TYBATCH12\\document\\new.txt");
			String str = scanner.nextLine();
			fileWriter.write(str);
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("unable to create file");

		}
		reader();
	}

}
