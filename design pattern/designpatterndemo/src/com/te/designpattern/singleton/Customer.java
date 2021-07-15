package com.te.designpattern.singleton;

public class Customer {

	public static void main(String[] args) {
		Movie movie = Movie.getTickets(8);
		System.out.println(movie);
		Movie movie1 = Movie.getTickets(10);
		System.out.println(movie1);
		Movie movie2 = Movie.getTickets(20);
		System.out.println(movie2);
		
		
	}

}
