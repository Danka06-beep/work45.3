package com.company;

import java.util.ArrayList;

public class Book {
    static ArrayList<Book> arrayBook = new ArrayList<>();
    String author;
    String name;
    String years;
    String genre;

    public Book(String author, String name, String years, String genre) {
        this.author = author;
        this.name = name;
        this.years = years;
        this.genre = genre;
    }
    public void addBook(){
        arrayBook.add(this);
    }
    @Override
    public String toString() {
        return "Book{" + "author='" + author + '\'' + ", name='" + name + '\'' + ", years='" + years + '\'' + ", genre='" + genre + '\'' + '}';
    }
}
