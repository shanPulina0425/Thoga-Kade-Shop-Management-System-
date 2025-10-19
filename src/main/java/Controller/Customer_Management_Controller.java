package Controller;

import Model.Dto.Customers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Customer_Management_Controller implements Initializable {

    ObservableList<Customers> customer= FXCollections.observableArrayList(
        new Customers("1", "Mr.", "John Doe", "1990-01-01", 123 , "Springfield", "IL", "62701", "55000.00"),
        new Customers("2", "Ms.", "Jane Smith", "1985-05-15", 456 , "Shelbyville", "IL", "62565", "62000.00"),
        new Customers("3", "Dr.", "Emily Johnson", "1978-09-30", 789, "Capital City", "IL", "62702", "75000.00")
    );



    @FXML
    private Button addButton;

    @FXML
    private TextField adressTXT;

    @FXML
    private TextField cityTXT;

    @FXML
    private Button clearButton;

    @FXML
    private TextField customerIdTXT;

    @FXML
    private TableView<Customers> customerManagementTable;

    @FXML
    private Button deleteButton1;

    @FXML
    private TextField dobTXT;

    @FXML
    private TextField nameTXT;

    @FXML
    private TextField postalCodeTXT;

    @FXML
    private TextField provinceTXT;

    @FXML
    private TextField salaryTXT;

    @FXML
    private TableColumn<?, ?> tableCity;

    @FXML
    private TableColumn<?, ?> tableCustomerID;

    @FXML
    private TableColumn<?, ?> tableDateOfBirth;

    @FXML
    private TableColumn<?, ?> tableName;

    @FXML
    private TableColumn<?, ?> tablePostalCode;

    @FXML
    private TableColumn<?, ?> tableProvince;

    @FXML
    private TableColumn<?, ?> tableSalary;

    @FXML
    private TableColumn<?, ?> tableTitle;

    @FXML
    private TextField titleTXT;

    @FXML
    private Button upldateButton;

    @FXML
    private TableColumn<?, ?> tableAddress;

    @FXML
    void addButtonACT(ActionEvent event) {



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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableCustomerID.setCellValueFactory(new PropertyValueFactory<>("custID"));
        tableTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        tableName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableDateOfBirth.setCellValueFactory(new PropertyValueFactory<>("dob"));
        tableSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        tableAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tableCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        tableProvince.setCellValueFactory(new PropertyValueFactory<>("province"));
        tablePostalCode.setCellValueFactory(new PropertyValueFactory<>("postalCode"));
        customerManagementTable.setItems(customer);

    }
}
