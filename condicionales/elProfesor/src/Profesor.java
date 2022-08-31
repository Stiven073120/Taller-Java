import java.util.Scanner;

import clases.Geometria;

/**
 * Profesor
 * El profesor de geometría está explicando a sus estudiantes las fórmulas para
 * calcular el área de diferentes figuras geométricas,
 * para ello requiere una aplicación que le facilite el ejercicio solicitándole
 * los valores al estudiante. La aplicación debe permitir
 * que el estudiante seleccione si desea calcular el área de un rectángulo,
 * triángulo o trapecio. No olvide solicitar los datos
 * necesarios para realizar cada cálculo y mostrar su respectivo resultado.
 */

public class Profesor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Prefesor de geometria\n1. rectangulo\n2. triangulo\n3. trapecio");

        System.out.println("¿Cual desea calcular?");
        int opcion = Integer.parseInt(scanner.nextLine());

        double base, altura, base2, area;
        Geometria geometria = new Geometria();

        switch (opcion) {
            case 1:
                // rectangulo
                System.out.println("\nCalcular el area de un Rectangulo\n\n¿Cual es la base del rectangulo?");
                base = Double.parseDouble(scanner.nextLine());
                System.out.println("¿Cual es la altura del rectangulo?");
                altura = Double.parseDouble(scanner.nextLine());

                
                geometria.setBase(base);
                geometria.setAltura(altura);

                area = geometria.calcularRectangulo();

                System.out.println("el area del rectangulo con base "+base+" y altura "+altura+" es "+area);
                break;
            case 2:
                // triangulo
                System.out.println("\nCalcular el area de un triangulo\n\n¿Cual es la base del triangulo?");
                base = Double.parseDouble(scanner.nextLine());
                System.out.println("¿Cual es la altura del triangulo?");
                altura = Double.parseDouble(scanner.nextLine());

                geometria.setBase(base);
                geometria.setAltura(altura);

                area = geometria.calcularTriangulo();

                System.out.println("el area del triangulo con base "+base+" y altura "+altura+" es "+area);
                break;
            case 3:
                // trapecio
                System.out.println("\nCalcular el area de un trapecio\n\n¿Cual es la base del trapecio?");
                base = Double.parseDouble(scanner.nextLine());
                System.out.println("¿Cual es la altura del trapecio?");
                altura = Double.parseDouble(scanner.nextLine());
                System.out.println("¿Cual es la segunda base del trapecio?");
                base2 = Double.parseDouble(scanner.nextLine());

                geometria.setBase(base);
                geometria.setAltura(altura);
                geometria.setBase2(base2);

                area = geometria.calcularTrapecio();

                System.out.println("el area del trapecio con base "+base+" altura "+altura+" y segunda base "+base2+" es "+area);
                break;

            default:
                System.out.println("opcion incorrecta");
                break;
        }
    }
}