package controllers;

//Importaciones necesarias
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import models.ProductoFresco;

//Importando el mensaje de alerta
import static controllers.ViewAlerta.mostrarAlerta;

public class CrudProductosFrescosController {

    //Usando el SceneController para cambiar de escenas
    private final SceneController sceneController = new SceneController();

    //ListView para mostrar los productos frescos
    @FXML
    private ListView<ProductoFresco> lstVwProductoFresco;

    //TextField para poder escribir los datos
    @FXML
    private TextField txtFechaDeCaducidad;

    @FXML
    private TextField txtFechaDeEnvasado;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNumDeLote;

    @FXML
    private TextField txtPaisDeOrigen;

    // Mostrando la lista de productos frescos en la lstViewProductosFrescos
    private final ObservableList<ProductoFresco> productosFrescos = FXCollections.observableArrayList();

    // Inicializando la lista de productos frescos
    @FXML
    public void initialize() {
        lstVwProductoFresco.setItems(productosFrescos);
    }

    // Cambio de escena para el panel principal
    @FXML
    void cambiarAlPanelPrincipal(ActionEvent event) {
        sceneController.cambiarPanelPrincipal(event);
    }

    // Guardar los datos en la lista de productos frescos
    @FXML
    void guardarDatosEnLista(ActionEvent event) {
        String nombre = txtNombre.getText();
        String fechaCaducidad = txtFechaDeCaducidad.getText();
        String fechaEnvasado = txtFechaDeEnvasado.getText();
        String paisOrigen = txtPaisDeOrigen.getText();
        int numeroLote;

        //Validando que sea un numero entero
        try {
            numeroLote = Integer.parseInt(txtNumDeLote.getText());
        } catch (NumberFormatException e) {
            mostrarAlerta("No se permite vacío, decimales, letras o símbolos en N° Lote");
            this.txtNumDeLote.setText("");
            return;
        }

        //Creando el producto fresco
        ProductoFresco producto = new ProductoFresco(
                nombre,
                fechaCaducidad,
                numeroLote,
                fechaEnvasado,
                paisOrigen
        );
        productosFrescos.add(producto);

        limpiarTextField(event);
    }

    // Limpiar los campos de texto (TextField)
    @FXML
    void limpiarTextField(ActionEvent event) {
        this.txtNombre.setText("");
        this.txtFechaDeCaducidad.setText("");
        this.txtNumDeLote.setText("");
        this.txtFechaDeEnvasado.setText("");
        this.txtPaisDeOrigen.setText("");
    }
}