package controllers;

// Importaciones necesarias
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import models.ProductoCongelado;

import static controllers.ViewAlerta.mostrarAlerta;

public class CrudProductosCongeladosController {

    //Usando el SceneController para cambiar de escenas
    private final SceneController sceneController = new SceneController();

    //ListView para mostrar los productos congelados
    @FXML
    private ListView<ProductoCongelado> lstVwProductoCongelado;

    //TextField para poder escribir los datos
    @FXML
    private TextField txtFechaDeCaducidad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNumLote;

    @FXML
    private TextField txtTemCongelacion;

    // Mostrando la lista de productos congelados en la lstViewProductosCongelados
    private final ObservableList<ProductoCongelado> productosCongelados = FXCollections.observableArrayList();

    // Inicializando la lista de productos congelados
    @FXML
    public void initialize() {
        lstVwProductoCongelado.setItems(productosCongelados);
    }

    // Cambio de escena para el panel principal
    @FXML
    void cambiarAlPanelPrincipal(ActionEvent event) {
        sceneController.cambiarPanelPrincipal(event);
    }

    // Limpiar los campos de texto (TextField)
    @FXML
    void limpiarTextField(ActionEvent event) {
        this.txtNombre.setText("");
        this.txtFechaDeCaducidad.setText("");
        this.txtNumLote.setText("");
        this.txtTemCongelacion.setText("");
    }

    // Guardar los datos en la lista de productos congelados
    @FXML
    void guardarDatosEnLista(ActionEvent event) {
        String nombre = txtNombre.getText();
        String fechaCaducidad = txtFechaDeCaducidad.getText();
        int numeroLote;
        float temperatura;

        //Validando que sea un número entero y no otra cosa
        try {
            numeroLote = Integer.parseInt(txtNumLote.getText());
        } catch (NumberFormatException e) {
            mostrarAlerta("No se permite vacio, decimales, letras o símbolos en N° Lote");
            this.txtNumLote.setText("");
            return;
        }

        //Validando que sea un número flotante y no otra cosa
        try {
            temperatura = Float.parseFloat(txtTemCongelacion.getText());
        } catch (NumberFormatException e) {
            mostrarAlerta("No se permite vacio letras o símbolos en Temp. de Congelación");
            this.txtTemCongelacion.setText("");
            return;
        }

        //Creando el producto congelado
        ProductoCongelado producto = new ProductoCongelado(nombre, fechaCaducidad, numeroLote, temperatura);
        productosCongelados.add(producto);

        limpiarTextField(event);
    }
}

