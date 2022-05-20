package b_IClasses.Cuenta;

import b_IClasses.Cuenta.Cuenta;

import java.util.Scanner;

public class UseCuenta {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta("Camilo Diaz",152000.95);
        Cuenta cuenta2 = new Cuenta("Valeria gonzalez",15400.15);

        double deposito ;
        double retiro;

        // mostrar la info actual
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        // Pedir valor a depositar para las dos cuentas
        System.out.printf("\nIngresa el valor a depositar en la cuenta %s%n ",cuenta1.getNombre());
        deposito = input.nextDouble();
        cuenta1.setSaldo(deposito);
        System.out.printf("%n%nIngresa el valor a depositar en la cuenta %s%n ",cuenta2.getNombre());
        deposito = input.nextDouble();
        cuenta2.setSaldo(deposito);

        //Mostrar el valor nuevo de los saldos de las cuentas

        System.out.println("\n");
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        //Retiro de dinero de la cuenta
        System.out.println("\n\nProceso de retiro");
        System.out.printf("Ingresa el valor a retirar en la cuenta %s saldo actual : %.2f $%n ",cuenta1.getNombre(), cuenta1.getSaldo());
        retiro = input.nextDouble();
        cuenta1.retirarSaldo(retiro);
        mostrarCuenta(cuenta1);

    }
    private static void mostrarCuenta(Cuenta cuenta) {
        System.out.printf("El saldo actual de la cuenta %s es : %.2f $ %n", cuenta.getNombre(), cuenta.getSaldo());
    }

}
