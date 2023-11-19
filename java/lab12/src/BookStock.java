import java.util.ArrayList;
import java.util.List;

public class BookStock {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author, String name, String coverType, String paperType){
        BookType type = BookFactory.getBookType(name, coverType, paperType);
        Book book = new Book(title, author, type);
        books.add(book);
    }


}