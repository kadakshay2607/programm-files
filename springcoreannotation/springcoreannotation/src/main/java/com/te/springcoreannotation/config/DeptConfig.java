package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotation.bean.Department;

@Configuration
public class DeptConfig {

	@Bean("dept")
	public Department getDept() {
		Department department = new Department();
		department.setDid(1);
		department.setDname("research");
		return department;	
	}
	@Bean("test")
	public Department getDept1() {
		Department department = new Department();
		department.setDid(2);
		department.setDname("test");
		return department;	
	}
	@Bean("hr")
	public Department getDept2() {
		Department department = new Department();
		department.setDid(3);
		department.setDname("hr");
		return department;	
	}
}
