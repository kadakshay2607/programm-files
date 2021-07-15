package com.te.scrumteam2;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) throws Exception {
		BankDataBase bankDataBase = new BankDataBase();
		Scanner sc = new Scanner(System.in);
	
		for(;;) {
			System.out.println("for Register= 1 / Withdraw=2 / RemainingBalance=3 / Exit=4");
			int a = sc.nextInt();
			if (a == 1) {
				bankDataBase .Insert();
			}
			else if (a == 2) {
				bankDataBase.withdrawl();
			}
			else if (a == 3) {
				bankDataBase.remainingbalance();
			}
			else if (a == 4) {
				break;
			}
		
		}
	
	}

}