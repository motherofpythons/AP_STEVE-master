package controller;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.rag.rag_service;

public class student_dashboard_controller {


    @FXML private TextArea chat;
    @FXML private TextField input;


    private final rag_service rag = new rag_service();
    private String selectedPdfId = "";


    @FXML
    private void send() {
        String q = input.getText();
        input.clear();
        chat.appendText("You: " + q + "\n");
        chat.appendText("AI: " + rag.ask(selectedPdfId, q) + "\n");
    }
}