public class Main {
    public static void main(String[] args) {

        Item book = new Book("1");
        ItemDecorator ebook = new ElectronicDecorator(book);

        ebook.borrow();
    }
}