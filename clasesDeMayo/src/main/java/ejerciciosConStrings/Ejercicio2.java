package ejerciciosConStrings;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static StringBuilder pideStringBuilder() {
		System.out.println("Introduce una cadena");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder(s);
		return sb;
	}
	
	public static String reverseCadena(StringBuilder s) {
		String cadenaInvertida = s.reverse().toString();
		return cadenaInvertida;
	}
	
	public static void main(String[] args) {
		
		StringBuilder s = pideStringBuilder();
		String cadenaInvertida = reverseCadena(s);
		System.out.println("La cadena " + reverseCadena(s) + " del reves es " + cadenaInvertida);
		
	}
	
}
