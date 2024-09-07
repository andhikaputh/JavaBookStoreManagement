package com.lgcns.book.test;

import com.lgcns.book.Book;
import com.lgcns.book.Customer;
import com.lgcns.book.SecondBook;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book[]books = new Book[6];
//		books[0] = new Book("Apa itu keadilan?", "Michael Sandel", 15000, 15);
//        books[1] = new Book("Pistol, Kuman dan Besi", "Jared Diamond", 28000, 3);
//        books[2] = new Book("Street of Dark shops", "Patrick Modiano", 11000, 12);
//        books[3] = new Book("Perjalanan Mr. Cuffe menuju kebahagiaan", "Francois Leroy", 13500, 1);
//        books[4] = new SecondBook("Penjelajah warisan budaya", "Yoo Hong-Jun",13000, 45, "IU");
//        books[5] = new SecondBook("Cerita pendek Tolstoy", "Tolstoy", 16000,40, "Kim Soo-hyun");
//        
//        Customer[] customers = new Customer[2];
//        customers[0] = new Customer("Na Gong-Bu");
//        customers[1] = new Customer("Kim Shin-ip");
//    
//        System.out.println("--informasi buku--------------------------");
//        for (Book book : books) {
//            System.out.println(book.toString());
//        }
//        System.out.println("------------------------------------------------");
//        customers[0].buyBook(books[2], 3);
//        customers[0].buyBook(books[1],0);
//        customers[0].buyBook((SecondBook)books[5]);
//        customers[0].buyBook(books[0], 1);
//        customers[1].buyBook((SecondBook)books[5]);
//        customers[1].buyBook(books[3], 2);
//        customers[1].buyBook(books[1], 3);
//        System.out.println("------------------------------------------");
//        
//        System.out.println("\n--informasi buku------------------------------");
//        for (Book book : books) {
//            System.out.println(book.toString());
//        }
//        System.out.println("\n--informasi pembelian--------------------------------");
//        for (Customer customer : customers) {
//            System.out.println(customer.toString());
//        }
		

		// Kunci Jawaban
		Customer[] cust = {new Customer("Na Gong-Bu"), new Customer("Kim Sin-Ip")};
		
		Book[] book = {	new Book("Apa itu keadilan", "Michael Sandel", 15000, 15),
						new Book("Pistol, kuman dan besi", "Jared Diamond", 28000, 3),
						new Book("Street of Dark shops", "Patrick Modiano", 11000, 12),
						new Book("Perjalanan Mr.Cuffe menuju kebahagiaan", "Francois Leroy", 13500, 1) };
		
		SecondBook[] sbook = { new SecondBook("Perjalanan warisan budaya", "Yoon Hong-Jun", 13000, 45, "IU"),
								new SecondBook("Cerita Pendek Tolstoy", "Tolstoy", 16000, 40,"Kim Soohyun") };
		
		
		System.out.println("---------------------------Informasi buku-----------------------------");
		for(Book b : book){
			System.out.println(b);
		}
		for(SecondBook sb : sbook){
			System.out.println(sb);
		}
		System.out.println("------------------------------------------------------------------");
		
		cust[0].buyBook(book[2], 3);
		cust[0].buyBook(book[1], 0);
		cust[0].buyBook(sbook[1]);
		cust[0].buyBook(book[0], 1);
		cust[1].buyBook(sbook[1]);
		cust[1].buyBook(book[3], 2);
		cust[1].buyBook(book[1], 3);
		
		System.out.println("---------------------------Informasi buku-----------------------------");
		for(Book b : book){
			System.out.println(b);
		}
		for(SecondBook sb : sbook){
			System.out.println(sb);
		}
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("---------------------------Informasi pembelian--------------------------");
		for(Customer c : cust){
			System.out.println(c);
		}
		System.out.println("------------------------------------------------------------------");
	}

}
