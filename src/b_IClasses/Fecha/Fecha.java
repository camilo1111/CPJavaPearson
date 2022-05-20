package b_IClasses.Fecha;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {

        if (dia > 0 && dia < 32){
            this.dia = dia;
        }else {
            this.dia = 0;
        }
        if(mes > 0 && mes <13){
            this.mes = mes;
        }else {
            this.mes = 0;
        }
        if(año > 0 ){
            this.año = año;
        }

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

    public String mostrarFecha() {

        String fecha;
        if (dia == 0 || mes == 0 || año ==0 ){
            fecha = "Fecha ingresada incorrecta";
        }else {
            fecha = dia+"/"+mes+"/"+año;
        }
        return fecha;
    }

}
