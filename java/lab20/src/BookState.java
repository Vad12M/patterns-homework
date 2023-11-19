public interface BookState {
    void displayStatus();

    void borrowBook(Book book);

    void returnBook(Book book);

    void reserveBook(Book book);
}
