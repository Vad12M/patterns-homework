import java.util.HashMap;
import java.util.Map;
public class Borrowers {
    private Map<String, Boolean> borrowers = new HashMap<>();

    public void checkOutBook(String borrower, String bookTitle) {
        System.out.println(borrower + " checked out book: " + bookTitle);
        borrowers.put(borrower, true);
    }

    public void returnBook(String borrower, String bookTitle) {
        System.out.println(borrower + " returned book: " + bookTitle);
        borrowers.put(borrower, false);
    }
}
