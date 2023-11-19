public class Book implements Cloneable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}
