package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotation.bean.Shop;

@Configuration
public class ShopConfig {
	
	@Bean("ar")
	public Shop getMango() {
		Shop shop =new Shop();
		shop.setName("alphanso");
		return shop;
		
	}
	@Bean("hr")
	public Shop getMango1() {
		Shop shop =new Shop();
		shop.setName("hapus");
		return shop;
		
	}

}
