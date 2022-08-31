import java.util.scanner;
/**
 * Ejercicio_1
 * Realizar un programa en el cual se solicite la edad de una persona. Si la persona es mayor o igual a 18 años,
 * deberá mostrar en pantalla: Usted es mayor de edad.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es su edad?");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }
    }
    
}