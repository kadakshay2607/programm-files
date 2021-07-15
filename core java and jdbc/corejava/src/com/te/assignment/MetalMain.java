package com.te.assignment;

public class MetalMain {

	public static void main(String[] args) {
		Shop shop= new Shop();
		shop.keep(new Silver());
		System.out.println("......................");
		shop.keep(new Gold());
		

	}

}
