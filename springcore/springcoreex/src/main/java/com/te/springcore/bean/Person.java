package com.te.springcore.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Person implements Serializable {
	
	private int pid;
	private int  page;
	
	public Person(int pid, int page) {
		System.out.println("this is int , int");
		this.pid = pid;
		this.page = page;
	}
	public Person(double pid, double page) {
		System.out.println("this is double , double");
		this.pid = (int) pid;
		this.page = (int) page;
	}
	public Person(String pid, String page) {
		System.out.println("this is string , string");
		this.pid = Integer.parseInt(pid);
		this.page = Integer.parseInt(page);
	}
	

}
