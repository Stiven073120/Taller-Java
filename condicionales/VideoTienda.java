import java.util.Scanner;

/**
 * VideoTienda
 * La video tienda que presta sus servicios de alquiler de películas a los
 * usuarios del barrio el Porvenir, requiere
 * de una aplicación que permita registrar el alquiler de las películas que
 * adquieren sus usuarios. Para cada usuario
 * se debe permitir la opción de alquilar película, consultar películas
 * disponibles y recibir película en la video tienda
 * con la opción de realizar anotaciones sobre estas si se llegan a presentar
 * daños u otra novedad sobre la película.
 */

public class VideoTienda {
    public static void main(String[] args) {
        // codigo aqui
        Scanner scanner = new Scanner(System.in);

        // Se definen las variables que se van a utilizar
        String pelicula1 = "Mi villano favorito", pelicula2 = "Thor: love and thunder", pelicula3 = "Soy leyenda",
                pelicula4 = "Bad boys", pelicula5 = "Piratas del caribe";
        String nombrePelicula, nombre, anotacion;
        int opcion, opcion2;

        System.out.println("Hola ¿Cual es tu nombre?");
        nombre = scanner.nextLine();

        boolean estado = true;
        while (estado) {
            // panel principal
            System.out.println(
                    "Bienvenido a la video tienda\n1. Alquilar Pelicula.\n2. Recibir pelicula en la video tienda.");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    opcion = 1;
                    // panel principal de la opcion 1
                    System.out.println("\nPeliculas disponibles\n");
                    System.out.println("1. " + pelicula1 + "\n2. " + pelicula2 + "\n3. " + pelicula3 + "\n4. "
                            + pelicula4 + "\n5. " + pelicula5);
                    opcion2 = scanner.nextInt();

                    switch (opcion2) {
                        case 1:
                            opcion2 = 1;
                            System.out
                                    .println("Has escogido: " + pelicula1 + " " + nombre + " gracias por preferirnos.");
                            estado = false;
                            break;

                        case 2:
                            opcion2 = 2;
                            System.out
                                    .println("Has escogido: " + pelicula2 + " " + nombre + " gracias por preferirnos.");
                            estado = false;
                            break;

                        case 3:
                            opcion2 = 3;
                            System.out
                                    .println("Has escogido: " + pelicula3 + " " + nombre + " gracias por preferirnos.");
                            estado = false;
                            break;

                        case 4:
                            opcion2 = 4;
                            System.out
                                    .println("Has escogido: " + pelicula4 + " " + nombre + " gracias por preferirnos.");
                            estado = false;
                            break;

                        case 5:
                            opcion2 = 5;
                            System.out
                                    .println("Has escogido: " + pelicula5 + " " + nombre + " gracias por preferirnos.");
                            estado = false;
                            break;

                        default:
                            System.out.println("opcion incorrecta");
                            break;
                    }

                    break;

                case 2:
                    opcion = 2;
                    // Recibir pelicula en la video tienda
                    System.out.println("Por favor escriba el nombre de la pelicula que va a entregar");
                    nombrePelicula = scanner.next();

                    System.out.println("\n¿Desea hacer alguna anotacion?\n1. si\n2. no");
                    opcion2 = scanner.nextInt();

                    switch (opcion2) {
                        case 1:
                            opcion = 1;
                            System.out.println("Describa las anotaciones");
                            anotacion = scanner.next();
                            System.out.println(nombre + " Se recibio correctamente la pelicula " + nombrePelicula
                                    + " con la siguiente anotacion: " + anotacion);
                            estado = false;
                            break;

                        case 2:
                            opcion = 2;
                            System.out.println(nombre + " Se recibio correctamente la pelicula " + nombrePelicula
                                    + " sin anotacion.");
                            estado = false;
                            break;
                        default:
                            System.out.println("opcion incorrecta");
                            break;
                    }
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        }
    }
}
