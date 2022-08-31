import java.util.Scanner;

import clases.Persona;

/**
 * SecretariaDeSalud
 * La Secretaría de Salud Municipal requiere de una aplicación que le permita
 * calcular el IMC (Índice de masa corporal) y requiere los datos peso en
 * kilogramos y estatura en metros Para cada persona encuestada adicional a los
 * datos suministrados, debe mostrar el resultado para cada uno y establecer en
 * qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).
 */
public class SecretariaDeSalud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // menu principal
        System.out.println("Bienvenido a la calculadora del IMC");

        System.out.println("¿Cual es su nombre?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cual es su peso en kg?");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.println("¿Cual es su altura en mts?");
        double altura = Double.parseDouble(scanner.nextLine());

        // se crea una instancia de la clase persona
        Persona persona1 = new Persona(nombre, peso, altura);

        // llado al metodo para calcular el imc 
        double imc = persona1.calcularImc();

        // condicional segun imc
        if (imc <= 18.4) {
            System.out.println(persona1.getNombre()+" usted se encuentra en: bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println(persona1.getNombre()+" usted se encuentra en: peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println(persona1.getNombre()+" usted se encuentra en: sobrepeso");
        } else if (imc >= 30) {
            System.out.println(persona1.getNombre()+" usted se encuentra en: Obeso");
        }
      
    }
}
