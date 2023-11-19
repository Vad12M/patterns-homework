
public class PeopleFactory {
    public Person createPerson(String personType) {
        if (personType.equalsIgnoreCase("Reader")) {
            return new Reader();
        } else if (personType.equalsIgnoreCase("Librarian")) {
            return new Librarian();
        } else {
            return null;
        }
    }
}
