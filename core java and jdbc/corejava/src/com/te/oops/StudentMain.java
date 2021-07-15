package com.te.oops;

public class StudentMain {

	public static void main(String[] args) {
		Student student= new Student();
		student.setAge(15);
		student.setMarks(75.55);
		student.setName("aks");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getMarks());
			
	}
}
