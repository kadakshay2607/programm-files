package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDetailsMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("detailsConfig.xml");

		StudentDetails details	= (StudentDetails) context.getBean("deat");
		System.out.println(details);

	}

}
