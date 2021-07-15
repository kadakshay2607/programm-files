package com.te.assignment;

import java.util.Scanner;

public class AssignmentLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		System.out.println("Enter the month :");
		int month = sc.nextInt();
		if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) {
			System.out.println(month + " month has 31 days");
			String	res=(year%4==0) ? " is leap year":" is not leap year";
			System.out.println(year + res);
		}
		else if((month==4)||(month==6)||(month==9)||(month==11)) {
			System.out.println(month + " month has 30 days");
			String	res1=(year%4==0) ? " is leap year":" is not leap year";
			System.out.println(year + res1);
		}
		else if((month==2)&&(year%4==0)) {
			System.out.println(month + " month has 29 days.");
			System.out.println(year +" is leap year");
		}
		else if(month==2&&(year%4!=0)) {
			System.out.println(month + " month has 28 days.");
			System.out.println(year + " is not leap year");
		}
		else {
			System.out.println("Please enter valid input");
		}
	}

}
