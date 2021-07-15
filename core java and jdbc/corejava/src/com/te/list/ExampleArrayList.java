package com.te.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExampleArrayList {

	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add("aks");
		arrayList.add(1);
		arrayList.add(1.2);
		arrayList.add('a');
		arrayList.add(true);
		
		System.out.println("using for loop");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println(".......................................");
		System.out.println("using for each loop");
		for (Object object : arrayList) {
			System.out.println(object);
		}
		System.out.println(".......................................");
		System.out.println("using iterator forward");
		
		ListIterator iterator = arrayList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(".......................................");
		System.out.println("using iterator backward");
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		

	}

}
