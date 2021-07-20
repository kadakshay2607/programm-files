package com.te.springcoreannotation.lifecycle;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class MessageBean implements Serializable,InitializingBean,DisposableBean
{

	private String mess;
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initialize");
		
	}

}
