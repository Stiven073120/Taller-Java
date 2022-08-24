import java.util.Scanner;

/**
 * Ejercicio_1
 * Realizar un programa el cual solicite su nombre y apellidos.
 */

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es su nombre?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cual es su apellido?");
        String apellido = scanner.nextLine();

        System.out.println("Hola " + nombre + " " + apellido + " gracias por participar.");

    }

}
