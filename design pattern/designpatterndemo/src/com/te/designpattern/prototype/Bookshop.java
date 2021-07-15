package com.te.designpattern.prototype;

import java.util.ArrayList;

import java.util.List;

public class Bookshop implements Cloneable{
	
	
	private String shopname;
	private List<Book> books = new ArrayList<Book>();
	
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadBook() {
		for(int i=1;i<=5;i++) {
			Book book = new Book();
			book.setBid(i);
			book.setBname("book"+i);
			getBooks().add(book);
		}
	}
	@Override
	public String toString() {
		return "Bookshop [shopname=" + shopname + ", books=" + books + "]";
	}
	//deep cloning
	@Override
	public Object clone() throws CloneNotSupportedException {
		Bookshop bookshop = new Bookshop();
		for (Book book : getBooks()) {
			bookshop.getBooks().add(book);
		}
		return bookshop;
	}
	//shallow cloning
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	

}
