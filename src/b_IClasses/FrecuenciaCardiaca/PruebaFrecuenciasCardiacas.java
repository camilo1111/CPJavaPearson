package b_IClasses.FrecuenciaCardiaca;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class PruebaFrecuenciasCardiacas {

    public static void main(String[] args) {


        String nombre = "Camilo", apellido = "Diaz";
        int diaC=19, mesC=5, año=1997;
        FrecuenciasCardiacas usuario = new FrecuenciasCardiacas(nombre,apellido,diaC,mesC,año);
        double rangoEsperado []= usuario.frecuenciaCardicaEsperada();

        System.out.println("DATOS DE FRECUENCIA CARDIACA DE : " + usuario.getNombre()+ " "+ usuario.getApellido());
        System.out.println("EDAD : "+usuario.getEdad());
        System.out.println("FRECUENCIA CARDIACA MAXIMA : " + usuario.frecuenciaCardiacaMax());
        System.out.println("FRECUENCIA CARDIACA ESPERADA MINIMA : " + rangoEsperado[0]);
        System.out.println("FRECUENCIA CARDIACA ESPERADA MAXIMA : " + rangoEsperado[1]);
    }

}
