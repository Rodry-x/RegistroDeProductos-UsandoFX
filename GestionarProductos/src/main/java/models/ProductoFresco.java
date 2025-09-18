package models;

//heredando la clase Producto
public class ProductoFresco extends Producto {
    //Añadiendo nuevos atributos
    private String fechaDeEnvasado;
    private String paisDeOrigen;

    //Constructor de la clase ProductoFresco
    public ProductoFresco(String nombre, String fechaCaducidad, int numeroLote, String fechaDeEnvasado, String paisDeOrigen) {
        super(nombre, fechaCaducidad, numeroLote);
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.paisDeOrigen = paisDeOrigen;
    }

    //los getter y setter de los atributos de la clase ProductoFresco
    public String getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(String fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    //Devolviendo los atributos de la clase
    @Override
    public String toString() {
        return super.toString() + "\nFecha de Envasado: " + fechaDeEnvasado + "\nPaís de Origen: " + paisDeOrigen;
    }

}
