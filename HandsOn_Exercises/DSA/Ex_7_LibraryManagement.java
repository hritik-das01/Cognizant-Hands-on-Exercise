package HandsOn_Exercises.DSA;

class Book {

    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

public class Ex_7_LibraryManagement {

    static void linearSearch(Book[] books, String key) {

        boolean found = false;

        for (int i = 0; i < books.length; i++) {

            if (books[i].title.equalsIgnoreCase(key)) {

                System.out.println("Book Found");
                System.out.println("ID : " + books[i].bookId);
                System.out.println("Title : " + books[i].title);
                System.out.println("Author : " + books[i].author);

                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Book Not Found");
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido"),
                new Book(103, "C++", "Bjarne"),
                new Book(104, "DSA", "Narasimha Karumanchi")
        };

        linearSearch(books, "Python");
    }
}