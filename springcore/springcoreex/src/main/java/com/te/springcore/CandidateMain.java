package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Candidate;

public class CandidateMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("canConfig.xml");
		Candidate candidate =(Candidate) context.getBean("can");
		System.out.println(candidate);

	}

}
