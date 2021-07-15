package com.te.pack;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(name);
	}

	@Override
	public String toString() {// TODO Auto-generated method stub
		return "id ="+id+"  name :"+name;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
	

}
