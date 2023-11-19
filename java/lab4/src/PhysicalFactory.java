public class PhysicalFactory implements BookFactory{
    @Override
    public Book createBook() {
        return new PaperBook();
    }
}
