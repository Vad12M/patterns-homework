// extracted abstraction
abstract class BookGenre {
    protected StorageSystem storageSystem;

    public BookGenre(StorageSystem storageSystem) {
        this.storageSystem = storageSystem;
    }

    public abstract void addBook(String title);
    public abstract void removeBook(String title);
}

// impl
interface StorageSystem {
    void storeBook(String title);
    void removeBook(String title);
}

class PhysicalStorage implements StorageSystem {
    public void storeBook(String title) {
        System.out.println("Stored the physical book: " + title);
    }

    public void removeBook(String title) {
        System.out.println("Removed the physical book: " + title);
    }
}

class DigitalStorage implements StorageSystem {
    public void storeBook(String title) {
        System.out.println("Stored the digital book: " + title);
    }

    public void removeBook(String title) {
        System.out.println("Removed the digital book: " + title);
    }
}


class FictionGenre extends BookGenre {
    public FictionGenre(StorageSystem storageSystem) {
        super(storageSystem);
    }

    @Override
    public void addBook(String title) {
        System.out.print("Added a fiction book: ");
        storageSystem.storeBook(title);
    }

    @Override
    public void removeBook(String title) {
        System.out.print("Removed a fiction book: ");
        storageSystem.removeBook(title);
    }
}

class NonFictionGenre extends BookGenre {
    public NonFictionGenre(StorageSystem storageSystem) {
        super(storageSystem);
    }

    @Override
    public void addBook(String title) {
        System.out.print("Added a non-fiction book: ");
        storageSystem.storeBook(title);
    }

    @Override
    public void removeBook(String title) {
        System.out.print("Removed a non-fiction book: ");
        storageSystem.removeBook(title);
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        StorageSystem physicalStorage = new PhysicalStorage();
        StorageSystem digitalStorage = new DigitalStorage();

        BookGenre fiction = new FictionGenre(physicalStorage);
        BookGenre nonFiction = new NonFictionGenre(digitalStorage);

        fiction.addBook("The Great Gatsby");
        fiction.removeBook("The Great Gatsby");

        nonFiction.addBook("Math");
        nonFiction.removeBook("Math");
    }
}