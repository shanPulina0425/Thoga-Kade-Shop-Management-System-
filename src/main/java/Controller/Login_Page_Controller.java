package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login_Page_Controller {

    Stage stage=new Stage();

    @FXML
    private Button loginButton;

    @FXML
    private TextField passwordTXT;

    @FXML
    private TextField userNameTXT;

    @FXML
    public void loginButtonACT(ActionEvent event) {

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/Dashboard_Controller.fxml"))));
            Stage stage1=(Stage) loginButton.getScene().getWindow();
            stage1.close();
            stage.show();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
