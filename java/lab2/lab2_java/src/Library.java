import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> bookPrototypes = new HashMap<>();

    public void addBookPrototype(String key, Book book) {
        bookPrototypes.put(key, book);
    }

    public Book checkoutBook(String key) {
        Book bookPrototype = bookPrototypes.get(key);
        if (bookPrototype != null) {
            try {
                return bookPrototype.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
