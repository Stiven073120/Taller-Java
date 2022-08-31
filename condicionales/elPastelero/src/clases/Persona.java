package clases;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String telefono;
    private String direccion;


    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void pedirPastelDomicilio(Pastel pastel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es tu direccion?");
        String direccion = scanner.nextLine();
        System.out.println("¿Cual es tu telefono?");
        String telefono = scanner.nextLine();

        setDireccion(direccion);
        setTelefono(telefono);
        
    }

    
    public void pedirPastel(Pastel pastel) {
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
