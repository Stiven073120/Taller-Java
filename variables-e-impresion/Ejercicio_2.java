import java.util.Scanner;
/**
 * Ejercicio_2
 * Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.
 */

public class Ejercicio_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es su nombre?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cual es su apellido?");
        String apellido = scanner.nextLine();

        System.out.println("¿Cual es su edad?");
        int edad = scanner.nextInt();

        System.out.println("¿Cual es su estatura?");
        float estatura = scanner.nextFloat();

        System.out.println("Hola " + nombre + " " + apellido + " gracias por participar. recuerde que su estatura es de "+estatura+" y su edad es de "+edad);
    }
}
