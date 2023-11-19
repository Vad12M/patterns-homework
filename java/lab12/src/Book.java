public class Book {
    private String title;
    private String author;
    private BookType type;

    public Book(String title, String author, BookType type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public void getInfo(){
        type.getInfo();
    }
}
