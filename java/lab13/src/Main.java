public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryServiceProxy();
        LibraryServiceImpl realLibrary = new LibraryServiceImpl();
        realLibrary.addBook("Design Patterns");
        realLibrary.addBook("Clean Code");

        library.borrowBook("Design Patterns", "John");
        library.borrowBook("Clean Code", "Alice");
        library.returnBook("Design Patterns", "John");
        library.borrowBook("Design Patterns", "Bob");
    }
}