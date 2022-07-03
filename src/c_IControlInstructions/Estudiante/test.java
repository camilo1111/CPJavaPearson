package c_IControlInstructions.Estudiante;

public class test {
    public static void main(String[] args) {
        int numero = 100;
        int numero2 = numero;
        int i = 1;
        int j = 1;
        double porcentaje = numero * 0.15;
        while (i <= 6){
            System.out.println(numero);
            numero = (int) (numero - porcentaje);
            i++;
        }
        numero2 = (int) porcentaje;
        while (j<=6){
            System.out.println(numero2);
            numero2 = (int) (numero2 + porcentaje);
            j++;
        }


    }
}
