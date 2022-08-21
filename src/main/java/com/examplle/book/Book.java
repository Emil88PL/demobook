package com.examplle.book;

public class Book {

  
    private String book;
    private String author1;
    private String author2;
    private String author3;
    private String author4;
    private String author5;
    private double price;
    



    public Book(String book, String author1, String author2, String author3, String author4, String author5,
            double price) {
        this.book = book;
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.author4 = author4;
        this.author5 = author5;
        this.price = price;
    }


    public String getBook() {
        return book;
    }
    public void setBook(String book) {
        this.book = book;
    }
    public String getAuthor1() {
        return author1;
    }
    public void setAuthor1(String author1) {
        this.author1 = author1;
    }
    public String getAuthor2() {
        return author2;
    }
    public void setAuthor2(String author2) {
        this.author2 = author2;
    }
    public String getAuthor3() {
        return author3;
    }
    public void setAuthor3(String author3) {
        this.author3 = author3;
    }
    public String getAuthor4() {
        return author4;
    }
    public void setAuthor4(String author4) {
        this.author4 = author4;
    }
    public String getAuthor5() {
        return author5;
    }
    public void setAuthor5(String author5) {
        this.author5 = author5;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }




    public String toString() {
        return "Book:  [" + book + ", " + author1 +", " + author2 +", " + author3 + ", " +author4 + ", " +author5 +", " +price + "]"; 
    }



}




