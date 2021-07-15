package com.te.assignment;

import java.util.Scanner;

public class MainAssignmet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CrudOperations crudOperations = new CrudOperations();
		System.out.println("for Static press : 1");
		System.out.println("for dynamic press : 2");
		int a = scanner.nextInt();
		
		if (a == 1) {
			crudOperations.staticCrud();
		}
		else if (a == 2) {
			crudOperations.dynamicCrud();
		}

	}

}
