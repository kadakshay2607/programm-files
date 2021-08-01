package com.te.empapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class LocalEntityManagerConfig {

	@Bean
	public LocalEntityManagerFactoryBean getFactory() {
		
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		
		factoryBean.setPersistenceUnitName("ems");
		
		return factoryBean;
	}
}
