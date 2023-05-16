package ejerciciosConStrings;

import java.util.Scanner;

public class Ejercicio6 {

	// Pedir por consola un numero y guardarlo en un String. Convertirlo a Float y despues a float
	
	public static int pideNumero() {
		System.out.println("Introduce un numero entero");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	public static void main(String[] args) {
		int numero = pideNumero();
		//lo pasamos a cadena y lo comprobamos
		String numeroEnCadena = String.valueOf(numero);
		System.out.println("El numero en cadena: " + numeroEnCadena);
		// lo pasamos a Float y lo comprobamos
		Float numeroEnFloat = Float.valueOf(numeroEnCadena);
		System.out.println("El numero en Float: " + numeroEnFloat);
		// lo pasamos a float y lo comprobamos
		float numeroEnFloatPrimitivo = numeroEnFloat.floatValue();
		System.out.println("El numero en float: " + numeroEnFloatPrimitivo);
		
	}
	
}
