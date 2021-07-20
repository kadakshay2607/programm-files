package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PetConfig.class,AnimalConfig.class})
public class AllAnimalConfig {

}
