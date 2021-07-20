package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotation.interfaace.Cat;
import com.te.springcoreannotation.interfaace.Dog;

@Configuration
public class AnimalConfig {
	
	@Bean ("dog")
	@Primary
	public Dog getDog() {
		Dog dog = new Dog();
		return dog;
		
	}
	@Bean("cat")
	public Cat getCat() {
		
		return new Cat();
		
	}

}
