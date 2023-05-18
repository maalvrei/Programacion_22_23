package ejerciciosConStrings;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static String pideString() {
		System.out.println("Introduce una cadena");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		return s;
	}
	
	public static String reverseString(String s) {
		String cadenaInvertida = "";
		for (int i = 0 ; i < s.length() ; i++)
			cadenaInvertida += s.charAt(s.length() -1 - i);
		return cadenaInvertida;
	}
	
	public static void main(String[] args) {
		
		String s = pideString();
		String cadenaInvertida = reverseString(s);
		System.out.println("La cadena " + s + " del reves es " + cadenaInvertida);
		
	}
	
}
