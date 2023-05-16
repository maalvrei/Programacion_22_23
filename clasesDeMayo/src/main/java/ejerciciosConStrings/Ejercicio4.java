package ejerciciosConStrings;

import java.util.Scanner;

public class Ejercicio4 {

	public static String pideCadena() {
		System.out.println("Introduce una cadena");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		return s;
	}
	
	public static void main(String[] args) {
		String s1 = pideCadena();
		String s2 = pideCadena();
		// comparamos ambas cadenas, este equals da true si introducimos las mismas
		System.out.println(s1.equals(s2));
		// y este compareTo debe dar 0 si son las mismas cadenas
		System.out.println(s1.compareTo(s2));
		String s3 = s1.concat(s2);
		String s4 = s1.concat(s2);
		// comparamos s3 y s4, este equals da true
		System.out.println(s3.equals(s4));
		// y este comparteTo debe dar 0
		System.out.println(s3.compareTo(s4));
	}
	
}
