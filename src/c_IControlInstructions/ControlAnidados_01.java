package c_IControlInstructions;

import java.util.Scanner;

public class ControlAnidados_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contadorAprobado = 0, contadorReprobado = 0;
        int i = 1;
        while (i<=10){

            System.out.println("Ingrese la nota del estudiante " + i);
            int nota = scanner.nextInt();

            if (nota == 1 ){
                contadorAprobado ++;
            }
            if (nota == 2){
                contadorReprobado ++;
            }
            i++;
        }

        System.out.println("\nLa cantidad de aprobados es " + contadorAprobado);
        System.out.println("\nLa cantidad de reprobados es " + contadorReprobado);

        if (contadorAprobado >= 8){
            System.out.println("Bono para el instructor");
        }else {
            System.out.println("No hay bono para el instructor");
        }


    }
}
