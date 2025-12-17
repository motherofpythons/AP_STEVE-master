package model.pdf;


public class pdf_document {
    private final String id;
    private final String path;


    public pdf_document(String id, String path) {
        this.id = id;
        this.path = path;
    }


    public String getId() { return id; }
    public String getPath() { return path; }
}