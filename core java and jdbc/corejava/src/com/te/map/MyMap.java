package com.te.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("xyz", 100);
		map.put("pqr", 400);
		map.put("abc", 200);
		map.put("lmn", 800);
		
		System.out.println(map);
		System.out.println("using get method");
		System.out.println(map.get("xyz"));
		System.out.println("using remove method");
		System.out.println(map.remove("abc"));
		
		Set set = map.keySet();// to transfer only key to set
		System.out.println("using keyset method");
		System.out.println(set);
		System.out.println("using value method");
		Collection collection = map.values();// to transfer only values to collection
		System.out.println(collection);
		Set set1 = map.entrySet();
		Iterator iterator = set1.iterator();
		System.out.println("using entry set method");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
