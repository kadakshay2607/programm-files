package com.te.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcore.annotations.bean.Pet;

@Configuration
public class PetConfig {

	@Bean(name = "pet1")
	public Pet getPets() {
		
		Pet pet = new Pet();
		pet.setName("Bruno");
		
		return pet;
		
	}
	@Bean(name = "pet2")
	public Pet getPets1() {
		
		Pet pet = new Pet();
		pet.setName("Charlie");
		return pet;
		}
}
