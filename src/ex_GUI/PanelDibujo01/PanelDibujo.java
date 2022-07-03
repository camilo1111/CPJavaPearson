package ex_GUI.PanelDibujo01;

import javax.swing.*;
import java.awt.Graphics;

public class PanelDibujo extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        primerasLineas(g);
        segundasLineas(g);
        tercerasLineas(g);
        cuartasLineas(g);
        g.drawLine(0,0,getWidth(),getHeight());
        g.drawLine(0,getHeight(),getWidth(),0);


    }

    private void primerasLineas(Graphics g) {
        int ancho = getWidth();
        int alto = getHeight();
        int i = 1;
        int aplitudAncho = (int)(ancho*0.1);
        int aplitudAlto = (int)(alto*0.1);
        ancho = aplitudAncho;// el ancho debe comenzar bajo

        while (i <= 15){
            alto = alto-aplitudAlto;
            System.out.println(""+ ancho + " --- " +alto);
            g.drawLine(0,0,ancho,alto);
            ancho = ancho + aplitudAncho;
            i++;
        }
    }
    private void segundasLineas(Graphics g) {
        int ancho = getWidth();
        int alto = getHeight();
        int i = 1;
        int aplitudAncho = (int)(ancho*0.1);
        int aplitudAlto = (int)(alto*0.1);


        while (i <= 15){

            alto = alto-aplitudAlto;
            ancho = ancho - aplitudAncho;
            System.out.println("B"+ ancho + " --- " +alto);
            g.drawLine(0,getHeight(),ancho,alto);

            i++;
        }
    }
    private void tercerasLineas(Graphics g) {
        int ancho = getWidth();
        int alto = getHeight();
        int i = 1;
        int aplitudAncho = (int)(ancho*0.1);
        int aplitudAlto = (int)(alto*0.1);
        alto=aplitudAlto;

        while (i <= 15){
            ancho = ancho - aplitudAncho;
            System.out.println("C"+ ancho + " --- " +alto);
            g.drawLine(getWidth(),getHeight(),ancho,alto);
            alto =alto+aplitudAlto;


            i++;
        }
    }
    private void cuartasLineas(Graphics g) {
        int ancho = getWidth();
        int alto = getHeight();
        int i = 1;
        int aplitudAncho = (int)(ancho*0.1);
        int aplitudAlto = (int)(alto*0.1);


        while (i <= 15){
            alto =alto-aplitudAlto;
            ancho = ancho - aplitudAncho;
            System.out.println("D"+ ancho + " --- " +alto);
            g.drawLine(getWidth(),0,ancho,alto);



            i++;
        }
    }

}
