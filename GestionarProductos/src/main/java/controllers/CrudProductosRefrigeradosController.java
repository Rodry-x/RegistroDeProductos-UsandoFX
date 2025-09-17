package controllers;

//Importaciones necesarias
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import models.ProductoRefrigerado;

//Importando la alerta
import static controllers.ViewAlerta.mostrarAlerta;

public class CrudProductosRefrigeradosController {

    //Usando el SceneController para cambiar de escenas
    private final SceneController sceneController = new SceneController();

    //ListView para mostrar los productos refrigerados
    @FXML
    private ListView<ProductoRefrigerado> lstVwProductoRefrigerado;

    //TextField para poder escribir los datos
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtFechaDeCaducidad;

    @FXML
    private TextField txtNumLote;

    @FXML
    private TextField txtCodigoDigesa;

    // Mostrando la lista de productos refrigerados en la lstViewProductosRefrigerados
    private final ObservableList<ProductoRefrigerado> productosRefrigerados = FXCollections.observableArrayList();

    // Inicializando la lista de productos refrigerados
    @FXML
    public void initialize() {
        lstVwProductoRefrigerado.setItems(productosRefrigerados);
    }

    // Cambio de escena para el panel principal
    @FXML
    void cambiarAlPanelPrincipal(ActionEvent event) {
        sceneController.cambiarPanelPrincipal(event);
    }

    // Guardar los datos en la lista de productos refrigerados
    @FXML
    void guardarDatosEnLista(ActionEvent event) {
        String nombre = txtNombre.getText();
        String fechaCaducidad = txtFechaDeCaducidad.getText();
        String codigoDigesa = txtCodigoDigesa.getText();
        int numeroLote;

        //Validando que sea un número entero
        try {
            numeroLote = Integer.parseInt(txtNumLote.getText());
        } catch (NumberFormatException e) {
            mostrarAlerta("No se permite vacío, decimales, letras o símbolos en N° Lote");
            this.txtNumLote.setText("");
            return;
        }

        //Creando el producto refrigerado
        ProductoRefrigerado producto = new ProductoRefrigerado(
                nombre,
                fechaCaducidad,
                numeroLote,
                codigoDigesa
        );
        productosRefrigerados.add(producto);

        limpiarTextField(event);
    }

    // Limpiar los campos de texto (TextField)
    @FXML
    void limpiarTextField(ActionEvent event) {
        this.txtNombre.setText("");
        this.txtFechaDeCaducidad.setText("");
        this.txtNumLote.setText("");
        this.txtCodigoDigesa.setText("");
    }
}