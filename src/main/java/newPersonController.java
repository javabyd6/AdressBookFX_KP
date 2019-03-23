import Model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class newPersonController
{

    public Main main;

    public Main getMain()
    {
        return main;
    }

    public void setMain(Main main)
    {
        this.main = main;
    }

    @FXML
   private Button saveButton;

   @FXML
   private Button cancelButton;

   @FXML
   private TextField inputName;

   @FXML
   private TextField inputLastname;

   @FXML
   private TextField inputAdress;

   @FXML
   private TextField InputPostal;

   @FXML
   private TextField inputMiasto;

   @FXML
   private TextField InputPhone;


 /*   @Override
    public void initialize(URL location, ResourceBundle resources)
    {


    }*/

    public void saveClicked(ActionEvent actionEvent)
    {
        Person person = new Person(inputName.getText(),inputLastname.getText(),inputAdress.getText(),inputMiasto.getText(),InputPostal.getText(),InputPhone.getText());
        getMain().getPersonObservableList().add(person);
    }
//todo sprawdz czy jak jebniesz set to doda kolejnego persona
    public void CancelClicked(ActionEvent actionEvent)
    {

    }
}
