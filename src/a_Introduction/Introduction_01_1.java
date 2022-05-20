package a_Introduction;

import java.util.Scanner;

public class Introduction_01_1 {

    public static void main(String[] args) {

        // 1.0 Equal´s operators

        boolean equal = 1 == 2;
        boolean noEqual = 1 != 2 ;

        System.out.printf("%b, %b%n",equal,noEqual);

        //1.1 Relational´s operators

        boolean major = 5 > 1;
        boolean majorE = 6 >= 6;
        boolean minor = 1 < 2;
        boolean minorE = 1 <= 1;

        System.out.printf("%b, %b, %b, %b%n",major,majorE,minor,minorE);

        System.out.println("\n\nComparison of two numbers");

        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();

         if (num1 == num2)
             System.out.printf("%d == %d%n",num1, num2);
         if (num1 != num2)
             System.out.printf("%d != %d%n",num1, num2);
         if (num1 < num2)
            System.out.printf("%d < %d%n",num1, num2);
         if (num1 > num2)
            System.out.printf("%d > %d%n",num1, num2);
         if (num1 <= num2)
            System.out.printf("%d <= %d%n",num1, num2);
         if (num1 >= num2)
            System.out.printf("%d >= %d%n",num1, num2);


    }
}
