package com.te.springcoreannotation.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MessageMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageConfig.class);
		
		MessageBean a = applicationContext.getBean("get",MessageBean.class);
		System.out.println(a.getMess());
		((AbstractApplicationContext) applicationContext).registerShutdownHook();
	}

}
