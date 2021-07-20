package com.te.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcore.annotations.bean.Car;
import com.te.springcore.annotations.bean.Engine;

@Configuration
public class CarConfig {

	@Bean
	public Engine getEng() {
		
		Engine engine = new Engine();
		engine.setCc(4000);
		engine.setFuelType("Diesel");
		
		return engine;
		
	}
	
	@Bean("car")
	public Car getCars() {
		
		Car car = new Car();
		car.setBrand("Audi");
		car.setModel("r8");
		
		return car;
	}
}







