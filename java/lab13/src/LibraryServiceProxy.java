public class LibraryServiceProxy implements LibraryService{
    private LibraryService realLibrary = new LibraryServiceImpl();

    @Override
    public void borrowBook(String bookTitle, String borrower) {
        realLibrary.borrowBook(bookTitle, borrower);
    }

    @Override
    public void returnBook(String bookTitle, String borrower) {
        realLibrary.returnBook(bookTitle, borrower);
    }
}
