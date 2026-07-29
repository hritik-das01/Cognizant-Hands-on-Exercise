import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBook() {
        System.out.println("Adding Book...");
        bookRepository.saveBook();
    }
}