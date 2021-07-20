package com.te.springcore.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class LifeCycleInterfaces implements InitializingBean , DisposableBean{

	private int id;

	@Override
	public void destroy() throws Exception {
		System.out.println("Interface way of destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Interface way of init");
		
	}
}
