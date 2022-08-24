import java.util.Scanner;

/**
 * Ejercicio_4
 * Realizar un programa el cual solicite el nombre de una ciudad capital y el país. Al finalizar debe imprimir en pantalla el 
 * siguiente mensaje "La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País]
 */

public class Ejercicio_4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el nombre de un Pais");
        String pais = scanner.nextLine();

        System.out.println("¿Cual es la capital de "+pais+"?");
        String capitalPais = scanner.nextLine();

        System.out.println(capitalPais+ "es la capital de "+pais);
    }
}