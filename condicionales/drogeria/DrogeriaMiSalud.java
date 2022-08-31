package drogeria;

import java.util.Scanner;

/**
 * DrogeriaMiSalud
 * La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere
 * una aplicación para poder facturar los
 * productos que vende a sus clientes y para ello, los productos tienen unas
 * características que deben indicársele al
 * cliente para que pueda escoger el producto a comprar. Para cada cliente, se
 * tienen las opciones de compra de producto,
 * consulta de precios por producto y devoluciones en caso de que se presenten.
 */

public class DrogeriaMiSalud {
    public static void main(String[] args) {

        // se crean las instancias de las clases
        Producto producto1 = new Producto();

        producto1.nombre = "Acetaminofen";
        producto1.descripcion = "sobre x12 pastas";
        producto1.valor = 4000;
        producto1.cantidad = 18;

        // producto 2
        Producto producto2 = new Producto();

        producto2.nombre = "Advil Max";
        producto2.descripcion = "gel sobre x8 capsulas";
        producto2.valor = 10000;
        producto2.cantidad = 11;

        // producto 3
        Producto producto3 = new Producto();

        producto3.nombre = "suero";
        producto3.descripcion = "1000ml";
        producto3.valor = 12000;
        producto3.cantidad = 4;

        // producto 4
        Producto producto4 = new Producto();

        producto4.nombre = "vendas";
        producto4.descripcion = "2 metros elastica";
        producto4.valor = 6000;
        producto4.cantidad = 3;

        Scanner scanner = new Scanner(System.in);

        // ciclo principal
        boolean estado = true;
        while (estado) {
            // panel principal
            System.out.println(
                    "\nBienvenido a la Drogeria Mi Salud\n\n1. Comprar producto\n2. Consultar precios de productos\n3. Devolver Producto\n4. Salir");

            // captura la opcion a elegir
            int opcion = Integer.parseInt(scanner.nextLine());

            // condicional switch ( segun opcion )
            switch (opcion) {
                case 1:
                    opcion = 1;
                    // Comprar producto
                    System.out.println("\nListado de Productos\n1. " + producto1.nombre + "\n2. " + producto2.nombre
                            + "\n3. " + producto3.nombre + "\n4. " + producto4.nombre);

                    System.out.println("Elija un producto");
                    int opcion2 = Integer.parseInt(scanner.nextLine());

                    System.out.println("¿Cuantas unidades desea?");
                    int cantidad = Integer.parseInt(scanner.nextLine());

                    switch (opcion2) {
                        case 1:
                            // producto 1
                            if (cantidad < 0 ) {
                                System.out.println("elija una cantidad correcta");
                            } else if (cantidad <= producto1.cantidad) {
                                System.out.println("GRACIAS POR SU COMPRA\nacaba de adquirir " + cantidad + " - "
                                        + producto1.nombre + " - " + producto1.descripcion + " - por valor de "
                                        + (producto1.valor * cantidad));
                                producto1.comprarProducto(cantidad);        
                            } else {
                                System.out.println("cantidad no disponible solo contamos con: " + producto1.cantidad);
                            }
                            break;

                        case 2:
                            // producto 2
                            if (cantidad < 0 ) {
                                System.out.println("elija una cantidad correcta");
                            } else if (cantidad <= producto2.cantidad) {
                                System.out.println("GRACIAS POR SU COMPRA\nacaba de adquirir " + cantidad + " - "
                                        + producto2.nombre + " - " + producto2.descripcion + " - por valor de "
                                        + (producto2.valor * cantidad));
                                producto2.comprarProducto(cantidad);        
                            } else {
                                System.out.println("cantidad no disponible solo contamos con: " + producto2.cantidad);
                            }                           
                            break;
                        case 3:
                            // producto 3
                            if (cantidad < 0 ) {
                                System.out.println("elija una cantidad correcta");
                            } else if (cantidad <= producto3.cantidad) {
                                System.out.println("GRACIAS POR SU COMPRA\nacaba de adquirir " + cantidad + " - "
                                        + producto3.nombre + " - " + producto3.descripcion + " - por valor de "
                                        + (producto3.valor * cantidad));
                                producto3.comprarProducto(cantidad);        
                            } else {
                                System.out.println("cantidad no disponible solo contamos con: " + producto3.cantidad);
                            }      
                            break;
                        case 4:
                            // producto 4
                            if (cantidad < 0 ) {
                                System.out.println("elija una cantidad correcta");
                            } else if (cantidad <= producto4.cantidad) {
                                System.out.println("GRACIAS POR SU COMPRA\nacaba de adquirir " + cantidad + " - "
                                        + producto4.nombre + " - " + producto4.descripcion + " - por valor de "
                                        + (producto4.valor * cantidad));
                                producto4.comprarProducto(cantidad);        
                            } else {
                                System.out.println("cantidad no disponible solo contamos con: " + producto4.cantidad);
                            }  
                            break;
                        default:
                            System.out.println("opcion incorrecta");
                            break;
                    }

                    break;

                case 2:
                    opcion = 2;
                    // Consultar precios de productos
                    System.out.println("\nListado de productos\n1. " + producto1.nombre + "\tPrecio: " + producto1.valor
                            + "\t Cantidad: " + producto1.cantidad + "\n2. " + producto2.nombre + "\tPrecio: "
                            + producto2.valor + "\t Cantidad: " + producto2.cantidad + "\n2. " + producto2.nombre
                            + "\tPrecio: " + producto2.valor + "\t Cantidad: " + producto3.cantidad + "\n3. "
                            + producto3.nombre + "\tPrecio: "
                            + producto3.valor + "\t Cantidad: " + producto1.cantidad + "\n4. " + producto4.nombre
                            + "\tPrecio: " + producto4.valor + "\t Cantidad: " + producto4.cantidad);
                    System.out.println("\nEnter para continuar");
                    scanner.nextLine();
                    break;

                case 3:
                    // Devolver producto
                    System.out.println("\n¿Que producto desea devolver?\n1. " + producto1.nombre + "\n2. " + producto2.nombre
                            + "\n3. " + producto3.nombre + "\n4. " + producto4.nombre);

                    System.out.println("Elija un producto");
                    int opcionDevolucion = Integer.parseInt(scanner.nextLine());

                    System.out.println("¿Cuantas unidades desea?");
                    int cantidadDevolucion = Integer.parseInt(scanner.nextLine());
                    
                    switch (opcionDevolucion) {
                        case 1:
                            // producto 1
                            if (cantidadDevolucion > 0) {
                                System.out.println("Por favor indique el motivo de su devolucion");
                                String motivo = scanner.nextLine();

                                System.out.println("Se realizo con exito la devolucion de "+cantidadDevolucion+" unidades del producto: "+producto1.nombre);
                                System.out.println("Por motivo de: "+motivo);
                                producto1.devolverProducto(cantidadDevolucion);
                            } else {
                                System.out.println("Por favor ingrese una cantidad valida");
                            }
                            break;
                        case 2:
                            // producto 2
                            if (cantidadDevolucion > 0) {
                                System.out.println("Por favor indique el motivo de su devolucion");
                                String motivo = scanner.nextLine();

                                System.out.println("Se realizo con exito la devolucion de "+cantidadDevolucion+" unidades del producto: "+producto2.nombre);
                                System.out.println("Por motivo de: "+motivo);
                                producto2.devolverProducto(cantidadDevolucion);
                            } else {
                                System.out.println("Por favor ingrese una cantidad valida");
                            }
                            break;

                        case 3:
                            // producto 3
                            if (cantidadDevolucion > 0) {
                                System.out.println("Por favor indique el motivo de su devolucion");
                                String motivo = scanner.nextLine();

                                System.out.println("Se realizo con exito la devolucion de "+cantidadDevolucion+" unidades del producto: "+producto3.nombre);
                                System.out.println("Por motivo de: "+motivo);
                                producto3.devolverProducto(cantidadDevolucion);
                            } else {
                                System.out.println("Por favor ingrese una cantidad valida");
                            }
                            break;

                        case 4:
                            // producto 4
                            if (cantidadDevolucion > 0) {
                                System.out.println("Por favor indique el motivo de su devolucion");
                                String motivo = scanner.nextLine();

                                System.out.println("Se realizo con exito la devolucion de "+cantidadDevolucion+" unidades del producto: "+producto4.nombre);
                                System.out.println("Por motivo de: "+motivo);
                                producto4.devolverProducto(cantidadDevolucion);
                            } else {
                                System.out.println("Por favor ingrese una cantidad valida");
                            }
                            break;

                        default:
                            System.out.println("opcion incorrecta");
                            break;
                    }

                    break;
                case 4:
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