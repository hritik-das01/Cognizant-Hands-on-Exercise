package com.telusko.Ex_8LibraryManagement;

import com.telusko.Ex_8LibraryManagement.BookRepository;

public class BookService {

    private BookRepository repository;

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook() {
        repository.addBook();
    }
}
