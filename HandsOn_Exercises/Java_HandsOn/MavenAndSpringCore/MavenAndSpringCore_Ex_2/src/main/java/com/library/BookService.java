package com.library;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void service() {
        System.out.println("Book Service Called");
        bookRepository.displayBook();
    }
}