package clases;

public class Persona {
    private String nombre;
    private double peso;
    private double altura;


    public Persona(String nombre, double peso, double altura ) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        return peso/(Math.pow(altura, 2));
    }

    public String getNombre() {
        return nombre;
    }


}
