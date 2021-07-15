package com.te.restaurant;

import java.util.Scanner;

public class Manager {
	int[] item = {40,10,60,20,15};
	int m,t,d,c,p;

	public void menuCard() {
		String [] strings = new String[5];
		strings[0] = "Misal  --- Price-40rs";
		strings[1] = "Tea    --- Price-10rs";
		strings[2] = "Dosa   --- Price-60rs";
		strings[3] = "Coeffe --- Price-20rs";
		strings[4] = "Poha   --- Price-15rs";
		for (String string : strings) {
			System.out.println(string);
		}
		System.out.println(".............................");
		System.out.println("Please enter your order");
		order();
	}
	public void order() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("for Misal=1/ Tea=2/ Dosa=3/ Coeffe=4/ Poha=5/ exit=6");
		int a = scanner.nextInt();
		if (a == 1) {
			m = item[0];
			order();
		}
		else if (a == 2) {
			t = item[1];
			order();
		}
		else if (a == 3) {
			d = item[2];
			order();
		}
		else if (a == 4) {
			c = item[3];
			order();
		}
		else if (a == 5) {
			p = item[4];
			order();
		}
		else if (a == 6) {

		}
	}
	public void bill() {
		int [] bill = new int[5];
		bill[0] = m;
		bill[1] = t;
		bill[2] = d;
		bill[3] = c;
		bill[4] = p;
		int k = bill[0]+bill[1]+bill[2]+bill[3]+bill[4];
		System.out.println(".................................");
		System.out.println("Total  Amount Is : "+ k + " Rs");
		System.out.println(".................................");
		System.out.println("Order Placed Successfully");
	}

}
