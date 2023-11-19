public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        LibraryMember member1 = new LibraryMember("m1");
        LibraryMember member2 = new LibraryMember("m2");

        library.addObserver(member1);
        library.addObserver(member2);

        library.addBook("The Great Gatsby");
        library.addBook("To Kill a Mockingbird");
    }
}