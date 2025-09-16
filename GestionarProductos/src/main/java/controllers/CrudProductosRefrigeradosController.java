package controllers;

public class CrudProductosRefrigeradosController {
    private final SceneController sceneController = new SceneController();

    public void cambiarAlPanelPrincipal(javafx.event.ActionEvent event) {
        sceneController.cambiarPanelPrincipal(event);
    }

}
