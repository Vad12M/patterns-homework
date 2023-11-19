public class AvailableState implements BookState{
    @Override
    public void displayStatus() {
        System.out.println("Book is Available");
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Book is borrowed.");
        book.setState(new BorrowedState());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Book is already available.");
    }

    @Override
    public void reserveBook(Book book) {
        System.out.println("Book is reserved.");
        book.setState(new ReservedState());
    }
}

class BorrowedState implements BookState {
    @Override
    public void displayStatus() {
        System.out.println("Book is Borrowed");
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Book is already borrowed.");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Book is returned. Now available.");
        book.setState(new AvailableState());
    }

    @Override
    public void reserveBook(Book book) {
        System.out.println("Book is already borrowed. Cannot reserve.");
    }
}

class ReservedState implements BookState {
    @Override
    public void displayStatus() {
        System.out.println("Book is Reserved");
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Book is reserved. Cannot borrow.");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Reserved book cannot be returned. Wait for availability.");
    }

    @Override
    public void reserveBook(Book book) {
        System.out.println("Book is already reserved.");
    }
}
