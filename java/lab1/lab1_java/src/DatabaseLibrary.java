import java.util.ArrayList;
import java.util.List;

public class DatabaseLibrary {
    private static DatabaseLibrary instance;
    private List<Book> books;
    private List<Author> authors;
    private List<Reader> readers;

    private DatabaseLibrary() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
        readers = new ArrayList<>();
    }

    public static DatabaseLibrary getInstance() {
        if (instance == null) {
            synchronized (DatabaseLibrary.class) {
                if (instance == null) {
                    instance = new DatabaseLibrary();
                }
            }
        }
        return instance;
    }
}
