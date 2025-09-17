package controllers;
import javafx.fxml.FXML;

public class CrudPanelPrincipalController {
    //Usando el SceneController para cambiar de escenas
    private final SceneController sceneController = new SceneController();

    //Cambiar de escena al panel de congelados
    @FXML
    public void cambiarPanelCongelados(javafx.event.ActionEvent event){
        sceneController.cambiarPanelCongelados(event);
    }

    //Cambiar de escena al panel de frescos
    @FXML
    public void cambiarPanelFrescos(javafx.event.ActionEvent event) {
        sceneController.cambiarPanelFrescos(event);
    }

    //Cambiar de escena al panel de refrigerados
    @FXML
    public void cambiarPanelRefrigerados(javafx.event.ActionEvent event) {
        sceneController.cambiarPanelRefrigerados(event);
    }

}
