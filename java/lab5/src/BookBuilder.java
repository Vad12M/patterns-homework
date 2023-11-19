public class BookBuilder implements Builder{
    private boolean hardcover;
    private int maxOfPages;
    private boolean hasIllustrations;
    private boolean glossyPaper;
    @Override
    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

    @Override
    public void setMaxOfPages(int maxOfPages) {
        this.maxOfPages = maxOfPages;
    }

    @Override
    public void setHasIllustrations(boolean hasIllustrations) {
        this.hasIllustrations = hasIllustrations;
    }

    @Override
    public void setGlossyPaper(boolean glossyPaper) {
        this.glossyPaper = glossyPaper;
    }

    public Book getResult(){
        return new Book(hardcover,maxOfPages,hasIllustrations,glossyPaper);
    }
}
