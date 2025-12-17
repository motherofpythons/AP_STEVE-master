package app;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


    public class main_app extends Application {


        @Override
        public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/view/login_view.fxml")
            );


            stage.setScene(new Scene(loader.load()));
            stage.setTitle("AI Learning Assistant");
            stage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }
    }
}
