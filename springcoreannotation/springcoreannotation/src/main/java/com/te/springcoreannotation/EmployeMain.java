package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotation.bean.Employee;
import com.te.springcoreannotation.config.EmpConfig;

public class EmployeMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee employee = applicationContext.getBean(Employee.class);
		System.out.println(employee);
	}

}
