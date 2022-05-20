package b_IClasses.FrecuenciaCardiaca;

import java.util.Calendar;
public class FrecuenciasCardiacas {

    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int año;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private int edad;
    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.edad = obtenerEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int obtenerEdad(){
        Calendar fechaAct = Calendar.getInstance();

        int añoAct = fechaAct.get(Calendar.YEAR);
        int mesAct = fechaAct.get(Calendar.MONTH+1);
        int diaAct = fechaAct.get(Calendar.DAY_OF_MONTH);

        if(this.mes <= mesAct && this.dia <= diaAct){
            return (añoAct-this.año);
        }else {
            return (añoAct-this.año-1);
        }
    }
    public double frecuenciaCardiacaMax(){

        int edad = obtenerEdad();
        double freCarMax = 220 - edad;

        return freCarMax;
    }
    public double[] frecuenciaCardicaEsperada(){

        double frecuenciaMax = frecuenciaCardiacaMax();
        double rango []= new double[2];
        rango[0]= frecuenciaMax*0.5;
        rango[1]= frecuenciaMax*0.85;
        return rango;
    }
}
