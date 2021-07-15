
package com.te.customexception;

import java.util.Scanner;

public class MainElection {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the age :");
		int ac = scanner.nextInt();
		Election election = new Election();
		try {
			election.ageCheck(ac);
		} catch (InvalidAgeException e) {
			
			e.getMessage();
		}
	

	}

}
