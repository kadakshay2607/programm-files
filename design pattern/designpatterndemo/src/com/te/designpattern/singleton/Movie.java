package com.te.designpattern.singleton;

public class Movie {
	private  Movie() {
		
	}
	private static Movie movies;
	static int tickets = 50;
	
	public static Movie getTickets(int noOfTicket) {
		if (movies == null) {
			movies = new Movie();
		}
		System.out.println("no of ticket available are "+ tickets);
		tickets -= noOfTicket;
		System.out.println(noOfTicket+" booked sucessfully.");
		System.out.println("no of ticket available are "+tickets);
		return movies;
		
		
	}

}
