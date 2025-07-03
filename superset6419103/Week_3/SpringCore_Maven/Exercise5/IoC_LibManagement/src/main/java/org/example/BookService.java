package org.example;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(String name) {
        System.out.println("Adding the book: " + name);
        bookRepository.saveBook(name);
    }
}
