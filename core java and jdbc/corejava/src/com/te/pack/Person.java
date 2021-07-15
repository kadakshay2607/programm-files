package com.te.pack;

import java.util.Comparator;

public class Person implements Comparator<Person> {
      
	int id;
	String name;
	
	
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.hashCode()-o2.hashCode();
	}

	@Override
	public int hashCode() {
		
		return this.id;
	}

	@Override
	public String toString() {
		
		return "id ="+id + " name = "+name;
	}
	

}
