import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements LibraryMediator{
    private List<LibraryMember> members = new ArrayList<>();
    private List<String> availableBooks = new ArrayList<>();

    @Override
    public void registerLibraryMember(LibraryMember member) {
        members.add(member);
    }

    @Override
    public void borrowBook(LibraryMember member, String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            System.out.println(member.getName() + " borrowed: " + bookTitle);
        } else {
            System.out.println("Sorry, " + member.getName() + ". The book " + bookTitle + " is not available.");
        }
    }

    @Override
    public void returnBook(LibraryMember member, String bookTitle) {
        availableBooks.add(bookTitle);
        System.out.println(member.getName() + " returned: " + bookTitle);
    }
}
