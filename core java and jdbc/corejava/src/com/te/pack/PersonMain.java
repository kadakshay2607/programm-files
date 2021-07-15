package com.te.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		
		List<Person> arrayList = new ArrayList<Person>();
		arrayList.add(new Person(5, "scott"));
		arrayList.add(new Person(1, "jame"));
		arrayList.add(new Person(3, "akshay"));
		arrayList.add(new Person(2, "wlliam"));
		
		for (Person person : arrayList) {
			System.out.println(person);
		}
		Collections.sort(arrayList, new Person());
		for (Person person : arrayList) {
			System.out.println(person);
		}
		

	}

}
