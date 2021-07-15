package com.te.assignment;

import java.util.Scanner;

import com.te.demo1.MethodMain;
import com.te.game.MainClass;

public class Player1 extends Player2 {
	private String pname;
	private int number1;
	public int getNumber() {
		return number1;
	}
	public void setNumber(int number) {
		this.number1 = number;
	}
	public Player1(int number) {
		super(number);
		this.pname = "player1";
		this.number1 = number;
	}
	public Player1(){

	}
	public void guess() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("for "+"Player1" +" guess the number:");
		int a = scanner.nextInt();
		if(a==this.number1) {
			this.answer1=a;
			guess1();

		}
		else {
			guess1();
		}

	}
}


