package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotation.bean.Car;
import com.te.springcoreannotation.config.CarCon;

public class CarMain {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("carconfig.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarCon.class);
		Car car = applicationContext.getBean("getCar", Car.class);
		System.out.println(car);

	}

}
