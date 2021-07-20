package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Person;

public class PersonTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ciConfig.xml");
		
		Person person = (Person) context.getBean("person");
		
		System.out.println(person);
		
	}

}
