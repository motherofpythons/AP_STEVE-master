package model.rag;
import dev.langchain4j.model.openai.OpenAiChatModel;
import model.ai.STEVE_config;

public class rag_service {
    private final OpenAiChatModel model = STEVE_config.model();

    public String ask(String pdfId, String question) {
        String context = text_retriever.retrieve(pdfId);
        return model.generate(
                "Use ONLY this material:\n" + context +
                        "\nQuestion: " + question
        );
    }
}