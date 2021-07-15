package com.te.mock;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {


		List list = new ArrayList ();
		list.add('a');
		list.add(5);
		list.add("aks");
		
		list.forEach(var -> System.out.println(var));

	}

}
