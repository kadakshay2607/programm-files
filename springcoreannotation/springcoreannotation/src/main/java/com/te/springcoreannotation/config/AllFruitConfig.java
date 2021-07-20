package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FruitConfig.class,ShopConfig.class})
public class AllFruitConfig {

}
