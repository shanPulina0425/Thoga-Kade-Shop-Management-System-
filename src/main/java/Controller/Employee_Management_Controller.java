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

public class Employee_Management_Controller {
    Stage stage=new Stage();


    @FXML
    private Button addButton;

    @FXML
    private TextField addressTXT;

    @FXML
    private Button backButton;

    @FXML
    private Button clearButton;

    @FXML
    private TextField contactNumberTXT;

    @FXML
    private Button deleteButton1;

    @FXML
    private TextField dobTXT;

    @FXML
    private TextField employeeIDTXT;

    @FXML
    private TextField joinedDateTXT;

    @FXML
    private TextField nameTXT;

    @FXML
    private TextField nicTXT;

    @FXML
    private TextField positionTXT;

    @FXML
    private TextField salaryTXT;

    @FXML
    private TextField statusTXT;

    @FXML
    private TableColumn<?, ?> tableAddress;

    @FXML
    private TableColumn<?, ?> tableContactNumber;

    @FXML
    private TableColumn<?, ?> tableDOB;

    @FXML
    private TableColumn<?, ?> tableJoinedDate;

    @FXML
    private TableColumn<?, ?> tableName;

    @FXML
    private TableColumn<?, ?> tableNic;

    @FXML
    private TableColumn<?, ?> tablePosition;

    @FXML
    private TableColumn<?, ?> tableSalary;

    @FXML
    private TableColumn<?, ?> tableStatus;

    @FXML
    private TableColumn<?, ?> tableemployeeId;

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
            stage1=(Stage)backButton.getScene().getWindow();
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
