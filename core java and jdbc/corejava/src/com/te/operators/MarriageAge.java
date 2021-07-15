package com.te.operators;

import java.util.Scanner;

public class MarriageAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter age:");
		int age = scanner.nextInt();
		if (age>=27) {
			if (age<=35) {
				System.out.println("fit for marriage");	
			}
			else {
				System.out.println("no use");
			}
		}
		else {
			System.out.println("not eligiable");
		}
	}

}
