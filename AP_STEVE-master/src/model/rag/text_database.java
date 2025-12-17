package model.rag;
import java.util.*;

public class text_database {
    private static final Map<String, String> DATA = new HashMap<>();


    public static void store(String id, String text) {
        DATA.put(id, text);
    }


    public static String get(String id) {
        return DATA.get(id);
    }
}