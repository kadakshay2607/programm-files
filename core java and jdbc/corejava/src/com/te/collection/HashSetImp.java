package com.te.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class HashSetImp {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee(10, "abc", 10000));
		set.add(new Employee(15, "pqr", 5000));
		set.add(new Employee(12, "xyz", 40000));
		System.out.println("before sorting");
		for (Employee employee : set) {
			System.out.println(employee);
		}
		LinkedList<Employee> linkedList = new LinkedList<Employee>(set);
		Collections.sort(linkedList);
		System.out.println("after sorting");
		for (Employee employee : linkedList) {
			System.out.println(employee);
		}
		System.out.println("after tree set");
		TreeSet<Employee> treeSet = new TreeSet<Employee>(set);
		for (Employee employee : treeSet) {
			System.out.println(employee);
		}
		LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet<Employee>(set);
		System.out.println("after linkedhashset");
		for (Employee employee : linkedHashSet) {
			System.out.println(employee);
		}

	}

}
