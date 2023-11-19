public class LibraryFacade {
    private Catalog catalog;
    private Borrowers borrowers;
    private Accounting accounting;

    public LibraryFacade() {
        catalog = new Catalog();
        borrowers = new Borrowers();
        accounting = new Accounting();
    }

    public void borrowBook(String borrower, String bookTitle) {
        catalog.searchBook(bookTitle);
        borrowers.checkOutBook(borrower, bookTitle);
        accounting.calculateLateFees();
    }

    public void returnBook(String borrower, String bookTitle) {
        catalog.searchBook(bookTitle);
        borrowers.returnBook(borrower, bookTitle);
        accounting.calculateLateFees();
    }
}
