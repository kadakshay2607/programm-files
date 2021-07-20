package com.te.springcoreannotation.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

	@Bean
	public MessageBean get() {
		MessageBean bean = new MessageBean();
		bean.setMess("hi are you learn core");
		return bean;
		
	}
	@Bean
	public MyBeanFactoryPostProcessor get1() {
		
		return new MyBeanFactoryPostProcessor();
		
	}
	@Bean
	public MyPostProcessor get2() {
		
		return new MyPostProcessor();
		
	}
}
