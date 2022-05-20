package ex_GUI;

import javax.swing.JOptionPane;

public class Dialogo_01 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Bienvenido a Java!!!","Mensaje",1);

        String nombre;

        nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        String msj1 = "Hola como estas " + nombre ;
        String msj2 = String.format("Hola %s como estas",nombre);

        JOptionPane.showMessageDialog(null,msj1,"Mensaje",1);
        JOptionPane.showMessageDialog(null,msj2,"Mensaje",1);





    }
}
