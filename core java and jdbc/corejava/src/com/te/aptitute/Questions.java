package com.te.aptitute;

import java.util.Scanner;

public class Questions {
	
	String [] str = new String[20];
	int [] a = new int [20];
	int skip;
	int per;
	
	Scanner scanner = new Scanner(System.in);
	
	public void mcq() {
		int i = 1;
		for (int j = 0; j < str.length; j++) {
			str[j] = "Q."+i+"  What is correct option ?"
					+" 1.option"
					+" 2.option"
					+" 3.option"
					+" 4.option"
					+" Skip=5";
			i++;
		}
	}
	public void start() {
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
			System.out.println("Enter your choice");
			int no = scanner.nextInt();
			if (no == 1) {
				a[j] = 1;
			}
			else if (no == 2) {
				a[j] = 0;
			}
			else if (no == 3) {
				a[j] = 0;
			}
			else if (no == 4) {
				a[j] = 1;
			}
			else if (no == 5) {
				a[j] = 0;
				skip++;
			}
		}
	}
	public void result() {
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				count++;
			}
		}		
		System.out.println("No of Correct Option is : " + count);
		System.out.println("No of Questions Skipped :" + skip);
		 per = count/a.length*100;
		System.out.println("Percentage for Test Is : " + per);
		if ((count >= 3) && (count <= 8)) {
			System.out.println("Performance is bad");	
		}
		else if ((count >= 9) && (count <= 13)) {
			System.out.println("Performance is good");
		}
		else if ((count >= 14) && (count <= 17)) {
			System.out.println("Performance is very good");
		}
		else if ((count >= 18) && (count <= 20)) {
			System.out.println("Performance is very Excellent");
		}
		else if (count >= 12) {
			System.out.println("eligible for next round");
		}
		System.out.println("....................................");
		
	}

}



