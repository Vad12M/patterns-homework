import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryObservable{
    private List<LibraryObserver> observers = new ArrayList<>();
    private List<String> books = new ArrayList<>();

    @Override
    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(LibraryObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String bookTitle) {
        for (LibraryObserver observer : observers) {
            observer.update(bookTitle);
        }
    }

    public void addBook(String bookTitle) {
        books.add(bookTitle);
        notifyObservers(bookTitle);
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

}
