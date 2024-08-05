package com.techlabs.test;

import com.techlabs.model.*;

import java.util.*;

public class BookTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();
       
        book[] books = new book[n];
        
        for (int i = 0; i < n; i++) {
           
            System.out.print("Enter Book name: ");
            String name = scanner.next();
                                                                   
            System.out.print("Enter Author name: ");
            String author = scanner.next();

            System.out.print("Enter Book Price: ");
            int price = scanner.nextInt();

            System.out.print("Enter Publication: ");
            String publication = scanner.next();

       books[i] = new book(name,author, price, publication);
        }
        
        Arrays.sort(books, (b1,b2)-> Double.compare(b2.getprice(),b1.getprice()));

        System.out.println("\nBooks sorted by price in descending order:");
        for (book book : books) {
            System.out.println("book name: "+book.getname());
            System.out.println("author name: "+book.getauthor());
            System.out.println("book price: "+book.getprice());
            System.out.println("publication : "+book.getpublication());
        }
    }
}
