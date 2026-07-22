package com.telusko.loggingAOP;

public class BookService {

	private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
}
    public void addBook() {

        bookRepository.save();

        System.out.println("Book Added");
    }
}
    
