package com.te.pack;
//akshay kad
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mock {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add('a');
		list.add("akshay");
		list.add(true);
		list.add(15);
		
		list.forEach(var -> System.out.println(var));
	}

}
