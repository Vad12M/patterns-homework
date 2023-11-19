public class EFactory implements BookFactory{
    @Override
    public Book createBook() {
        return new EBook();
    }
}
