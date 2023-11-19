public abstract class LibraryMember {
    private LibraryMediator mediator;
    private String name;

    public LibraryMember(LibraryMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(String bookTitle) {
        mediator.borrowBook(this, bookTitle);
    }

    public void returnBook(String bookTitle) {
        mediator.returnBook(this, bookTitle);
    }
}
