package com.te.portal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Register  {
	String name;
	String email;
	double ten;
	double diploma;
	double degree;
	int no;

	HashSet hashSet = new HashSet();
	ArrayList arrayList = new ArrayList();

	public void register() throws InvalidEmailException {
		Scanner scanner = new Scanner(System.in);

		if (no == 1) {
			System.out.println("Enter Email");
			email = scanner.nextLine();
			hashSet.add(email);
		}
		else if (no == 2) {
			System.out.println("Enter Email");
			email = scanner.nextLine();
			hashSet.add(email);
			if (hashSet.size() == 1) {
				throw new InvalidEmailException("try another email");
			}
		}
		else if (no == 3) {
			System.out.println("Enter Email");
			email = scanner.nextLine();
			hashSet.add(email);
			if (hashSet.size() == 2) {
				throw new InvalidEmailException("try another email");
			}
		}
		else if (no == 4) {
			System.out.println("Enter Email");
			email = scanner.nextLine();
			hashSet.add(email);
			if (hashSet.size() == 3) {
				throw new InvalidEmailException("try another email");
				//register();
			}
		} 


		if (no == 1) {
			System.out.println("Enter  Name");
			name = scanner.nextLine();
			arrayList.add(name);
			System.out.println("Enter 10th Marks:");
			ten = scanner.nextDouble();
			arrayList.add(ten);
			System.out.println("Enter Diploma Marks:");
			diploma = scanner.nextDouble();
			arrayList.add(diploma);
			System.out.println("Enter Degree Marks");
			degree = scanner.nextDouble();
			arrayList.add(degree);
			System.out.println("Registration Completed");
			System.out.println("..........................");
		}
		else if (no == 2) {
			System.out.println("Enter  Name");
			name = scanner.nextLine();
			arrayList.add(name);
			System.out.println("Enter 10th Marks:");
			ten = scanner.nextDouble();
			arrayList.add(ten);
			System.out.println("Enter Diploma Marks:");
			diploma = scanner.nextDouble();
			arrayList.add(diploma);
			System.out.println("Enter Degree Marks");
			degree = scanner.nextDouble();
			arrayList.add(degree);
			System.out.println("Registration Completed");
			System.out.println("..........................");

		}
		else if (no == 3) {
			System.out.println("Enter  Name");
			name = scanner.nextLine();
			arrayList.add(name);
			System.out.println("Enter 10th Marks:");
			ten = scanner.nextDouble();
			arrayList.add(ten);
			System.out.println("Enter Diploma Marks:");
			diploma = scanner.nextDouble();
			arrayList.add(diploma);
			System.out.println("Enter Degree Marks");
			degree = scanner.nextDouble();
			arrayList.add(degree);
			System.out.println("Registration Completed");
			System.out.println("..........................");

		}
		else if (no == 4) {
			System.out.println("Enter  Name");
			name = scanner.nextLine();
			arrayList.add(name);
			System.out.println("Enter 10th Marks:");
			ten = scanner.nextDouble();
			arrayList.add(ten);
			System.out.println("Enter Diploma Marks:");
			diploma = scanner.nextDouble();
			arrayList.add(diploma);
			System.out.println("Enter Degree Marks");
			degree = scanner.nextDouble();
			arrayList.add(degree);
			System.out.println("Registration Completed");
			System.out.println("..........................");

		}
	}

}



