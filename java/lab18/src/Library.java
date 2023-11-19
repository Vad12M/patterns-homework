import java.util.ArrayList;
import java.util.List;

class Library {
    private List<String> books = new ArrayList<>();

    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    public void displayBooks() {
        System.out.println("Library's Book Collection:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public LibraryMemento save() {
        return new LibraryMemento(new ArrayList<>(books));
    }

    public void restore(LibraryMemento Memento) {
        books = new ArrayList<>(Memento.getBooks());
    }

    static class LibraryMemento {
        private List<String> books;

        LibraryMemento(List<String> books) {
            this.books = new ArrayList<>(books);
        }

        List<String> getBooks() {
            return new ArrayList<>(books);
        }
    }
}