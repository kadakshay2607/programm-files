package com.te.restaurant;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for MenuCard");
		int no = scanner.nextInt();
		if (no == 1) {
			manager.menuCard();
		}
		System.out.println("for Bill press 2");
		int no1 = scanner.nextInt();
		 if (no1 == 2) {
			manager.bill();
		}	
	}
}
