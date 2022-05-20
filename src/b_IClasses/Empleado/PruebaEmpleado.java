package b_IClasses.Empleado;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Andres","Diaz",100000);
        Empleado empleado2 = new Empleado("Valeria","Perez",150000);

        System.out.println("INFORMACION DE LOS SALARIOS DE LOS EMPLEADO \n");
        System.out.printf("El salario anual de %s %s es : %.2f",empleado1.getNombre(),empleado1.getApellido(),empleado1.anualSueldo());
        System.out.printf("\nEl salario anual de %s %s es : %.2f\n",empleado2.getNombre(),empleado2.getApellido(),empleado2.anualSueldo());
        System.out.println("\n Los empleado obtendran un aumento en un 10 % en sus sueldos");
        empleado1.setSueldo(empleado1.getSueldo()*1.1);
        empleado2.setSueldo(empleado2.getSueldo()*1.1);

        System.out.println("\nSUELDOS ACTUALIZADOS\n");
        System.out.printf("El salario anual de %s %s es : %.2f",empleado1.getNombre(),empleado1.getApellido(),empleado1.anualSueldo());
        System.out.printf("\nEl salario anual de %s %s es : %.2f\n",empleado2.getNombre(),empleado2.getApellido(),empleado2.anualSueldo());


    }

}
