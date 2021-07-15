package com.te.list;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {

	public static void main(String[] args) {
	ArrayList<Person> arrayList = new ArrayList<Person>();

	arrayList.add(new Person(1, 3, "abc"));
	arrayList.add(new Person(4, 5, "xbc"));
	arrayList.add(new Person(8, 2, "dbc"));

	
	for (Person p  : arrayList) {
		System.out.println(p);
	}
	System.out.println(".........................");
	Collections.sort(arrayList);
	for (Person p  : arrayList) {
		System.out.println(p);
	}

}
}