package com.corenetworks.dam.tema2.ejercicio2;

public class Billetes {

    public static void main(String[] args) {
        // Cantidad de dinero aleatoria
        int cantidad = 4545454;

        // Billetes disponibles
        int[] billetes = { 500, 200, 100, 50, 20, 10, 5, 1 };

        // Mostrar la cantidad de billetes de cada tipo necesarios
        System.out.println("Cantidad de dinero: " + cantidad + "€\n");

        for (int i = 0; i < billetes.length; i++) {
            int cantidadBilletes = cantidad / billetes[i];
            cantidad %= billetes[i];
            System.out.println("Billetes de " + billetes[i] + "€: " + cantidadBilletes);
        }
    }
}