package application;

// Importaciones necesarias para la aplicación
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utilities.Paths;

public class App extends Application {

    @Override
    public void start(Stage stage){
        // Cargar el archivo FXML para el panel principal
        try{
            Parent root = FXMLLoader.load(getClass().getResource(Paths.PANEL_PRINCIPAL_FXML));
            Scene panelPrincipal = new Scene(root);
            stage.setScene(panelPrincipal);
            stage.show();

        }
        // Manejar excepciones
        catch (Exception e){
            e.printStackTrace(); // Imprimir el mensaje de error en la consola
        }
    }

    // Método principal para iniciar la aplicación
    public static void main(String[] args) {
        launch(args);
    }
}
