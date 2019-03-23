import Model.Person;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
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


    private Main main;

    public Main getMain()
    {
        return main;
    }

    public void setMain(Main main)
    {
        this.main = main;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
//        System.out.println(getMain().getPersonObservableList());
//        nameCol.setCellValueFactory(c->c.getValue().nameProperty());
//        LastnameCol.setCellValueFactory(c->c.getValue().nameProperty());
    }

    public void loadPerson()
    {
        System.out.println(getMain().getPersonObservableList());
        personTableView.setItems(getMain().getPersonObservableList());
        nameCol.setCellValueFactory(c->c.getValue().nameProperty());
        LastnameCol.setCellValueFactory(c->c.getValue().lastNameProperty());
    }
}
