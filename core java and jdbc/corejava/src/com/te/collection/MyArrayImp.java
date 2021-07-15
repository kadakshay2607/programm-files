package com.te.collection;

import java.util.Iterator;

public class MyArrayImp {

	public static void main(String[] args) {
		MyArray myArray = new MyArray(10);
		myArray.add("sam");
		myArray.add(12);
		myArray.add('s');
		myArray.add("xyz");
		myArray.add(18);
		myArray.add('j');

		for(int i=0;i<myArray.size();i++) {
			System.out.println(myArray.get(i));
		}
		System.out.println("..........................");
		Iterator iterator = myArray.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		myArray.remove(1);
		//myArray.remove(2);
		System.out.println("after apply remove method");
		for(int i=0;i<myArray.size();i++) {
			System.out.println(myArray.get(i));
		}
		

	}
}

