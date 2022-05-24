package c_IControlInstructions;

public class IFInstruction_01 {

    public static void main(String[] args) {

        int calificacion=72;

        if (calificacion >= 90){
            System.out.println("A");
        }
        else if (calificacion >= 80){
            System.out.println("B");
        }
        else if (calificacion >= 70){
            System.out.println("C");
        }
        else if (calificacion >=60){
            System.out.println("D");
        }
            else{
            System.out.println("F");
        }

        System.out.println(calificacion >= 70 ? "APROBADO" : "REPROBADO");

            }
        }

