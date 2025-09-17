package controllers;

import javafx.scene.control.Alert;

// Clase para mostrar alertas de error
public class ViewAlerta {
    public static void mostrarAlerta(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error de validación");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
