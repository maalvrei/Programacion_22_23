package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	
	private static int generarNumeroAleatorio() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10);
        return numeroAleatorio;
    }
	
	static void rellena (int[] arr, int numParaGenerar) {
		
		int suma = 0;
		int cantidad = 0;
		for (int i = 0 ; i < numParaGenerar ; i++) {
			int num = generarNumeroAleatorio();
			arr[i] = num;
			suma += num;
			cantidad += 1;
		}
		System.out.println("La suma de los valores de todas las posiciones del array es de " + suma + "\nEl array tiene " + cantidad + " elementos");
	}
	
	static void imprime (int[] arr, int tamanyoArray) {
		
		for (int i = 0 ; i < tamanyoArray ; i++) {
			System.out.println("La posicion " + i + " del array contiene el numero " + arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime cuantas posiciones tiene tu array.");
		int tamanyoArray = sc.nextInt();
		int [] arr = new int[tamanyoArray];
		
		rellena(arr, tamanyoArray);
		imprime(arr, tamanyoArray);
		
		
	}
	
}
