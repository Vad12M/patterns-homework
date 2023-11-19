public class Main {
    public static void main(String[] args) {

        LibraryBooks library = new LibraryBooks();
        library.addBook("1");
        library.addBook("2");
        library.addBook("3");

        LibraryIterator iterator = library.createIterator();

        while (iterator.hasNext()) {
            System.out.println("Book: " + iterator.next());
        }
    }
}