package proyectoobyd;

import java.util.Scanner;

public class ProyectoOBYD {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rep = true;

        while (rep) {
            // Leer la dimensión de la matriz
            System.out.print("Ingrese la dimensión de la matriz MxM: ");
            int dimension = scanner.nextInt();

            // Leer un carácter, número o símbolo del usuario
            System.out.print("Ingrese un carácter cualquiera: ");
            char caracter = scanner.next().charAt(0);

            // Crear un objeto Triangulo
            Triangulo triangulo = new Triangulo(caracter, dimension);

            // Imprimir Triángulo A
            System.out.println("Triángulo A:");
            triangulo.TrianguloA();

            // Imprimir Triángulo B
            System.out.println("\nTriángulo B:");
            triangulo.TrianguloB();

            // Preguntar al usuario si desea repetir con otro carácter
            System.out.print("¿Desea repetir con otro carácter? (si/no): ");
            String respuesta = scanner.next().toLowerCase();
            
            if (respuesta.equals("no")) {
                rep = false;
                System.out.println("Saliendo del programa....");
            }
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
