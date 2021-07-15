package com.te.assignment;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = scanner.nextInt();
		Player1 player1 = new Player1(a);
		player1.guess();
	    if(player1.again()==0) {
	    	player1.guess();
	    }

	}
}
