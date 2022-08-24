import java.util.Scanner;

/**
 * Ejercicio_3
 * Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre. 
 * Al finalizar debe imprimir en pantalla el siguiente mensaje "Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y 
 * [Nombre del Padre].
 */

public class Ejercicio_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es su nombre?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cual es su apellido?");
        String apellido = scanner.nextLine();

        System.out.println("¿Cual es el nombre de su madre?");
        String nombreMadre = scanner.nextLine();

        System.out.println("¿Cual es el apellido de su madre?");
        String apellidoMadre = scanner.nextLine();

        System.out.println("¿Cual es el nombre de su padre?");
        String nombrePadre = scanner.nextLine();

        System.out.println("¿Cual es el apellido de su padre?");
        String apellidoPadre = scanner.nextLine();

        System.out.println("Yo "+nombre+" "+apellido+", soy hijo de "+nombreMadre+" "+apellidoMadre+" y "+nombrePadre+" "+apellidoPadre);

    }
}