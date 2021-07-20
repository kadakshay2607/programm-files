package com.te.springcore.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Candidate;

public class CandidateMain {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("canconfig.xml");
		Candidate candidate =(Candidate) context.getBean("canid");
		System.out.println(candidate);

	}

}
