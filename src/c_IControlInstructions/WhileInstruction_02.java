package c_IControlInstructions;

import java.util.Scanner;

public class WhileInstruction_02 {
    public static void main(String[] args) {

        int total=0;
        int i = 0;
        double promedio;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la nota 1 o -1 para salir");
        int calificacion = scanner.nextInt(); // Va a ser el centinela

        while (calificacion != -1){

            total += calificacion;
            i++;

            System.out.println("Ingrese la nota "+ (i + 1 ) +" o -1 para salir");
            calificacion = scanner.nextInt(); // Va a ser el centinela

        }

        promedio = (double) total/i;

        System.out.printf("\nEl total de las %d calificaciones es %d",i,total);
        System.out.printf("\nEl promedio de las notas ingresadas es %.2f",promedio);
    }
}
