import java.util.Scanner;
/**
 * Ejercicio_5
 * Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo. 
 * Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: [Nombre de Mascota] es un(a) [Tipo de Mascota], 
 * el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo] es actualmente su dueño(a).
 */

public class Ejercicio_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es el nombre de su mascota?");
        String nombreMascota = scanner.nextLine();

        System.out.println("¿Que tipo de mascota es?");
        String tipoMascota = scanner.nextLine();

        System.out.println("¿Cual es su nombre completo?");
        String nombreCompleto = scanner.nextLine();

        System.out.println("¿Cual es la edad de su mascota?");
        int edadMascota = scanner.nextInt();

        System.out.println(nombreMascota+" es un(a) "+tipoMascota+", el cual, tiene "+edadMascota+" años de edad y "+nombreCompleto+" es actualmente su dueño(a).");
    }
}