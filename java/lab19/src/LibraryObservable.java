public interface LibraryObservable {
    void addObserver(LibraryObserver observer);

    void removeObserver(LibraryObserver observer);

    void notifyObservers(String bookTitle);

}
