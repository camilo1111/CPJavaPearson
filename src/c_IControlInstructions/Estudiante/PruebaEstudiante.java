package c_IControlInstructions.Estudiante;

public class PruebaEstudiante {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Camilo Diaz", 72.24);
        Estudiante estudiante2 = new Estudiante("Jade Porth", 90.24);

        System.out.printf("La calificacion de %s es %s",estudiante1.getNombre(),estudiante1.obtenerCalificacion());
        System.out.printf("\nLa calificacion de %s es %s",estudiante2.getNombre(),estudiante2.obtenerCalificacion());

    }
}
