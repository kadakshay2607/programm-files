package com.te.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("Config.xml");
		Employee em = (Employee) beanFactory.getBean("emp");
		
		System.out.println(em);
		
	}

}
