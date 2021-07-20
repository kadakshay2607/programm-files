package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Student;

public class StudentTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
		
		Student student = (Student) context.getBean("studentNames");
		
		System.out.println(student.getNames());
		System.out.println(student.getAddresses());
		System.out.println(student.getCourses());
		
		System.out.println("------------------------------------------");
		
		Student student1 =   (Student) context.getBean("studentAddresses");
		
		System.out.println(student1.getAddresses());
//		
		System.out.println("------------------------------------------");
		
		Student student2 = (Student) context.getBean("studentCourses");
		System.out.println(student2.getCourses());
	}

}
