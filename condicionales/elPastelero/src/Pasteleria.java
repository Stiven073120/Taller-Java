import java.io.Console;
import java.util.Scanner;

import clases.Pastel;
import clases.Persona;

/**
 * Pasteleria
 * El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere una
 * aplicación que le permita registrar los pedidos de los clientes en cuanto a
 * las tortas que realiza. Cada torta tiene unas características propias como
 * sabor, cantidad (porciones) y decoraciones). Se requiere que la aplicación
 * permita registrar los pedidos, las tortas disponibles y las ventas que se
 * registren diariamente.
 */

public class Pasteleria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pastel pastel1 = new Pastel("Torta de chocolate", 8, "trozos de chocolate", 21000);
        Pastel pastel2 = new Pastel("Torta de cafe", 8, "crema de cafe", 23000);
        Pastel pastel3 = new Pastel("Torta de tres leches", 12, "acompañada de nutella", 40000);
        Pastel pastel4 = new Pastel("Torta napolitana", 12, "con trozos de mani", 35000);

        System.out.println("Bienvenido ¿Cual es tu nombre?");
        String nombre = scanner.nextLine();

        Persona persona1 = new Persona(nombre);

        // ciclo principal
        boolean estado = true;
        while (estado) {
            // menu principal
            System.out.println(
                    "\nBienvenido a la Pasteleria Don Carlos\n1. Consultar productos y precios\n2. Pedir un pastel\n3. Salir");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    // Consultar productos y precios
                    System.out.println("\nLista de Productos\n1. " + pastel1.toString() + "\n2. " + pastel2.toString()
                            + "\n2. " + pastel3.toString() + "\n2. " + pastel4.toString());
                    break;
                case 2:
                    // Pedir un pastel
                    System.out.println("\nCual desea ordenar\n1. " + pastel1.getSabor() + "\n2. " + pastel2.getSabor()
                            + "\n3. " + pastel3.getSabor() + "\n4. " + pastel4.getSabor());

                    int opcionPastel = Integer.parseInt(scanner.nextLine());
                    int opcionDomicilio;

                    switch (opcionPastel) {
                        case 1:
                            System.out.println("\n¿Desea?\n1. Retirar en tienda\n2. Recibir en domicilio");
                            opcionDomicilio = Integer.parseInt(scanner.nextLine());

                            switch (opcionDomicilio) {
                                case 1:
                                    persona1.pedirPastel(pastel1);
                                    System.out.println(persona1.getNombre() + " Se realizo el pedido de "
                                            + pastel1.getSabor() + " para retiro en tienda");
                                    break;
                                case 2:
                                    persona1.pedirPastelDomicilio(pastel1);
                                    System.out.println(persona1.getNombre() + " Se realizo el pedido de "
                                            + pastel1.getSabor() + " a la direccion " + persona1.getDireccion()
                                            + " y numero de telefono " + persona1.getTelefono());
                                    break;

                                default:
                                    System.out.println("opcion incorrecta");
                                    break;
                            }
                            estado = false;
                            break;
                        case 2:
                            System.out.println("\n¿Desea?\n1. Retirar en tienda\n2. Recibir en domicilio");
                            opcionDomicilio = Integer.parseInt(scanner.nextLine());

                            switch (opcionDomicilio) {
                                case 1:
                                    persona1.pedirPastel(pastel2);
                                    System.out.println(persona1.getNombre() + " Se realizo el pedido de "
                                            + pastel2.getSabor() + " para retiro en tienda");
                                    break;
                                case 2:
                                    persona1.pedirPastelDomicilio(pastel2);
                                    System.out.println(persona1.getNombre() + " Se realizo el pedido de "
                                            + pastel2.getSabor() + " a la direccion " + persona1.getDireccion()
                                            + " y numero de telefono " + persona1.getTelefono());
                                    break;

                                default:
                                System.out.println("opcion incorrecta");
                                    break;
                            }
                            estado = false;
                            break;
                        case 3:
                            System.out.println("\n¿Desea?\n1. Retirar en tienda\n2. Recibir en domicilio");
                            opcionDomicilio = Integer.parseInt(scanner.nextLine());

                            switch (opcionDomicilio) {
                                case 1:
                                    persona1.pedirPastel(pastel3);
                                    System.out.println(persona1.getNombre() + " Se realizo el pedido de "
                                            + pastel3.getSabor() + " para retiro en tienda");
                                    break;
                                case 2:
                                    persona1.pedirPastelDomicilio(pastel3);
                                    System.out.println(persona1.getNombre() + " Se realizo el pedido de "
                                            + pastel3.getSabor() + " a la direccion " + persona1.getDireccion()
                                            + " y numero de telefono " + persona1.getTelefono());
                                    break;

                                default:
                                System.out.println("opcion incorrecta");
                                    break;
                            }
                            estado = false;
                            break;
                        case 4:
                            System.out.println("\n¿Desea?\n1. Retirar en tienda\n2. Recibir en domicilio");
                            opcionDomicilio = Integer.parseInt(scanner.nextLine());

                            switch (opcionDomicilio) {
                                case 1:
                                    persona1.pedirPastel(pastel4);
                                    System.out.println(persona1.getNombre() + " Se realizo el pedido de "
                                            + pastel4.getSabor() + " para retiro en tienda");
                                    break;
                                case 2:
                                    persona1.pedirPastelDomicilio(pastel4);
                                    System.out.println(persona1.getNombre() + " Se realizo el pedido de "
                                            + pastel4.getSabor() + " a la direccion " + persona1.getDireccion()
                                            + " y numero de telefono " + persona1.getTelefono());
                                    break;

                                default:
                                System.out.println("opcion incorrecta");
                                    break;
                            }
                            estado = false;
                            break;

                        default:
                            System.out.println("opcion incorrecta");
                            break;
                    }
                    break;
                case 3:
                    // Salir
                    System.out.println("Gracias por su tiempo");
                    estado = false;
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        }
    }

}