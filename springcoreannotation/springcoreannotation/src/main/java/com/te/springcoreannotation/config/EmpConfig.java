package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springcoreannotation.bean.Employee;

@Configuration
@Import({DeptConfig.class})
public class EmpConfig {
	
	@Bean("emp")
	public Employee getEmp() {
		Employee employee = new Employee();
		employee.setId(100);
		employee.setName("smith");
		return employee;
	}

}
