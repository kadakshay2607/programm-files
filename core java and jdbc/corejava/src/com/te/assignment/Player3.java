package com.te.assignment;

import java.util.Scanner;

public class Player3 extends Umpire {
	private String pname3;
	private int number3;
	public Player3(int number) {
		this.pname3 = "Player3";
		this.number3 = number;
	}
	public Player3(){

	}
	public void guess2() {
		this.c = number3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("for "+pname3+" guess the number:");
		int a = scanner.nextInt();
		if(a==this.number3) {
			this.answer3 = a;
			decision();
		}
		else if((this.answer1 == this.c)|| (this.answer2 == this.c)){
			decision();
		}
		else if(a!=number3) {
			fail();
		}

	}

}
