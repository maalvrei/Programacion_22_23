package ejercicios;

import java.util.*;

public class Ejercicio1 {
	
	static void rellena (int[] arr) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i <10 ; i++) {
			System.out.println("Dime un numero");
			int nextNum = sc.nextInt();
			arr[i] = nextNum;
		}
		
		sc.close();
	}
	
	static void imprime (int[] arr) {
		
		for (int i = 0 ; i <10 ; i++) {
			System.out.println("La posicion " + i + " del array contiene el numero " + arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		rellena(arr);
		imprime(arr);
	}
	
}
