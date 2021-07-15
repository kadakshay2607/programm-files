package com.te.mock;

import java.util.ArrayList;
import java.util.List;

public class MainLib {

	public static void main(String[] args) {
		Book b1
		= new Book("EffectiveJ Java", "Joshua Bloch");
	Book b2
		= new Book("Thinking in Java", "Bruce Eckel");
	Book b3 = new Book("Java: The Complete Reference",
					"Herbert Schildt");

	// Creating the list which contains the
	// no. of books.
	List<Book> book = new ArrayList<Book>();
	book.add(b1);
	book.add(b2);
	book.add(b3);

	Library library = new Library(book);

	List<Book> books = library.getTotalBooksInLibrary();
	for (Book bk : books) {

		System.out.println("Title : " + bk.title
						+ " and "
						+ " Author : " + bk.author);

	}

	}
}
