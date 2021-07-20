package com.te.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.te.springcore.annotations.bean.Department;

@Configuration
public class DepartmentConfig {
	
	@Bean(name = "dev")
	public Department getDev() {
		Department department = new Department();
		department.setDId(1);
		department.setDName("Development");
		return department;
	}
	
	@Bean(name = "test")
	public Department getTest() {
		Department department = new Department();
		department.setDId(2);
		department.setDName("Testing");
		return department;
	}
	@Bean(name = "hr")
	public Department getHr() {
		Department department = new Department();
		department.setDId(3);
		department.setDName("Hr");
		return department;
	}
}
