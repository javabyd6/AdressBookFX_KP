import Model.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    private ObservableList<Person> personObservableList = FXCollections.observableArrayList();

    public Main()
    {
        personObservableList.add(new Person("Jan","Kowalski", "bydgoska","Bydgoszcz", "85-000","555444888"));
        personObservableList.add(new Person("Kowal","Janowski", "torunska","Bydgoszcz", "85-010","555444888"));
    }

    public  ObservableList<Person> getPersonObservableList()
    {
        return personObservableList;
    }


    public static void main(String[] args)
        {
            launch(args);
        }
    @Override
    public void start(Stage primaryStage) throws Exception
    {
//        Parent root = FXMLLoader.load(getClass().getResource("/Adress.fxml"));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Adress.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        Controller controller = loader.getController();
        controller.setMain(this);
        controller.loadPerson();
        primaryStage.setScene(new Scene(root,650,400));
        primaryStage.show();
    }
}
