import java.util.ArrayList;
import java.util.List;

interface CatalogComponent {
    void displayInfo();
    void add(CatalogComponent component);
    List<CatalogComponent> getSubComponents();
}

// Leaf
class Book implements CatalogComponent {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Book: " + title);
    }

    public void add(CatalogComponent component) {
        throw new UnsupportedOperationException("Not supported for Book.");
    }

    public List<CatalogComponent> getSubComponents() {
        return new ArrayList<>();
    }
}

class Catalog implements CatalogComponent {
    private final String name;
    private final List<CatalogComponent> subComponents = new ArrayList<>();

    public Catalog(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Catalog: " + name);
        for (CatalogComponent component : subComponents) {
            component.displayInfo();
        }
    }

    public void add(CatalogComponent component) {
        subComponents.add(component);
    }

    public List<CatalogComponent> getSubComponents() {
        return subComponents;
    }
}

public class Main {
    public static void main(String[] args) {
        Catalog library = new Catalog("Library");

        Catalog fictionCatalog = new Catalog("Fiction");
        Catalog dramaCatalog = new Catalog("Drama");

        Book fictionBook1 = new Book("To Kill a Mockingbird");
        Book dramaBook1 = new Book("Hamlet");

        fictionCatalog.add(fictionBook1);
        dramaCatalog.add(dramaBook1);

        fictionCatalog.add(dramaCatalog);

        library.add(fictionCatalog);

        library.displayInfo(); //трошки криво виводить, не у вигляді дерева
    }
}