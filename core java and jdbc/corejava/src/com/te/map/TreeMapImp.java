package com.te.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapImp {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("xyz", 100);
		map.put("pqr", 400);
		map.put("abc", 200);
		map.put("lmn", 800);
		System.out.println(map);
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Entry<String, Integer> entry2 : entry) {
			System.out.println(entry2.getValue());
		}
		System.out.println("according to values");
		Collection collection = map.values();
		for (Object object : collection) {
			System.out.println(object );
		}
		System.out.println("according to values");
		TreeSet set = new TreeSet(collection);
		System.out.println(set);
		System.out.println("according to keys");
		Set set2 = map.keySet();
		System.out.println(set2);
		ArrayList arrayList = new ArrayList(set2);
		Collections.sort(arrayList);
		System.out.println("using arraylist sort method");
		for (Object object : arrayList) {
			System.out.println(object);
			
		}
	}

}
