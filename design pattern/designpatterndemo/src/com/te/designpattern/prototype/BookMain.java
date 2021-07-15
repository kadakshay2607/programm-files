package com.te.designpattern.prototype;

public class BookMain {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Bookshop bookshop = new Bookshop();
		bookshop.setShopname("novelty");
		bookshop.loadBook();
		System.out.println(bookshop);
		
		Bookshop bookshop2 = (Bookshop)bookshop.clone();
		bookshop2.setShopname("nir");
		bookshop2.getBooks().remove(1);
		//bookshop2.loadBook();
		System.out.println(bookshop2);

	}

}
