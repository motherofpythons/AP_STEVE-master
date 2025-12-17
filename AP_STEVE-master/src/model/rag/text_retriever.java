package model.rag;
public class text_retriever {
    public static String retrieve(String id) {
        String text = text_database.get(id);
        return text == null ? "" : text.substring(0, Math.min(3000, text.length()));
    }
}