package com.te.demo1;

public class Arrays {

	public static void main(String[] args) {
		int []array = new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
	int[] array1  = new int[5]; 
	for(int i=0;i<array.length;i++) {
		int j=0;
		array1[i]=array[j];
         j++;
	}
	for(int ar:array1) {
		System.out.println(ar);
	}
	}
}
