package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotation.bean.Student;

@Configuration
public class StudentConfig {
	
	@Bean("one")
	public Student studOne() {
		return new Student();
		
	}
	//setter injection
	@Bean("two")
	public Student studTwo() {
		Student student = new Student();
		student.setId(1);
		student.setName("john");
		return student;
		
	}
	// constructor injection
	@Bean("three")
	@Primary
	public Student studThree() {
		Student student = new Student(2,"james");
		return student;
		
	}

}
