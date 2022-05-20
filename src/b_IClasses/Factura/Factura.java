package b_IClasses.Factura;

public class Factura {

    private String numPieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numPieza, String descripcion, int cantidad, double precio) {
        this.numPieza = numPieza;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {

        if (cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad = cantidad;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio < 0){
            this.precio = 0;
        }else {
            this.precio = precio;
        }
    }

    public double obtenerMontoFactura(){

        return (cantidad * precio);
    }

}
