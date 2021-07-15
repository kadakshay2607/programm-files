package com.te.assignment;

import java.util.Scanner;

import com.te.operators.SwitchCase;

public class AssignmentSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		System.out.println("Enter the month :");
		int month = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println(month+"st month has 31 days");
			break;
		case 2:
			if(year%4==0){
				System.out.println(month+"nd month has 29 days");
			}
			else{
				System.out.println(month+"nd month has 28 days");
			}
			break;
		case 3 :
			System.out.println(month+"th month has 31 days");
			break;
		case 4 :
			System.out.println(month+"th month has 30 days");
			break;
		case 5 :
			System.out.println(month+"th month has 31 days");
			break;
		case 6 :
			System.out.println(month+"th month has 30 days");
			break;
		case 7 :
			System.out.println(month+"th month has 31 days");
			break;
		case 8 :
			System.out.println(month+"th month has 31 days");
			break;
		case 9 :
			System.out.println(month+"th month has 30 days");
			break;
		case 10 :
			System.out.println(month+"th month has 31 days");
			break;
		case 11 :
			System.out.println(month+"th month has 30 days");
			break;
		case 12 :
			System.out.println(month+"th month has 31 days");
			break;
		default:
			System.out.println("enter valid input");
		}
		String res = (year%4==0)? " is leap year":" is not leap year";
		System.out.println(year+ res);
	}
}
