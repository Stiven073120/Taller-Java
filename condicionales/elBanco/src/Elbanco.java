import java.util.Scanner;

import clases.Persona;

/**
 * Elbanco
 * El banco "Su banco fiel" es un banco que inicia sus actividades financieras y
 * necesita una aplicación para llevar las cuentas de sus usuarios; por lo
 * tanto, se sugiere que la cuenta tenga los atributos titular y cantidad. Para
 * cada cliente las cuentas permitirán realizar ingresos, retiros o consultas de
 * valor. En los ingresos no se pueden insertar valores negativos y para los
 * retiros el valor no puede ser mayor al valor que tiene en la cuenta.
 */

public class Elbanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es su nombre?");
        String nombre = scanner.nextLine();

        Persona persona1 = new Persona(nombre, "123456789", 850000);

        // ciclo principal
        boolean estado = true;
        while (estado) {
            System.out.println("\nBienvenido a su Banco Fiel" + "\n1. Consultar saldo"
                    + "\n2. Ingresar dinero" + "\n3. Retirar dinero" + "\n4. Salir");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    // Consultar saldo
                    System.out.println("\n" + persona1.getNombre() + " El saldo actual de su cuenta numero "
                            + persona1.getNumeroCuenta() + " es: " + persona1.getSaldoCuenta());
                    break;
                case 2:
                    // Ingresar dinero
                    System.out.println("¿Cuanto dinero desea ingresar?");
                    double cantidadIngresar = Double.parseDouble(scanner.nextLine());

                    if (cantidadIngresar > 0) {
                        persona1.ingresarSaldo(cantidadIngresar);
                        System.out.println("Transaccion exitosa su saldo actual es de " + persona1.getSaldoCuenta());
                    } else {
                        System.out.println("Cantidad incorrecta");
                    }
                    break;
                case 3:
                    // Retirar dinero
                    System.out.println("¿Cuanto dinero desea retirar?");
                    double cantidadRetirar = Double.parseDouble(scanner.nextLine());

                    if (cantidadRetirar > 0) {

                        if (cantidadRetirar < persona1.getSaldoCuenta()) {
                            persona1.retirarSaldo(cantidadRetirar);
                            System.out
                                    .println("Transaccion exitosa su saldo actual es de " + persona1.getSaldoCuenta());
                        } else {
                            System.out.println("Saldo insuficiente");
                        }

                    } else {
                        System.out.println("Cantidad incorrecta ");
                    }
                    break;
                case 4:
                    // Salir
                    System.out.println("Gracias por su tiempo");
                    estado = false;
                    break;

                default:
                    System.out.println("opcion incorrecta");
                    break;
            }

        }
    }

}