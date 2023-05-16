package ejerciciosConStrings;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
	
	public static String pideCadena() {
		System.out.println("Introduce una cadena");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		return s;
	}
	
	public static int recorreCadena (String s) {
		int contador = 0;
		
		for (int i = 0 ; i < s.length() ; i++) {
			char letra = s.charAt(i);
			if (esVocal(letra))
				contador++;
		}
		
		return contador;
	}
	
	public static void main(String[] args) {
		String s = pideCadena();
		System.out.println("Tu cadena tiene " + recorreCadena(s) + " vocales");
	}
	
}
