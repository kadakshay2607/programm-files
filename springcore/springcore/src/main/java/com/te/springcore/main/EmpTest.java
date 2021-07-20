package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Emp;

public class EmpTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		Emp  emp =  (Emp) context.getBean("emp");
		System.out.println(emp);
	}

}
