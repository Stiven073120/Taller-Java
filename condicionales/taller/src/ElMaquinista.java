import java.util.Scanner;

import clases.Persona;
import clases.Servicio;

/**
 * ElMaquinista
 * El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje
 * para realizar las respectivas
 * revisiones y requiere una aplicación que le permita registrar los servicios
 * generados a sus clientes.
 * Para cada motocicleta se debe tener registro del ingreso al taller y las
 * observaciones por parte del
 * cliente. También debe existir registro de salida del taller con las novedades
 * y otra de arreglos hechos
 * por el mecánico en caso de que se requiera inventariar cambios repuestos en
 * la motocicleta al entregarla.
 */

public class ElMaquinista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // se instancian los servicios
        Servicio servicio1 = new Servicio("Cambio de aceite", 10000);
        Servicio servicio2 = new Servicio("Cambio de filtros de aire", 15000);
        Servicio servicio3 = new Servicio("Cambio de Kit de arrastre", 15000);
        Servicio servicio4 = new Servicio("Lubricacion", 7000);
        Servicio servicio5 = new Servicio("Cambio de Pastillas", 10000);
        Servicio servicio6 = new Servicio("Mantenimiento General", 25000);

        // se crea una instancia de la persona
        System.out.println("¿Como es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.println("¿Cual es tu apellido?");
        String apellido = scanner.nextLine();
        System.out.println("¿Cual es la referencia de tu moto?");
        String moto = scanner.nextLine();

        Persona persona1 = new Persona(nombre, apellido, moto);

        // ciclo principal de la aplicacion
        boolean estado = true;
        while (estado) {
            // menu principal
            System.out.println(
                    "\nBienbenido al taller el Maquinista\n1. Solicitar servicios\n2. Consultar valor de servicios\n3. Salir");
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("\nListado de Servicios\n1. " + servicio1.getNombre() + "\n2. "
                            + servicio2.getNombre() + "\n3. " + servicio3.getNombre() + "\n4. " + servicio4.getNombre()
                            + "\n5. " + servicio5.getNombre() + "\n6. " + servicio6.getNombre());
                    System.out.println("\nElija una opcion");
                    int opcionServicio = Integer.parseInt(scanner.nextLine());

                    switch (opcionServicio) {
                        case 1:
                            servicio1.servicioTomado(persona1);
                            break;

                        case 2:
                            // servicio 2
                            servicio2.servicioTomado(persona1);
                            break;

                        case 3:
                            // servicio 3
                            servicio3.servicioTomado(persona1);
                            break;
                            
                        case 4:
                            // servicio 4
                            servicio4.servicioTomado(persona1);
                            break;

                        case 5:
                            // servicio 5
                            servicio5.servicioTomado(persona1);
                            break;

                        case 6:
                            // servicio 6
                            servicio6.servicioTomado(persona1);
                            break;

                        default:
                            System.out.println("Respuesta incorrecta");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nListado de Servicios\n1. " + servicio1.getNombre() + "\t\t\t"
                            + servicio1.getValor() + "\n2. " + servicio2.getNombre() + "\t\t" + servicio2.getValor()
                            + "\n3. " + servicio3.getNombre() + "\t\t" + servicio3.getValor() + "\n4. "
                            + servicio4.getNombre() + "\t\t\t\t" + servicio4.getValor() + "\n5. "
                            + servicio5.getNombre()
                            + "\t\t\t" + servicio5.getValor() + "\n6. " + servicio6.getNombre() + "\t\t"
                            + servicio6.getValor());
                    System.out.println("Enter para continuar");
                    scanner.nextLine();
                    break;

                case 3:
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