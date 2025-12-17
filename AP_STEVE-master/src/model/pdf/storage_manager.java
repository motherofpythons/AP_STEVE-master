package model.pdf;
import java.nio.file.*;

public class storage_manager {
    public static final Path PDF_DIR = Path.of("app-data/pdfs");

    public static void init() throws Exception {
        Files.createDirectories(PDF_DIR);
    }
}
