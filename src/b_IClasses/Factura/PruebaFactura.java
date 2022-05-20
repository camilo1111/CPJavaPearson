package b_IClasses.Factura;

import java.util.Scanner;

public class PruebaFactura {

    static final double PRECIO1 = 50;
    static final String NUM_PIEZA = "01";
    static final String DESCRIPCION = "Tornillos pequeños 3cm";
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Factura factura1 = new Factura(NUM_PIEZA,DESCRIPCION,0,PRECIO1);
        int cantidad;

        System.out.println("Ingrese la cantidad que va a comprar ");
        cantidad = entrada.nextInt();

        factura1.setCantidad(cantidad);
        System.out.println();
        System.out.print("FACTURA -----------> Factura 01");
        System.out.printf("\nNumero de la pieza : %s%n" +
                "Descripcion : %s%n" +
                "Cantidad : %d%n" +
                "Precio c/u : %.2f%n" +
                "Total Factura : %.2f%n%n" +
                "GRACIAS POR SU COMPRA" +
                        "",factura1.getNumPieza(),factura1.getDescripcion(),
                factura1.getCantidad(),factura1.getPrecio(),factura1.obtenerMontoFactura());





    }

}
