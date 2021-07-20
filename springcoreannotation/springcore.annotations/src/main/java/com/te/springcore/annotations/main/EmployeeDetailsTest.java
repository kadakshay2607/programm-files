package com.te.springcore.annotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcore.annotations.bean.Employee;
import com.te.springcore.annotations.config.EmployeeConfig;

public class EmployeeDetailsTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee = context.getBean("getEmp", Employee.class);
		System.out.println(employee);
	}

}
