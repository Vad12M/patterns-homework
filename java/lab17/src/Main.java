public class Main {
    public static void main(String[] args) {
        LibraryManager mediator = new LibraryManager();

        LibraryMember student1 = new Student(mediator, "st1");
        LibraryMember student2 = new Student(mediator, "st2");

        mediator.registerLibraryMember(student1);
        mediator.registerLibraryMember(student2);

        mediator.borrowBook(student1, "Book 1");
        mediator.borrowBook(student2, "Book 2");

        mediator.returnBook(student1, "Book 1");
        mediator.borrowBook(student2, "Book 1");
    }
}