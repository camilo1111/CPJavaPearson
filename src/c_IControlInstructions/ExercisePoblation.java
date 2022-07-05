package c_IControlInstructions;

public class ExercisePoblation {

    public static void main(String[] args) {

        long poblacionInic = 7700;

        System.out.printf("Year\tCantidad Years\tPoblacion\t\tAumento");
        System.out.println();
        int year = 2022;
        long poblacion = poblacionInic;
        long aumento = 0;

        for (int i = 0; i <= 75; i+=5) {

            System.out.printf("%d\t%d\t\t\t\t%d millones\t%d millones\n",(year+i),(i),poblacion,aumento);
            aumento = (long) (poblacion * 0.9);
            poblacion = (long) (poblacion + (poblacion * 0.9));

        }
    }
}
