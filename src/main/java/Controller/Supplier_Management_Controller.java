package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Supplier_Management_Controller {

    Stage stage =new Stage();

    @FXML
    private Button addButton;

    @FXML
    private TextField addressTXT;

    @FXML
    private Button backButton;

    @FXML
    private TextField cityTXT;

    @FXML
    private Button clearButton;

    @FXML
    private TextField companyNameTXT;

    @FXML
    private Button deleteButton1;

    @FXML
    private TextField emailTXT;

    @FXML
    private TextField nameTXT;

    @FXML
    private TextField phoneTXT;

    @FXML
    private TextField postalCodeTXT;

    @FXML
    private TextField provinceTXT;

    @FXML
    private Label supplierId1;

    @FXML
    private Label supplierId11;

    @FXML
    private Label supplierId111;

    @FXML
    private Label supplierId1111;

    @FXML
    private Label supplierId11111;

    @FXML
    private Label supplierId111111;

    @FXML
    private Label supplierId1111111;

    @FXML
    private Label supplierId11111111;

    @FXML
    private TextField supplierIdTXT;

    @FXML
    private TableColumn<?, ?> tableAddress;

    @FXML
    private TableColumn<?, ?> tableCity;

    @FXML
    private TableColumn<?, ?> tableCompanyName;

    @FXML
    private TableColumn<?, ?> tableEmail;

    @FXML
    private TableColumn<?, ?> tableName;

    @FXML
    private TableColumn<?, ?> tablePhone;

    @FXML
    private TableColumn<?, ?> tablePostalCode;

    @FXML
    private TableColumn<?, ?> tableProvince;

    @FXML
    private TableColumn<?, ?> tableSupplierID;

    @FXML
    private Button upldateButton;

    @FXML
    void addButtonACT(ActionEvent event) {

    }

    @FXML
    void backButtonOnAction(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/Dashboard.fxml"))));
            Stage stage1=new Stage();
            stage1=(Stage) backButton.getScene().getWindow();
            stage1.close();
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void clearButtonACT(ActionEvent event) {

    }

    @FXML
    void deleteButtonACT(ActionEvent event) {

    }

    @FXML
    void updateButtonACT(ActionEvent event) {

    }

}
