package com.te.aptitute;

import java.util.Scanner;

public class AptituteMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Questions questions = new Questions();
        questions.mcq();
        System.out.println("For Start test press 1");
        int m = scanner.nextInt();
        if (m == 1) {
			questions.start();
		}
        for (int string : questions.a) {
			System.out.println(string);
		}
        System.out.println("For result press 2");
        int n = scanner.nextInt();
        if (n == 2) {
			questions.result();
		}
        
        
	}

}
