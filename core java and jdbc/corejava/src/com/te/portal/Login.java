package com.te.portal;

import java.util.Scanner;

public class Login extends Register  {

	public void login() throws InvalidEmailException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter valid email ");
		String emailid = scanner.nextLine();
		if(hashSet.contains(emailid)) {
			System.out.println("Login Successfully");
			System.out.println("  Name   10M   DipM  DegM" );
			System.out.println(arrayList);
			System.out.println("..................................");
			System.out.println("Press 1 For Apply Drive");
			int j = scanner.nextInt();
			System.out.println("Company require 60% throughout academic");
			if (j == 1) {
				if((ten>=60)&&(diploma>=60)&&(degree>=60)) {
					System.out.println("Eligible for Drive");
					System.out.println("...............................");
				}
				else {
					System.out.println("Not eligible for drive");
					System.out.println("...............................");

				}
			}
		}

			else {
				throw new InvalidEmailException("Please register! First");
			}
		
	}

}
