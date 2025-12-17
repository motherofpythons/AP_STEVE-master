package model.pdf;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;

public class pdf_text_extractor {
    public static String extract(String path) throws Exception {
        PDDocument doc = PDDocument.load(new File(path));
        String text = new PDFTextStripper().getText(doc);
        doc.close();
        return text;
    }
}