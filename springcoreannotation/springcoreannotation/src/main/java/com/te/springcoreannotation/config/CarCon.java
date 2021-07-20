package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotation.bean.Car;
import com.te.springcoreannotation.bean.Engine;

@Configuration
public class CarCon {

	@Bean("car")
	public Car getCar() {
		Car car = new Car();
		car.setBrand("maruti");
		car.setModel("gtr");
		return car;
	}
	@Bean
	public Engine getEng() {
		Engine engine = new Engine();
		engine.setCc(1200);
		engine.setFueltype("petrol");
		return engine;
	}

}
