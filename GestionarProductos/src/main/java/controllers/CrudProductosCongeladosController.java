package controllers;

public class CrudProductosCongeladosController {
    private final SceneController sceneController = new SceneController();

    public void cambiarAlPanelPrincipal(javafx.event.ActionEvent event) {
        sceneController.cambiarPanelPrincipal(event);
    }

}
