package com.te.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springcore.annotations.bean.Employee;

@Configuration
@Import({DepartmentConfig.class})
public class EmployeeConfig {

	@Bean
	public Employee getEmp() {

		Employee employee = new Employee();
		employee.setId(100);
		employee.setName("Smith");
		
		return employee;
	}
}
