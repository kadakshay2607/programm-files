package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotation.interfaace.Fruit;
import com.te.springcoreannotation.interfaace.Mango;
import com.te.springcoreannotation.interfaace.Orange;

@Configuration
public class FruitConfig {


	@Bean("fruit1")
	public Fruit getFruit() {
	Fruit fruit = new Mango();
	return fruit;
		
	}
	@Bean("fruit")
	public Fruit getFruit1() {
	Fruit fruit = new Orange();
	return fruit;
	
		
	}
}
