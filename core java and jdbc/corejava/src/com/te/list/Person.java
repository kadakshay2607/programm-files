package com.te.list;

public class Person implements Comparable<Person> {
	int id;
	int rollNo;
	String name;


	@Override
	public int compareTo(Person o) {
		return this.hashCode()-o.hashCode();
	}

	@Override
	public int hashCode() {
		return this.rollNo;
	}

	@Override
	public String toString() {
		return "id=" + id + ", rollNo=" + rollNo + ", name=" + name;
	}

	public Person(int id, int rollNo, String name) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
	}

	
}
