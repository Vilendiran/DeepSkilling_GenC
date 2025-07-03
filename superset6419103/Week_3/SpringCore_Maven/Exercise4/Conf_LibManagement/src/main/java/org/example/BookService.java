package org.example;

import org.example.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(String name) {
        System.out.println("book Added: " + name);
        bookRepository.saveBook(name);
    }
}
