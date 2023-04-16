package ejercicios;

import java.util.Random;

public class Matriz {

    private int[][] matriz;

    public Matriz() {
        matriz = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(10); // Valores aleatorios del 0 al 9
            }
        }
    }

    public void imprimirPorFilas() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirPorColumnas() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirPorFilasInversa() {
        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirPorColumnasInversa() {
        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirDiagonal() {
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Matriz matriz = new Matriz();

        System.out.println("Matriz:");
        matriz.imprimirPorFilas();

        System.out.println("Matriz por columnas:");
        matriz.imprimirPorColumnas();

        System.out.println("Matriz por filas inversa:");
        matriz.imprimirPorFilasInversa();

        System.out.println("Matriz por columnas inversa:");
        matriz.imprimirPorColumnasInversa();

        System.out.println("Diagonal de la matriz:");
        matriz.imprimirDiagonal();
    }
}
