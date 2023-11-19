import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        List<Library.LibraryMemento> history = new ArrayList<>();

        library.addBook("b1");
        library.addBook("b2");
        library.addBook("b3");

        history.add(library.save());

        library.addBook("b4");

        library.displayBooks();

        library.restore(history.get(0));

        library.displayBooks();
    }
}