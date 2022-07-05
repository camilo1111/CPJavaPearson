package c_IControlInstructions;

import java.util.Scanner;

public class ExerciseMultiply {

    public static void main(String[] args) {

        int a,b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = scanner.nextInt();

        int result = 0;


            for (int i = 0; i < b; i++) {
                result = result + a;
            }


        System.out.println("El resultado es -->" + result);
    }
}
