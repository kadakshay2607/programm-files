package com.te.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcore.annotations.bean.Student;

@Configuration
public class StudentConfig {

	@Bean(name = "one")
	public Student student1() {
		return new Student();
	}

// setter injection
	@Bean(name = "two")
	public Student student2() {

		Student student = new Student();
		student.setId(23);
		student.setName("Salman");
		return student;
	}

	// constructor injection(for constructor injection we need to have a param const. in the class)
	@Bean(name = "three")
	@Primary
	public Student student3() {

		Student student = new Student(12, "John");
		return student;
	}

}
