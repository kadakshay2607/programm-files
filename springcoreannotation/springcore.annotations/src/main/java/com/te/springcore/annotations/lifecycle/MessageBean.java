package com.te.springcore.annotations.lifecycle;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class MessageBean implements Serializable, InitializingBean , DisposableBean{

	private String msg;

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initialize");
	}
}
