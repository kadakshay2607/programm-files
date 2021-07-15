package com.te.oops;

public class Book {
	String title;
	String author;
	double price;

	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	public Book(String title,String author,Double price) {
		this(title,author);
		this.price=price;
	}
	public void display() {
		System.out.println("Title :"+ title);
		System.out.println("author :"+author);
		System.out.println("price :"+price);
		
	}
		
	}