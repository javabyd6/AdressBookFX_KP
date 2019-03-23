import Model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
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
    private Label nameLabel0;
    @FXML
    private Label lastNameLabel0;
    @FXML
    private Label adressLabel0;
    @FXML
    private Label cityLabel0;
    @FXML
    private Label postalCodeLabel0;
    @FXML
    private Label telephoneLabel0;

    @FXML
    private Button newPersonButton;
    @FXML
    private Button editButton;
    @FXML
    private Button saveButton;
    @FXML
    private Button deleteButton;

    private Stage stage;

    public Stage getStage()
    {
        return stage;
    }

    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

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

    public void selectedPerson(MouseEvent mouseEvent)
    {
        Person person = personTableView.getSelectionModel().getSelectedItem();
        nameLabel0.setText(person.getName());
        lastNameLabel0.setText(person.getLastName());
        cityLabel0.setText(person.getCity());
        adressLabel0.setText(person.getAdress());
        postalCodeLabel0.setText(person.getPostalCode());
        telephoneLabel0.setText(person.getTelephone());
    }

    public void newPersonAction(ActionEvent actionEvent) throws IOException
    {
        Stage myStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/newPerson.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        newPersonController newPersonController = loader.getController();
        newPersonController.setMain(getMain());
        myStage.setScene(new Scene(root,650,400));
        myStage.show();


    /*    newPersonController newPersonStage = new newPersonController();
        Parent rootNewPerson = FXMLLoader.load(getClass().getResource("/newPerson.fxml"));
        newPersonStage.(new Scene(rootNewPerson));

        newPersonStage.show();*/
    }

    public void EditAction(ActionEvent actionEvent) throws IOException
    {
        Stage myStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/EditPerson.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        newPersonController newPersonController = loader.getController();
        newPersonController.setMain(getMain());
        myStage.setScene(new Scene(root,650,400));
        myStage.show();

    }
}
