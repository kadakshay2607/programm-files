package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("config.xml");
//		Employee employee = (Employee) beanFactory.getBean("emp");
	
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = (Employee) context.getBean("emp");
		
		
		System.out.println(employee);
		
		
	}

}
