package com.te.javaafeature;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class StreamApi1 {

	public static void main(String[] args) {
		ArrayList<Ele>arrayList = new ArrayList<Ele>();
		arrayList.add(new Ele(10,"hp",6000));
		arrayList.add(new Ele(11,"acer",8000));
		arrayList.add(new Ele(12,"lenovo",10000));

		List list = arrayList.stream().filter(laptop -> laptop.price>7000).map(laptop -> laptop.price).collect(Collectors.toList());
		System.out.println(list);
	}

}
