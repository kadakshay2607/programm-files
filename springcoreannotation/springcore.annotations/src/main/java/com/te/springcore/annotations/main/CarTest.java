package com.te.springcore.annotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcore.annotations.bean.Car;
import com.te.springcore.annotations.config.CarConfig;


public class CarTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		Car car =  context.getBean("car", Car.class);
		System.out.println(car.getBrand());
		System.out.println(car.getModel());
		System.out.println(car.getEngine().getCc());
		System.out.println(car.getEngine().getFuelType());
		System.out.println("----------------------------------------------");
		System.out.println(car);
	}

}
