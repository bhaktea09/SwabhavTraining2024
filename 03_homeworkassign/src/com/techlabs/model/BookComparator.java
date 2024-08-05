package com.techlabs.model;

import java.util.Comparator;

public class BookComparator {

	public static class BookTitleComparator implements Comparator<Book> {
	    public int compare(Book b1, Book b2) {
	        return b1.getTitle().compareTo(b2.getTitle());
	    }
	}
	public static class BookAuthorComparator implements Comparator<Book> {
	    public int compare(Book b1, Book b2) {
	        return b1.getAuthor().compareTo(b2.getAuthor());
	    }
	}
	public static class BookPriceComparator implements Comparator<Book> {
	    public int compare(Book b1, Book b2) {
	        return Double.compare(b1.getPrice(), b2.getPrice());
	    }
	}
	public static class BookPublicationYearComparator implements Comparator<Book> {
	    public int compare(Book b1, Book b2) {
	        return Integer.compare(b2.getPublicationYear(), b1.getPublicationYear());
	    }
	}
}
