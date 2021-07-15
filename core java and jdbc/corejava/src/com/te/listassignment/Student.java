package com.te.listassignment;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	int id;
	String className;
	String name;
	int age;
	int marks;
	static int a;	

	public Student( int id, String className, String name, int age, int marks) {
		this.id = id;
		this.className = className;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "id=" + id + ", className=" + className + ", name=" + name + ", age=" + age + ", marks=" + marks;
	}
	@Override
	public int compare(Student o1, Student o2) {
			if (a == 1) {
				return o1.id-o2.id;
			}
			else if (a == 2) {
				return o1.className.compareTo(o2.className);
			}else if (a == 3) {
				return o1.name.compareTo(o2.name);
			}else if (a == 4) {
				return o1.age-o2.age;
			}
			return o1.marks-o2.marks;
	}

	@Override
	public int hashCode() {
		return 0;
	}
	public Student() {
		super();
	}
	
	}



