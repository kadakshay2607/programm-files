package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ConstructConfig.xml");
		Person person= (Person) applicationContext.getBean("person");
		System.out.println(person);

	}

}
