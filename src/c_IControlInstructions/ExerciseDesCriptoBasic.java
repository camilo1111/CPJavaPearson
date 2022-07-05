package c_IControlInstructions;

import java.util.Scanner;

public class ExerciseDesCriptoBasic {
    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de 4 digitos");
        num = scanner.nextInt();

        if (num < 1000 && num > 9999) {

            System.out.println("El numero que ingreso no es valido ");
        } else {

            int num1 = (num / 1000);
            num = num % 1000;
            int num2 = (num / 100);
            num = num % 100;
            int num3 = (num / 10);
            num = num % 10;
            int num4 = (num);
            String cifrado1 = num1 + "-" + num2 + "-" + num3 + "-" + num4;

            System.out.println("Descomprimiendo numero de manera correcta ...."+cifrado1);
            // proceso de descifrado
            int numd3 = getNumd(num3);
            int numd1 = getNumd(num1);
            int numd2 = getNumd(num2);
            int numd4 = getNumd(num4);

            String descifrado = numd3 + "" + numd4 + "" + numd1 + "" + numd2;
            System.out.println("El numero descifrado es : " + descifrado);
        }
    }

    private static int getNumd(int num) {
        int numd;
        int divEnt;
        if (num < 7) {
            divEnt = 1;
            numd = ((10 * divEnt) + num) - 7;

        } else {
            divEnt = 0;
            numd = ((10 * divEnt) + num) - 7;

        }
        return numd;
    }
}
