package com.te.assignment;

import java.util.Scanner;

public class Player2 extends Player3  {
	private String pname2;
	private int number2;
	public Player2(int number) {
		super(number);
		this.pname2 = "Player2";
		this.number2 = number;
	}
	public Player2(){

	}
	public void guess1() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("for "+pname2+" guess the number:");
		int a = scanner.nextInt();
		if(a==this.number2) {
			this.answer2=a;
			guess2();
		}
		else {
			guess2();
		}

	}
}
