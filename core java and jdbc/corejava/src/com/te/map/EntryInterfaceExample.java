package com.te.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryInterfaceExample {


	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("xyz", 100);
		map.put("pqr", 400);
		map.put("abc", 200);
		map.put("lmn", 800);

		System.out.println(map);
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Entry<String, Integer> entry2 : entry) {
			System.out.println(entry2.getKey()+entry2.getValue());
			if (entry2.getKey().equals("xyz")) {
				entry2.setValue(300);
				
			}
		}
		System.out.println(map);
	}
}
