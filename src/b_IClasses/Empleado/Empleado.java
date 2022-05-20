package b_IClasses.Empleado;

public class Empleado {

    private String nombre;
    private String apellido;
    private double sueldo;

    public Empleado(String nombre, String apellido, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;

        if (sueldo<0){
        this.sueldo = 0;
        }else {
            this.sueldo = sueldo;
        }
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double anualSueldo() {
        return sueldo * 12;
    }
}
