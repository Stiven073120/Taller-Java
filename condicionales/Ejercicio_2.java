import java.util.Scanner;

/**
 * Ejercicio_2
 * Realizar un programa en el cual se solicite la edad de una persona. Si la persona es menor a 18 años, 
 * deberá mostrar en pantalla: Usted aún es un niño(a).
 */

public class Ejercicio_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es su edad?");
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("Usted aun es un niño(a)");
        }

    }
    
}