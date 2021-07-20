package com.te.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcore.annotations.interfaces.Animal;
import com.te.springcore.annotations.interfaces.Cat;
import com.te.springcore.annotations.interfaces.Dog;

@Configuration
public class AnimalConfig {
	
	@Bean("doginstance")
	public Animal getDog() {
		
	Animal animal = new Dog();
	return animal;
	
	}

	@Bean("catinstance")
	public Animal getCat() {
		
	Animal animal = new Cat();
	return animal;
	
	}

}
