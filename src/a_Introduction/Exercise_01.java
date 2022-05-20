package a_Introduction;

import java.util.Scanner;

public class Exercise_01 {

    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero de 5 digitos");
        int num = input.nextInt();
        System.out.println( (num / 10000) + "   " +((num % 10000)/1000) + "   " +
        ((num % 1000)/100)+"   "+((num % 100)/10)+"   "+ (num %10));
*/

        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.println("Ingrese el numero 1");
        num1 = input.nextInt();
        System.out.println("Ingrese el numero 2");
        num2 = input.nextInt();
        System.out.println("Ingrese el numero 3");
        num3 = input.nextInt();
        System.out.println("Ingrese el numero 4");
        num4 = input.nextInt();
        System.out.println("Ingrese el numero 5");
        num5 = input.nextInt();

        int pos=0, neg=0,cero=0;
        if (num1 > 0){
            pos = pos + 1 ;
        }else if(num1 < 0){
            neg = neg + 1 ;
        }else if (num1 == 0){
            cero= cero+1;
        }

        if (num2 > 0){
            pos = pos + 1 ;
        }else if(num2 < 0){
            neg = neg + 1 ;
        }else if (num2 == 0){
            cero= cero+1;
        }
        if (num3 > 0){
            pos = pos + 1 ;
        }else if(num3 < 0){
            neg = neg + 1 ;
        }else if (num3 == 0){
            cero= cero+1;
        }

        if (num4 > 0){
            pos = pos + 1 ;
        }else if(num4 < 0){
            neg = neg + 1 ;
        }else if (num4 == 0){
            cero= cero+1;
        }

        if (num5 > 0){
            pos = pos + 1 ;
        }else if(num5 < 0){
            neg = neg + 1 ;
        }else if (num5 == 0){
            cero= cero+1;
        }

        System.out.println("positivos : "+ pos);
        System.out.println("Negativos : "+neg);
        System.out.println("Nulos: "+cero);

    }
}
