package c_IControlInstructions;

import java.util.Scanner;

public class ExercisesCriptoBasic {

    public static void main(String[] args) {

        int num ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de 4 digitos");
        num = scanner.nextInt();

        if (num < 1000 && num > 9999){

            System.out.println("El numero que ingreso no es valido ");
        }else{

            int num1 = ((num/1000) + 7) % 10;
            num = num % 1000;
            int num2 = ((num/100) + 7) % 10;
            num = num % 100;
            int num3 = ((num/10) + 7) % 10;
            num = num % 10;
            int num4 = ((num/1) + 7) % 10;
            String cifrado1 = num1 +""+ num2 +""+ num3 +""+num4;
            String cifrado2 = num3 +""+ num4 +""+ num1 +""+num2;
            System.out.println(cifrado1);
            System.out.println(cifrado2);

            // proceso de descifrado
            int numd3,divEnt;
            if (num3 < 7){
                divEnt = 1;
                numd3 = ((10 * divEnt) + num3 ) - 7;
                System.out.println("Descifrado : " + numd3 );
            }else {
                divEnt = 0;
                numd3 = ((10 * divEnt) + num3 ) - 7;
                System.out.println("Descifrado : " + numd3 );
            }






        }

    }
}
