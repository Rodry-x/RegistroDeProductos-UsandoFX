
package controllers;

// Importaciones necesarias para la aplicación
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import utilities.Paths;
import javafx.event.ActionEvent;
import java.io.IOException;

public class SceneController {

    // Método para obtener la ventana actual
    private Stage getStageFromEvent(ActionEvent event) {
        Object source = event.getSource();
        if (source instanceof Node) {
            return (Stage) ((Node) source).getScene().getWindow();
        } else {
            // Si viene de un MenuItem, busca la ventana activa
            return (Stage) Window.getWindows().stream()
                    .filter(Window::isFocused)
                    .findFirst()
                    .orElse(null);
        }
    }

    // Método para cambiar de escena
    private void cambiarEscena(ActionEvent event, String fxmlPath) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = getStageFromEvent(event);
            if (stage != null) {
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Usando Paths para abreviar las rutas de los archivos FXML
    public void cambiarPanelCongelados(ActionEvent event) {
        cambiarEscena(event, Paths.PRODUCTOS_CONGELADOS_FXML);
    }

    public void cambiarPanelFrescos(ActionEvent event) {
        cambiarEscena(event, Paths.PRODUCTOS_FRESCOS_FXML);
    }

    public void cambiarPanelRefrigerados(ActionEvent event) {
        cambiarEscena(event, Paths.PRODUCTOS_REFRIGERADOS_FXML);
    }

    public void cambiarPanelPrincipal(ActionEvent event) {
        cambiarEscena(event, Paths.PANEL_PRINCIPAL_FXML);
    }
}
