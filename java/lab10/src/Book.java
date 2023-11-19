public class Book implements Item{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void borrow() {
        System.out.println("Book " + name + " is borrowed");
    }
}
