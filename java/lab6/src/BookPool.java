import java.util.ArrayList;
import java.util.List;

class BookPool {
    private long maxIdleTime;
    private List<Book> availableBooks;
    private List<Book> borrowedBooks;

    public BookPool() {
        maxIdleTime = 60000;
        availableBooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
    }

    public synchronized Book borrowBook() {
        Book book = null;

        if (!availableBooks.isEmpty()) {
            book = availableBooks.remove(0);
            borrowedBooks.add(book);
        }

        if (book == null) {
            book = createBook();
            borrowedBooks.add(book);
        }

        return book;
    }

    public synchronized void returnBook(Book book) {
        borrowedBooks.remove(book);
        availableBooks.add(book);
    }

    private Book createBook() {
        String title = "Sample Title";
        String author = "Sample Author";
        return new Book(title, author);
    }
}
