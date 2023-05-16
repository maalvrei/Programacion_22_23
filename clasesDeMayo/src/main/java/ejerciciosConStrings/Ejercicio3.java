package ejerciciosConStrings;

import java.util.Scanner;

public class Ejercicio3 {

	public static String pideCadena() {
		System.out.println("Introduce una cadena");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		return s;
	}

	public static char pideLetra() {

		String letra = null;
		boolean comprobante = true;
		while (comprobante) {
			System.out.println("Introduce una letra");
			Scanner sc = new Scanner(System.in);
			letra = sc.next();
			if (letra.length() == 1)
				comprobante = false;
		}
		return letra.charAt(0);

	}

	public static int recorreCadena(String s, char c) {
		int contador = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				contador++;
		}

		return contador;
	}

	public static void main(String[] args) {
		String cadena = pideCadena();
		char letra = pideLetra();
		System.out.println("La letra " + letra + " en la cadena " + cadena + " aparece " + recorreCadena(cadena, letra) + " veces.");
	}

}