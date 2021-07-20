package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.StudentDetails;

public class StudentDetailsMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("referenceConfig.xml");
		
//		StudentAddress studentAddress =  (StudentAddress) context.getBean("address");
//		
//		System.out.println(studentAddress);
		StudentDetails details =   (StudentDetails) context.getBean("studentDetails");
		
		System.out.println(details);
		
		
	}
}
