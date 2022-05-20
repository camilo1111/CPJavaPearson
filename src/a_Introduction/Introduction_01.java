package a_Introduction;

import java.util.Scanner;

public class Introduction_01 {

    public static void main(String[] args) {
        //1.0First Line Text
        System.out.println("This is my first line of text");

        //1.1 This is a comment of one line
        /*This is a comment of multiple lines
        */

        //1.3 Line Text with multiple instructions

        System.out.print("This is a line text ");
        System.out.println("with multiple instructions");

        //1.4 Multiple lines of text with one instruction

        System.out.printf("Multiples lines%nWith one%nInstruction");

        //1.5 Escape sequences \n \t \r \\ \"

        System.out.println("Line with jump \nof line ");
        System.out.println("Line\twith\tTAB");
        System.out.println("Imp \\");
        System.out.println("Imp \"");

        //1.6 printf Imp with format
        System.out.printf("%s %s %d%n","Format","is",(1+1));

        // Sum of integers (Result with printf)

        Scanner input = new Scanner(System.in);

        int num1, num2, sum;

        System.out.println("Enter first number ");
        num1 = input.nextInt();

        System.out.println("Enter second number ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.printf("The Sum is : %d%n",sum);


    }

}
