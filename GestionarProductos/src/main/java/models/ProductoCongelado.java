package models;

//heredando la clase Producto
public class ProductoCongelado extends Producto {
    //Añadiendo un nuevo atributo
    private float temperaturaDeCongelacion;

    //Constructor de la clase ProductoCongelado
    public ProductoCongelado(String nombre, String fechaCaducidad, int numeroLote, float temperaturaCongelacionRecomendada) {
        super(nombre, fechaCaducidad, numeroLote);
        setTemperaturaCongelacionRecomendada(temperaturaCongelacionRecomendada);
    }

    //los getter y setter de los atributos de la clase ProductoCongelado
    public float getTemperaturaCongelacionRecomendada() {
        return temperaturaDeCongelacion;
    }

    public void setTemperaturaCongelacionRecomendada(float temperaturaCongelacionRecomendada) {
        this.temperaturaDeCongelacion = temperaturaCongelacionRecomendada;
    }

    //Devolviendo los atributos de la clase
    @Override
    public String toString() {
        return super.toString() + ", Temperatura de Congelación Recomendada: " + getTemperaturaCongelacionRecomendada();
    }
}