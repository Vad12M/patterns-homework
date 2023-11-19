public class LibraryMember implements LibraryObserver{
    private String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookTitle) {
        System.out.println("Library member " + name + " received a notification: New book added - " + bookTitle);
    }
}
