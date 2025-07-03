package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Get BookService bean
        BookService bookService = context.getBean("bookService", BookService.class);
        // Test method
        bookService.addBook("Spring in the Action");
    }
}


