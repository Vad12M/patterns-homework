// Existing physical book management system
class Library {
    public void checkoutPhysicalBook(String title) {
        System.out.println("Checked out physical book: " + title);
    }

    public void returnPhysicalBook(String title) {
        System.out.println("Returned physical book: " + title);
    }
}


//ebbook not compatible with ordinary books
class EBook {
    public void downloadEBook(String title) {
        System.out.println("Downloaded e-book: " + title);
    }

    public void removeEBook(String title) {
        System.out.println("Removed e-book: " + title);
    }
}

// Adapter for EBook
class EBookAdapter extends Library {
    private final EBook eBook;

    public EBookAdapter(EBook eBook) {
        this.eBook = eBook;
    }

    public void checkoutEBook(String title) {
        eBook.downloadEBook(title);
    }

    public void returnEBook(String title) {
        eBook.removeEBook(title);
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        EBook eBook = new EBook();

        EBookAdapter eBookAdapter = new EBookAdapter(eBook);


        library.checkoutPhysicalBook("The Great Gatsby");
        library.returnPhysicalBook("The Great Gatsby");


        eBookAdapter.checkoutEBook("1984");
        eBookAdapter.returnEBook("1984");
    }
}