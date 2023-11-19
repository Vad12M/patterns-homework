public class Main {
    public static void main(String[] args) {
        Book book = new Book();


        book.displayStatus();

        book.borrowBook();
        book.displayStatus();

        book.returnBook();
        book.displayStatus();

        book.reserveBook();
        book.displayStatus();
    }
}