package model.ai;
import dev.langchain4j.model.openai.OpenAiChatModel;

public class STEVE_config {
    public static OpenAiChatModel model() {
        return OpenAiChatModel.builder()
                .apiKey(System.getenv("OPENAI_API_KEY"))
                .modelName("gpt-4.1-mini")
                .temperature(0)
                .build();
    }
}