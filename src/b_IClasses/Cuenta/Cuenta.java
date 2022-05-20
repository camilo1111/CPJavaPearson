package b_IClasses.Cuenta;

public class Cuenta{

    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;

        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        if (saldo > 0) {
            this.saldo = this.saldo + saldo;
        }
    }

    public void retirarSaldo(double saldo){

        if (saldo <= this.saldo) {
            this.saldo = this.saldo - saldo;
        }else{
            System.out.println("No se puede retirar esa cantidad. Saldo no suficiente");
        }

    }
}
