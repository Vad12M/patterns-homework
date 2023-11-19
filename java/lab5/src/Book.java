public class Book {
    private final boolean hardcover;
    private final int maxOfPages;
    private final boolean hasIllustrations;
    private final boolean glossyPaper;

    public Book(boolean hardcover, int maxOfPages, boolean hasIllustrations, boolean glossyPaper) {
        this.hardcover = hardcover;
        this.maxOfPages = maxOfPages;
        this.hasIllustrations = hasIllustrations;
        this.glossyPaper = glossyPaper;
    }

    @Override
    public String toString() {
        return "Book{" +
                "hardcover=" + hardcover +
                ", maxOfPages=" + maxOfPages +
                ", hasIllustrations=" + hasIllustrations +
                ", glossyPaper=" + glossyPaper +
                '}';
    }
}
