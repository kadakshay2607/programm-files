package com.te.dynamic;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInsert {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("enter date ");
		String date = scanner.nextLine();
		
		try {
			java.util.Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
			Date dat = new Date(date2.getTime());
			System.out.println("to SQLdate Formate :"+dat);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}

	}

}
