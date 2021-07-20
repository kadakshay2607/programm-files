package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Student;

public class StudentMain {

	public static void main(String[] args) {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("StudentConfig.xml");
    Student student =(Student) applicationContext.getBean("stuName");
    System.out.println(student.getNames());
    
    Student student1 =(Student) applicationContext.getBean("stuAddress");
    System.out.println(student1.getAddress());
    
    Student student2 =(Student) applicationContext.getBean("stuMap");
    System.out.println(student2.getMap());

	}

}
