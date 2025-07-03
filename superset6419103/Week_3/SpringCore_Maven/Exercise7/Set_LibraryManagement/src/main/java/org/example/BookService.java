package org.example;

import org.example.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String message;
    public BookService(String message) {
        this.message = message;
    }
    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(String name) {
        System.out.println(message + ": Adding the book - " + name);
        bookRepository.saveBook(name);
    }
}