package com.telusko;
import com.telusko.Ex_8LibraryManagement.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainlibrary {

	public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.addBook();

        ((ClassPathXmlApplicationContext) context).close();
    }

}
