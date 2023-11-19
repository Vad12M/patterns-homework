public class Main {
    public static void main(String[] args) {
        PeopleFactory personFactory = new PeopleFactory();

        Person reader = personFactory.createPerson("Reader");
        reader.printInfo();

        Person librarian = personFactory.createPerson("Librarian");
        librarian.printInfo();
    }
}