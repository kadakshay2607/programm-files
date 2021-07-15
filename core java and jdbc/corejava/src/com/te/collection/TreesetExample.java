package com.te.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(60);
		set.add(20);
		set.add(90);
		set.add(100);
		
		System.out.println(set);
		System.out.println("smallest element:"+ set.first());
		System.out.println("larger element"+set.last());
		
		SortedSet set2 = set.headSet(60);// return element upto 60 exclude
		System.out.println("............headset.....................");

		for (Object object : set2) {
			System.out.println(object);
		}
		System.out.println(".............tailset.....................");
		SortedSet set3 = set.tailSet(20);//return element above 20 include 20
		for (Object object : set3) {
			System.out.println(object);
		}
		SortedSet set4 = set.subSet(20, 90);// return element 20 include upto 90 exclude
		System.out.println(".............subset.....................");
        for (Object object : set4) {
			System.out.println(object);
		}
	}

}
