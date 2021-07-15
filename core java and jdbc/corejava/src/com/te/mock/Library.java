package com.te.mock;

import java.util.List;

public class Library {
	private final List<Book> books;

	Library(List<Book> books) { this.books = books; }

	// Getting total number of books
	public List<Book> getTotalBooksInLibrary()
	{

		return books;
	}
	
	

}
