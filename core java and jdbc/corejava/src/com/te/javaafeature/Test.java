package com.te.javaafeature;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

     List<String> list = Arrays.asList("c","php","c++","python");
     
     for (int i = 0; i < list.size(); i++) {
		System.out.println("values :"+ list.get(i));
		
	}
     System.out.println("..............................");
     
     for (String string : list) {
		System.out.println(string);
	}
     System.out.println("..............................");
     
     list.forEach(var -> System.out.println(var));
     

	}

}
