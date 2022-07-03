package ex_GUI.PanelDibujo01;

import javax.swing.*;

public class PruebaPanelDibujo {

    public static void main(String[] args) {
        PanelDibujo panelDibujo = new PanelDibujo();
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panelDibujo);
        aplicacion.setSize(250,250);
        aplicacion.setVisible(true);

    }
}
