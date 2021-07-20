package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotation.bean.Student;
import com.te.springcoreannotation.config.StudentConfig;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student);

	}

}
