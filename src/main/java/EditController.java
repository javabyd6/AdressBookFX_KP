import Model.Person;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditController implements Initializable
{
    Label sampleLabel;

    private Main main = getMain();

    public Main getMain()
    {
        return main;
    }

    @FXML
    TextField inputName;
    @FXML
    TextField inputLastname;
    @FXML
    TextField inputAdress;
    @FXML
    TextField InputPostal;
    @FXML
    TextField inputMiasto;
    @FXML
    TextField InputPhone;

    @FXML
    Label labelName;
    @FXML
    Label labelLastname;
    @FXML
    Label labelPhone;
    @FXML
    Label labelPostal;
    @FXML
    Label labelCity;
    @FXML
    Label labelStreet;

    private Person edited;

    @FXML
    Button saveButton;
    @FXML
    Button cancelButton;
    Controller controller;

    public Controller getController()
    {
        return controller;
    }

    public void setController(Controller controller)
    {
        this.controller = controller;
    }

    public void initData(Person person, Controller controller)
    {
        this.controller = controller;
        edited = person;
        inputName.setText(person.getName());
        inputLastname.setText(person.getLastName());
        InputPhone.setText(person.getTelephone());
        inputAdress.setText(person.getAdress());
        inputMiasto.setText(person.getCity());
        InputPostal.setText(person.getPostalCode());
        }

    public void setMain(Main main)
    {
        this.main = main;
    }

    public void saveClicked(ActionEvent actionEvent) throws IOException
    {
        inputName.getText();

        ObservableList<Person> personObservableList = main.getPersonObservableList();
        //Person person = personObservableList.getPerson();
       // personObservableList.
        edited.setAdress(inputAdress.getText());
        edited.setName(inputName.getText());
        edited.setLastName(inputLastname.getText());
        edited.setPostalCode(InputPostal.getText());
        edited.setTelephone(InputPhone.getText());
        edited.setCity(inputMiasto.getText());
        //call controller.method();


        controller.update();
    }

    public void CancelClicked(ActionEvent actionEvent)
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.hide();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }
}
