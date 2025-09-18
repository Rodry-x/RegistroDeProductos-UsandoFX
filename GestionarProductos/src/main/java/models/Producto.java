package models;

public class Producto {
    private String nombre;
    private String fechaDeCaducidad;
    private int numeroDeLote;

    //Constructor de la clase Producto
    public Producto(String nombre, String fechaCaducidad, int numeroLote) {
        this.nombre = nombre;
        this.fechaDeCaducidad = fechaCaducidad;
        this.numeroDeLote = numeroLote;
    }

    //los getter y setter de los atributos de la clase Productos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaDeCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroDeLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroDeLote = numeroLote;
    }

    //Devolviendo los atributos de la clase
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCaducidad: " + fechaDeCaducidad + "\nLote: " + numeroDeLote;
    }

}
