package com.te.springcore;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Emp;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmpConfig.xml");
		Emp emp =(Emp) context.getBean("emp");
		System.out.println(emp);

	}

}
