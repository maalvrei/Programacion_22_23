package ejerciciosConStrings;

import java.util.Scanner;

public class Ejercicio5 {
	
	// Pedir por consola un numero y guardarlo en un String. Convertirlo a Integer y despues a int
	
	public static int pideNumero() {
		System.out.println("Introduce un numero entero");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	public static void main(String[] args) {
		int numero = pideNumero();
		// guardamos el numero como String y lo comprobamos
		String numeroEnCadena = String.valueOf(numero);
		System.out.println("El numero en cadena: " + numeroEnCadena);
		// guardamos el numero como Integer y lo comprobamos
		Integer numeroEnInteger = Integer.parseInt(numeroEnCadena);
		System.out.println("El numero como integer: " + numeroEnInteger);
		//Pasamos el Integer a int
		int numeroEnEntero = numeroEnInteger.intValue();
		System.out.println("El numero como int: " + numeroEnEntero);
	}
	
}
