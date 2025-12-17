package model.pdf;
import model.rag.TextDatabase;

public class pdf_ingestor {
    public static void ingest(pdf_document pdf) throws Exception {
        String text = pdf_text_extractor.extract(pdf.getPath());
        TextDatabase.store(pdf.getId(), text);
    }
}