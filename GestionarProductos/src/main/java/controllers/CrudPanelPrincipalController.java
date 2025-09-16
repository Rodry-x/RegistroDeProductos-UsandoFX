package controllers;
import javafx.fxml.FXML;

public class CrudPanelPrincipalController {
    private final SceneController sceneController = new SceneController();

    @FXML
    public void cambiarPanelCongelados(javafx.event.ActionEvent event){
        sceneController.cambiarPanelCongelados(event);
    }

    @FXML
    public void cambiarPanelFrescos(javafx.event.ActionEvent event) {
        sceneController.cambiarPanelFrescos(event);
    }

    @FXML
    public void cambiarPanelRefrigerados(javafx.event.ActionEvent event) {
        sceneController.cambiarPanelRefrigerados(event);
    }

}
