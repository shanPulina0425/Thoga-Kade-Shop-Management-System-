package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard_Controller {

    Stage stage=new Stage();

    @FXML
    private Button backButton;

    @FXML
    private Button customerManagementButton;

    @FXML
    private Button employeeManagementButton;

    @FXML
    private Button itemManagementButton;

    @FXML
    private Button supplierManagementButton;

    @FXML
    void backButtonACT(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/Login_Page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage1=(Stage) backButton.getScene().getWindow();
        stage1.close();
        stage.show();


    }

    @FXML
    void customerManagementACT(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/Customer_Management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage1=(Stage) customerManagementButton.getScene().getWindow();
        stage1.close();
        stage.show();
    }

    @FXML
    void employeeManagementACT(ActionEvent event) {

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/Employee_Management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage1=(Stage) employeeManagementButton.getScene().getWindow();
        stage1.close();
        stage.show();



    }

    @FXML
    void itemManagementACT(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/Item_Management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage1=(Stage) itemManagementButton.getScene().getWindow();
        stage1.close();
        stage.show();

    }

    @FXML
    void supplierManagementACT(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/Supplier_Management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage1=(Stage) supplierManagementButton.getScene().getWindow();
        stage1.close();
        stage.show();
    }

}
