package com.te.mock;

import com.te.deadlock.Test;

public class AnomonusArray {

	public static void test(int[] a) {
		int total = 0;
		for (int i : a) {
			total = total + i;
		}
		System.out.println(total);
		
	}
	public static void main(String[] args) {
		
    test(new int[] {1, 2, 3} );
	

}
}
