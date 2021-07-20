package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotation.bean.Pet;

@Configuration
public class PetConfig {

	@Bean(name="pet")
	
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("brunno");
		return pet;
	}
	@Bean(name="pet1")
	public Pet getPet1() {
		Pet pet = new Pet();
		pet.setName("fruity");
		return pet;
	}

}
