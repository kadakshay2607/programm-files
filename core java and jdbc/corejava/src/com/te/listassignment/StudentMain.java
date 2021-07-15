package com.te.listassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class StudentMain {
	static int n ;
	public static void main(String[] args) {

		for(;;) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("For id =1/className=2/ name=3/ age=4/ marks=5/ Exit=6");
			int no = scanner.nextInt();
			n = no;
			Student.a = n;
			List<Student> list = new ArrayList<Student>();
			list.add(new Student(2, "1st", "abc", 6, 55));
			list.add(new Student(3, "3rd", "zqr", 9, 45));
			list.add(new Student(1, "5th", "pyz", 13, 83));
			Collections.sort(list, new Student());
			if(n == 6) {
				System.out.println("exit from the program");
				break;
			}else if((n>6)) {
				System.out.println("Please enter valid input");
				continue;
			}
			for (Student student : list) {
				System.out.println(student);
			}
			System.out.println(".....................................................");
		}

	}

}




