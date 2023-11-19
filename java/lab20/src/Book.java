public class Book {
    private BookState currentState;

    public Book() {
        currentState = new AvailableState();
    }

    public void setState(BookState newState) {
        currentState = newState;
    }

    public void displayStatus() {
        currentState.displayStatus();
    }

    public void borrowBook() {
        currentState.borrowBook(this);
    }

    public void returnBook() {
        currentState.returnBook(this);
    }

    public void reserveBook() {
        currentState.reserveBook(this);
    }
}
