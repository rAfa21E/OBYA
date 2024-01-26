package proyectoobyd;

public class Triangulo {

    private char cart;
    private int dim;

    public Triangulo(char cart, int dim) {
        this.cart = cart;
        this.dim = dim;
    }

    // Método que imprime un triángulo ascendente.
    // Complejidad: O(n^2), donde "n" es la dimensión de la matriz.
    public void TrianguloA() {
        for (int i = 1; i <= dim; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cart + " ");
            }
            System.out.println();
        }
    }

    // Método que imprime un triángulo descendente.
    // Complejidad: O(n^2), donde "n" es la dimensión de la matriz.
    public void TrianguloB() {
        for (int i = dim; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cart + " ");
            }
            System.out.println();
        }
    }
}

