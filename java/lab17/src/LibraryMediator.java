public interface LibraryMediator {
    void registerLibraryMember(LibraryMember member);

    void borrowBook(LibraryMember member, String bookTitle);

    void returnBook(LibraryMember member, String bookTitle);
}
