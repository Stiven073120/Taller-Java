package clases;

public class Persona {
    private String nombre;
    private String apellido;
    private String moto;

    public Persona(String nombre, String apellido, String moto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.moto = moto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMoto() {
        return moto;
    }
   


}