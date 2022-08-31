package clases;

import java.util.Scanner;

public class Servicio {
    private String nombre;
    private int valor;

    public Servicio(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public void servicioTomado(Persona persona) {
        // servicio 1
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "escriba la fecha (dd/mm/aa) de ingreso de la motocicleta " + persona.getMoto());
        String fechaIngreso = scanner.nextLine();

        System.out.println("describa las observaciones de ingreso de la motocicleta");
        String observacionesIngreso = scanner.nextLine();

        System.out.println(
                "escriba la fecha (dd/mm/aa) de salida de la motocicleta " + persona.getMoto());
        String fechaSalida = scanner.nextLine();

        System.out.println("describa las observaciones de salida de la motocicleta");
        String observacionesSalida = scanner.nextLine();

        System.out.println("¿Se cambiaron repuestos adicionales?\n1. Si\n2. No");
        int opcionRepuestos = Integer.parseInt(scanner.nextLine());

        switch (opcionRepuestos) {
            case 1:
                System.out.println("Nombres de los repuestos adicionales");
                String nombreRespuestos = scanner.nextLine();

                System.out.println("Valor de los repuestos adicionales");
                int valorRepuestos = Integer.parseInt(scanner.nextLine());

                // salida final
                System.out.println("Se realizo con exito el servicio de " + this.nombre
                        + " para la motocicleta " + persona.getMoto() + " del propietario "
                        + persona.getNombre() + " " + persona.getApellido()
                        + " el cual tiene un valor de $ " + this.valor
                        + " y se le agregan los repuestos adicionales " + nombreRespuestos
                        + " con un valor de " + valorRepuestos + " TOTAL A PAGAR "
                        + (valorRepuestos + this.valor));
                break;

            case 2:
                System.out.println("Se realizo con exito el servicio de " + this.nombre
                        + " para la motocicleta " + persona.getMoto() + " del propietario "
                        + persona.getNombre() + " " + persona.getApellido()
                        + " el cual tiene un valor de $ " + this.valor);
                break;
            default:
                break;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

}
