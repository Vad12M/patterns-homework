import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    static Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String name, String coverType, String paperType){
        BookType result = bookTypes.get(name);
        if (result == null){
            result = new BookType(name, coverType, paperType);
            bookTypes.put(name, result);
        }
        return result;
    }
}
