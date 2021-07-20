package com.te.springcore.annotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcore.annotations.bean.Student;
import com.te.springcore.annotations.config.StudentConfig;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = context.getBean(Student.class);
		
		Student student1 = context.getBean("one" , Student.class);
		
		Student student2 = context.getBean("two" ,Student.class);
		System.out.println(student);
		System.out.println(student1);
		System.out.println(student2);
	}
}
