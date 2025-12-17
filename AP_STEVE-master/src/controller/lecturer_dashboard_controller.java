package controller;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import model.pdf.*;
import model.rag.rag_service;
import java.io.File;
import java.nio.file.*;


public class lecturer_dashboard_controller {


    @FXML private TextArea chat;
    private final rag_service rag = new rag_service();


    @FXML
    public void initialize() throws Exception {
        storage_manager.init();
    }


    @FXML
    private void uploadPdf() throws Exception {
        File file = new FileChooser().showOpenDialog(null);
        if (file == null) return;


        Path target = storage_manager.PDF_DIR.resolve(file.getName());
        Files.copy(file.toPath(), target, StandardCopyOption.REPLACE_EXISTING);


        pdf_document pdf = new pdf_document(file.getName(), target.toString());
        pdf_ingestor.ingest(pdf);


        chat.appendText("Uploaded: " + file.getName() + "\n");
    }
}
