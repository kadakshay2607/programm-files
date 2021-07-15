package com.te.mock;

import com.te.javaafeature.Demo1;

public class Child {
	
	public static void test( int a) {
		
		System.out.println("test method");
		if (a == 4) {
			return;
		}
		a++;
		test(a);
		
	}
	public static void main(String[] args) {
		test(1);
		
	}

	
   
    
    
    	
    	
    	
	
    
    
    
	
}
