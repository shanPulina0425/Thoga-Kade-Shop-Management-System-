package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Item_Management_Controller {

    Stage stage=new Stage();

    @FXML
    private Button addButton;

    @FXML
    private Button backButton;

    @FXML
    private TextField categoryTXT;

    @FXML
    private Button clearButton;

    @FXML
    private Button deleteButton1;

    @FXML
    private TextField descriptionTXT;

    @FXML
    private TextField itemCodeTXT;

    @FXML
    private TextField qtyOnHandTXT;

    @FXML
    private TableColumn<?, ?> tableCategory;

    @FXML
    private TableColumn<?, ?> tableDescription;

    @FXML
    private TableColumn<?, ?> tableItemCode;

    @FXML
    private TableColumn<?, ?> tableQuantityOnHand;

    @FXML
    private TableColumn<?, ?> tableUnitPrice;

    @FXML
    private TextField unitPriceTXT;

    @FXML
    private Button upldateButton;

    @FXML
    void addButtonACT(ActionEvent event) {

    }

    @FXML
    void backButtonOnAction(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/Dashboard.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage1=(Stage) backButton.getScene().getWindow();
        stage1.close();
        stage.show();


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
