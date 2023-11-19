public class Main {
    public static void main(String[] args) {

        LibraryFacade library = new LibraryFacade();

        String borrower1 = "Ira";
        String book1 = "Design Patterns";

        library.borrowBook(borrower1, book1);
        library.returnBook(borrower1, book1);
    }
}