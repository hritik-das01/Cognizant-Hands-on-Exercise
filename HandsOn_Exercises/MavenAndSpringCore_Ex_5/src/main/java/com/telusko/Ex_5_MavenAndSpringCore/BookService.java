package com.telusko.Ex_5_MavenAndSpringCore;

public class BookService {

	private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("Adding book...");
        bookRepository.saveBook();
    }
}