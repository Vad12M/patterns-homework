import java.util.HashMap;
import java.util.Map;

public class LibraryServiceImpl implements LibraryService{
    private Map<String, Boolean> books = new HashMap<>();

    @Override
    public void borrowBook(String bookTitle, String borrower) {
        if (!books.containsKey(bookTitle)) {
            System.out.println(bookTitle + " is not available.");
            return;
        }
        if (!books.get(bookTitle)) {
            System.out.println(bookTitle + " is already borrowed by " + borrower);
        } else {
            books.put(bookTitle, false);
            System.out.println(borrower + " borrowed " + bookTitle);
        }
    }

    @Override
    public void returnBook(String bookTitle, String borrower) {
        if (!books.containsKey(bookTitle)) {
            System.out.println(bookTitle + " is not available.");
            return;
        }
        if (books.get(bookTitle)) {
            System.out.println(bookTitle + " is not borrowed.");
        } else {
            books.put(bookTitle, true);
            System.out.println(borrower + " returned " + bookTitle);
        }
    }

    void addBook(String bookTitle) {
        books.put(bookTitle, true);
    }
}
