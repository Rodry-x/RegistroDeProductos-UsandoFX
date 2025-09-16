package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utilities.Paths;

public class App extends Application {

    @Override
    public void start(Stage stage){
        try{
            Parent root = FXMLLoader.load(getClass().getResource(Paths.PANEL_PRINCIPAL_FXML));
            Scene panelPrincipal = new Scene(root);
            stage.setScene(panelPrincipal);
            stage.show();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
