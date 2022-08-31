package clases;

public class Persona {
    
    private String nombre;
    private String numeroCuenta;
    private double saldoCuenta;

    public Persona(String nombre, String numeroCuenta, double saldoCuenta) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public void retirarSaldo(double cantidadRetirar) {
        saldoCuenta -= cantidadRetirar; 
    }

    public void ingresarSaldo(double cantidadIngresar) {
        saldoCuenta += cantidadIngresar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

}
