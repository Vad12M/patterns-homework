import java.util.List;

public class BookIterator implements LibraryIterator {
    private List<String> books;
    private int position = 0;

    public BookIterator(List<String> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return books.get(position++);
        }
        return null;
    }
}
