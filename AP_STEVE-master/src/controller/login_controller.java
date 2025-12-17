package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.authenticate.*;

    public class login_controller {


        @FXML private TextField usernameField;


        @FXML
        private void handleLogin() throws Exception {
            user_login user = auth_service.login(
                    usernameField.getText(), ""
            );


            String view = user.getRole() == user_role.LECTURER
                    ? "/view/lecturer_dashboard.fxml"
                    : "/view/student_dashboard.fxml";


            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(new Scene(
                    new FXMLLoader(getClass().getResource(view)).load()
            ));
        }
    }

