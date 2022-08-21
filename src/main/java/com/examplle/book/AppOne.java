package com.examplle.book;

public class AppOne {
    public static void main(String[] args) {

        
        Book myBook = new Book("Got", "aut1", "aut1", "aut1", "aut1", "aut1", 99.99);

        myBook.setBook("Got");
        myBook.setAuthor1("author1");
        myBook.setAuthor2("author2");
        myBook.setAuthor3("author3");
        myBook.setAuthor4("author4");
        myBook.setAuthor5("author5");
        myBook.setPrice(99.99);

        System.out.println(myBook);

     
    }
}
