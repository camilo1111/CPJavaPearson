package b_IClasses.Fecha;

import java.util.Scanner;

public class PruebaFecha {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int dia,mes,age ;

        System.out.println("Ingrese el dia");
        dia = entrada.nextInt();
        System.out.println("Ingrese el mes");
        mes = entrada.nextInt();
        System.out.println("Ingrese el año");
        age = entrada.nextInt();

        Fecha fecha = new Fecha(dia,mes,age);

        System.out.println(fecha.mostrarFecha());


    }

}
