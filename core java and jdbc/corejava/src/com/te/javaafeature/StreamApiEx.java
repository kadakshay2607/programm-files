package com.te.javaafeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx {

	public static void main(String[] args) {
		
		ArrayList<Electronic> arrayList =  new ArrayList<Electronic>();
		arrayList.add(new Electronic(10,"hp",60000));
		arrayList.add(new Electronic(11,"dell",80000));
		arrayList.add(new Electronic(12,"acer",20000));
		arrayList.add(new Electronic(13,"lenovo",30000));

		List list = arrayList.stream().filter(laptop ->laptop.price >30000).map(laptop -> laptop.price).collect(Collectors.toList());
		System.out.println(list);

	}

}
