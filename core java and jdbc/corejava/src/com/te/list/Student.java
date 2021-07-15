package com.te.list;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	int id;
	String name;
	public Student() {
		super();
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compare(Student o1, Student o2) {
	
		return o1.hashCode()-o2.hashCode();
	}

	
	
	

}
