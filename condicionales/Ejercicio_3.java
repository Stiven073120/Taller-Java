import java.util.Scanner;

/**
 * Ejercicio_3
 * Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona. Si la persona es mayor o igual a 18 años, 
 * entonce se deberá imprimir en pantalla [Nombre completo] usted es mayor de edad, por lo tanto puede entrar a la fiesta. Si la edad
 * de la persona es menor que 18 años, entonces, deberá imprimirse el siguiente mensaje: [Nombre completo] usted es menor de edad, 
 * por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.
 */

public class Ejercicio_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es su nombre?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cual es su apellido?");
        String apellido = scanner.nextLine();

        System.out.println("¿Cual es su edad?");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println(nombre+" "+apellido+" usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        } else {
            System.out.println(nombre+" "+apellido+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}