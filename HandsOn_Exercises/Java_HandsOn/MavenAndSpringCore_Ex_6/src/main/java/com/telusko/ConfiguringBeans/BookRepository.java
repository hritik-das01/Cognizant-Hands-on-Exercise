package com.telusko.ConfiguringBeans;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	
	public void saveBook() {
        System.out.println("Book saved successfully.");
    }
}
