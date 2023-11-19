public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BookBuilder builder = new BookBuilder();

        director.createMagazine(builder);
        System.out.println("Created: " + builder.getResult());

        director.createManualBook(builder);
        System.out.println("Created: " + builder.getResult());
    }
}