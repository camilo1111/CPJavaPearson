package b_IClasses.PerfilMedico;

import java.util.Calendar;

public class PerfilMedico {

    // Datos ingresados por el usuario
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int añoNacimiento;
    private int estatura;
    private double peso;

    // Datos determinados por el sistema
    private int edad;
    private int frecuenciaCardiacaMax;
    private double frecuenciaCardiacaEsperadaMin;
    private double frecuenciaCardiacaEsperadaMax;
    private double bmi;

    public PerfilMedico(String nombre, String apellido, int diaNacimiento, int mesNacimiento, int añoNacimiento, int estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.añoNacimiento = añoNacimiento;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = calcularEdad();
        this.frecuenciaCardiacaMax = (int) frecuenciaCardiacaMax();
        this.frecuenciaCardiacaEsperadaMax =frecuenciaCardicaEsperadaMax();
        this.frecuenciaCardiacaEsperadaMin =frecuenciaCardicaEsperadaMin();
        this.bmi= calcularBMI();
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

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFrecuenciaCardiacaMax() {
        return frecuenciaCardiacaMax;
    }

    public void setFrecuenciaCardiacaMax(int frecuenciaCardiacaMax) {
        this.frecuenciaCardiacaMax = frecuenciaCardiacaMax;
    }

    public double getFrecuenciaCardiacaEsperadaMin() {
        return frecuenciaCardiacaEsperadaMin;
    }

    public void setFrecuenciaCardiacaEsperadaMin(double frecuenciaCardiacaEsperadaMin) {
        this.frecuenciaCardiacaEsperadaMin = frecuenciaCardiacaEsperadaMin;
    }

    public double getFrecuenciaCardiacaEsperadaMax() {
        return frecuenciaCardiacaEsperadaMax;
    }

    public void setFrecuenciaCardiacaEsperadaMax(double frecuenciaCardiacaEsperadaMax) {
        this.frecuenciaCardiacaEsperadaMax = frecuenciaCardiacaEsperadaMax;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public int calcularEdad(){
        Calendar fechaAct = Calendar.getInstance();

        int añoAct = fechaAct.get(Calendar.YEAR);
        int mesAct = fechaAct.get(Calendar.MONTH+1);
        int diaAct = fechaAct.get(Calendar.DAY_OF_MONTH);

        if(this.mesNacimiento <= mesAct && this.diaNacimiento <= diaAct){
            return (añoAct-this.añoNacimiento);
        }else {
            return (añoAct-this.añoNacimiento-1);
        }
    }

    public double frecuenciaCardiacaMax (){

        int edad = this.edad;
        double freCarMax = 220 - edad;

        return freCarMax;
    }
    public double frecuenciaCardicaEsperadaMax(){

        double frecuenciaMaxx = this.frecuenciaCardiacaMax;
        double frecuenciaEMax= frecuenciaMaxx*0.85;

        return frecuenciaEMax;
    }
    public double frecuenciaCardicaEsperadaMin(){

        double frecuenciaMaxx = this.frecuenciaCardiacaMax;
        double frecuenciaEMin= frecuenciaMaxx*0.50;

        return frecuenciaEMin;
    }

    public double calcularBMI(){
        double bmi=0;
        double estaturaM = this.estatura * 0.01;
        bmi = this.peso / Math.pow(estaturaM,2);
        return bmi;
    }

    public String valoresBMI (){

        if (this.bmi < 18.5){
            return "BMI : BAJO DE PESO";
        }else if (this.bmi>= 18.5 && this.bmi <= 24.9){
            return "BMI : NORMAL";
        }else if (this.bmi >= 25 && this.bmi <= 29.9){
            return "BMI : SOBREPESO";
        }else{
            return "BMI : OBESIDAD";
        }
    }



}
