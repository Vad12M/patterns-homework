public interface LibraryService {
    void borrowBook(String bookTitle, String borrower);
    void returnBook(String bookTitle, String borrower);
}
