public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");
        library.addBookPrototype("key1", book1);
        library.addBookPrototype("key2", book2);
        Book clonedBook1 = library.checkoutBook("key1");
        Book clonedBook2 = library.checkoutBook("key2");

        if (clonedBook1 != null) {
            System.out.println("Cloned Book 1: " + clonedBook1);
        } else {
            System.out.println("Book 1 prototype not found.");
        }

        if (clonedBook2 != null) {
            System.out.println("Cloned Book 2: " + clonedBook2);
        } else {
            System.out.println("Book 2 prototype not found.");
        }
    }
}