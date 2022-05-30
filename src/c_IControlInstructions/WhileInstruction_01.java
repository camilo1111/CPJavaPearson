package c_IControlInstructions;

import java.util.Scanner;

public class WhileInstruction_01 {

    public static void main(String[] args) {
        int i = 1; // contador = i
        int total=0; // Total de las notas a las que le sacaremos el promedio
        double promedio;
        Scanner input = new Scanner(System.in);
        while (i <= 10){// La condicion se cumplira mientras siga siendo true

            System.out.println("Escriba la nota " + i);
            int calificacion = input.nextInt();
            total= total+ calificacion;
            i++;
        }
        promedio= (double) total/10;
        System.out.println("Total de notas "+total);
        System.out.printf("El promedio de las notas ingresadas es %.2f",promedio);

    }
}
