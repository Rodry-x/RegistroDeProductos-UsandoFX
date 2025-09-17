package models;

//heredando la clase Producto
public class ProductoRefrigerado extends Producto{
    private String codigoDigesa;

    //Constructor de la clase ProductoRefrigerado
    public ProductoRefrigerado(String nombre, String fechaCaducidad, int numeroLote, String codigoOrganismoSupervision) {
        super(nombre, fechaCaducidad, numeroLote);
        this.codigoDigesa = codigoOrganismoSupervision;
    }

    //los getter y setter de los atributos de la clase ProductoRefrigerado
    public String getCodigoDigesa() {
        return codigoDigesa;
    }

    public void setCodigoDigesa(String codigoDigesa) {
        this.codigoDigesa = codigoDigesa;
    }

    //Devolviendo los atributos de la clase
    @Override
    public String toString() {
        return super.toString() + ", Código DIGESA: " + codigoDigesa;
    }
}
