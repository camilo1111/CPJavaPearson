package a_Introduction;

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        System.out.println("Indice de masa corporal (BMI) \n");

        Scanner input = new Scanner(System.in);
        double peso=0, altura=0;
        System.out.println("Ingrese su peso en kilogramos (Kg)");
        peso = input.nextDouble();
        System.out.println("Ingrese su altura en Metros (Mts)");
        altura= input.nextDouble();
        double bmi= peso/(Math.pow(altura,2));

        System.out.printf("%nSu indice de masa corporal es : %.0f%n%n",bmi);

        if (bmi < 18.5){
            System.out.println("Estas bajo de peso");
        }else if (bmi>= 18.5 && bmi <= 24.9){
            System.out.println("Tu peso es normal");
        }else if (bmi >= 25 && bmi <= 29.9){
            System.out.println("Tienes sobre peso");
        }else{
            System.out.println("Estas en obesidad");
        }
    }
}
