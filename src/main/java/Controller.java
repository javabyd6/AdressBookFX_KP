import Model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller
{
    @FXML
    private TableView<Person> personTableView;

    @FXML
    private TableColumn<Person,String> nameCol;

    @FXML
    private TableColumn<Person,String> LastnameCol;

    @FXML
    private Label nameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label adressLabel;
    @FXML
    private Label CityLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label telephoneLabel;

    @FXML
    private Button newPersonButton;
    @FXML
    private Button editButton;
    @FXML
    private Button saveButton;
    @FXML
    private Button deleteButton;
}
