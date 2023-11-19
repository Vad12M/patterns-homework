import java.util.ArrayList;
import java.util.List;

public class LibraryBooks implements LibraryCollection{
    private List<String> books = new ArrayList<>();
    @Override
    public LibraryIterator createIterator() {

        return new BookIterator(books);
    }

    public void addBook(String book) {
        books.add(book);
    }
}
