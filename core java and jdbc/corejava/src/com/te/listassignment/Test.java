package com.te.listassignment;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(4);
		arrayList.add(2);
		arrayList.add(1);
		for (Object object : arrayList) {
			System.out.println(object);
		}
	}
	

}
