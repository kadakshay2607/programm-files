package com.te.portal;

import java.util.Scanner;

public class JobPortalMain {

	public static void main(String[] args) {
		Login login = new Login();
		
		int i =1;
		for(;;) {
			login.no = i;
			Scanner scanner = new Scanner(System.in);
			System.out.println("For Register press : 1 / for Login press 2");
			int n = scanner.nextInt();
			if (n == 1) {
				try {
					login.register();
				} catch (InvalidEmailException e) {
					System.out.println(e.getMessage());
				}	
			}
			else if (n == 2) {
				try {
					login.login();
				} catch (InvalidEmailException e) {
					System.out.println(e.getMessage());
				}
			}
			else {
				System.out.println("Please enter valid input ");
			}
			i++;
		}	       
	}
}
