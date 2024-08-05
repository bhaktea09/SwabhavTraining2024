package com.techlabs.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.model.Book;
import com.techlabs.model.BookComparator;
import com.techlabs.model.BookComparator.*;

public class BookTest {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("MORNING", " BHAKTI ", 10.99, 2000));
		books.add(new Book("HI", " MITALI ", 7.99, 2002));
		books.add(new Book("NICE", " SHWETA", 8.99, 2024));

		Collections.sort(books,new BookComparator.BookAuthorComparator()
				.thenComparing(new BookComparator.BookTitleComparator())
				.thenComparing(new BookComparator.BookPriceComparator()));
		System.out.println("Sorted by author, then title, then price:");
		for (Book book : books) {
			System.out.println(book);
		}
		Collections.sort(books,new BookComparator.BookPublicationYearComparator()
				.thenComparing(new BookComparator.BookPriceComparator())
				.thenComparing(new BookComparator.BookAuthorComparator()));
		System.out.println("Sorted by publication year, then price, then author:");
		for (Book book : books) {
			System.out.println(book);
		}

		
	}

}
