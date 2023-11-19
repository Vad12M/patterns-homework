public class Director {
    public void createMagazine(Builder builder){
        builder.setHardcover(false);
        builder.setMaxOfPages(50);
        builder.setHasIllustrations(true);
        builder.setGlossyPaper(true);
    }

    public void createManualBook(Builder builder){
        builder.setHardcover(false);
        builder.setMaxOfPages(300);
        builder.setHasIllustrations(true);
        builder.setGlossyPaper(false);
    }
}
